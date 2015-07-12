/**
 */
package org.inria.diverse.logo.dsl.logoDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.inria.diverse.logo.dsl.logoDSL.EXPRESSION;
import org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage;
import org.inria.diverse.logo.dsl.logoDSL.REPEAT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REPEAT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.impl.REPEATImpl#getTimes <em>Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class REPEATImpl extends CONTROL_SENTENCESImpl implements REPEAT
{
  /**
   * The cached value of the '{@link #getTimes() <em>Times</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimes()
   * @generated
   * @ordered
   */
  protected EXPRESSION times;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected REPEATImpl()
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
    return LogoDSLPackage.Literals.REPEAT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getTimes()
  {
    return times;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimes(EXPRESSION newTimes, NotificationChain msgs)
  {
    EXPRESSION oldTimes = times;
    times = newTimes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogoDSLPackage.REPEAT__TIMES, oldTimes, newTimes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimes(EXPRESSION newTimes)
  {
    if (newTimes != times)
    {
      NotificationChain msgs = null;
      if (times != null)
        msgs = ((InternalEObject)times).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogoDSLPackage.REPEAT__TIMES, null, msgs);
      if (newTimes != null)
        msgs = ((InternalEObject)newTimes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogoDSLPackage.REPEAT__TIMES, null, msgs);
      msgs = basicSetTimes(newTimes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LogoDSLPackage.REPEAT__TIMES, newTimes, newTimes));
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
      case LogoDSLPackage.REPEAT__TIMES:
        return basicSetTimes(null, msgs);
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
      case LogoDSLPackage.REPEAT__TIMES:
        return getTimes();
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
      case LogoDSLPackage.REPEAT__TIMES:
        setTimes((EXPRESSION)newValue);
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
      case LogoDSLPackage.REPEAT__TIMES:
        setTimes((EXPRESSION)null);
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
      case LogoDSLPackage.REPEAT__TIMES:
        return times != null;
    }
    return super.eIsSet(featureID);
  }

} //REPEATImpl
