/**
 */
package animations.impl;

import animations.AnimationsPackage;
import animations.Hide;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link animations.impl.HideImpl#getSimplePosition <em>Simple Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HideImpl extends AnimationImpl implements Hide {
	/**
	 * The default value of the '{@link #getSimplePosition() <em>Simple Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplePosition()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMPLE_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSimplePosition() <em>Simple Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimplePosition()
	 * @generated
	 * @ordered
	 */
	protected String simplePosition = SIMPLE_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnimationsPackage.Literals.HIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSimplePosition() {
		return simplePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimplePosition(String newSimplePosition) {
		String oldSimplePosition = simplePosition;
		simplePosition = newSimplePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationsPackage.HIDE__SIMPLE_POSITION, oldSimplePosition, simplePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnimationsPackage.HIDE__SIMPLE_POSITION:
				return getSimplePosition();
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
			case AnimationsPackage.HIDE__SIMPLE_POSITION:
				setSimplePosition((String)newValue);
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
			case AnimationsPackage.HIDE__SIMPLE_POSITION:
				setSimplePosition(SIMPLE_POSITION_EDEFAULT);
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
			case AnimationsPackage.HIDE__SIMPLE_POSITION:
				return SIMPLE_POSITION_EDEFAULT == null ? simplePosition != null : !SIMPLE_POSITION_EDEFAULT.equals(simplePosition);
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
		result.append(" (simplePosition: ");
		result.append(simplePosition);
		result.append(')');
		return result.toString();
	}

} //HideImpl
