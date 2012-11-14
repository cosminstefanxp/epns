/**
 */
package se2.e.geometry.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se2.e.geometry.Geometry;
import se2.e.geometry.GeometryObject;
import se2.e.geometry.GeometryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link se2.e.geometry.impl.GeometryImpl#getGeoObjects <em>Geo Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeometryImpl extends EObjectImpl implements Geometry {
	/**
	 * The cached value of the '{@link #getGeoObjects() <em>Geo Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<GeometryObject> geoObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.GEOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeometryObject> getGeoObjects() {
		if (geoObjects == null) {
			geoObjects = new EObjectContainmentEList<GeometryObject>(GeometryObject.class, this, GeometryPackage.GEOMETRY__GEO_OBJECTS);
		}
		return geoObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeometryPackage.GEOMETRY__GEO_OBJECTS:
				return ((InternalEList<?>)getGeoObjects()).basicRemove(otherEnd, msgs);
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
			case GeometryPackage.GEOMETRY__GEO_OBJECTS:
				return getGeoObjects();
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
			case GeometryPackage.GEOMETRY__GEO_OBJECTS:
				getGeoObjects().clear();
				getGeoObjects().addAll((Collection<? extends GeometryObject>)newValue);
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
			case GeometryPackage.GEOMETRY__GEO_OBJECTS:
				getGeoObjects().clear();
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
			case GeometryPackage.GEOMETRY__GEO_OBJECTS:
				return geoObjects != null && !geoObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeometryImpl
