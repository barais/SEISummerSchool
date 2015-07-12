/**
 */
package org.inria.diverse.logo.dsl.logoDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>COLOREABLE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.COLOREABLE#getColor <em>Color</em>}</li>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.COLOREABLE#getColorSpec <em>Color Spec</em>}</li>
 * </ul>
 *
 * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getCOLOREABLE()
 * @model
 * @generated
 */
public interface COLOREABLE extends DRAWING_SENTENCE
{
  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see #setColor(String)
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getCOLOREABLE_Color()
   * @model
   * @generated
   */
  String getColor();

  /**
   * Sets the value of the '{@link org.inria.diverse.logo.dsl.logoDSL.COLOREABLE#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see #getColor()
   * @generated
   */
  void setColor(String value);

  /**
   * Returns the value of the '<em><b>Color Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color Spec</em>' containment reference.
   * @see #setColorSpec(COLOR_SPEC)
   * @see org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage#getCOLOREABLE_ColorSpec()
   * @model containment="true"
   * @generated
   */
  COLOR_SPEC getColorSpec();

  /**
   * Sets the value of the '{@link org.inria.diverse.logo.dsl.logoDSL.COLOREABLE#getColorSpec <em>Color Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color Spec</em>' containment reference.
   * @see #getColorSpec()
   * @generated
   */
  void setColorSpec(COLOR_SPEC value);

} // COLOREABLE
