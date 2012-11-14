/**
 */
package appearance.impl;

import appearance.AppearanceInfo;
import appearance.AppearanceModel;
import appearance.AppearancePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link appearance.impl.AppearanceModelImpl#getAppearanceInfos <em>Appearance Infos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppearanceModelImpl extends EObjectImpl implements AppearanceModel {
	/**
	 * The cached value of the '{@link #getAppearanceInfos() <em>Appearance Infos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearanceInfos()
	 * @generated
	 * @ordered
	 */
	protected EList<AppearanceInfo> appearanceInfos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppearanceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.APPEARANCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppearanceInfo> getAppearanceInfos() {
		if (appearanceInfos == null) {
			appearanceInfos = new EObjectContainmentEList<AppearanceInfo>(AppearanceInfo.class, this, AppearancePackage.APPEARANCE_MODEL__APPEARANCE_INFOS);
		}
		return appearanceInfos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.APPEARANCE_MODEL__APPEARANCE_INFOS:
				return ((InternalEList<?>)getAppearanceInfos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppearancePackage.APPEARANCE_MODEL__APPEARANCE_INFOS:
				return getAppearanceInfos();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AppearancePackage.APPEARANCE_MODEL__APPEARANCE_INFOS:
				getAppearanceInfos().clear();
				getAppearanceInfos().addAll((Collection<? extends AppearanceInfo>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case AppearancePackage.APPEARANCE_MODEL__APPEARANCE_INFOS:
				getAppearanceInfos().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AppearancePackage.APPEARANCE_MODEL__APPEARANCE_INFOS:
				return appearanceInfos != null && !appearanceInfos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppearanceModelImpl
