/**
 */
package org.inria.diverse.logo.dsl.logoDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.TO#getName <em>Name</em>}</li>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.TO#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getTO()
 * @model
 * @generated
 */
public interface TO extends CONTROL_SENTENCES
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getTO_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.inria.diverse.logo.dsl.logoDSL.TO#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.inria.diverse.logo.dsl.logoDSL.PARAM}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getTO_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<PARAM> getParameters();

} // TO
