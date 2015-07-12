/**
 */
package org.inria.diverse.logo.dsl.logoDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VARIABLE REF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.VARIABLE_REF#getToVar <em>To Var</em>}</li>
 * </ul>
 *
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getVARIABLE_REF()
 * @model
 * @generated
 */
public interface VARIABLE_REF extends EXPRESSION
{
  /**
   * Returns the value of the '<em><b>To Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Var</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Var</em>' reference.
   * @see #setToVar(REFERENCIABLE)
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getVARIABLE_REF_ToVar()
   * @model
   * @generated
   */
  REFERENCIABLE getToVar();

  /**
   * Sets the value of the '{@link org.inria.diverse.logo.dsl.logoDSL.VARIABLE_REF#getToVar <em>To Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Var</em>' reference.
   * @see #getToVar()
   * @generated
   */
  void setToVar(REFERENCIABLE value);

} // VARIABLE_REF
