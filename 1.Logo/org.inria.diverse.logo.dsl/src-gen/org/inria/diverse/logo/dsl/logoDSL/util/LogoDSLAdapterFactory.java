/**
 */
package org.inria.diverse.logo.dsl.logoDSL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.inria.diverse.logo.dsl.logoDSL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage
 * @generated
 */
public class LogoDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LogoDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogoDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LogoDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogoDSLSwitch<Adapter> modelSwitch =
    new LogoDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseLogoProgram(LogoProgram object)
      {
        return createLogoProgramAdapter();
      }
      @Override
      public Adapter caseSENTENCE(SENTENCE object)
      {
        return createSENTENCEAdapter();
      }
      @Override
      public Adapter caseMOVE(MOVE object)
      {
        return createMOVEAdapter();
      }
      @Override
      public Adapter caseFORWARD(FORWARD object)
      {
        return createFORWARDAdapter();
      }
      @Override
      public Adapter caseLEFT(LEFT object)
      {
        return createLEFTAdapter();
      }
      @Override
      public Adapter caseRIGHT(RIGHT object)
      {
        return createRIGHTAdapter();
      }
      @Override
      public Adapter caseSET_X(SET_X object)
      {
        return createSET_XAdapter();
      }
      @Override
      public Adapter caseSET_Y(SET_Y object)
      {
        return createSET_YAdapter();
      }
      @Override
      public Adapter caseDRAWING_SENTENCE(DRAWING_SENTENCE object)
      {
        return createDRAWING_SENTENCEAdapter();
      }
      @Override
      public Adapter casePENDOWN(PENDOWN object)
      {
        return createPENDOWNAdapter();
      }
      @Override
      public Adapter casePENUP(PENUP object)
      {
        return createPENUPAdapter();
      }
      @Override
      public Adapter caseCOLOREABLE(COLOREABLE object)
      {
        return createCOLOREABLEAdapter();
      }
      @Override
      public Adapter casePENCOLOR(PENCOLOR object)
      {
        return createPENCOLORAdapter();
      }
      @Override
      public Adapter caseCANVAS_COLOR(CANVAS_COLOR object)
      {
        return createCANVAS_COLORAdapter();
      }
      @Override
      public Adapter caseCOLOR_SPEC(COLOR_SPEC object)
      {
        return createCOLOR_SPECAdapter();
      }
      @Override
      public Adapter caseFONT_SPEC(FONT_SPEC object)
      {
        return createFONT_SPECAdapter();
      }
      @Override
      public Adapter caseFONT_STYLE(FONT_STYLE object)
      {
        return createFONT_STYLEAdapter();
      }
      @Override
      public Adapter caseFontStyleValues(FontStyleValues object)
      {
        return createFontStyleValuesAdapter();
      }
      @Override
      public Adapter caseCLEAR(CLEAR object)
      {
        return createCLEARAdapter();
      }
      @Override
      public Adapter caseHOME(HOME object)
      {
        return createHOMEAdapter();
      }
      @Override
      public Adapter caseDRAW_STRING(DRAW_STRING object)
      {
        return createDRAW_STRINGAdapter();
      }
      @Override
      public Adapter caseREFERENCIABLE(REFERENCIABLE object)
      {
        return createREFERENCIABLEAdapter();
      }
      @Override
      public Adapter caseMAKE(MAKE object)
      {
        return createMAKEAdapter();
      }
      @Override
      public Adapter caseVARIABLE_REF(VARIABLE_REF object)
      {
        return createVARIABLE_REFAdapter();
      }
      @Override
      public Adapter caseEXPRESSION(EXPRESSION object)
      {
        return createEXPRESSIONAdapter();
      }
      @Override
      public Adapter caseVALUE(VALUE object)
      {
        return createVALUEAdapter();
      }
      @Override
      public Adapter caseCONTENT(CONTENT object)
      {
        return createCONTENTAdapter();
      }
      @Override
      public Adapter caseOPERATION(OPERATION object)
      {
        return createOPERATIONAdapter();
      }
      @Override
      public Adapter caseSUM(SUM object)
      {
        return createSUMAdapter();
      }
      @Override
      public Adapter caseSUBTRACT(SUBTRACT object)
      {
        return createSUBTRACTAdapter();
      }
      @Override
      public Adapter caseMULTIPLY(MULTIPLY object)
      {
        return createMULTIPLYAdapter();
      }
      @Override
      public Adapter caseDIVIDE(DIVIDE object)
      {
        return createDIVIDEAdapter();
      }
      @Override
      public Adapter caseCONTROL_SENTENCES(CONTROL_SENTENCES object)
      {
        return createCONTROL_SENTENCESAdapter();
      }
      @Override
      public Adapter caseREPEAT(REPEAT object)
      {
        return createREPEATAdapter();
      }
      @Override
      public Adapter caseTO(TO object)
      {
        return createTOAdapter();
      }
      @Override
      public Adapter casePARAM(PARAM object)
      {
        return createPARAMAdapter();
      }
      @Override
      public Adapter casePROCEDURE_CALL(PROCEDURE_CALL object)
      {
        return createPROCEDURE_CALLAdapter();
      }
      @Override
      public Adapter caseIF_SENTENCE(IF_SENTENCE object)
      {
        return createIF_SENTENCEAdapter();
      }
      @Override
      public Adapter caseBOOLEAN_EXPRESSION(BOOLEAN_EXPRESSION object)
      {
        return createBOOLEAN_EXPRESSIONAdapter();
      }
      @Override
      public Adapter caseEQUALS(EQUALS object)
      {
        return createEQUALSAdapter();
      }
      @Override
      public Adapter caseGREATER_THAN(GREATER_THAN object)
      {
        return createGREATER_THANAdapter();
      }
      @Override
      public Adapter caseLESSER_THAN(LESSER_THAN object)
      {
        return createLESSER_THANAdapter();
      }
      @Override
      public Adapter caseBOLD(BOLD object)
      {
        return createBOLDAdapter();
      }
      @Override
      public Adapter caseITALIC(ITALIC object)
      {
        return createITALICAdapter();
      }
      @Override
      public Adapter casePLAIN(PLAIN object)
      {
        return createPLAINAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.LogoProgram <em>Logo Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoProgram
   * @generated
   */
  public Adapter createLogoProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.SENTENCE <em>SENTENCE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.SENTENCE
   * @generated
   */
  public Adapter createSENTENCEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.MOVE <em>MOVE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.MOVE
   * @generated
   */
  public Adapter createMOVEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.FORWARD <em>FORWARD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.FORWARD
   * @generated
   */
  public Adapter createFORWARDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.LEFT <em>LEFT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.LEFT
   * @generated
   */
  public Adapter createLEFTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.RIGHT <em>RIGHT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.RIGHT
   * @generated
   */
  public Adapter createRIGHTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.SET_X <em>SET X</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.SET_X
   * @generated
   */
  public Adapter createSET_XAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.SET_Y <em>SET Y</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.SET_Y
   * @generated
   */
  public Adapter createSET_YAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.DRAWING_SENTENCE <em>DRAWING SENTENCE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.DRAWING_SENTENCE
   * @generated
   */
  public Adapter createDRAWING_SENTENCEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.PENDOWN <em>PENDOWN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.PENDOWN
   * @generated
   */
  public Adapter createPENDOWNAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.PENUP <em>PENUP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.PENUP
   * @generated
   */
  public Adapter createPENUPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.COLOREABLE <em>COLOREABLE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.COLOREABLE
   * @generated
   */
  public Adapter createCOLOREABLEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.PENCOLOR <em>PENCOLOR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.PENCOLOR
   * @generated
   */
  public Adapter createPENCOLORAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.CANVAS_COLOR <em>CANVAS COLOR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.CANVAS_COLOR
   * @generated
   */
  public Adapter createCANVAS_COLORAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC <em>COLOR SPEC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC
   * @generated
   */
  public Adapter createCOLOR_SPECAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.FONT_SPEC <em>FONT SPEC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.FONT_SPEC
   * @generated
   */
  public Adapter createFONT_SPECAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.FONT_STYLE <em>FONT STYLE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.FONT_STYLE
   * @generated
   */
  public Adapter createFONT_STYLEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.FontStyleValues <em>Font Style Values</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.FontStyleValues
   * @generated
   */
  public Adapter createFontStyleValuesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.CLEAR <em>CLEAR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.CLEAR
   * @generated
   */
  public Adapter createCLEARAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.HOME <em>HOME</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.HOME
   * @generated
   */
  public Adapter createHOMEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.DRAW_STRING <em>DRAW STRING</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.DRAW_STRING
   * @generated
   */
  public Adapter createDRAW_STRINGAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.REFERENCIABLE <em>REFERENCIABLE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.REFERENCIABLE
   * @generated
   */
  public Adapter createREFERENCIABLEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.MAKE <em>MAKE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.MAKE
   * @generated
   */
  public Adapter createMAKEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.VARIABLE_REF <em>VARIABLE REF</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.VARIABLE_REF
   * @generated
   */
  public Adapter createVARIABLE_REFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.EXPRESSION <em>EXPRESSION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.EXPRESSION
   * @generated
   */
  public Adapter createEXPRESSIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.VALUE <em>VALUE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.VALUE
   * @generated
   */
  public Adapter createVALUEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.CONTENT <em>CONTENT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.CONTENT
   * @generated
   */
  public Adapter createCONTENTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.OPERATION <em>OPERATION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.OPERATION
   * @generated
   */
  public Adapter createOPERATIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.SUM <em>SUM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.SUM
   * @generated
   */
  public Adapter createSUMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.SUBTRACT <em>SUBTRACT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.SUBTRACT
   * @generated
   */
  public Adapter createSUBTRACTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.MULTIPLY <em>MULTIPLY</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.MULTIPLY
   * @generated
   */
  public Adapter createMULTIPLYAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.DIVIDE <em>DIVIDE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.DIVIDE
   * @generated
   */
  public Adapter createDIVIDEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.CONTROL_SENTENCES <em>CONTROL SENTENCES</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.CONTROL_SENTENCES
   * @generated
   */
  public Adapter createCONTROL_SENTENCESAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.REPEAT <em>REPEAT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.REPEAT
   * @generated
   */
  public Adapter createREPEATAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.TO <em>TO</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.TO
   * @generated
   */
  public Adapter createTOAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.PARAM <em>PARAM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.PARAM
   * @generated
   */
  public Adapter createPARAMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL <em>PROCEDURE CALL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL
   * @generated
   */
  public Adapter createPROCEDURE_CALLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.IF_SENTENCE <em>IF SENTENCE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.IF_SENTENCE
   * @generated
   */
  public Adapter createIF_SENTENCEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION <em>BOOLEAN EXPRESSION</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION
   * @generated
   */
  public Adapter createBOOLEAN_EXPRESSIONAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.EQUALS <em>EQUALS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.EQUALS
   * @generated
   */
  public Adapter createEQUALSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.GREATER_THAN <em>GREATER THAN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.GREATER_THAN
   * @generated
   */
  public Adapter createGREATER_THANAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.LESSER_THAN <em>LESSER THAN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.LESSER_THAN
   * @generated
   */
  public Adapter createLESSER_THANAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.BOLD <em>BOLD</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.BOLD
   * @generated
   */
  public Adapter createBOLDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.ITALIC <em>ITALIC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.ITALIC
   * @generated
   */
  public Adapter createITALICAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.inria.diverse.logo.dsl.logoDSL.PLAIN <em>PLAIN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.inria.diverse.logo.dsl.logoDSL.PLAIN
   * @generated
   */
  public Adapter createPLAINAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LogoDSLAdapterFactory
