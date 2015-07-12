/**
 */
package org.inria.diverse.logo.dsl.logoDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IF SENTENCE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.IF_SENTENCE#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getIF_SENTENCE()
 * @model
 * @generated
 */
public interface IF_SENTENCE extends CONTROL_SENTENCES
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(BOOLEAN_EXPRESSION)
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getIF_SENTENCE_Condition()
   * @model containment="true"
   * @generated
   */
  BOOLEAN_EXPRESSION getCondition();

  /**
   * Sets the value of the '{@link org.inria.diverse.logo.dsl.logoDSL.IF_SENTENCE#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(BOOLEAN_EXPRESSION value);

} // IF_SENTENCE
