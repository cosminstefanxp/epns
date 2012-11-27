/**
 */
package se2.e.configurator.impl;

import appearance.AppearanceModel;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import se2.e.configurator.Configurator;
import se2.e.configurator.ConfiguratorPackage;

import se2.e.geometry.Geometry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configurator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se2.e.configurator.impl.ConfiguratorImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link se2.e.configurator.impl.ConfiguratorImpl#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link se2.e.configurator.impl.ConfiguratorImpl#getPetrinet <em>Petrinet</em>}</li>
 *   <li>{@link se2.e.configurator.impl.ConfiguratorImpl#getDefaultTrackWidth <em>Default Track Width</em>}</li>
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
	 * The cached value of the '{@link #getAppearance() <em>Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearance()
	 * @generated
	 * @ordered
	 */
	protected AppearanceModel appearance;

	/**
	 * The cached value of the '{@link #getPetrinet() <em>Petrinet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinet()
	 * @generated
	 * @ordered
	 */
	protected PetriNetDoc petrinet;

	/**
	 * The default value of the '{@link #getDefaultTrackWidth() <em>Default Track Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTrackWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double DEFAULT_TRACK_WIDTH_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getDefaultTrackWidth() <em>Default Track Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTrackWidth()
	 * @generated
	 * @ordered
	 */
	protected double defaultTrackWidth = DEFAULT_TRACK_WIDTH_EDEFAULT;

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
	public AppearanceModel getAppearance() {
		if (appearance != null && appearance.eIsProxy()) {
			InternalEObject oldAppearance = (InternalEObject)appearance;
			appearance = (AppearanceModel)eResolveProxy(oldAppearance);
			if (appearance != oldAppearance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfiguratorPackage.CONFIGURATOR__APPEARANCE, oldAppearance, appearance));
			}
		}
		return appearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearanceModel basicGetAppearance() {
		return appearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearance(AppearanceModel newAppearance) {
		AppearanceModel oldAppearance = appearance;
		appearance = newAppearance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.CONFIGURATOR__APPEARANCE, oldAppearance, appearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetDoc getPetrinet() {
		if (petrinet != null && petrinet.eIsProxy()) {
			InternalEObject oldPetrinet = (InternalEObject)petrinet;
			petrinet = (PetriNetDoc)eResolveProxy(oldPetrinet);
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
	public PetriNetDoc basicGetPetrinet() {
		return petrinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetrinet(PetriNetDoc newPetrinet) {
		PetriNetDoc oldPetrinet = petrinet;
		petrinet = newPetrinet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.CONFIGURATOR__PETRINET, oldPetrinet, petrinet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDefaultTrackWidth() {
		return defaultTrackWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultTrackWidth(double newDefaultTrackWidth) {
		double oldDefaultTrackWidth = defaultTrackWidth;
		defaultTrackWidth = newDefaultTrackWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorPackage.CONFIGURATOR__DEFAULT_TRACK_WIDTH, oldDefaultTrackWidth, defaultTrackWidth));
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
			case ConfiguratorPackage.CONFIGURATOR__APPEARANCE:
				if (resolve) return getAppearance();
				return basicGetAppearance();
			case ConfiguratorPackage.CONFIGURATOR__PETRINET:
				if (resolve) return getPetrinet();
				return basicGetPetrinet();
			case ConfiguratorPackage.CONFIGURATOR__DEFAULT_TRACK_WIDTH:
				return getDefaultTrackWidth();
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
			case ConfiguratorPackage.CONFIGURATOR__GEOMETRY:
				setGeometry((Geometry)newValue);
				return;
			case ConfiguratorPackage.CONFIGURATOR__APPEARANCE:
				setAppearance((AppearanceModel)newValue);
				return;
			case ConfiguratorPackage.CONFIGURATOR__PETRINET:
				setPetrinet((PetriNetDoc)newValue);
				return;
			case ConfiguratorPackage.CONFIGURATOR__DEFAULT_TRACK_WIDTH:
				setDefaultTrackWidth((Double)newValue);
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
			case ConfiguratorPackage.CONFIGURATOR__APPEARANCE:
				setAppearance((AppearanceModel)null);
				return;
			case ConfiguratorPackage.CONFIGURATOR__PETRINET:
				setPetrinet((PetriNetDoc)null);
				return;
			case ConfiguratorPackage.CONFIGURATOR__DEFAULT_TRACK_WIDTH:
				setDefaultTrackWidth(DEFAULT_TRACK_WIDTH_EDEFAULT);
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
			case ConfiguratorPackage.CONFIGURATOR__APPEARANCE:
				return appearance != null;
			case ConfiguratorPackage.CONFIGURATOR__PETRINET:
				return petrinet != null;
			case ConfiguratorPackage.CONFIGURATOR__DEFAULT_TRACK_WIDTH:
				return defaultTrackWidth != DEFAULT_TRACK_WIDTH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		return result.toString();
	}

} //ConfiguratorImpl
