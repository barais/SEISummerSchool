/**
 */
package org.inria.diverse.logo.dsl.logoDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REPEAT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.REPEAT#getTimes <em>Times</em>}</li>
 * </ul>
 *
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getREPEAT()
 * @model
 * @generated
 */
public interface REPEAT extends CONTROL_SENTENCES
{
  /**
   * Returns the value of the '<em><b>Times</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Times</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Times</em>' containment reference.
   * @see #setTimes(EXPRESSION)
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getREPEAT_Times()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getTimes();

  /**
   * Sets the value of the '{@link org.inria.diverse.logo.dsl.logoDSL.REPEAT#getTimes <em>Times</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Times</em>' containment reference.
   * @see #getTimes()
   * @generated
   */
  void setTimes(EXPRESSION value);

} // REPEAT
