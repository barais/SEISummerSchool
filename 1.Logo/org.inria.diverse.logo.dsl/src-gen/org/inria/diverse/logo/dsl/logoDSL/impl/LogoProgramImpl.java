/**
 */
package org.inria.diverse.logo.dsl.logoDSL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.inria.diverse.logo.dsl.logoDSL.LogoDSLPackage;
import org.inria.diverse.logo.dsl.logoDSL.LogoProgram;
import org.inria.diverse.logo.dsl.logoDSL.SENTENCE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logo Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.inria.diverse.logo.dsl.logoDSL.impl.LogoProgramImpl#getSentences <em>Sentences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogoProgramImpl extends MinimalEObjectImpl.Container implements LogoProgram
{
  /**
   * The cached value of the '{@link #getSentences() <em>Sentences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSentences()
   * @generated
   * @ordered
   */
  protected EList<SENTENCE> sentences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogoProgramImpl()
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
    return LogoDSLPackage.Literals.LOGO_PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SENTENCE> getSentences()
  {
    if (sentences == null)
    {
      sentences = new EObjectContainmentEList<SENTENCE>(SENTENCE.class, this, LogoDSLPackage.LOGO_PROGRAM__SENTENCES);
    }
    return sentences;
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
      case LogoDSLPackage.LOGO_PROGRAM__SENTENCES:
        return ((InternalEList<?>)getSentences()).basicRemove(otherEnd, msgs);
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
      case LogoDSLPackage.LOGO_PROGRAM__SENTENCES:
        return getSentences();
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
      case LogoDSLPackage.LOGO_PROGRAM__SENTENCES:
        getSentences().clear();
        getSentences().addAll((Collection<? extends SENTENCE>)newValue);
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
      case LogoDSLPackage.LOGO_PROGRAM__SENTENCES:
        getSentences().clear();
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
      case LogoDSLPackage.LOGO_PROGRAM__SENTENCES:
        return sentences != null && !sentences.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LogoProgramImpl
