/**
 */
package animations.impl;

import animations.AnimationsPackage;
import animations.Move;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link animations.impl.MoveImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link animations.impl.MoveImpl#getGeoTrack <em>Geo Track</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveImpl extends AnimationImpl implements Move {
	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected double speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeoTrack() <em>Geo Track</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoTrack()
	 * @generated
	 * @ordered
	 */
	protected static final String GEO_TRACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeoTrack() <em>Geo Track</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoTrack()
	 * @generated
	 * @ordered
	 */
	protected String geoTrack = GEO_TRACK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnimationsPackage.Literals.MOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(double newSpeed) {
		double oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationsPackage.MOVE__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeoTrack() {
		return geoTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeoTrack(String newGeoTrack) {
		String oldGeoTrack = geoTrack;
		geoTrack = newGeoTrack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationsPackage.MOVE__GEO_TRACK, oldGeoTrack, geoTrack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnimationsPackage.MOVE__SPEED:
				return getSpeed();
			case AnimationsPackage.MOVE__GEO_TRACK:
				return getGeoTrack();
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
			case AnimationsPackage.MOVE__SPEED:
				setSpeed((Double)newValue);
				return;
			case AnimationsPackage.MOVE__GEO_TRACK:
				setGeoTrack((String)newValue);
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
			case AnimationsPackage.MOVE__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case AnimationsPackage.MOVE__GEO_TRACK:
				setGeoTrack(GEO_TRACK_EDEFAULT);
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
			case AnimationsPackage.MOVE__SPEED:
				return speed != SPEED_EDEFAULT;
			case AnimationsPackage.MOVE__GEO_TRACK:
				return GEO_TRACK_EDEFAULT == null ? geoTrack != null : !GEO_TRACK_EDEFAULT.equals(geoTrack);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (speed: ");
		result.append(speed);
		result.append(", geoTrack: ");
		result.append(geoTrack);
		result.append(')');
		return result.toString();
	}

} //MoveImpl
