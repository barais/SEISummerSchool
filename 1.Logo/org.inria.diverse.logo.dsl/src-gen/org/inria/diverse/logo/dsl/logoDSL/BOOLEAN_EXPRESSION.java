/**
 */
package org.inria.diverse.logo.dsl.logoDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOOLEAN EXPRESSION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION#getOp1 <em>Op1</em>}</li>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION#getOp2 <em>Op2</em>}</li>
 * </ul>
 *
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getBOOLEAN_EXPRESSION()
 * @model
 * @generated
 */
public interface BOOLEAN_EXPRESSION extends EObject
{
  /**
   * Returns the value of the '<em><b>Op1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op1</em>' containment reference.
   * @see #setOp1(EXPRESSION)
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getBOOLEAN_EXPRESSION_Op1()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getOp1();

  /**
   * Sets the value of the '{@link org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION#getOp1 <em>Op1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op1</em>' containment reference.
   * @see #getOp1()
   * @generated
   */
  void setOp1(EXPRESSION value);

  /**
   * Returns the value of the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op2</em>' containment reference.
   * @see #setOp2(EXPRESSION)
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getBOOLEAN_EXPRESSION_Op2()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getOp2();

  /**
   * Sets the value of the '{@link org.inria.diverse.logo.dsl.logoDSL.BOOLEAN_EXPRESSION#getOp2 <em>Op2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op2</em>' containment reference.
   * @see #getOp2()
   * @generated
   */
  void setOp2(EXPRESSION value);

} // BOOLEAN_EXPRESSION
