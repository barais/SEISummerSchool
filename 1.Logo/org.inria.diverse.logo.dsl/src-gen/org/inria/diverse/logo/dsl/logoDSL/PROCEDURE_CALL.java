/**
 */
package org.inria.diverse.logo.dsl.logoDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PROCEDURE CALL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL#getTo <em>To</em>}</li>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getPROCEDURE_CALL()
 * @model
 * @generated
 */
public interface PROCEDURE_CALL extends SENTENCE
{
  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(TO)
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getPROCEDURE_CALL_To()
   * @model
   * @generated
   */
  TO getTo();

  /**
   * Sets the value of the '{@link org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(TO value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.inria.diverse.logo.dsl.logoDSL.EXPRESSION}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getPROCEDURE_CALL_Params()
   * @model containment="true"
   * @generated
   */
  EList<EXPRESSION> getParams();

} // PROCEDURE_CALL
