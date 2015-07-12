/**
 */
package org.inria.diverse.logo.dsl.logoDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CONTROL SENTENCES</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.CONTROL_SENTENCES#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getCONTROL_SENTENCES()
 * @model
 * @generated
 */
public interface CONTROL_SENTENCES extends SENTENCE
{
  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link org.inria.diverse.logo.dsl.logoDSL.SENTENCE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getCONTROL_SENTENCES_Commands()
   * @model containment="true"
   * @generated
   */
  EList<SENTENCE> getCommands();

} // CONTROL_SENTENCES
