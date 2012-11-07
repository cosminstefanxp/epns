/**
 */
package geometry.impl;

import geometry.GeometryPackage;
import geometry.Position;
import geometry.Track;

import geometry.trackPosition;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link geometry.impl.TrackImpl#getStartPosition <em>Start Position</em>}</li>
 *   <li>{@link geometry.impl.TrackImpl#getEndPosition <em>End Position</em>}</li>
 *   <li>{@link geometry.impl.TrackImpl#getIntermediatePositions <em>Intermediate Positions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrackImpl extends GeometryObjectImpl implements Track {
	/**
	 * The cached value of the '{@link #getStartPosition() <em>Start Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected trackPosition startPosition;
	/**
	 * The cached value of the '{@link #getEndPosition() <em>End Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPosition()
	 * @generated
	 * @ordered
	 */
	protected trackPosition endPosition;
	/**
	 * The cached value of the '{@link #getIntermediatePositions() <em>Intermediate Positions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediatePositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Position> intermediatePositions;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.TRACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public trackPosition getStartPosition() {
		if (startPosition != null && startPosition.eIsProxy()) {
			InternalEObject oldStartPosition = (InternalEObject)startPosition;
			startPosition = (trackPosition)eResolveProxy(oldStartPosition);
			if (startPosition != oldStartPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeometryPackage.TRACK__START_POSITION, oldStartPosition, startPosition));
			}
		}
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public trackPosition basicGetStartPosition() {
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPosition(trackPosition newStartPosition) {
		trackPosition oldStartPosition = startPosition;
		startPosition = newStartPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.TRACK__START_POSITION, oldStartPosition, startPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public trackPosition getEndPosition() {
		if (endPosition != null && endPosition.eIsProxy()) {
			InternalEObject oldEndPosition = (InternalEObject)endPosition;
			endPosition = (trackPosition)eResolveProxy(oldEndPosition);
			if (endPosition != oldEndPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeometryPackage.TRACK__END_POSITION, oldEndPosition, endPosition));
			}
		}
		return endPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public trackPosition basicGetEndPosition() {
		return endPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndPosition(trackPosition newEndPosition) {
		trackPosition oldEndPosition = endPosition;
		endPosition = newEndPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.TRACK__END_POSITION, oldEndPosition, endPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Position> getIntermediatePositions() {
		if (intermediatePositions == null) {
			intermediatePositions = new EObjectContainmentEList<Position>(Position.class, this, GeometryPackage.TRACK__INTERMEDIATE_POSITIONS);
		}
		return intermediatePositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeometryPackage.TRACK__INTERMEDIATE_POSITIONS:
				return ((InternalEList<?>)getIntermediatePositions()).basicRemove(otherEnd, msgs);
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
			case GeometryPackage.TRACK__START_POSITION:
				if (resolve) return getStartPosition();
				return basicGetStartPosition();
			case GeometryPackage.TRACK__END_POSITION:
				if (resolve) return getEndPosition();
				return basicGetEndPosition();
			case GeometryPackage.TRACK__INTERMEDIATE_POSITIONS:
				return getIntermediatePositions();
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
			case GeometryPackage.TRACK__START_POSITION:
				setStartPosition((trackPosition)newValue);
				return;
			case GeometryPackage.TRACK__END_POSITION:
				setEndPosition((trackPosition)newValue);
				return;
			case GeometryPackage.TRACK__INTERMEDIATE_POSITIONS:
				getIntermediatePositions().clear();
				getIntermediatePositions().addAll((Collection<? extends Position>)newValue);
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
			case GeometryPackage.TRACK__START_POSITION:
				setStartPosition((trackPosition)null);
				return;
			case GeometryPackage.TRACK__END_POSITION:
				setEndPosition((trackPosition)null);
				return;
			case GeometryPackage.TRACK__INTERMEDIATE_POSITIONS:
				getIntermediatePositions().clear();
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
			case GeometryPackage.TRACK__START_POSITION:
				return startPosition != null;
			case GeometryPackage.TRACK__END_POSITION:
				return endPosition != null;
			case GeometryPackage.TRACK__INTERMEDIATE_POSITIONS:
				return intermediatePositions != null && !intermediatePositions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrackImpl
