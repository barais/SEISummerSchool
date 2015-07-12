/**
 */
package org.inria.diverse.logo.dsl.logoDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.inria.diverse.logo.dsl.logoDSL.EXPRESSION;
import org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage;
import org.inria.diverse.logo.dsl.logoDSL.PROCEDURE_CALL;
import org.inria.diverse.logo.dsl.logoDSL.TO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROCEDURE CALL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.impl.PROCEDURE_CALLImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.impl.PROCEDURE_CALLImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PROCEDURE_CALLImpl extends SENTENCEImpl implements PROCEDURE_CALL
{
  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected TO to;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<EXPRESSION> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PROCEDURE_CALLImpl()
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
    return LogoDSLPackage.Literals.PROCEDURE_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TO getTo()
  {
    if (to != null && to.eIsProxy())
    {
      InternalEObject oldTo = (InternalEObject)to;
      to = (TO)eResolveProxy(oldTo);
      if (to != oldTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogoDSLPackage.PROCEDURE_CALL__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TO basicGetTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(TO newTo)
  {
    TO oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LogoDSLPackage.PROCEDURE_CALL__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EXPRESSION> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<EXPRESSION>(EXPRESSION.class, this, LogoDSLPackage.PROCEDURE_CALL__PARAMS);
    }
    return params;
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
      case LogoDSLPackage.PROCEDURE_CALL__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case LogoDSLPackage.PROCEDURE_CALL__TO:
        if (resolve) return getTo();
        return basicGetTo();
      case LogoDSLPackage.PROCEDURE_CALL__PARAMS:
        return getParams();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LogoDSLPackage.PROCEDURE_CALL__TO:
        setTo((TO)newValue);
        return;
      case LogoDSLPackage.PROCEDURE_CALL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends EXPRESSION>)newValue);
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
      case LogoDSLPackage.PROCEDURE_CALL__TO:
        setTo((TO)null);
        return;
      case LogoDSLPackage.PROCEDURE_CALL__PARAMS:
        getParams().clear();
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
      case LogoDSLPackage.PROCEDURE_CALL__TO:
        return to != null;
      case LogoDSLPackage.PROCEDURE_CALL__PARAMS:
        return params != null && !params.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PROCEDURE_CALLImpl
