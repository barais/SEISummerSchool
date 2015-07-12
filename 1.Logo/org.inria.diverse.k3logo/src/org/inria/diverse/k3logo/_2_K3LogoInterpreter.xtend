package org.inria.diverse.k3logo

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.awt.Color
import java.io.File
import java.util.HashMap
import java.util.Stack
import kmLogo.VM.Turtle
import kmLogo.VM.VMFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.resource.XtextResourceSet
import org.inria.diverse.logo.dsl.LogoDSLStandaloneSetup
import org.inria.diverse.logo.dsl.logoDSL.BOLD
import org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION
import org.inria.diverse.logo.dsl.logoDSL.CANVAS_COLOR
import org.inria.diverse.logo.dsl.logoDSL.CLEAR
import org.inria.diverse.logo.dsl.logoDSL.COLOREABLE
import org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC
import org.inria.diverse.logo.dsl.logoDSL.CONTENT
import org.inria.diverse.logo.dsl.logoDSL.CONTROL_SENTENCES
import org.inria.diverse.logo.dsl.logoDSL.DIVIDE
import org.inria.diverse.logo.dsl.logoDSL.DRAWING_SENTENCE
import org.inria.diverse.logo.dsl.logoDSL.DRAW_STRING
import org.inria.diverse.logo.dsl.logoDSL.EQUALS
import org.inria.diverse.logo.dsl.logoDSL.EXPRESSION
import org.inria.diverse.logo.dsl.logoDSL.FONT_SPEC
import org.inria.diverse.logo.dsl.logoDSL.FONT_STYLE
import org.inria.diverse.logo.dsl.logoDSL.FORWARD
import org.inria.diverse.logo.dsl.logoDSL.FontStyleValues
import org.inria.diverse.logo.dsl.logoDSL.GREATER_THAN
import org.inria.diverse.logo.dsl.logoDSL.IF_SENTENCE
import org.inria.diverse.logo.dsl.logoDSL.ITALIC
import org.inria.diverse.logo.dsl.logoDSL.LEFT
import org.inria.diverse.logo.dsl.logoDSL.LESSER_THAN
import org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage
import org.inria.diverse.logo.dsl.logoDSL.LogoProgram
import org.inria.diverse.logo.dsl.logoDSL.MAKE
import org.inria.diverse.logo.dsl.logoDSL.MOVE
import org.inria.diverse.logo.dsl.logoDSL.MULTIPLY
import org.inria.diverse.logo.dsl.logoDSL.OPERATION
import org.inria.diverse.logo.dsl.logoDSL.PARAM
import org.inria.diverse.logo.dsl.logoDSL.PENCOLOR
import org.inria.diverse.logo.dsl.logoDSL.PENDOWN
import org.inria.diverse.logo.dsl.logoDSL.PENUP
import org.inria.diverse.logo.dsl.logoDSL.PLAIN
import org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL
import org.inria.diverse.logo.dsl.logoDSL.REFERENCIABLE
import org.inria.diverse.logo.dsl.logoDSL.REPEAT
import org.inria.diverse.logo.dsl.logoDSL.RIGHT
import org.inria.diverse.logo.dsl.logoDSL.SENTENCE
import org.inria.diverse.logo.dsl.logoDSL.SET_X
import org.inria.diverse.logo.dsl.logoDSL.SET_Y
import org.inria.diverse.logo.dsl.logoDSL.SUBTRACT
import org.inria.diverse.logo.dsl.logoDSL.SUM
import org.inria.diverse.logo.dsl.logoDSL.TO
import org.inria.diverse.logo.dsl.logoDSL.VALUE
import org.inria.diverse.logo.dsl.logoDSL.VARIABLE_REF

import static extension org.inria.diverse.k3logo.BOOLEAN_EXPRESSIONAspect.*
import static extension org.inria.diverse.k3logo.COLOR_SPECAspect.*
import static extension org.inria.diverse.k3logo.EXPRESSIONAspect.*
import static extension org.inria.diverse.k3logo.FontStyleValuesAspect.*
import static extension org.inria.diverse.k3logo.LogoProgramAspect.*
import static extension org.inria.diverse.k3logo.REFERENCIABLEAspect.*
import static extension org.inria.diverse.k3logo.SENTENCEAspect.*
import static extension org.inria.diverse.k3logo.graphical.TurtleAspect.*

abstract class K3LogoInterpreter {
	protected XtextResourceSet resourceSet ;
	protected ResourceSet resourceSetxmi ;

	Context c;
	
	def Context getContext(){
		c
	}
	
	 def void init(){
	 	this.c = new Context
	
	 }

	def void run(String[] args) {
		init()
		resourceSet = new XtextResourceSet();
		resourceSetxmi = new ResourceSetImpl();
		LogoDSLStandaloneSetup.doSetup();

		if (!EPackage.Registry.INSTANCE.containsKey(LogoDSLPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(LogoDSLPackage.eNS_URI, LogoDSLPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl);
		var pr = getLogoProgram("test0.logo")
		var resource = resourceSetxmi.createResource(URI.createFileURI("text.xmi"))
		resource.contents.add(pr)
		resource.save(new HashMap)
		var start = System.nanoTime;

		pr.eval(c)
		var stop = System.nanoTime;
		println("time to execute in ns" + ( stop - start))

	}

	def LogoProgram getLogoProgram(String modelPath) {
		var resource = resourceSet.getResource(createFileURI(modelPath), true);
		var eObject = resource.getContents().get(0);
		if (eObject instanceof LogoProgram) {
			var ch = eObject as LogoProgram;
			return ch;
		}
		return null;
	}

	def URI createFileURI(String path) {
		return URI.createFileURI(createFile(path).getAbsolutePath());
	}

	def LogoProgram getLogoProgramfromXMI(String modelPath) {
		var resource = resourceSetxmi.getResource(createFileURI(modelPath), true);
		var eObject = resource.getContents().get(0);
		if (eObject instanceof LogoProgram) {
			var ch = eObject as LogoProgram;
			return ch;
		}
		return null;
	}

	def File createFile(String path) {
		return new File(path);
	}

}

class Context {
	new(){
		stack = new Stack<HashMap<String, Integer>>()
		stack.add(new HashMap<String, Integer>())
		turtle = VMFactory.eINSTANCE.createTurtle
		turtle.reset
		
	}
	Stack<HashMap<String, Integer>> stack = new Stack<HashMap<String, Integer>>()

	Turtle turtle ;

	def Turtle getTurtle() {
		return turtle
	}

	def Stack<HashMap<String, Integer>> getStack() {
		return stack
	}

	def void reset() {
		stack = new Stack<HashMap<String, Integer>>()
		stack.add(new HashMap<String, Integer>())
		turtle = VMFactory.eINSTANCE.createTurtle
		turtle.reset
	}

	def void pushFrame(HashMap<String, Integer> frame) {
		stack.push(frame)
	}

	def HashMap<String, Integer> popFrame() {
		return stack.pop
	}

	def HashMap<String, Integer> peekFrame() {
		return stack.peek
	}

}

@Aspect(className=LogoProgram)
class LogoProgramAspect {
	int res = 0;

	def int eval(Context context) {
		_self.res = 0;
		_self.sentences.forEach[instruction|_self.res = instruction.eval(context)]
		return _self.res;
	}
}

@Aspect(className=SENTENCE)
abstract class SENTENCEAspect {
	def int eval(Context context) ;
}

@Aspect(className=MOVE)
abstract class MOVEAspect extends SENTENCEAspect {
	def int eval(Context context) ;

}

@Aspect(className=FORWARD)
class FORWARDAspect extends MOVEAspect {
	def int eval(Context context) {
		context.turtle.forward(_self.amount.eval(context))
		return 0;
	}
}

@Aspect(className=LEFT)
class LEFTAspect extends MOVEAspect {
	def int eval(Context context) {
		//TODO
		return 0;
	}
}

@Aspect(className=RIGHT)
class RIGHTAspect extends MOVEAspect {
	def int eval(Context context) {
		context.turtle.rotate(_self.amount.eval(context))
		return 0;
	}
}

@Aspect(className=SET_X)
class SET_XAspect extends MOVEAspect {
	def int eval(Context context) {
		context.turtle.position.x = _self.amount.eval(context)
		return 0;
	}

}

@Aspect(className=SET_Y)
class SET_YAspect extends MOVEAspect {
	def int eval(Context context) {
		context.turtle.position.y = _self.amount.eval(context)
		return 0;
	}
}

@Aspect(className=DRAWING_SENTENCE)
abstract class DRAWING_SENTENCEAspect extends SENTENCEAspect {
		def int eval(Context context) ;
	
}

@Aspect(className=PENDOWN)
class PENDOWNAspect extends DRAWING_SENTENCEAspect {
	def int eval(Context context) {
		context.turtle.penUp = false
		return 0;
	}

}

@Aspect(className=PENUP)
class PENUPAspect extends DRAWING_SENTENCEAspect {
	def int eval(Context context) {
		context.turtle.penUp = true
		return 0;
	}
}

@Aspect(className=CLEAR)
class CLEARAspect extends HOMEAspect {
	def int eval(Context context) {
		context.turtle.reset
		return 0;
	}

}

@Aspect(className=LogoProgram)
class HOMEAspect extends DRAWING_SENTENCEAspect {
	def int eval(Context context) {
		context.turtle.position.x = 0
		context.turtle.position.y = 0
		return 0;
	}
}

@Aspect(className=DRAW_STRING)
class DRAW_STRINGAspect extends DRAWING_SENTENCEAspect {
	def int eval(Context context) {
		context.turtle.drawString(_self.text)
		return 0
	}
}

@Aspect(className=REFERENCIABLE)
abstract class REFERENCIABLEAspect {
	def int eval(Context context) {
		return context.peekFrame.get(_self.name)
	}
}

@Aspect(className=MAKE)
class MAKEAspect extends SENTENCEAspect {
	def int eval(Context context) {
		context.peekFrame.put(_self.name,_self.value.eval(context))
		return 0
	}

}

@Aspect(className=VARIABLE_REF)
class VARIABLE_REFAspect extends EXPRESSIONAspect {
	def int eval(Context context) {
		return _self.toVar.eval(context)
	}
}

@Aspect(className=EXPRESSION)
abstract class EXPRESSIONAspect {
	def int eval(Context context) ;
}

@Aspect(className=VALUE)
class VALUEAspect extends EXPRESSIONAspect {
	def int eval(Context context) {
		return _self.^val.intValue
	}

}

@Aspect(className=CONTENT)
abstract class CONTENTAspect extends SENTENCEAspect {
	def int eval(Context context) ;
	
}

@Aspect(className=OPERATION)
abstract class OPERATIONAspect extends SENTENCEAspect {
		def int eval(Context context) ;
}

@Aspect(className=SUM)
class SUMAspect extends OPERATIONAspect {
	def int eval(Context context) {
		val res = _self.valOne.eval(context) + _self.valTwo.eval(context)
		if (_self.targetVariable != null)		
			context.peekFrame.put(_self.targetVariable.name,res)		
		return res
	}

}

@Aspect(className=SUBTRACT)
class SUBTRACTAspect extends OPERATIONAspect {
	def int eval(Context context) {
		//TODO
		return 0

	}
}

@Aspect(className=MULTIPLY)
class MULTIPLYAspect extends OPERATIONAspect {
	def int eval(Context context) {
		val res = _self.valOne.eval(context) * _self.valTwo.eval(context)
		if (_self.targetVariable != null)		
			context.peekFrame.put(_self.targetVariable.name,res)		
		return res
	}
}

@Aspect(className=DIVIDE)
class DIVIDEAspect extends OPERATIONAspect {
	def int eval(Context context) {
		val res = _self.valOne.eval(context) / _self.valTwo.eval(context)
		if (_self.targetVariable != null)		
			context.peekFrame.put(_self.targetVariable.name,res)		
		return res
	}

}

@Aspect(className=CONTROL_SENTENCES)
abstract class CONTROL_SENTENCESAspect extends SENTENCEAspect {
	def int eval(Context context) ;
}

@Aspect(className=REPEAT)
class REPEATAspect extends CONTROL_SENTENCESAspect {

	int res = 0

	def int eval(Context context) {
		_self.res = 0
		
		for (var i = 0; i < _self.times.eval(context); i++) {
			
			_self.commands.forEach[c | 
			_self.res = c.eval(context)
			]
		}
		return _self.res
	}

}

@Aspect(className=TO)
class TOAspect extends CONTROL_SENTENCESAspect {
	def int eval(Context context) {
		return 0;
	}
}

@Aspect(className=PARAM)
class PARAMAspect extends REFERENCIABLEAspect {
	def int eval(Context context) {
		context.stack.peek.get(_self.name)
	}
}

@Aspect(className=PROCEDURE_CALL)
class PROCEDURE_CALLAspect extends SENTENCEAspect {

	int res = 0
	def int eval(Context context) {
		//TODO
		return _self.res
	}

	def HashMap<String, Integer> createContext(Context context) {
		val map = new HashMap<String, Integer>()
		context.peekFrame.keySet.forEach[e| map.put(e,context.peekFrame.get(e))]
		// param - value
		_self.params.forEach [ p, i |
			map.put(_self.to.parameters.get(i).name, p.eval(context))
		]
		return map
	}

}

@Aspect(className=IF_SENTENCE)
class IF_SENTENCEAspect extends CONTROL_SENTENCESAspect {
	int res = 0

	def int eval(Context context) {
		_self.res = 0
		//TODO
		return _self.res
	}
}

@Aspect(className=BOOLEAN_EXPRESSION)
abstract class BOOLEAN_EXPRESSIONAspect {
	def int eval(Context context) ;
}

@Aspect(className=EQUALS)
class EQUALSAspect extends BOOLEAN_EXPRESSIONAspect {
	def int eval(Context context) {
		if(_self.op1.eval(context) == _self.op2.eval(context)) return 1 else return 0
	}

}

@Aspect(className=GREATER_THAN)
class GREATER_THANAspect extends BOOLEAN_EXPRESSIONAspect {
	def int eval(Context context) {
		if(_self.op1.eval(context) > _self.op2.eval(context)) return 1 else return 0
	}
}

@Aspect(className=LESSER_THAN)
class LESSER_THANAspect extends BOOLEAN_EXPRESSIONAspect {
	def int eval(Context context) {
		if(_self.op1.eval(context) < _self.op2.eval(context)) return 1 else return 0
	}
}

@Aspect(className=BOLD)
class BOLDAspect extends FontStyleValuesAspect {
	def int eval(Context context) {
		return 1
	}
}

@Aspect(className=ITALIC)
class ITALICAspect extends FontStyleValuesAspect {
	def int eval(Context context) {
		return 2
	}
}

@Aspect(className=PLAIN)
class PLAINAspect extends FontStyleValuesAspect {
	def int eval(Context context) {
		return 0
	}
}

@Aspect(className=COLOREABLE)
abstract class COLOREABLEAspect extends DRAWING_SENTENCEAspect {
	def int eval(Context context) ;
}

@Aspect(className=PENCOLOR)
class PENCOLORAspect extends COLOREABLEAspect {
	def int eval(Context context) {
		println("setcolor" + _self.colorSpec.toColorObject(context))
		if (_self.color != null) context.turtle.setPenColor(_self.color)  else context.turtle.setPenColor(_self.colorSpec.toColorObject(context))		
		return 0; 
	}
	
}

@Aspect(className=CANVAS_COLOR)
class CANVAS_COLORAspect extends COLOREABLEAspect {
	def int eval(Context context) {
		if (_self.color != null) context.turtle.setCanevasColor(_self.color)  else context.turtle.setCanevasColor(_self.colorSpec.toColorObject(context))		
		return 0; 
	}
}

@Aspect(className=COLOR_SPEC)
class COLOR_SPECAspect {
	
	def Color toColorObject(Context context) {
		return new Color(_self.red.eval(context), 
			_self.green.eval(context), 
			_self.blue.eval(context), 
			_self.alpha.eval(context))
	}
	
}

@Aspect(className=FONT_SPEC)
abstract class FONT_SPECAspect extends DRAWING_SENTENCEAspect {
	def int eval(Context context) ;
	
}

/*@Aspect(className=FONT_SIZE)
class FONT_SIZEAspect extends FONT_SPECAspect {
	def int eval(Context context) {
	//TODO
	 
		}
	
}*/

@Aspect(className=FONT_STYLE)
class FONT_STYLEAspect extends FONT_SPECAspect {
	def int eval(Context context) {
		context.turtle.fontStyle(_self.style.eval(context))
		return 0
	}
	
}

@Aspect(className=FontStyleValues)
abstract class FontStyleValuesAspect {
		def int eval(Context context) 
}

