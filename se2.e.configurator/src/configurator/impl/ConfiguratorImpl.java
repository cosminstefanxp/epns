/**
 */
package configurator.impl;

import configurator.Configurator;
import configurator.ConfiguratorPackage;

import geometry.Geometry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import petrinet.PetriNet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configurator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configurator.impl.ConfiguratorImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link configurator.impl.ConfiguratorImpl#getPetriNet <em>Petri Net</em>}</li>
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
	 * The cached value of the '{@link #getPetriNet() <em>Petri Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetriNet()
	 * @generated
	 * @ordered
	 */
	protected PetriNet petriNet;

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
	public PetriNet getPetriNet() {
		if (petriNet != null && petriNet.eIsProxy()) {
			InternalEObject oldPetriNet = (InternalEObject)petriNet;
			petriNet = (PetriNet)eResolveProxy(oldPetriNet);
			if (petriNet != oldPetriNet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfiguratorPackage.CONFIGURATOR__PETRI_NET, oldPetriNet, petriNet));
			}
		}
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet basicGetPetriNet() {
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetriNet(PetriNet newPetriNet) {
		PetriNet oldPetriNet = petriNet;
		petriNet = newPetriNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.CONFIGURATOR__PETRI_NET, oldPetriNet, petriNet));
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
			case ConfiguratorPackage.CONFIGURATOR__PETRI_NET:
				if (resolve) return getPetriNet();
				return basicGetPetriNet();
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
			case ConfiguratorPackage.CONFIGURATOR__PETRI_NET:
				setPetriNet((PetriNet)newValue);
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
			case ConfiguratorPackage.CONFIGURATOR__PETRI_NET:
				setPetriNet((PetriNet)null);
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
			case ConfiguratorPackage.CONFIGURATOR__PETRI_NET:
				return petriNet != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfiguratorImpl
