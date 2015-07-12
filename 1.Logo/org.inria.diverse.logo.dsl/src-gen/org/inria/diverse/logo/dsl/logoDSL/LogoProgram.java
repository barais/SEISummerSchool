/**
 */
package org.inria.diverse.logo.dsl.logoDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logo Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.LogoProgram#getSentences <em>Sentences</em>}</li>
 * </ul>
 *
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getLogoProgram()
 * @model
 * @generated
 */
public interface LogoProgram extends EObject
{
  /**
   * Returns the value of the '<em><b>Sentences</b></em>' containment reference list.
   * The list contents are of type {@link org.inria.diverse.logo.dsl.logoDSL.SENTENCE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sentences</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sentences</em>' containment reference list.
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getLogoProgram_Sentences()
   * @model containment="true"
   * @generated
   */
  EList<SENTENCE> getSentences();

} // LogoProgram
