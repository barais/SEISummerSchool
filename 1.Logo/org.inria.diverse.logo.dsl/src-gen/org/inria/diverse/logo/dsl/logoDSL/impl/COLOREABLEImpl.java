/**
 */
package org.inria.diverse.logo.dsl.logoDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.inria.diverse.logo.dsl.logoDSL.COLOREABLE;
import org.inria.diverse.logo.dsl.logoDSL.COLOR_SPEC;
import org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>COLOREABLE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.impl.COLOREABLEImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.impl.COLOREABLEImpl#getColorSpec <em>Color Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class COLOREABLEImpl extends DRAWING_SENTENCEImpl implements COLOREABLE
{
  /**
   * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected static final String COLOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected String color = COLOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getColorSpec() <em>Color Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorSpec()
   * @generated
   * @ordered
   */
  protected COLOR_SPEC colorSpec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected COLOREABLEImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LogoDSLPackage.Literals.COLOREABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(String newColor)
  {
    String oldColor = color;
    color = newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LogoDSLPackage.COLOREABLE__COLOR, oldColor, color));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COLOR_SPEC getColorSpec()
  {
    return colorSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColorSpec(COLOR_SPEC newColorSpec, NotificationChain msgs)
  {
    COLOR_SPEC oldColorSpec = colorSpec;
    colorSpec = newColorSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogoDSLPackage.COLOREABLE__COLOR_SPEC, oldColorSpec, newColorSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColorSpec(COLOR_SPEC newColorSpec)
  {
    if (newColorSpec != colorSpec)
    {
      NotificationChain msgs = null;
      if (colorSpec != null)
        msgs = ((InternalEObject)colorSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogoDSLPackage.COLOREABLE__COLOR_SPEC, null, msgs);
      if (newColorSpec != null)
        msgs = ((InternalEObject)newColorSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogoDSLPackage.COLOREABLE__COLOR_SPEC, null, msgs);
      msgs = basicSetColorSpec(newColorSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LogoDSLPackage.COLOREABLE__COLOR_SPEC, newColorSpec, newColorSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LogoDSLPackage.COLOREABLE__COLOR_SPEC:
        return basicSetColorSpec(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LogoDSLPackage.COLOREABLE__COLOR:
        return getColor();
      case LogoDSLPackage.COLOREABLE__COLOR_SPEC:
        return getColorSpec();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LogoDSLPackage.COLOREABLE__COLOR:
        setColor((String)newValue);
        return;
      case LogoDSLPackage.COLOREABLE__COLOR_SPEC:
        setColorSpec((COLOR_SPEC)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LogoDSLPackage.COLOREABLE__COLOR:
        setColor(COLOR_EDEFAULT);
        return;
      case LogoDSLPackage.COLOREABLE__COLOR_SPEC:
        setColorSpec((COLOR_SPEC)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LogoDSLPackage.COLOREABLE__COLOR:
        return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
      case LogoDSLPackage.COLOREABLE__COLOR_SPEC:
        return colorSpec != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (color: ");
    result.append(color);
    result.append(')');
    return result.toString();
  }

} //COLOREABLEImpl
