/**
 */
package org.inria.diverse.logo.dsl.logoDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLFactory
 * @model kind="package"
 * @generated
 */
public interface LogoDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "logoDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.inria.fr/diverse/logo/DSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "logoDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LogoDSLPackage eINSTANCE = org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.LogoProgramImpl <em>Logo Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoProgramImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getLogoProgram()
   * @generated
   */
  int LOGO_PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGO_PROGRAM__SENTENCES = 0;

  /**
   * The number of structural features of the '<em>Logo Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGO_PROGRAM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.SENTENCEImpl <em>SENTENCE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.SENTENCEImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getSENTENCE()
   * @generated
   */
  int SENTENCE = 1;

  /**
   * The number of structural features of the '<em>SENTENCE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENTENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.MOVEImpl <em>MOVE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.MOVEImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getMOVE()
   * @generated
   */
  int MOVE = 2;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE__AMOUNT = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>MOVE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.FORWARDImpl <em>FORWARD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.FORWARDImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getFORWARD()
   * @generated
   */
  int FORWARD = 3;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD__AMOUNT = MOVE__AMOUNT;

  /**
   * The number of structural features of the '<em>FORWARD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORWARD_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.LEFTImpl <em>LEFT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LEFTImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getLEFT()
   * @generated
   */
  int LEFT = 4;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT__AMOUNT = MOVE__AMOUNT;

  /**
   * The number of structural features of the '<em>LEFT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEFT_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.RIGHTImpl <em>RIGHT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.RIGHTImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getRIGHT()
   * @generated
   */
  int RIGHT = 5;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT__AMOUNT = MOVE__AMOUNT;

  /**
   * The number of structural features of the '<em>RIGHT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.SET_XImpl <em>SET X</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.SET_XImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getSET_X()
   * @generated
   */
  int SET_X = 6;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_X__AMOUNT = MOVE__AMOUNT;

  /**
   * The number of structural features of the '<em>SET X</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_X_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.SET_YImpl <em>SET Y</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.SET_YImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getSET_Y()
   * @generated
   */
  int SET_Y = 7;

  /**
   * The feature id for the '<em><b>Amount</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_Y__AMOUNT = MOVE__AMOUNT;

  /**
   * The number of structural features of the '<em>SET Y</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_Y_FEATURE_COUNT = MOVE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.DRAWING_SENTENCEImpl <em>DRAWING SENTENCE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.DRAWING_SENTENCEImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getDRAWING_SENTENCE()
   * @generated
   */
  int DRAWING_SENTENCE = 8;

  /**
   * The number of structural features of the '<em>DRAWING SENTENCE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAWING_SENTENCE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.PENDOWNImpl <em>PENDOWN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.PENDOWNImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getPENDOWN()
   * @generated
   */
  int PENDOWN = 9;

  /**
   * The number of structural features of the '<em>PENDOWN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PENDOWN_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.PENUPImpl <em>PENUP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.PENUPImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getPENUP()
   * @generated
   */
  int PENUP = 10;

  /**
   * The number of structural features of the '<em>PENUP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PENUP_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.COLOREABLEImpl <em>COLOREABLE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.COLOREABLEImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getCOLOREABLE()
   * @generated
   */
  int COLOREABLE = 11;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOREABLE__COLOR = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Color Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOREABLE__COLOR_SPEC = DRAWING_SENTENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>COLOREABLE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOREABLE_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.PENCOLORImpl <em>PENCOLOR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.PENCOLORImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getPENCOLOR()
   * @generated
   */
  int PENCOLOR = 12;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PENCOLOR__COLOR = COLOREABLE__COLOR;

  /**
   * The feature id for the '<em><b>Color Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PENCOLOR__COLOR_SPEC = COLOREABLE__COLOR_SPEC;

  /**
   * The number of structural features of the '<em>PENCOLOR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PENCOLOR_FEATURE_COUNT = COLOREABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.CANVAS_COLORImpl <em>CANVAS COLOR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.CANVAS_COLORImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getCANVAS_COLOR()
   * @generated
   */
  int CANVAS_COLOR = 13;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_COLOR__COLOR = COLOREABLE__COLOR;

  /**
   * The feature id for the '<em><b>Color Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_COLOR__COLOR_SPEC = COLOREABLE__COLOR_SPEC;

  /**
   * The number of structural features of the '<em>CANVAS COLOR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANVAS_COLOR_FEATURE_COUNT = COLOREABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.COLOR_SPECImpl <em>COLOR SPEC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.COLOR_SPECImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getCOLOR_SPEC()
   * @generated
   */
  int COLOR_SPEC = 14;

  /**
   * The feature id for the '<em><b>Red</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_SPEC__RED = 0;

  /**
   * The feature id for the '<em><b>Green</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_SPEC__GREEN = 1;

  /**
   * The feature id for the '<em><b>Blue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_SPEC__BLUE = 2;

  /**
   * The feature id for the '<em><b>Alpha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_SPEC__ALPHA = 3;

  /**
   * The number of structural features of the '<em>COLOR SPEC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_SPEC_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.FONT_SPECImpl <em>FONT SPEC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.FONT_SPECImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getFONT_SPEC()
   * @generated
   */
  int FONT_SPEC = 15;

  /**
   * The number of structural features of the '<em>FONT SPEC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_SPEC_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.FONT_STYLEImpl <em>FONT STYLE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.FONT_STYLEImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getFONT_STYLE()
   * @generated
   */
  int FONT_STYLE = 16;

  /**
   * The feature id for the '<em><b>Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE__STYLE = FONT_SPEC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>FONT STYLE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE_FEATURE_COUNT = FONT_SPEC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.FontStyleValuesImpl <em>Font Style Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.FontStyleValuesImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getFontStyleValues()
   * @generated
   */
  int FONT_STYLE_VALUES = 17;

  /**
   * The number of structural features of the '<em>Font Style Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FONT_STYLE_VALUES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.CLEARImpl <em>CLEAR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.CLEARImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getCLEAR()
   * @generated
   */
  int CLEAR = 18;

  /**
   * The number of structural features of the '<em>CLEAR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLEAR_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.HOMEImpl <em>HOME</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.HOMEImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getHOME()
   * @generated
   */
  int HOME = 19;

  /**
   * The number of structural features of the '<em>HOME</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOME_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.DRAW_STRINGImpl <em>DRAW STRING</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.DRAW_STRINGImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getDRAW_STRING()
   * @generated
   */
  int DRAW_STRING = 20;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAW_STRING__TEXT = DRAWING_SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>DRAW STRING</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DRAW_STRING_FEATURE_COUNT = DRAWING_SENTENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.REFERENCIABLEImpl <em>REFERENCIABLE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.REFERENCIABLEImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getREFERENCIABLE()
   * @generated
   */
  int REFERENCIABLE = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>REFERENCIABLE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.MAKEImpl <em>MAKE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.MAKEImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getMAKE()
   * @generated
   */
  int MAKE = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE__NAME = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE__VALUE = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MAKE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAKE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.EXPRESSIONImpl <em>EXPRESSION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.EXPRESSIONImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getEXPRESSION()
   * @generated
   */
  int EXPRESSION = 24;

  /**
   * The number of structural features of the '<em>EXPRESSION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.VARIABLE_REFImpl <em>VARIABLE REF</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.VARIABLE_REFImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getVARIABLE_REF()
   * @generated
   */
  int VARIABLE_REF = 23;

  /**
   * The feature id for the '<em><b>To Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF__TO_VAR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>VARIABLE REF</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.VALUEImpl <em>VALUE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.VALUEImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getVALUE()
   * @generated
   */
  int VALUE = 25;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VAL = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>VALUE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.CONTENTImpl <em>CONTENT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.CONTENTImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getCONTENT()
   * @generated
   */
  int CONTENT = 26;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__VAR = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CONTENT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.OPERATIONImpl <em>OPERATION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.OPERATIONImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getOPERATION()
   * @generated
   */
  int OPERATION = 27;

  /**
   * The feature id for the '<em><b>Target Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TARGET_VARIABLE = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Val One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VAL_ONE = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Val Two</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VAL_TWO = SENTENCE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>OPERATION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.SUMImpl <em>SUM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.SUMImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getSUM()
   * @generated
   */
  int SUM = 28;

  /**
   * The feature id for the '<em><b>Target Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM__TARGET_VARIABLE = OPERATION__TARGET_VARIABLE;

  /**
   * The feature id for the '<em><b>Val One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM__VAL_ONE = OPERATION__VAL_ONE;

  /**
   * The feature id for the '<em><b>Val Two</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM__VAL_TWO = OPERATION__VAL_TWO;

  /**
   * The number of structural features of the '<em>SUM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUM_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.SUBTRACTImpl <em>SUBTRACT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.SUBTRACTImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getSUBTRACT()
   * @generated
   */
  int SUBTRACT = 29;

  /**
   * The feature id for the '<em><b>Target Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACT__TARGET_VARIABLE = OPERATION__TARGET_VARIABLE;

  /**
   * The feature id for the '<em><b>Val One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACT__VAL_ONE = OPERATION__VAL_ONE;

  /**
   * The feature id for the '<em><b>Val Two</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACT__VAL_TWO = OPERATION__VAL_TWO;

  /**
   * The number of structural features of the '<em>SUBTRACT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTRACT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.MULTIPLYImpl <em>MULTIPLY</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.MULTIPLYImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getMULTIPLY()
   * @generated
   */
  int MULTIPLY = 30;

  /**
   * The feature id for the '<em><b>Target Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__TARGET_VARIABLE = OPERATION__TARGET_VARIABLE;

  /**
   * The feature id for the '<em><b>Val One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__VAL_ONE = OPERATION__VAL_ONE;

  /**
   * The feature id for the '<em><b>Val Two</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__VAL_TWO = OPERATION__VAL_TWO;

  /**
   * The number of structural features of the '<em>MULTIPLY</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.DIVIDEImpl <em>DIVIDE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.DIVIDEImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getDIVIDE()
   * @generated
   */
  int DIVIDE = 31;

  /**
   * The feature id for the '<em><b>Target Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE__TARGET_VARIABLE = OPERATION__TARGET_VARIABLE;

  /**
   * The feature id for the '<em><b>Val One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE__VAL_ONE = OPERATION__VAL_ONE;

  /**
   * The feature id for the '<em><b>Val Two</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE__VAL_TWO = OPERATION__VAL_TWO;

  /**
   * The number of structural features of the '<em>DIVIDE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVIDE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.CONTROL_SENTENCESImpl <em>CONTROL SENTENCES</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.CONTROL_SENTENCESImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getCONTROL_SENTENCES()
   * @generated
   */
  int CONTROL_SENTENCES = 32;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SENTENCES__COMMANDS = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CONTROL SENTENCES</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_SENTENCES_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.REPEATImpl <em>REPEAT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.REPEATImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getREPEAT()
   * @generated
   */
  int REPEAT = 33;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__COMMANDS = CONTROL_SENTENCES__COMMANDS;

  /**
   * The feature id for the '<em><b>Times</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT__TIMES = CONTROL_SENTENCES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>REPEAT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPEAT_FEATURE_COUNT = CONTROL_SENTENCES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.TOImpl <em>TO</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.TOImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getTO()
   * @generated
   */
  int TO = 34;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO__COMMANDS = CONTROL_SENTENCES__COMMANDS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO__NAME = CONTROL_SENTENCES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO__PARAMETERS = CONTROL_SENTENCES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>TO</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_FEATURE_COUNT = CONTROL_SENTENCES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.PARAMImpl <em>PARAM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.PARAMImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getPARAM()
   * @generated
   */
  int PARAM = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = REFERENCIABLE__NAME;

  /**
   * The number of structural features of the '<em>PARAM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = REFERENCIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.PROCEDURE_CALLImpl <em>PROCEDURE CALL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.PROCEDURE_CALLImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getPROCEDURE_CALL()
   * @generated
   */
  int PROCEDURE_CALL = 36;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL__TO = SENTENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL__PARAMS = SENTENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>PROCEDURE CALL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCEDURE_CALL_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.IF_SENTENCEImpl <em>IF SENTENCE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.IF_SENTENCEImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getIF_SENTENCE()
   * @generated
   */
  int IF_SENTENCE = 37;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SENTENCE__COMMANDS = CONTROL_SENTENCES__COMMANDS;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SENTENCE__CONDITION = CONTROL_SENTENCES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>IF SENTENCE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_SENTENCE_FEATURE_COUNT = CONTROL_SENTENCES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.BOOLEAN_EXPRESSIONImpl <em>BOOLEAN EXPRESSION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.BOOLEAN_EXPRESSIONImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getBOOLEAN_EXPRESSION()
   * @generated
   */
  int BOOLEAN_EXPRESSION = 38;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__OP1 = 0;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION__OP2 = 1;

  /**
   * The number of structural features of the '<em>BOOLEAN EXPRESSION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.EQUALSImpl <em>EQUALS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.EQUALSImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getEQUALS()
   * @generated
   */
  int EQUALS = 39;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__OP1 = BOOLEAN_EXPRESSION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__OP2 = BOOLEAN_EXPRESSION__OP2;

  /**
   * The number of structural features of the '<em>EQUALS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.GREATER_THANImpl <em>GREATER THAN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.GREATER_THANImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getGREATER_THAN()
   * @generated
   */
  int GREATER_THAN = 40;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN__OP1 = BOOLEAN_EXPRESSION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN__OP2 = BOOLEAN_EXPRESSION__OP2;

  /**
   * The number of structural features of the '<em>GREATER THAN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_THAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.LESSER_THANImpl <em>LESSER THAN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LESSER_THANImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getLESSER_THAN()
   * @generated
   */
  int LESSER_THAN = 41;

  /**
   * The feature id for the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESSER_THAN__OP1 = BOOLEAN_EXPRESSION__OP1;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESSER_THAN__OP2 = BOOLEAN_EXPRESSION__OP2;

  /**
   * The number of structural features of the '<em>LESSER THAN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESSER_THAN_FEATURE_COUNT = BOOLEAN_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.BOLDImpl <em>BOLD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.BOLDImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getBOLD()
   * @generated
   */
  int BOLD = 42;

  /**
   * The number of structural features of the '<em>BOLD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOLD_FEATURE_COUNT = FONT_STYLE_VALUES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.ITALICImpl <em>ITALIC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.ITALICImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getITALIC()
   * @generated
   */
  int ITALIC = 43;

  /**
   * The number of structural features of the '<em>ITALIC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITALIC_FEATURE_COUNT = FONT_STYLE_VALUES_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.PLAINImpl <em>PLAIN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.PLAINImpl
   * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getPLAIN()
   * @generated
   */
  int PLAIN = 44;

  /**
   * The number of structural features of the '<em>PLAIN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAIN_FEATURE_COUNT = FONT_STYLE_VALUES_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.LogoProgram <em>Logo Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logo Program</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoProgram
   * @generated
   */
  EClass getLogoProgram();

  /**
   * Returns the meta object for the containment reference list '{@link org.inria.diverse.logo.dsl.logoDSL.LogoProgram#getSentences <em>Sentences</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sentences</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoProgram#getSentences()
   * @see #getLogoProgram()
   * @generated
   */
  EReference getLogoProgram_Sentences();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.SENTENCE <em>SENTENCE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SENTENCE</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.SENTENCE
   * @generated
   */
  EClass getSENTENCE();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.MOVE <em>MOVE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MOVE</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.MOVE
   * @generated
   */
  EClass getMOVE();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.MOVE#getAmount <em>Amount</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Amount</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.MOVE#getAmount()
   * @see #getMOVE()
   * @generated
   */
  EReference getMOVE_Amount();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.FORWARD <em>FORWARD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FORWARD</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.FORWARD
   * @generated
   */
  EClass getFORWARD();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.LEFT <em>LEFT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LEFT</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.LEFT
   * @generated
   */
  EClass getLEFT();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.RIGHT <em>RIGHT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RIGHT</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.RIGHT
   * @generated
   */
  EClass getRIGHT();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.SET_X <em>SET X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SET X</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.SET_X
   * @generated
   */
  EClass getSET_X();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.SET_Y <em>SET Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SET Y</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.SET_Y
   * @generated
   */
  EClass getSET_Y();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.DRAWING_SENTENCE <em>DRAWING SENTENCE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DRAWING SENTENCE</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.DRAWING_SENTENCE
   * @generated
   */
  EClass getDRAWING_SENTENCE();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.PENDOWN <em>PENDOWN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PENDOWN</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.PENDOWN
   * @generated
   */
  EClass getPENDOWN();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.PENUP <em>PENUP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PENUP</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.PENUP
   * @generated
   */
  EClass getPENUP();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.COLOREABLE <em>COLOREABLE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>COLOREABLE</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.COLOREABLE
   * @generated
   */
  EClass getCOLOREABLE();

  /**
   * Returns the meta object for the attribute '{@link org.inria.diverse.logo.dsl.logoDSL.COLOREABLE#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.COLOREABLE#getColor()
   * @see #getCOLOREABLE()
   * @generated
   */
  EAttribute getCOLOREABLE_Color();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.COLOREABLE#getColorSpec <em>Color Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Color Spec</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.COLOREABLE#getColorSpec()
   * @see #getCOLOREABLE()
   * @generated
   */
  EReference getCOLOREABLE_ColorSpec();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.PENCOLOR <em>PENCOLOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PENCOLOR</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.PENCOLOR
   * @generated
   */
  EClass getPENCOLOR();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.CANVAS_COLOR <em>CANVAS COLOR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CANVAS COLOR</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.CANVAS_COLOR
   * @generated
   */
  EClass getCANVAS_COLOR();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC <em>COLOR SPEC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>COLOR SPEC</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC
   * @generated
   */
  EClass getCOLOR_SPEC();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC#getRed <em>Red</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Red</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC#getRed()
   * @see #getCOLOR_SPEC()
   * @generated
   */
  EReference getCOLOR_SPEC_Red();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC#getGreen <em>Green</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Green</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC#getGreen()
   * @see #getCOLOR_SPEC()
   * @generated
   */
  EReference getCOLOR_SPEC_Green();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC#getBlue <em>Blue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Blue</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC#getBlue()
   * @see #getCOLOR_SPEC()
   * @generated
   */
  EReference getCOLOR_SPEC_Blue();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC#getAlpha <em>Alpha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alpha</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC#getAlpha()
   * @see #getCOLOR_SPEC()
   * @generated
   */
  EReference getCOLOR_SPEC_Alpha();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.FONT_SPEC <em>FONT SPEC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FONT SPEC</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.FONT_SPEC
   * @generated
   */
  EClass getFONT_SPEC();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.FONT_STYLE <em>FONT STYLE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>FONT STYLE</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.FONT_STYLE
   * @generated
   */
  EClass getFONT_STYLE();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.FONT_STYLE#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Style</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.FONT_STYLE#getStyle()
   * @see #getFONT_STYLE()
   * @generated
   */
  EReference getFONT_STYLE_Style();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.FontStyleValues <em>Font Style Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Font Style Values</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.FontStyleValues
   * @generated
   */
  EClass getFontStyleValues();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.CLEAR <em>CLEAR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CLEAR</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.CLEAR
   * @generated
   */
  EClass getCLEAR();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.HOME <em>HOME</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>HOME</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.HOME
   * @generated
   */
  EClass getHOME();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.DRAW_STRING <em>DRAW STRING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DRAW STRING</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.DRAW_STRING
   * @generated
   */
  EClass getDRAW_STRING();

  /**
   * Returns the meta object for the attribute '{@link org.inria.diverse.logo.dsl.logoDSL.DRAW_STRING#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.DRAW_STRING#getText()
   * @see #getDRAW_STRING()
   * @generated
   */
  EAttribute getDRAW_STRING_Text();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.REFERENCIABLE <em>REFERENCIABLE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REFERENCIABLE</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.REFERENCIABLE
   * @generated
   */
  EClass getREFERENCIABLE();

  /**
   * Returns the meta object for the attribute '{@link org.inria.diverse.logo.dsl.logoDSL.REFERENCIABLE#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.REFERENCIABLE#getName()
   * @see #getREFERENCIABLE()
   * @generated
   */
  EAttribute getREFERENCIABLE_Name();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.MAKE <em>MAKE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MAKE</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.MAKE
   * @generated
   */
  EClass getMAKE();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.MAKE#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.MAKE#getValue()
   * @see #getMAKE()
   * @generated
   */
  EReference getMAKE_Value();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.VARIABLE_REF <em>VARIABLE REF</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VARIABLE REF</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.VARIABLE_REF
   * @generated
   */
  EClass getVARIABLE_REF();

  /**
   * Returns the meta object for the reference '{@link org.inria.diverse.logo.dsl.logoDSL.VARIABLE_REF#getToVar <em>To Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Var</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.VARIABLE_REF#getToVar()
   * @see #getVARIABLE_REF()
   * @generated
   */
  EReference getVARIABLE_REF_ToVar();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.EXPRESSION <em>EXPRESSION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EXPRESSION</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.EXPRESSION
   * @generated
   */
  EClass getEXPRESSION();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.VALUE <em>VALUE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VALUE</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.VALUE
   * @generated
   */
  EClass getVALUE();

  /**
   * Returns the meta object for the attribute '{@link org.inria.diverse.logo.dsl.logoDSL.VALUE#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.VALUE#getVal()
   * @see #getVALUE()
   * @generated
   */
  EAttribute getVALUE_Val();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.CONTENT <em>CONTENT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CONTENT</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.CONTENT
   * @generated
   */
  EClass getCONTENT();

  /**
   * Returns the meta object for the reference '{@link org.inria.diverse.logo.dsl.logoDSL.CONTENT#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.CONTENT#getVar()
   * @see #getCONTENT()
   * @generated
   */
  EReference getCONTENT_Var();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.OPERATION <em>OPERATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OPERATION</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.OPERATION
   * @generated
   */
  EClass getOPERATION();

  /**
   * Returns the meta object for the reference '{@link org.inria.diverse.logo.dsl.logoDSL.OPERATION#getTargetVariable <em>Target Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target Variable</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.OPERATION#getTargetVariable()
   * @see #getOPERATION()
   * @generated
   */
  EReference getOPERATION_TargetVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.OPERATION#getValOne <em>Val One</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val One</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.OPERATION#getValOne()
   * @see #getOPERATION()
   * @generated
   */
  EReference getOPERATION_ValOne();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.OPERATION#getValTwo <em>Val Two</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val Two</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.OPERATION#getValTwo()
   * @see #getOPERATION()
   * @generated
   */
  EReference getOPERATION_ValTwo();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.SUM <em>SUM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SUM</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.SUM
   * @generated
   */
  EClass getSUM();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.SUBTRACT <em>SUBTRACT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SUBTRACT</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.SUBTRACT
   * @generated
   */
  EClass getSUBTRACT();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.MULTIPLY <em>MULTIPLY</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MULTIPLY</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.MULTIPLY
   * @generated
   */
  EClass getMULTIPLY();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.DIVIDE <em>DIVIDE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DIVIDE</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.DIVIDE
   * @generated
   */
  EClass getDIVIDE();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.CONTROL_SENTENCES <em>CONTROL SENTENCES</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CONTROL SENTENCES</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.CONTROL_SENTENCES
   * @generated
   */
  EClass getCONTROL_SENTENCES();

  /**
   * Returns the meta object for the containment reference list '{@link org.inria.diverse.logo.dsl.logoDSL.CONTROL_SENTENCES#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.CONTROL_SENTENCES#getCommands()
   * @see #getCONTROL_SENTENCES()
   * @generated
   */
  EReference getCONTROL_SENTENCES_Commands();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.REPEAT <em>REPEAT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REPEAT</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.REPEAT
   * @generated
   */
  EClass getREPEAT();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.REPEAT#getTimes <em>Times</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Times</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.REPEAT#getTimes()
   * @see #getREPEAT()
   * @generated
   */
  EReference getREPEAT_Times();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.TO <em>TO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TO</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.TO
   * @generated
   */
  EClass getTO();

  /**
   * Returns the meta object for the attribute '{@link org.inria.diverse.logo.dsl.logoDSL.TO#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.TO#getName()
   * @see #getTO()
   * @generated
   */
  EAttribute getTO_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.inria.diverse.logo.dsl.logoDSL.TO#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.TO#getParameters()
   * @see #getTO()
   * @generated
   */
  EReference getTO_Parameters();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.PARAM <em>PARAM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PARAM</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.PARAM
   * @generated
   */
  EClass getPARAM();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL <em>PROCEDURE CALL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PROCEDURE CALL</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL
   * @generated
   */
  EClass getPROCEDURE_CALL();

  /**
   * Returns the meta object for the reference '{@link org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL#getTo()
   * @see #getPROCEDURE_CALL()
   * @generated
   */
  EReference getPROCEDURE_CALL_To();

  /**
   * Returns the meta object for the containment reference list '{@link org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL#getParams()
   * @see #getPROCEDURE_CALL()
   * @generated
   */
  EReference getPROCEDURE_CALL_Params();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.IF_SENTENCE <em>IF SENTENCE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IF SENTENCE</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.IF_SENTENCE
   * @generated
   */
  EClass getIF_SENTENCE();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.IF_SENTENCE#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.IF_SENTENCE#getCondition()
   * @see #getIF_SENTENCE()
   * @generated
   */
  EReference getIF_SENTENCE_Condition();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION <em>BOOLEAN EXPRESSION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BOOLEAN EXPRESSION</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION
   * @generated
   */
  EClass getBOOLEAN_EXPRESSION();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION#getOp1 <em>Op1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op1</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION#getOp1()
   * @see #getBOOLEAN_EXPRESSION()
   * @generated
   */
  EReference getBOOLEAN_EXPRESSION_Op1();

  /**
   * Returns the meta object for the containment reference '{@link org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION#getOp2()
   * @see #getBOOLEAN_EXPRESSION()
   * @generated
   */
  EReference getBOOLEAN_EXPRESSION_Op2();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.EQUALS <em>EQUALS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EQUALS</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.EQUALS
   * @generated
   */
  EClass getEQUALS();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.GREATER_THAN <em>GREATER THAN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>GREATER THAN</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.GREATER_THAN
   * @generated
   */
  EClass getGREATER_THAN();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.LESSER_THAN <em>LESSER THAN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LESSER THAN</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.LESSER_THAN
   * @generated
   */
  EClass getLESSER_THAN();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.BOLD <em>BOLD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BOLD</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.BOLD
   * @generated
   */
  EClass getBOLD();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.ITALIC <em>ITALIC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ITALIC</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.ITALIC
   * @generated
   */
  EClass getITALIC();

  /**
   * Returns the meta object for class '{@link org.inria.diverse.logo.dsl.logoDSL.PLAIN <em>PLAIN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PLAIN</em>'.
   * @see org.inria.diverse.logo.dsl.logoDSL.PLAIN
   * @generated
   */
  EClass getPLAIN();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LogoDSLFactory getLogoDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.LogoProgramImpl <em>Logo Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoProgramImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getLogoProgram()
     * @generated
     */
    EClass LOGO_PROGRAM = eINSTANCE.getLogoProgram();

    /**
     * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGO_PROGRAM__SENTENCES = eINSTANCE.getLogoProgram_Sentences();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.SENTENCEImpl <em>SENTENCE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.SENTENCEImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getSENTENCE()
     * @generated
     */
    EClass SENTENCE = eINSTANCE.getSENTENCE();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.MOVEImpl <em>MOVE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.MOVEImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getMOVE()
     * @generated
     */
    EClass MOVE = eINSTANCE.getMOVE();

    /**
     * The meta object literal for the '<em><b>Amount</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVE__AMOUNT = eINSTANCE.getMOVE_Amount();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.FORWARDImpl <em>FORWARD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.FORWARDImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getFORWARD()
     * @generated
     */
    EClass FORWARD = eINSTANCE.getFORWARD();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.LEFTImpl <em>LEFT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LEFTImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getLEFT()
     * @generated
     */
    EClass LEFT = eINSTANCE.getLEFT();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.RIGHTImpl <em>RIGHT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.RIGHTImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getRIGHT()
     * @generated
     */
    EClass RIGHT = eINSTANCE.getRIGHT();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.SET_XImpl <em>SET X</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.SET_XImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getSET_X()
     * @generated
     */
    EClass SET_X = eINSTANCE.getSET_X();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.SET_YImpl <em>SET Y</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.SET_YImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getSET_Y()
     * @generated
     */
    EClass SET_Y = eINSTANCE.getSET_Y();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.DRAWING_SENTENCEImpl <em>DRAWING SENTENCE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.DRAWING_SENTENCEImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getDRAWING_SENTENCE()
     * @generated
     */
    EClass DRAWING_SENTENCE = eINSTANCE.getDRAWING_SENTENCE();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.PENDOWNImpl <em>PENDOWN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.PENDOWNImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getPENDOWN()
     * @generated
     */
    EClass PENDOWN = eINSTANCE.getPENDOWN();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.PENUPImpl <em>PENUP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.PENUPImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getPENUP()
     * @generated
     */
    EClass PENUP = eINSTANCE.getPENUP();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.COLOREABLEImpl <em>COLOREABLE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.COLOREABLEImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getCOLOREABLE()
     * @generated
     */
    EClass COLOREABLE = eINSTANCE.getCOLOREABLE();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOREABLE__COLOR = eINSTANCE.getCOLOREABLE_Color();

    /**
     * The meta object literal for the '<em><b>Color Spec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOREABLE__COLOR_SPEC = eINSTANCE.getCOLOREABLE_ColorSpec();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.PENCOLORImpl <em>PENCOLOR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.PENCOLORImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getPENCOLOR()
     * @generated
     */
    EClass PENCOLOR = eINSTANCE.getPENCOLOR();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.CANVAS_COLORImpl <em>CANVAS COLOR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.CANVAS_COLORImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getCANVAS_COLOR()
     * @generated
     */
    EClass CANVAS_COLOR = eINSTANCE.getCANVAS_COLOR();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.COLOR_SPECImpl <em>COLOR SPEC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.COLOR_SPECImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getCOLOR_SPEC()
     * @generated
     */
    EClass COLOR_SPEC = eINSTANCE.getCOLOR_SPEC();

    /**
     * The meta object literal for the '<em><b>Red</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_SPEC__RED = eINSTANCE.getCOLOR_SPEC_Red();

    /**
     * The meta object literal for the '<em><b>Green</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_SPEC__GREEN = eINSTANCE.getCOLOR_SPEC_Green();

    /**
     * The meta object literal for the '<em><b>Blue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_SPEC__BLUE = eINSTANCE.getCOLOR_SPEC_Blue();

    /**
     * The meta object literal for the '<em><b>Alpha</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLOR_SPEC__ALPHA = eINSTANCE.getCOLOR_SPEC_Alpha();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.FONT_SPECImpl <em>FONT SPEC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.FONT_SPECImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getFONT_SPEC()
     * @generated
     */
    EClass FONT_SPEC = eINSTANCE.getFONT_SPEC();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.FONT_STYLEImpl <em>FONT STYLE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.FONT_STYLEImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getFONT_STYLE()
     * @generated
     */
    EClass FONT_STYLE = eINSTANCE.getFONT_STYLE();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FONT_STYLE__STYLE = eINSTANCE.getFONT_STYLE_Style();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.FontStyleValuesImpl <em>Font Style Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.FontStyleValuesImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getFontStyleValues()
     * @generated
     */
    EClass FONT_STYLE_VALUES = eINSTANCE.getFontStyleValues();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.CLEARImpl <em>CLEAR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.CLEARImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getCLEAR()
     * @generated
     */
    EClass CLEAR = eINSTANCE.getCLEAR();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.HOMEImpl <em>HOME</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.HOMEImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getHOME()
     * @generated
     */
    EClass HOME = eINSTANCE.getHOME();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.DRAW_STRINGImpl <em>DRAW STRING</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.DRAW_STRINGImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getDRAW_STRING()
     * @generated
     */
    EClass DRAW_STRING = eINSTANCE.getDRAW_STRING();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DRAW_STRING__TEXT = eINSTANCE.getDRAW_STRING_Text();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.REFERENCIABLEImpl <em>REFERENCIABLE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.REFERENCIABLEImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getREFERENCIABLE()
     * @generated
     */
    EClass REFERENCIABLE = eINSTANCE.getREFERENCIABLE();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCIABLE__NAME = eINSTANCE.getREFERENCIABLE_Name();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.MAKEImpl <em>MAKE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.MAKEImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getMAKE()
     * @generated
     */
    EClass MAKE = eINSTANCE.getMAKE();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAKE__VALUE = eINSTANCE.getMAKE_Value();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.VARIABLE_REFImpl <em>VARIABLE REF</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.VARIABLE_REFImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getVARIABLE_REF()
     * @generated
     */
    EClass VARIABLE_REF = eINSTANCE.getVARIABLE_REF();

    /**
     * The meta object literal for the '<em><b>To Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REF__TO_VAR = eINSTANCE.getVARIABLE_REF_ToVar();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.EXPRESSIONImpl <em>EXPRESSION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.EXPRESSIONImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getEXPRESSION()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getEXPRESSION();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.VALUEImpl <em>VALUE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.VALUEImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getVALUE()
     * @generated
     */
    EClass VALUE = eINSTANCE.getVALUE();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE__VAL = eINSTANCE.getVALUE_Val();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.CONTENTImpl <em>CONTENT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.CONTENTImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getCONTENT()
     * @generated
     */
    EClass CONTENT = eINSTANCE.getCONTENT();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT__VAR = eINSTANCE.getCONTENT_Var();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.OPERATIONImpl <em>OPERATION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.OPERATIONImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getOPERATION()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOPERATION();

    /**
     * The meta object literal for the '<em><b>Target Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__TARGET_VARIABLE = eINSTANCE.getOPERATION_TargetVariable();

    /**
     * The meta object literal for the '<em><b>Val One</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__VAL_ONE = eINSTANCE.getOPERATION_ValOne();

    /**
     * The meta object literal for the '<em><b>Val Two</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__VAL_TWO = eINSTANCE.getOPERATION_ValTwo();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.SUMImpl <em>SUM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.SUMImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getSUM()
     * @generated
     */
    EClass SUM = eINSTANCE.getSUM();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.SUBTRACTImpl <em>SUBTRACT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.SUBTRACTImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getSUBTRACT()
     * @generated
     */
    EClass SUBTRACT = eINSTANCE.getSUBTRACT();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.MULTIPLYImpl <em>MULTIPLY</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.MULTIPLYImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getMULTIPLY()
     * @generated
     */
    EClass MULTIPLY = eINSTANCE.getMULTIPLY();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.DIVIDEImpl <em>DIVIDE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.DIVIDEImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getDIVIDE()
     * @generated
     */
    EClass DIVIDE = eINSTANCE.getDIVIDE();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.CONTROL_SENTENCESImpl <em>CONTROL SENTENCES</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.CONTROL_SENTENCESImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getCONTROL_SENTENCES()
     * @generated
     */
    EClass CONTROL_SENTENCES = eINSTANCE.getCONTROL_SENTENCES();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_SENTENCES__COMMANDS = eINSTANCE.getCONTROL_SENTENCES_Commands();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.REPEATImpl <em>REPEAT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.REPEATImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getREPEAT()
     * @generated
     */
    EClass REPEAT = eINSTANCE.getREPEAT();

    /**
     * The meta object literal for the '<em><b>Times</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPEAT__TIMES = eINSTANCE.getREPEAT_Times();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.TOImpl <em>TO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.TOImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getTO()
     * @generated
     */
    EClass TO = eINSTANCE.getTO();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TO__NAME = eINSTANCE.getTO_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TO__PARAMETERS = eINSTANCE.getTO_Parameters();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.PARAMImpl <em>PARAM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.PARAMImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getPARAM()
     * @generated
     */
    EClass PARAM = eINSTANCE.getPARAM();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.PROCEDURE_CALLImpl <em>PROCEDURE CALL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.PROCEDURE_CALLImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getPROCEDURE_CALL()
     * @generated
     */
    EClass PROCEDURE_CALL = eINSTANCE.getPROCEDURE_CALL();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_CALL__TO = eINSTANCE.getPROCEDURE_CALL_To();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCEDURE_CALL__PARAMS = eINSTANCE.getPROCEDURE_CALL_Params();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.IF_SENTENCEImpl <em>IF SENTENCE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.IF_SENTENCEImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getIF_SENTENCE()
     * @generated
     */
    EClass IF_SENTENCE = eINSTANCE.getIF_SENTENCE();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_SENTENCE__CONDITION = eINSTANCE.getIF_SENTENCE_Condition();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.BOOLEAN_EXPRESSIONImpl <em>BOOLEAN EXPRESSION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.BOOLEAN_EXPRESSIONImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getBOOLEAN_EXPRESSION()
     * @generated
     */
    EClass BOOLEAN_EXPRESSION = eINSTANCE.getBOOLEAN_EXPRESSION();

    /**
     * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION__OP1 = eINSTANCE.getBOOLEAN_EXPRESSION_Op1();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BOOLEAN_EXPRESSION__OP2 = eINSTANCE.getBOOLEAN_EXPRESSION_Op2();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.EQUALSImpl <em>EQUALS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.EQUALSImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getEQUALS()
     * @generated
     */
    EClass EQUALS = eINSTANCE.getEQUALS();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.GREATER_THANImpl <em>GREATER THAN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.GREATER_THANImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getGREATER_THAN()
     * @generated
     */
    EClass GREATER_THAN = eINSTANCE.getGREATER_THAN();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.LESSER_THANImpl <em>LESSER THAN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LESSER_THANImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getLESSER_THAN()
     * @generated
     */
    EClass LESSER_THAN = eINSTANCE.getLESSER_THAN();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.BOLDImpl <em>BOLD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.BOLDImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getBOLD()
     * @generated
     */
    EClass BOLD = eINSTANCE.getBOLD();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.ITALICImpl <em>ITALIC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.ITALICImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getITALIC()
     * @generated
     */
    EClass ITALIC = eINSTANCE.getITALIC();

    /**
     * The meta object literal for the '{@link org.inria.diverse.logo.dsl.logoDSL.impl.PLAINImpl <em>PLAIN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.PLAINImpl
     * @see org.inria.diverse.logo.dsl.logoDSL.impl.LogoDSLPackageImpl#getPLAIN()
     * @generated
     */
    EClass PLAIN = eINSTANCE.getPLAIN();

  }

} //LogoDSLPackage
