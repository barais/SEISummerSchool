/**
 */
package org.inria.diverse.logo.dsl.logoDSL.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.inria.diverse.logo.dsl.logoDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage
 * @generated
 */
public class LogoDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LogoDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogoDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LogoDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LogoDSLPackage.LOGO_PROGRAM:
      {
        LogoProgram logoProgram = (LogoProgram)theEObject;
        T result = caseLogoProgram(logoProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.SENTENCE:
      {
        SENTENCE sentence = (SENTENCE)theEObject;
        T result = caseSENTENCE(sentence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.MOVE:
      {
        MOVE move = (MOVE)theEObject;
        T result = caseMOVE(move);
        if (result == null) result = caseSENTENCE(move);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.FORWARD:
      {
        FORWARD forward = (FORWARD)theEObject;
        T result = caseFORWARD(forward);
        if (result == null) result = caseMOVE(forward);
        if (result == null) result = caseSENTENCE(forward);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.LEFT:
      {
        LEFT left = (LEFT)theEObject;
        T result = caseLEFT(left);
        if (result == null) result = caseMOVE(left);
        if (result == null) result = caseSENTENCE(left);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.RIGHT:
      {
        RIGHT right = (RIGHT)theEObject;
        T result = caseRIGHT(right);
        if (result == null) result = caseMOVE(right);
        if (result == null) result = caseSENTENCE(right);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.SET_X:
      {
        SET_X seT_X = (SET_X)theEObject;
        T result = caseSET_X(seT_X);
        if (result == null) result = caseMOVE(seT_X);
        if (result == null) result = caseSENTENCE(seT_X);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.SET_Y:
      {
        SET_Y seT_Y = (SET_Y)theEObject;
        T result = caseSET_Y(seT_Y);
        if (result == null) result = caseMOVE(seT_Y);
        if (result == null) result = caseSENTENCE(seT_Y);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.DRAWING_SENTENCE:
      {
        DRAWING_SENTENCE drawinG_SENTENCE = (DRAWING_SENTENCE)theEObject;
        T result = caseDRAWING_SENTENCE(drawinG_SENTENCE);
        if (result == null) result = caseSENTENCE(drawinG_SENTENCE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.PENDOWN:
      {
        PENDOWN pendown = (PENDOWN)theEObject;
        T result = casePENDOWN(pendown);
        if (result == null) result = caseDRAWING_SENTENCE(pendown);
        if (result == null) result = caseSENTENCE(pendown);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.PENUP:
      {
        PENUP penup = (PENUP)theEObject;
        T result = casePENUP(penup);
        if (result == null) result = caseDRAWING_SENTENCE(penup);
        if (result == null) result = caseSENTENCE(penup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.COLOREABLE:
      {
        COLOREABLE coloreable = (COLOREABLE)theEObject;
        T result = caseCOLOREABLE(coloreable);
        if (result == null) result = caseDRAWING_SENTENCE(coloreable);
        if (result == null) result = caseSENTENCE(coloreable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.PENCOLOR:
      {
        PENCOLOR pencolor = (PENCOLOR)theEObject;
        T result = casePENCOLOR(pencolor);
        if (result == null) result = caseCOLOREABLE(pencolor);
        if (result == null) result = caseDRAWING_SENTENCE(pencolor);
        if (result == null) result = caseSENTENCE(pencolor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.CANVAS_COLOR:
      {
        CANVAS_COLOR canvaS_COLOR = (CANVAS_COLOR)theEObject;
        T result = caseCANVAS_COLOR(canvaS_COLOR);
        if (result == null) result = caseCOLOREABLE(canvaS_COLOR);
        if (result == null) result = caseDRAWING_SENTENCE(canvaS_COLOR);
        if (result == null) result = caseSENTENCE(canvaS_COLOR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.COLOR_SPEC:
      {
        COLOR_SPEC coloR_SPEC = (COLOR_SPEC)theEObject;
        T result = caseCOLOR_SPEC(coloR_SPEC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.FONT_SPEC:
      {
        FONT_SPEC fonT_SPEC = (FONT_SPEC)theEObject;
        T result = caseFONT_SPEC(fonT_SPEC);
        if (result == null) result = caseDRAWING_SENTENCE(fonT_SPEC);
        if (result == null) result = caseSENTENCE(fonT_SPEC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.FONT_STYLE:
      {
        FONT_STYLE fonT_STYLE = (FONT_STYLE)theEObject;
        T result = caseFONT_STYLE(fonT_STYLE);
        if (result == null) result = caseFONT_SPEC(fonT_STYLE);
        if (result == null) result = caseDRAWING_SENTENCE(fonT_STYLE);
        if (result == null) result = caseSENTENCE(fonT_STYLE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.FONT_STYLE_VALUES:
      {
        FontStyleValues fontStyleValues = (FontStyleValues)theEObject;
        T result = caseFontStyleValues(fontStyleValues);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.CLEAR:
      {
        CLEAR clear = (CLEAR)theEObject;
        T result = caseCLEAR(clear);
        if (result == null) result = caseDRAWING_SENTENCE(clear);
        if (result == null) result = caseSENTENCE(clear);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.HOME:
      {
        HOME home = (HOME)theEObject;
        T result = caseHOME(home);
        if (result == null) result = caseDRAWING_SENTENCE(home);
        if (result == null) result = caseSENTENCE(home);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.DRAW_STRING:
      {
        DRAW_STRING draW_STRING = (DRAW_STRING)theEObject;
        T result = caseDRAW_STRING(draW_STRING);
        if (result == null) result = caseDRAWING_SENTENCE(draW_STRING);
        if (result == null) result = caseSENTENCE(draW_STRING);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.REFERENCIABLE:
      {
        REFERENCIABLE referenciable = (REFERENCIABLE)theEObject;
        T result = caseREFERENCIABLE(referenciable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.MAKE:
      {
        MAKE make = (MAKE)theEObject;
        T result = caseMAKE(make);
        if (result == null) result = caseSENTENCE(make);
        if (result == null) result = caseREFERENCIABLE(make);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.VARIABLE_REF:
      {
        VARIABLE_REF variablE_REF = (VARIABLE_REF)theEObject;
        T result = caseVARIABLE_REF(variablE_REF);
        if (result == null) result = caseEXPRESSION(variablE_REF);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.EXPRESSION:
      {
        EXPRESSION expression = (EXPRESSION)theEObject;
        T result = caseEXPRESSION(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.VALUE:
      {
        VALUE value = (VALUE)theEObject;
        T result = caseVALUE(value);
        if (result == null) result = caseEXPRESSION(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.CONTENT:
      {
        CONTENT content = (CONTENT)theEObject;
        T result = caseCONTENT(content);
        if (result == null) result = caseSENTENCE(content);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.OPERATION:
      {
        OPERATION operation = (OPERATION)theEObject;
        T result = caseOPERATION(operation);
        if (result == null) result = caseSENTENCE(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.SUM:
      {
        SUM sum = (SUM)theEObject;
        T result = caseSUM(sum);
        if (result == null) result = caseOPERATION(sum);
        if (result == null) result = caseSENTENCE(sum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.SUBTRACT:
      {
        SUBTRACT subtract = (SUBTRACT)theEObject;
        T result = caseSUBTRACT(subtract);
        if (result == null) result = caseOPERATION(subtract);
        if (result == null) result = caseSENTENCE(subtract);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.MULTIPLY:
      {
        MULTIPLY multiply = (MULTIPLY)theEObject;
        T result = caseMULTIPLY(multiply);
        if (result == null) result = caseOPERATION(multiply);
        if (result == null) result = caseSENTENCE(multiply);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.DIVIDE:
      {
        DIVIDE divide = (DIVIDE)theEObject;
        T result = caseDIVIDE(divide);
        if (result == null) result = caseOPERATION(divide);
        if (result == null) result = caseSENTENCE(divide);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.CONTROL_SENTENCES:
      {
        CONTROL_SENTENCES controL_SENTENCES = (CONTROL_SENTENCES)theEObject;
        T result = caseCONTROL_SENTENCES(controL_SENTENCES);
        if (result == null) result = caseSENTENCE(controL_SENTENCES);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.REPEAT:
      {
        REPEAT repeat = (REPEAT)theEObject;
        T result = caseREPEAT(repeat);
        if (result == null) result = caseCONTROL_SENTENCES(repeat);
        if (result == null) result = caseSENTENCE(repeat);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.TO:
      {
        TO to = (TO)theEObject;
        T result = caseTO(to);
        if (result == null) result = caseCONTROL_SENTENCES(to);
        if (result == null) result = caseSENTENCE(to);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.PARAM:
      {
        PARAM param = (PARAM)theEObject;
        T result = casePARAM(param);
        if (result == null) result = caseREFERENCIABLE(param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.PROCEDURE_CALL:
      {
        PROCEDURE_CALL procedurE_CALL = (PROCEDURE_CALL)theEObject;
        T result = casePROCEDURE_CALL(procedurE_CALL);
        if (result == null) result = caseSENTENCE(procedurE_CALL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.IF_SENTENCE:
      {
        IF_SENTENCE iF_SENTENCE = (IF_SENTENCE)theEObject;
        T result = caseIF_SENTENCE(iF_SENTENCE);
        if (result == null) result = caseCONTROL_SENTENCES(iF_SENTENCE);
        if (result == null) result = caseSENTENCE(iF_SENTENCE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.BOOLEAN_EXPRESSION:
      {
        BOOLEAN_EXPRESSION booleaN_EXPRESSION = (BOOLEAN_EXPRESSION)theEObject;
        T result = caseBOOLEAN_EXPRESSION(booleaN_EXPRESSION);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.EQUALS:
      {
        EQUALS equals = (EQUALS)theEObject;
        T result = caseEQUALS(equals);
        if (result == null) result = caseBOOLEAN_EXPRESSION(equals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.GREATER_THAN:
      {
        GREATER_THAN greateR_THAN = (GREATER_THAN)theEObject;
        T result = caseGREATER_THAN(greateR_THAN);
        if (result == null) result = caseBOOLEAN_EXPRESSION(greateR_THAN);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.LESSER_THAN:
      {
        LESSER_THAN lesseR_THAN = (LESSER_THAN)theEObject;
        T result = caseLESSER_THAN(lesseR_THAN);
        if (result == null) result = caseBOOLEAN_EXPRESSION(lesseR_THAN);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.BOLD:
      {
        BOLD bold = (BOLD)theEObject;
        T result = caseBOLD(bold);
        if (result == null) result = caseFontStyleValues(bold);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.ITALIC:
      {
        ITALIC italic = (ITALIC)theEObject;
        T result = caseITALIC(italic);
        if (result == null) result = caseFontStyleValues(italic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LogoDSLPackage.PLAIN:
      {
        PLAIN plain = (PLAIN)theEObject;
        T result = casePLAIN(plain);
        if (result == null) result = caseFontStyleValues(plain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logo Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logo Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogoProgram(LogoProgram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SENTENCE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SENTENCE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSENTENCE(SENTENCE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MOVE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MOVE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMOVE(MOVE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FORWARD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FORWARD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFORWARD(FORWARD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LEFT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LEFT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLEFT(LEFT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RIGHT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RIGHT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRIGHT(RIGHT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SET X</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SET X</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSET_X(SET_X object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SET Y</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SET Y</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSET_Y(SET_Y object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DRAWING SENTENCE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DRAWING SENTENCE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDRAWING_SENTENCE(DRAWING_SENTENCE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PENDOWN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PENDOWN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePENDOWN(PENDOWN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PENUP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PENUP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePENUP(PENUP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>COLOREABLE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>COLOREABLE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCOLOREABLE(COLOREABLE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PENCOLOR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PENCOLOR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePENCOLOR(PENCOLOR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CANVAS COLOR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CANVAS COLOR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCANVAS_COLOR(CANVAS_COLOR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>COLOR SPEC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>COLOR SPEC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCOLOR_SPEC(COLOR_SPEC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FONT SPEC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FONT SPEC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFONT_SPEC(FONT_SPEC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FONT STYLE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FONT STYLE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFONT_STYLE(FONT_STYLE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Font Style Values</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Font Style Values</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFontStyleValues(FontStyleValues object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CLEAR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CLEAR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCLEAR(CLEAR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>HOME</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>HOME</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHOME(HOME object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DRAW STRING</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DRAW STRING</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDRAW_STRING(DRAW_STRING object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>REFERENCIABLE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>REFERENCIABLE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseREFERENCIABLE(REFERENCIABLE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MAKE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MAKE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMAKE(MAKE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VARIABLE REF</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VARIABLE REF</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVARIABLE_REF(VARIABLE_REF object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EXPRESSION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EXPRESSION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEXPRESSION(EXPRESSION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VALUE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VALUE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVALUE(VALUE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CONTENT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CONTENT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCONTENT(CONTENT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OPERATION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OPERATION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOPERATION(OPERATION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SUM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SUM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSUM(SUM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SUBTRACT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SUBTRACT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSUBTRACT(SUBTRACT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MULTIPLY</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MULTIPLY</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMULTIPLY(MULTIPLY object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DIVIDE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DIVIDE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDIVIDE(DIVIDE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CONTROL SENTENCES</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CONTROL SENTENCES</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCONTROL_SENTENCES(CONTROL_SENTENCES object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>REPEAT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>REPEAT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseREPEAT(REPEAT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TO</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TO</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTO(TO object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PARAM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PARAM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePARAM(PARAM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PROCEDURE CALL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PROCEDURE CALL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePROCEDURE_CALL(PROCEDURE_CALL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IF SENTENCE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IF SENTENCE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIF_SENTENCE(IF_SENTENCE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BOOLEAN EXPRESSION</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BOOLEAN EXPRESSION</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBOOLEAN_EXPRESSION(BOOLEAN_EXPRESSION object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EQUALS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EQUALS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEQUALS(EQUALS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>GREATER THAN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>GREATER THAN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGREATER_THAN(GREATER_THAN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>LESSER THAN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>LESSER THAN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLESSER_THAN(LESSER_THAN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BOLD</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BOLD</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBOLD(BOLD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ITALIC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ITALIC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseITALIC(ITALIC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PLAIN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PLAIN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePLAIN(PLAIN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LogoDSLSwitch
