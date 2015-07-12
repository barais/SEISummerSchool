/**
 */
package org.inria.diverse.logo.dsl.logoDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OPERATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.OPERATION#getTargetVariable <em>Target Variable</em>}</li>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.OPERATION#getValOne <em>Val One</em>}</li>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.OPERATION#getValTwo <em>Val Two</em>}</li>
 * </ul>
 *
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getOPERATION()
 * @model
 * @generated
 */
public interface OPERATION extends SENTENCE
{
  /**
   * Returns the value of the '<em><b>Target Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Variable</em>' reference.
   * @see #setTargetVariable(MAKE)
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getOPERATION_TargetVariable()
   * @model
   * @generated
   */
  MAKE getTargetVariable();

  /**
   * Sets the value of the '{@link org.inria.diverse.logo.dsl.logoDSL.OPERATION#getTargetVariable <em>Target Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Variable</em>' reference.
   * @see #getTargetVariable()
   * @generated
   */
  void setTargetVariable(MAKE value);

  /**
   * Returns the value of the '<em><b>Val One</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val One</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val One</em>' containment reference.
   * @see #setValOne(EXPRESSION)
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getOPERATION_ValOne()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getValOne();

  /**
   * Sets the value of the '{@link org.inria.diverse.logo.dsl.logoDSL.OPERATION#getValOne <em>Val One</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val One</em>' containment reference.
   * @see #getValOne()
   * @generated
   */
  void setValOne(EXPRESSION value);

  /**
   * Returns the value of the '<em><b>Val Two</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val Two</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val Two</em>' containment reference.
   * @see #setValTwo(EXPRESSION)
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getOPERATION_ValTwo()
   * @model containment="true"
   * @generated
   */
  EXPRESSION getValTwo();

  /**
   * Sets the value of the '{@link org.inria.diverse.logo.dsl.logoDSL.OPERATION#getValTwo <em>Val Two</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val Two</em>' containment reference.
   * @see #getValTwo()
   * @generated
   */
  void setValTwo(EXPRESSION value);

} // OPERATION
