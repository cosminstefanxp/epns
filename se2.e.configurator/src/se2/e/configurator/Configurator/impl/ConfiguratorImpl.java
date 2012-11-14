/**
 */
package se2.e.configurator.Configurator.impl;

import extendedpetrinet.ExtendedPetriNet;

import geometry.Geometry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import se2.e.configurator.Configurator.Configurator;
import se2.e.configurator.Configurator.ConfiguratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configurator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se2.e.configurator.Configurator.impl.ConfiguratorImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link se2.e.configurator.Configurator.impl.ConfiguratorImpl#getPetrinet <em>Petrinet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfiguratorImpl extends EObjectImpl implements Configurator {
	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected Geometry geometry;

	/**
	 * The cached value of the '{@link #getPetrinet() <em>Petrinet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinet()
	 * @generated
	 * @ordered
	 */
	protected ExtendedPetriNet petrinet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorPackage.Literals.CONFIGURATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry getGeometry() {
		if (geometry != null && geometry.eIsProxy()) {
			InternalEObject oldGeometry = (InternalEObject)geometry;
			geometry = (Geometry)eResolveProxy(oldGeometry);
			if (geometry != oldGeometry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfiguratorPackage.CONFIGURATOR__GEOMETRY, oldGeometry, geometry));
			}
		}
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry basicGetGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(Geometry newGeometry) {
		Geometry oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.CONFIGURATOR__GEOMETRY, oldGeometry, geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedPetriNet getPetrinet() {
		if (petrinet != null && petrinet.eIsProxy()) {
			InternalEObject oldPetrinet = (InternalEObject)petrinet;
			petrinet = (ExtendedPetriNet)eResolveProxy(oldPetrinet);
			if (petrinet != oldPetrinet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfiguratorPackage.CONFIGURATOR__PETRINET, oldPetrinet, petrinet));
			}
		}
		return petrinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedPetriNet basicGetPetrinet() {
		return petrinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetrinet(ExtendedPetriNet newPetrinet) {
		ExtendedPetriNet oldPetrinet = petrinet;
		petrinet = newPetrinet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.CONFIGURATOR__PETRINET, oldPetrinet, petrinet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfiguratorPackage.CONFIGURATOR__GEOMETRY:
				if (resolve) return getGeometry();
				return basicGetGeometry();
			case ConfiguratorPackage.CONFIGURATOR__PETRINET:
				if (resolve) return getPetrinet();
				return basicGetPetrinet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfiguratorPackage.CONFIGURATOR__GEOMETRY:
				setGeometry((Geometry)newValue);
				return;
			case ConfiguratorPackage.CONFIGURATOR__PETRINET:
				setPetrinet((ExtendedPetriNet)newValue);
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
			case ConfiguratorPackage.CONFIGURATOR__GEOMETRY:
				setGeometry((Geometry)null);
				return;
			case ConfiguratorPackage.CONFIGURATOR__PETRINET:
				setPetrinet((ExtendedPetriNet)null);
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
			case ConfiguratorPackage.CONFIGURATOR__GEOMETRY:
				return geometry != null;
			case ConfiguratorPackage.CONFIGURATOR__PETRINET:
				return petrinet != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfiguratorImpl
