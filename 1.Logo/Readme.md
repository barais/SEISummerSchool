#Model-Driven Engineering

##TP – Creating a domain-specific language (DSL) with EMF and Kermeta

### Goal

The goal of these three practical sessions is to create a language for programming the behaviour of a Drawing Lego robot based on the Logo Language. This robot can move forward, rotate, penup and pendown a pen, and display some texts on its screen.

!(image/tpidm.png) Schema describing the use of a DSL for programming a Lego robot

The development toolkit provided with the robot relies on C language. The main drawback is that C is a general-purpose language (GPL) and is, therefore, not dedicated to the development of Lego robots. Using C to develop robots will polluted the developed code with C-specific routines and hacks. The use of a language dedicated to robots will alleviate their development.

As explained in the three classes devoted to MDE, the development of such a dedicated programming language consists of three steps:

1.	The creation of the metamodel (the abstract syntax) of the new programming language (Here we will Mimic Logo). The metamodel defines and organises, through a UML-like class diagram, the concepts of the programming language (instructions, conditional statements, etc.).
2.	The creation of a textual editor to ease the coding of programs using the newly created language. This step involves the creation of a grammar (the concrete syntax) for the textual language. The concrete syntax is provided in the next Section.
3.	A simulator to test the program
4.	A compiler that transforms (compiles) a program of your language into C code that runs on top of the robot (we cannot bypass C everywhere since the robot needs C programs to run).

Creating a metamodel with Eclipse and EMF
-----------------------------------------

**Example of a program using our dedicated Logo language**

Here is an example of a program of the language to develop. You have to extract from this program all the concepts that compose our dedicated language to design its metamodel.

```logo
CLEAR
TO carre  :n
	REPEAT 4
		LEFT 90
		PENDOWN
		FORWARD n
	END REPEAT
END TO

carre 50
```

Designing the metamodel
-----------------------

From the concepts used in the previous program, define a metamodel that can represent this program.

To do so, create a Java project, then create an Ecore model (new → other → ecore diagram) un a folder metamodels to create. Validate your metamodel at the end of this step to check errors (« Sample Ecore Editor » -> « Validate »). A recurrent error concerns the root package of the metamodel: « Ns Prefix » must have a value (e.g. the name of the package) and « Ns URI » must be a URI (e.g. http://logo). Thus URI identifies the metamodel and its models. Remark : there is to parts to model. The concepts specific to controlling robots (pendown, etc.) and the control flow (if, while, boolean expression, etc.). Separate them in two packages (robot and controlFlow).

Generating EMF tools to create models (i.e. programs)
-----------------------------------------------------

1.	Generate the Java code from the metamodel, and the reflexive editor. To do so, you have to create a genmodel file, open it, and right-clic on its root.

2.	Create the model of the previous program using these generated tools. To do so, “Run as Eclipse Application” to launch a new Eclipse that uses your newly created plug-ins. Create a new project. To create a model of your language: “New” -> “Other” -> “logo” (or the name of your language).

3.	Fill the model to represent the previous program.

##Creating a textual editor with Xtext Create a new XText project (« from existing Ecore model ») . You can then defined the grammar of your language to match the one of previous program. Use the hard-copy to design this grammar. Here is a skeleton of the grammar to fill:

grammar org.inria.diverse.logo.dsl.LogoDSL with org.eclipse.xtext.common.Terminals

```xtext
generate logoDSL "http://www.inria.fr/diverse/logo/DSL"

import "http://www.eclipse.org/emf/2002/Ecore" as ecore

LogoProgram:
	sentences+=SENTENCE*;

SENTENCE:
	// VARIABLES
	MAKE | CONTENT
	| PROCEDURE_CALL
	| OPERATION
	| CONTROL_SENTENCES
	| MOVE
	| DRAWING_SENTENCE
;

MOVE:
	FORWARD | LEFT | RIGHT | SET_X | SET_Y
;

FORWARD: 'FORWARD' amount=EXPRESSION;
LEFT: 'LEFT' amount=EXPRESSION;
RIGHT: 'RIGHT' amount=EXPRESSION;
SET_X: 'SETX' amount=EXPRESSION;
SET_Y: 'SETY' amount=EXPRESSION;

DRAWING_SENTENCE:
	PENDOWN | PENUP | CLEAR | HOME | COLOREABLE | FONT_SPEC | DRAW_STRING
;

PENDOWN: {PENDOWN} 'PENDOWN';
PENUP: {PENUP} 'PENUP';

COLOREABLE: PENCOLOR | CANVAS_COLOR;
PENCOLOR: 'PENCOLOR' (color=COLOR | colorSpec=COLOR_SPEC);
CANVAS_COLOR: 'CANVASCOLOR' (color=COLOR | colorSpec=COLOR_SPEC);
COLOR_SPEC:
	red=EXPRESSION green=EXPRESSION blue=EXPRESSION alpha=EXPRESSION
;
COLOR: 'BLACK'|'BLUE'|'CYAN'|'DARK GRAY'|'GRAY'|'GREEN'|'LIGHTGRAY'|'MAGENTA'|'ORANGE'|'PINK'|'RED'|'WHITE'|'YELLOW';

FONT_SPEC: FONT_STYLE ;
FONT_STYLE: 'FONTSTYLE' style=FontStyleValues;
FontStyleValues:
	{BOLD} 'BOLD' | {ITALIC} 'ITALIC' | {PLAIN} 'PLAIN'
;

CLEAR: {CLEAR} 'CLEAR';
HOME: {HOME} 'HOME';

DRAW_STRING:
	'DRAWSTRING' text=STRING
;

REFERENCIABLE:
	MAKE | PARAM
;

MAKE: 'MAKE' name=ID '=' value=EXPRESSION;
VARIABLE_REF: toVar=[REFERENCIABLE];

EXPRESSION:  
	VARIABLE_REF | VALUE
;

VALUE:
	val=DOUBLE
;

CONTENT:
	'CONTENT' var=[MAKE]
;

OPERATION:
	  SUM
	| SUBTRACT
	| MULTIPLY
	| DIVIDE
;

SUM: 		'SUM' targetVariable=[MAKE] '=' valOne=EXPRESSION '+' valTwo=EXPRESSION;
SUBTRACT: 	'SUBTRACT' targetVariable=[MAKE] '=' valOne=EXPRESSION  '-' valTwo=EXPRESSION;
MULTIPLY: 	'MULTIPLY' targetVariable=[MAKE] '=' valOne=EXPRESSION  '*' valTwo=EXPRESSION;
DIVIDE: 	'DIVIDE' targetVariable=[MAKE] '=' valOne=EXPRESSION  '/' valTwo=EXPRESSION;


CONTROL_SENTENCES:
	REPEAT | TO | IF_SENTENCE
;

REPEAT:
	'REPEAT' times=EXPRESSION
		(commands+=SENTENCE)+
	'END REPEAT'
;

// define una funcion/procedimiento
TO:
	'TO' name=ID (parameters+=PARAM)*
		(commands+=SENTENCE)+
	'END TO'
;
PARAM:
	':' name=ID
;

// llamada
PROCEDURE_CALL:
	to=[TO] (params+=EXPRESSION)*
;


IF_SENTENCE:
	'IF' condition=BOOLEAN_EXPRESSION
		(commands+=SENTENCE)+
	'END IF'
;

BOOLEAN_EXPRESSION:
	EQUALS
	| GREATER_THAN
	| LESSER_THAN
;

EQUALS: 		op1=EXPRESSION '=' op2=EXPRESSION;
GREATER_THAN: 	op1=EXPRESSION '>' op2=EXPRESSION;
LESSER_THAN: 	op1=EXPRESSION '<' op2=EXPRESSION;

//terminal DEGREES returns ecore::EInt: ('0'..'9')+ '°';
terminal DOUBLE returns ecore::EDouble: ('0'..'9')+ ('.' ('0'..'9')+)?;
```

Copy-paste the previous program in your editor to test it.

Create your own simulator
-------------------------

I prepare a first version of the simulator with some piece of code to complete. Import these projects.

In particular, you must complete the left statement and the PROC_CALL Statement

##. Extends your language to support the change of the font size.

At the end you should be able to simulate this program

```logo
CLEAR
FONTSIZE 36
FONTSTYLE BOLD

SETX 140

MAKE color = 10
TO test  :n
	REPEAT n
	PENCOLOR color 0 color 50
	LEFT 15
	PENUP
	FORWARD 45
	PENDOWN
	DRAWSTRING "THIS IS TORTUE TEXT"
	SUM color = color + 10
END REPEAT
END TO

test 24
```

##5. Generating NXC programs

### Using the design pattern Visitor and Interpreter to visit and generate NXC programs

As seen in classes, the design pattern Interpreter aims at simulating, executing, or interpreting an executable model. In our case, it will be used to navigate through a model to generate its corresponding NXC code. NXC is a variant of C that understand the robot. Interpreter relies on a Visitor: see the exercise on arithmetical expressions. However, in Kermeta (the language you are going to use) there is no need for adding accept methods in the model to visit. Kermeta provides an advanced mechanism called static introduction that permits to add methods into a given class (aka. open class). To do so, the Kermeta keyword aspect permits to augment a class with operations or attributes. Refer to the Kermeta documentation (see the footnote) and the hard-copy. 1. Complete the Xtend file NXCGenerator.xtend to visit the different classes of your metamodel to generate the corresponding C code. Indications are provided in this file. 2. Test all along your development the generator with the previously created model.
