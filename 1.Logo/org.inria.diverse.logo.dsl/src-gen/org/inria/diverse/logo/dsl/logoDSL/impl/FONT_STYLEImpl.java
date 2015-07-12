/**
 */
package org.inria.diverse.logo.dsl.logoDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.inria.diverse.logo.dsl.logoDSL.FONT_STYLE;
import org.inria.diverse.logo.dsl.logoDSL.FontStyleValues;
import org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FONT STYLE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.impl.FONT_STYLEImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FONT_STYLEImpl extends FONT_SPECImpl implements FONT_STYLE
{
  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected FontStyleValues style;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FONT_STYLEImpl()
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
    return LogoDSLPackage.Literals.FONT_STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontStyleValues getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyle(FontStyleValues newStyle, NotificationChain msgs)
  {
    FontStyleValues oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogoDSLPackage.FONT_STYLE__STYLE, oldStyle, newStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(FontStyleValues newStyle)
  {
    if (newStyle != style)
    {
      NotificationChain msgs = null;
      if (style != null)
        msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogoDSLPackage.FONT_STYLE__STYLE, null, msgs);
      if (newStyle != null)
        msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogoDSLPackage.FONT_STYLE__STYLE, null, msgs);
      msgs = basicSetStyle(newStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LogoDSLPackage.FONT_STYLE__STYLE, newStyle, newStyle));
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
      case LogoDSLPackage.FONT_STYLE__STYLE:
        return basicSetStyle(null, msgs);
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
      case LogoDSLPackage.FONT_STYLE__STYLE:
        return getStyle();
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
      case LogoDSLPackage.FONT_STYLE__STYLE:
        setStyle((FontStyleValues)newValue);
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
      case LogoDSLPackage.FONT_STYLE__STYLE:
        setStyle((FontStyleValues)null);
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
      case LogoDSLPackage.FONT_STYLE__STYLE:
        return style != null;
    }
    return super.eIsSet(featureID);
  }

} //FONT_STYLEImpl
