/**
 */
package org.inria.diverse.logo.dsl.logoDSL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.inria.diverse.logo.dsl.logoDSL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogoDSLFactoryImpl extends EFactoryImpl implements LogoDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LogoDSLFactory init()
  {
    try
    {
      LogoDSLFactory theLogoDSLFactory = (LogoDSLFactory)EPackage.Registry.INSTANCE.getEFactory(LogoDSLPackage.eNS_URI);
      if (theLogoDSLFactory != null)
      {
        return theLogoDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LogoDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogoDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LogoDSLPackage.LOGO_PROGRAM: return createLogoProgram();
      case LogoDSLPackage.SENTENCE: return createSENTENCE();
      case LogoDSLPackage.MOVE: return createMOVE();
      case LogoDSLPackage.FORWARD: return createFORWARD();
      case LogoDSLPackage.LEFT: return createLEFT();
      case LogoDSLPackage.RIGHT: return createRIGHT();
      case LogoDSLPackage.SET_X: return createSET_X();
      case LogoDSLPackage.SET_Y: return createSET_Y();
      case LogoDSLPackage.DRAWING_SENTENCE: return createDRAWING_SENTENCE();
      case LogoDSLPackage.PENDOWN: return createPENDOWN();
      case LogoDSLPackage.PENUP: return createPENUP();
      case LogoDSLPackage.COLOREABLE: return createCOLOREABLE();
      case LogoDSLPackage.PENCOLOR: return createPENCOLOR();
      case LogoDSLPackage.CANVAS_COLOR: return createCANVAS_COLOR();
      case LogoDSLPackage.COLOR_SPEC: return createCOLOR_SPEC();
      case LogoDSLPackage.FONT_SPEC: return createFONT_SPEC();
      case LogoDSLPackage.FONT_STYLE: return createFONT_STYLE();
      case LogoDSLPackage.FONT_STYLE_VALUES: return createFontStyleValues();
      case LogoDSLPackage.CLEAR: return createCLEAR();
      case LogoDSLPackage.HOME: return createHOME();
      case LogoDSLPackage.DRAW_STRING: return createDRAW_STRING();
      case LogoDSLPackage.REFERENCIABLE: return createREFERENCIABLE();
      case LogoDSLPackage.MAKE: return createMAKE();
      case LogoDSLPackage.VARIABLE_REF: return createVARIABLE_REF();
      case LogoDSLPackage.EXPRESSION: return createEXPRESSION();
      case LogoDSLPackage.VALUE: return createVALUE();
      case LogoDSLPackage.CONTENT: return createCONTENT();
      case LogoDSLPackage.OPERATION: return createOPERATION();
      case LogoDSLPackage.SUM: return createSUM();
      case LogoDSLPackage.SUBTRACT: return createSUBTRACT();
      case LogoDSLPackage.MULTIPLY: return createMULTIPLY();
      case LogoDSLPackage.DIVIDE: return createDIVIDE();
      case LogoDSLPackage.CONTROL_SENTENCES: return createCONTROL_SENTENCES();
      case LogoDSLPackage.REPEAT: return createREPEAT();
      case LogoDSLPackage.TO: return createTO();
      case LogoDSLPackage.PARAM: return createPARAM();
      case LogoDSLPackage.PROCEDURE_CALL: return createPROCEDURE_CALL();
      case LogoDSLPackage.IF_SENTENCE: return createIF_SENTENCE();
      case LogoDSLPackage.BOOLEAN_EXPRESSION: return createBOOLEAN_EXPRESSION();
      case LogoDSLPackage.EQUALS: return createEQUALS();
      case LogoDSLPackage.GREATER_THAN: return createGREATER_THAN();
      case LogoDSLPackage.LESSER_THAN: return createLESSER_THAN();
      case LogoDSLPackage.BOLD: return createBOLD();
      case LogoDSLPackage.ITALIC: return createITALIC();
      case LogoDSLPackage.PLAIN: return createPLAIN();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogoProgram createLogoProgram()
  {
    LogoProgramImpl logoProgram = new LogoProgramImpl();
    return logoProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SENTENCE createSENTENCE()
  {
    SENTENCEImpl sentence = new SENTENCEImpl();
    return sentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MOVE createMOVE()
  {
    MOVEImpl move = new MOVEImpl();
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FORWARD createFORWARD()
  {
    FORWARDImpl forward = new FORWARDImpl();
    return forward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEFT createLEFT()
  {
    LEFTImpl left = new LEFTImpl();
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RIGHT createRIGHT()
  {
    RIGHTImpl right = new RIGHTImpl();
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SET_X createSET_X()
  {
    SET_XImpl seT_X = new SET_XImpl();
    return seT_X;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SET_Y createSET_Y()
  {
    SET_YImpl seT_Y = new SET_YImpl();
    return seT_Y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DRAWING_SENTENCE createDRAWING_SENTENCE()
  {
    DRAWING_SENTENCEImpl drawinG_SENTENCE = new DRAWING_SENTENCEImpl();
    return drawinG_SENTENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PENDOWN createPENDOWN()
  {
    PENDOWNImpl pendown = new PENDOWNImpl();
    return pendown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PENUP createPENUP()
  {
    PENUPImpl penup = new PENUPImpl();
    return penup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COLOREABLE createCOLOREABLE()
  {
    COLOREABLEImpl coloreable = new COLOREABLEImpl();
    return coloreable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PENCOLOR createPENCOLOR()
  {
    PENCOLORImpl pencolor = new PENCOLORImpl();
    return pencolor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CANVAS_COLOR createCANVAS_COLOR()
  {
    CANVAS_COLORImpl canvaS_COLOR = new CANVAS_COLORImpl();
    return canvaS_COLOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COLOR_SPEC createCOLOR_SPEC()
  {
    COLOR_SPECImpl coloR_SPEC = new COLOR_SPECImpl();
    return coloR_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FONT_SPEC createFONT_SPEC()
  {
    FONT_SPECImpl fonT_SPEC = new FONT_SPECImpl();
    return fonT_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FONT_STYLE createFONT_STYLE()
  {
    FONT_STYLEImpl fonT_STYLE = new FONT_STYLEImpl();
    return fonT_STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontStyleValues createFontStyleValues()
  {
    FontStyleValuesImpl fontStyleValues = new FontStyleValuesImpl();
    return fontStyleValues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CLEAR createCLEAR()
  {
    CLEARImpl clear = new CLEARImpl();
    return clear;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HOME createHOME()
  {
    HOMEImpl home = new HOMEImpl();
    return home;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DRAW_STRING createDRAW_STRING()
  {
    DRAW_STRINGImpl draW_STRING = new DRAW_STRINGImpl();
    return draW_STRING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REFERENCIABLE createREFERENCIABLE()
  {
    REFERENCIABLEImpl referenciable = new REFERENCIABLEImpl();
    return referenciable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MAKE createMAKE()
  {
    MAKEImpl make = new MAKEImpl();
    return make;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VARIABLE_REF createVARIABLE_REF()
  {
    VARIABLE_REFImpl variablE_REF = new VARIABLE_REFImpl();
    return variablE_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION createEXPRESSION()
  {
    EXPRESSIONImpl expression = new EXPRESSIONImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VALUE createVALUE()
  {
    VALUEImpl value = new VALUEImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CONTENT createCONTENT()
  {
    CONTENTImpl content = new CONTENTImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OPERATION createOPERATION()
  {
    OPERATIONImpl operation = new OPERATIONImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SUM createSUM()
  {
    SUMImpl sum = new SUMImpl();
    return sum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SUBTRACT createSUBTRACT()
  {
    SUBTRACTImpl subtract = new SUBTRACTImpl();
    return subtract;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MULTIPLY createMULTIPLY()
  {
    MULTIPLYImpl multiply = new MULTIPLYImpl();
    return multiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DIVIDE createDIVIDE()
  {
    DIVIDEImpl divide = new DIVIDEImpl();
    return divide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CONTROL_SENTENCES createCONTROL_SENTENCES()
  {
    CONTROL_SENTENCESImpl controL_SENTENCES = new CONTROL_SENTENCESImpl();
    return controL_SENTENCES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REPEAT createREPEAT()
  {
    REPEATImpl repeat = new REPEATImpl();
    return repeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TO createTO()
  {
    TOImpl to = new TOImpl();
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PARAM createPARAM()
  {
    PARAMImpl param = new PARAMImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PROCEDURE_CALL createPROCEDURE_CALL()
  {
    PROCEDURE_CALLImpl procedurE_CALL = new PROCEDURE_CALLImpl();
    return procedurE_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IF_SENTENCE createIF_SENTENCE()
  {
    IF_SENTENCEImpl iF_SENTENCE = new IF_SENTENCEImpl();
    return iF_SENTENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BOOLEAN_EXPRESSION createBOOLEAN_EXPRESSION()
  {
    BOOLEAN_EXPRESSIONImpl booleaN_EXPRESSION = new BOOLEAN_EXPRESSIONImpl();
    return booleaN_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EQUALS createEQUALS()
  {
    EQUALSImpl equals = new EQUALSImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GREATER_THAN createGREATER_THAN()
  {
    GREATER_THANImpl greateR_THAN = new GREATER_THANImpl();
    return greateR_THAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LESSER_THAN createLESSER_THAN()
  {
    LESSER_THANImpl lesseR_THAN = new LESSER_THANImpl();
    return lesseR_THAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BOLD createBOLD()
  {
    BOLDImpl bold = new BOLDImpl();
    return bold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ITALIC createITALIC()
  {
    ITALICImpl italic = new ITALICImpl();
    return italic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PLAIN createPLAIN()
  {
    PLAINImpl plain = new PLAINImpl();
    return plain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogoDSLPackage getLogoDSLPackage()
  {
    return (LogoDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LogoDSLPackage getPackage()
  {
    return LogoDSLPackage.eINSTANCE;
  }

} //LogoDSLFactoryImpl
