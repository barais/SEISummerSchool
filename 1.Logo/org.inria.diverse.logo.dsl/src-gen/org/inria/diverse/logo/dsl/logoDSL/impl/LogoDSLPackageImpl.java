/**
 */
package org.inria.diverse.logo.dsl.logoDSL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.inria.diverse.logo.dsl.logoDSL.FontStyleValues;
import org.inria.diverse.logo.dsl.logoDSL.LogoDSLFactory;
import org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage;
import org.inria.diverse.logo.dsl.logoDSL.LogoProgram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogoDSLPackageImpl extends EPackageImpl implements LogoDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logoProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sentenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forwardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leftEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rightEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seT_XEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seT_YEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass drawinG_SENTENCEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pendownEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass penupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coloreableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pencolorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass canvaS_COLOREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coloR_SPECEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fonT_SPECEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fonT_STYLEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fontStyleValuesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clearEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass homeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass draW_STRINGEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenciableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass makeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablE_REFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subtractEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controL_SENTENCESEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass repeatEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass toEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass procedurE_CALLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iF_SENTENCEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleaN_EXPRESSIONEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass greateR_THANEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lesseR_THANEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass italicEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plainEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LogoDSLPackageImpl()
  {
    super(eNS_URI, LogoDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LogoDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LogoDSLPackage init()
  {
    if (isInited) return (LogoDSLPackage)EPackage.Registry.INSTANCE.getEPackage(LogoDSLPackage.eNS_URI);

    // Obtain or create and register package
    LogoDSLPackageImpl theLogoDSLPackage = (LogoDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogoDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LogoDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLogoDSLPackage.createPackageContents();

    // Initialize created meta-data
    theLogoDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLogoDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LogoDSLPackage.eNS_URI, theLogoDSLPackage);
    return theLogoDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogoProgram()
  {
    return logoProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogoProgram_Sentences()
  {
    return (EReference)logoProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSENTENCE()
  {
    return sentenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMOVE()
  {
    return moveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMOVE_Amount()
  {
    return (EReference)moveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFORWARD()
  {
    return forwardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLEFT()
  {
    return leftEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRIGHT()
  {
    return rightEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSET_X()
  {
    return seT_XEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSET_Y()
  {
    return seT_YEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDRAWING_SENTENCE()
  {
    return drawinG_SENTENCEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPENDOWN()
  {
    return pendownEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPENUP()
  {
    return penupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCOLOREABLE()
  {
    return coloreableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCOLOREABLE_Color()
  {
    return (EAttribute)coloreableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCOLOREABLE_ColorSpec()
  {
    return (EReference)coloreableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPENCOLOR()
  {
    return pencolorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCANVAS_COLOR()
  {
    return canvaS_COLOREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCOLOR_SPEC()
  {
    return coloR_SPECEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCOLOR_SPEC_Red()
  {
    return (EReference)coloR_SPECEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCOLOR_SPEC_Green()
  {
    return (EReference)coloR_SPECEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCOLOR_SPEC_Blue()
  {
    return (EReference)coloR_SPECEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCOLOR_SPEC_Alpha()
  {
    return (EReference)coloR_SPECEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFONT_SPEC()
  {
    return fonT_SPECEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFONT_STYLE()
  {
    return fonT_STYLEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFONT_STYLE_Style()
  {
    return (EReference)fonT_STYLEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFontStyleValues()
  {
    return fontStyleValuesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCLEAR()
  {
    return clearEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHOME()
  {
    return homeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDRAW_STRING()
  {
    return draW_STRINGEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDRAW_STRING_Text()
  {
    return (EAttribute)draW_STRINGEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getREFERENCIABLE()
  {
    return referenciableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getREFERENCIABLE_Name()
  {
    return (EAttribute)referenciableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMAKE()
  {
    return makeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMAKE_Value()
  {
    return (EReference)makeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVARIABLE_REF()
  {
    return variablE_REFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVARIABLE_REF_ToVar()
  {
    return (EReference)variablE_REFEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEXPRESSION()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVALUE()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVALUE_Val()
  {
    return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCONTENT()
  {
    return contentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCONTENT_Var()
  {
    return (EReference)contentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOPERATION()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOPERATION_TargetVariable()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOPERATION_ValOne()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOPERATION_ValTwo()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSUM()
  {
    return sumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSUBTRACT()
  {
    return subtractEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMULTIPLY()
  {
    return multiplyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDIVIDE()
  {
    return divideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCONTROL_SENTENCES()
  {
    return controL_SENTENCESEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCONTROL_SENTENCES_Commands()
  {
    return (EReference)controL_SENTENCESEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getREPEAT()
  {
    return repeatEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getREPEAT_Times()
  {
    return (EReference)repeatEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTO()
  {
    return toEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTO_Name()
  {
    return (EAttribute)toEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTO_Parameters()
  {
    return (EReference)toEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPARAM()
  {
    return paramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPROCEDURE_CALL()
  {
    return procedurE_CALLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPROCEDURE_CALL_To()
  {
    return (EReference)procedurE_CALLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPROCEDURE_CALL_Params()
  {
    return (EReference)procedurE_CALLEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIF_SENTENCE()
  {
    return iF_SENTENCEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIF_SENTENCE_Condition()
  {
    return (EReference)iF_SENTENCEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBOOLEAN_EXPRESSION()
  {
    return booleaN_EXPRESSIONEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBOOLEAN_EXPRESSION_Op1()
  {
    return (EReference)booleaN_EXPRESSIONEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBOOLEAN_EXPRESSION_Op2()
  {
    return (EReference)booleaN_EXPRESSIONEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEQUALS()
  {
    return equalsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGREATER_THAN()
  {
    return greateR_THANEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLESSER_THAN()
  {
    return lesseR_THANEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBOLD()
  {
    return boldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getITALIC()
  {
    return italicEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPLAIN()
  {
    return plainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogoDSLFactory getLogoDSLFactory()
  {
    return (LogoDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    logoProgramEClass = createEClass(LOGO_PROGRAM);
    createEReference(logoProgramEClass, LOGO_PROGRAM__SENTENCES);

    sentenceEClass = createEClass(SENTENCE);

    moveEClass = createEClass(MOVE);
    createEReference(moveEClass, MOVE__AMOUNT);

    forwardEClass = createEClass(FORWARD);

    leftEClass = createEClass(LEFT);

    rightEClass = createEClass(RIGHT);

    seT_XEClass = createEClass(SET_X);

    seT_YEClass = createEClass(SET_Y);

    drawinG_SENTENCEEClass = createEClass(DRAWING_SENTENCE);

    pendownEClass = createEClass(PENDOWN);

    penupEClass = createEClass(PENUP);

    coloreableEClass = createEClass(COLOREABLE);
    createEAttribute(coloreableEClass, COLOREABLE__COLOR);
    createEReference(coloreableEClass, COLOREABLE__COLOR_SPEC);

    pencolorEClass = createEClass(PENCOLOR);

    canvaS_COLOREClass = createEClass(CANVAS_COLOR);

    coloR_SPECEClass = createEClass(COLOR_SPEC);
    createEReference(coloR_SPECEClass, COLOR_SPEC__RED);
    createEReference(coloR_SPECEClass, COLOR_SPEC__GREEN);
    createEReference(coloR_SPECEClass, COLOR_SPEC__BLUE);
    createEReference(coloR_SPECEClass, COLOR_SPEC__ALPHA);

    fonT_SPECEClass = createEClass(FONT_SPEC);

    fonT_STYLEEClass = createEClass(FONT_STYLE);
    createEReference(fonT_STYLEEClass, FONT_STYLE__STYLE);

    fontStyleValuesEClass = createEClass(FONT_STYLE_VALUES);

    clearEClass = createEClass(CLEAR);

    homeEClass = createEClass(HOME);

    draW_STRINGEClass = createEClass(DRAW_STRING);
    createEAttribute(draW_STRINGEClass, DRAW_STRING__TEXT);

    referenciableEClass = createEClass(REFERENCIABLE);
    createEAttribute(referenciableEClass, REFERENCIABLE__NAME);

    makeEClass = createEClass(MAKE);
    createEReference(makeEClass, MAKE__VALUE);

    variablE_REFEClass = createEClass(VARIABLE_REF);
    createEReference(variablE_REFEClass, VARIABLE_REF__TO_VAR);

    expressionEClass = createEClass(EXPRESSION);

    valueEClass = createEClass(VALUE);
    createEAttribute(valueEClass, VALUE__VAL);

    contentEClass = createEClass(CONTENT);
    createEReference(contentEClass, CONTENT__VAR);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__TARGET_VARIABLE);
    createEReference(operationEClass, OPERATION__VAL_ONE);
    createEReference(operationEClass, OPERATION__VAL_TWO);

    sumEClass = createEClass(SUM);

    subtractEClass = createEClass(SUBTRACT);

    multiplyEClass = createEClass(MULTIPLY);

    divideEClass = createEClass(DIVIDE);

    controL_SENTENCESEClass = createEClass(CONTROL_SENTENCES);
    createEReference(controL_SENTENCESEClass, CONTROL_SENTENCES__COMMANDS);

    repeatEClass = createEClass(REPEAT);
    createEReference(repeatEClass, REPEAT__TIMES);

    toEClass = createEClass(TO);
    createEAttribute(toEClass, TO__NAME);
    createEReference(toEClass, TO__PARAMETERS);

    paramEClass = createEClass(PARAM);

    procedurE_CALLEClass = createEClass(PROCEDURE_CALL);
    createEReference(procedurE_CALLEClass, PROCEDURE_CALL__TO);
    createEReference(procedurE_CALLEClass, PROCEDURE_CALL__PARAMS);

    iF_SENTENCEEClass = createEClass(IF_SENTENCE);
    createEReference(iF_SENTENCEEClass, IF_SENTENCE__CONDITION);

    booleaN_EXPRESSIONEClass = createEClass(BOOLEAN_EXPRESSION);
    createEReference(booleaN_EXPRESSIONEClass, BOOLEAN_EXPRESSION__OP1);
    createEReference(booleaN_EXPRESSIONEClass, BOOLEAN_EXPRESSION__OP2);

    equalsEClass = createEClass(EQUALS);

    greateR_THANEClass = createEClass(GREATER_THAN);

    lesseR_THANEClass = createEClass(LESSER_THAN);

    boldEClass = createEClass(BOLD);

    italicEClass = createEClass(ITALIC);

    plainEClass = createEClass(PLAIN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    moveEClass.getESuperTypes().add(this.getSENTENCE());
    forwardEClass.getESuperTypes().add(this.getMOVE());
    leftEClass.getESuperTypes().add(this.getMOVE());
    rightEClass.getESuperTypes().add(this.getMOVE());
    seT_XEClass.getESuperTypes().add(this.getMOVE());
    seT_YEClass.getESuperTypes().add(this.getMOVE());
    drawinG_SENTENCEEClass.getESuperTypes().add(this.getSENTENCE());
    pendownEClass.getESuperTypes().add(this.getDRAWING_SENTENCE());
    penupEClass.getESuperTypes().add(this.getDRAWING_SENTENCE());
    coloreableEClass.getESuperTypes().add(this.getDRAWING_SENTENCE());
    pencolorEClass.getESuperTypes().add(this.getCOLOREABLE());
    canvaS_COLOREClass.getESuperTypes().add(this.getCOLOREABLE());
    fonT_SPECEClass.getESuperTypes().add(this.getDRAWING_SENTENCE());
    fonT_STYLEEClass.getESuperTypes().add(this.getFONT_SPEC());
    clearEClass.getESuperTypes().add(this.getDRAWING_SENTENCE());
    homeEClass.getESuperTypes().add(this.getDRAWING_SENTENCE());
    draW_STRINGEClass.getESuperTypes().add(this.getDRAWING_SENTENCE());
    makeEClass.getESuperTypes().add(this.getSENTENCE());
    makeEClass.getESuperTypes().add(this.getREFERENCIABLE());
    variablE_REFEClass.getESuperTypes().add(this.getEXPRESSION());
    valueEClass.getESuperTypes().add(this.getEXPRESSION());
    contentEClass.getESuperTypes().add(this.getSENTENCE());
    operationEClass.getESuperTypes().add(this.getSENTENCE());
    sumEClass.getESuperTypes().add(this.getOPERATION());
    subtractEClass.getESuperTypes().add(this.getOPERATION());
    multiplyEClass.getESuperTypes().add(this.getOPERATION());
    divideEClass.getESuperTypes().add(this.getOPERATION());
    controL_SENTENCESEClass.getESuperTypes().add(this.getSENTENCE());
    repeatEClass.getESuperTypes().add(this.getCONTROL_SENTENCES());
    toEClass.getESuperTypes().add(this.getCONTROL_SENTENCES());
    paramEClass.getESuperTypes().add(this.getREFERENCIABLE());
    procedurE_CALLEClass.getESuperTypes().add(this.getSENTENCE());
    iF_SENTENCEEClass.getESuperTypes().add(this.getCONTROL_SENTENCES());
    equalsEClass.getESuperTypes().add(this.getBOOLEAN_EXPRESSION());
    greateR_THANEClass.getESuperTypes().add(this.getBOOLEAN_EXPRESSION());
    lesseR_THANEClass.getESuperTypes().add(this.getBOOLEAN_EXPRESSION());
    boldEClass.getESuperTypes().add(this.getFontStyleValues());
    italicEClass.getESuperTypes().add(this.getFontStyleValues());
    plainEClass.getESuperTypes().add(this.getFontStyleValues());

    // Initialize classes and features; add operations and parameters
    initEClass(logoProgramEClass, LogoProgram.class, "LogoProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogoProgram_Sentences(), this.getSENTENCE(), null, "sentences", null, 0, -1, LogoProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sentenceEClass, org.inria.diverse.logo.dsl.logoDSL.SENTENCE.class, "SENTENCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(moveEClass, org.inria.diverse.logo.dsl.logoDSL.MOVE.class, "MOVE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMOVE_Amount(), this.getEXPRESSION(), null, "amount", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.MOVE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forwardEClass, org.inria.diverse.logo.dsl.logoDSL.FORWARD.class, "FORWARD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(leftEClass, org.inria.diverse.logo.dsl.logoDSL.LEFT.class, "LEFT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rightEClass, org.inria.diverse.logo.dsl.logoDSL.RIGHT.class, "RIGHT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(seT_XEClass, org.inria.diverse.logo.dsl.logoDSL.SET_X.class, "SET_X", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(seT_YEClass, org.inria.diverse.logo.dsl.logoDSL.SET_Y.class, "SET_Y", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(drawinG_SENTENCEEClass, org.inria.diverse.logo.dsl.logoDSL.DRAWING_SENTENCE.class, "DRAWING_SENTENCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pendownEClass, org.inria.diverse.logo.dsl.logoDSL.PENDOWN.class, "PENDOWN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(penupEClass, org.inria.diverse.logo.dsl.logoDSL.PENUP.class, "PENUP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(coloreableEClass, org.inria.diverse.logo.dsl.logoDSL.COLOREABLE.class, "COLOREABLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCOLOREABLE_Color(), ecorePackage.getEString(), "color", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.COLOREABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCOLOREABLE_ColorSpec(), this.getCOLOR_SPEC(), null, "colorSpec", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.COLOREABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pencolorEClass, org.inria.diverse.logo.dsl.logoDSL.PENCOLOR.class, "PENCOLOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(canvaS_COLOREClass, org.inria.diverse.logo.dsl.logoDSL.CANVAS_COLOR.class, "CANVAS_COLOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(coloR_SPECEClass, org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC.class, "COLOR_SPEC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCOLOR_SPEC_Red(), this.getEXPRESSION(), null, "red", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCOLOR_SPEC_Green(), this.getEXPRESSION(), null, "green", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCOLOR_SPEC_Blue(), this.getEXPRESSION(), null, "blue", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCOLOR_SPEC_Alpha(), this.getEXPRESSION(), null, "alpha", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fonT_SPECEClass, org.inria.diverse.logo.dsl.logoDSL.FONT_SPEC.class, "FONT_SPEC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fonT_STYLEEClass, org.inria.diverse.logo.dsl.logoDSL.FONT_STYLE.class, "FONT_STYLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFONT_STYLE_Style(), this.getFontStyleValues(), null, "style", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.FONT_STYLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fontStyleValuesEClass, FontStyleValues.class, "FontStyleValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(clearEClass, org.inria.diverse.logo.dsl.logoDSL.CLEAR.class, "CLEAR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(homeEClass, org.inria.diverse.logo.dsl.logoDSL.HOME.class, "HOME", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(draW_STRINGEClass, org.inria.diverse.logo.dsl.logoDSL.DRAW_STRING.class, "DRAW_STRING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDRAW_STRING_Text(), ecorePackage.getEString(), "text", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.DRAW_STRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenciableEClass, org.inria.diverse.logo.dsl.logoDSL.REFERENCIABLE.class, "REFERENCIABLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getREFERENCIABLE_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.REFERENCIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(makeEClass, org.inria.diverse.logo.dsl.logoDSL.MAKE.class, "MAKE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMAKE_Value(), this.getEXPRESSION(), null, "value", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.MAKE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variablE_REFEClass, org.inria.diverse.logo.dsl.logoDSL.VARIABLE_REF.class, "VARIABLE_REF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVARIABLE_REF_ToVar(), this.getREFERENCIABLE(), null, "toVar", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.VARIABLE_REF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, org.inria.diverse.logo.dsl.logoDSL.EXPRESSION.class, "EXPRESSION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(valueEClass, org.inria.diverse.logo.dsl.logoDSL.VALUE.class, "VALUE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVALUE_Val(), ecorePackage.getEDouble(), "val", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.VALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contentEClass, org.inria.diverse.logo.dsl.logoDSL.CONTENT.class, "CONTENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCONTENT_Var(), this.getMAKE(), null, "var", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.CONTENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, org.inria.diverse.logo.dsl.logoDSL.OPERATION.class, "OPERATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOPERATION_TargetVariable(), this.getMAKE(), null, "targetVariable", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.OPERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOPERATION_ValOne(), this.getEXPRESSION(), null, "valOne", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.OPERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOPERATION_ValTwo(), this.getEXPRESSION(), null, "valTwo", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.OPERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sumEClass, org.inria.diverse.logo.dsl.logoDSL.SUM.class, "SUM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subtractEClass, org.inria.diverse.logo.dsl.logoDSL.SUBTRACT.class, "SUBTRACT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multiplyEClass, org.inria.diverse.logo.dsl.logoDSL.MULTIPLY.class, "MULTIPLY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(divideEClass, org.inria.diverse.logo.dsl.logoDSL.DIVIDE.class, "DIVIDE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(controL_SENTENCESEClass, org.inria.diverse.logo.dsl.logoDSL.CONTROL_SENTENCES.class, "CONTROL_SENTENCES", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCONTROL_SENTENCES_Commands(), this.getSENTENCE(), null, "commands", null, 0, -1, org.inria.diverse.logo.dsl.logoDSL.CONTROL_SENTENCES.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(repeatEClass, org.inria.diverse.logo.dsl.logoDSL.REPEAT.class, "REPEAT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getREPEAT_Times(), this.getEXPRESSION(), null, "times", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.REPEAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(toEClass, org.inria.diverse.logo.dsl.logoDSL.TO.class, "TO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTO_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.TO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTO_Parameters(), this.getPARAM(), null, "parameters", null, 0, -1, org.inria.diverse.logo.dsl.logoDSL.TO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramEClass, org.inria.diverse.logo.dsl.logoDSL.PARAM.class, "PARAM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(procedurE_CALLEClass, org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL.class, "PROCEDURE_CALL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPROCEDURE_CALL_To(), this.getTO(), null, "to", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPROCEDURE_CALL_Params(), this.getEXPRESSION(), null, "params", null, 0, -1, org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iF_SENTENCEEClass, org.inria.diverse.logo.dsl.logoDSL.IF_SENTENCE.class, "IF_SENTENCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIF_SENTENCE_Condition(), this.getBOOLEAN_EXPRESSION(), null, "condition", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.IF_SENTENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleaN_EXPRESSIONEClass, org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION.class, "BOOLEAN_EXPRESSION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBOOLEAN_EXPRESSION_Op1(), this.getEXPRESSION(), null, "op1", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBOOLEAN_EXPRESSION_Op2(), this.getEXPRESSION(), null, "op2", null, 0, 1, org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalsEClass, org.inria.diverse.logo.dsl.logoDSL.EQUALS.class, "EQUALS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(greateR_THANEClass, org.inria.diverse.logo.dsl.logoDSL.GREATER_THAN.class, "GREATER_THAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lesseR_THANEClass, org.inria.diverse.logo.dsl.logoDSL.LESSER_THAN.class, "LESSER_THAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boldEClass, org.inria.diverse.logo.dsl.logoDSL.BOLD.class, "BOLD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(italicEClass, org.inria.diverse.logo.dsl.logoDSL.ITALIC.class, "ITALIC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(plainEClass, org.inria.diverse.logo.dsl.logoDSL.PLAIN.class, "PLAIN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //LogoDSLPackageImpl
