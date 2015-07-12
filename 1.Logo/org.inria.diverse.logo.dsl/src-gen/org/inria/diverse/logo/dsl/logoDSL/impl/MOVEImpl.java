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
import org.inria.diverse.logo.dsl.logoDSL.MOVE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MOVE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.impl.MOVEImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MOVEImpl extends SENTENCEImpl implements MOVE
{
  /**
   * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected EXPRESSION amount;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MOVEImpl()
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
    return LogoDSLPackage.Literals.MOVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EXPRESSION getAmount()
  {
    return amount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAmount(EXPRESSION newAmount, NotificationChain msgs)
  {
    EXPRESSION oldAmount = amount;
    amount = newAmount;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogoDSLPackage.MOVE__AMOUNT, oldAmount, newAmount);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAmount(EXPRESSION newAmount)
  {
    if (newAmount != amount)
    {
      NotificationChain msgs = null;
      if (amount != null)
        msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogoDSLPackage.MOVE__AMOUNT, null, msgs);
      if (newAmount != null)
        msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogoDSLPackage.MOVE__AMOUNT, null, msgs);
      msgs = basicSetAmount(newAmount, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LogoDSLPackage.MOVE__AMOUNT, newAmount, newAmount));
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
      case LogoDSLPackage.MOVE__AMOUNT:
        return basicSetAmount(null, msgs);
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
      case LogoDSLPackage.MOVE__AMOUNT:
        return getAmount();
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
      case LogoDSLPackage.MOVE__AMOUNT:
        setAmount((EXPRESSION)newValue);
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
      case LogoDSLPackage.MOVE__AMOUNT:
        setAmount((EXPRESSION)null);
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
      case LogoDSLPackage.MOVE__AMOUNT:
        return amount != null;
    }
    return super.eIsSet(featureID);
  }

} //MOVEImpl
