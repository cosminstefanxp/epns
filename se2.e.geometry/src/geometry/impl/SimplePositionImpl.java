/**
 */
package geometry.impl;

import geometry.GeometryPackage;
import geometry.Name;
import geometry.Position;
import geometry.SimplePosition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link geometry.impl.SimplePositionImpl#getName <em>Name</em>}</li>
 *   <li>{@link geometry.impl.SimplePositionImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link geometry.impl.SimplePositionImpl#getAppearanceLabel <em>Appearance Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimplePositionImpl extends GeometryObjectImpl implements SimplePosition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * The default value of the '{@link #getAppearanceLabel() <em>Appearance Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearanceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String APPEARANCE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppearanceLabel() <em>Appearance Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearanceLabel()
	 * @generated
	 * @ordered
	 */
	protected String appearanceLabel = APPEARANCE_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplePositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.SIMPLE_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.SIMPLE_POSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeometryPackage.SIMPLE_POSITION__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeometryPackage.SIMPLE_POSITION__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeometryPackage.SIMPLE_POSITION__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.SIMPLE_POSITION__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppearanceLabel() {
		return appearanceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearanceLabel(String newAppearanceLabel) {
		String oldAppearanceLabel = appearanceLabel;
		appearanceLabel = newAppearanceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.SIMPLE_POSITION__APPEARANCE_LABEL, oldAppearanceLabel, appearanceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeometryPackage.SIMPLE_POSITION__POSITION:
				return basicSetPosition(null, msgs);
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
			case GeometryPackage.SIMPLE_POSITION__NAME:
				return getName();
			case GeometryPackage.SIMPLE_POSITION__POSITION:
				return getPosition();
			case GeometryPackage.SIMPLE_POSITION__APPEARANCE_LABEL:
				return getAppearanceLabel();
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
			case GeometryPackage.SIMPLE_POSITION__NAME:
				setName((String)newValue);
				return;
			case GeometryPackage.SIMPLE_POSITION__POSITION:
				setPosition((Position)newValue);
				return;
			case GeometryPackage.SIMPLE_POSITION__APPEARANCE_LABEL:
				setAppearanceLabel((String)newValue);
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
			case GeometryPackage.SIMPLE_POSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GeometryPackage.SIMPLE_POSITION__POSITION:
				setPosition((Position)null);
				return;
			case GeometryPackage.SIMPLE_POSITION__APPEARANCE_LABEL:
				setAppearanceLabel(APPEARANCE_LABEL_EDEFAULT);
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
			case GeometryPackage.SIMPLE_POSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GeometryPackage.SIMPLE_POSITION__POSITION:
				return position != null;
			case GeometryPackage.SIMPLE_POSITION__APPEARANCE_LABEL:
				return APPEARANCE_LABEL_EDEFAULT == null ? appearanceLabel != null : !APPEARANCE_LABEL_EDEFAULT.equals(appearanceLabel);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Name.class) {
			switch (derivedFeatureID) {
				case GeometryPackage.SIMPLE_POSITION__NAME: return GeometryPackage.NAME__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Name.class) {
			switch (baseFeatureID) {
				case GeometryPackage.NAME__NAME: return GeometryPackage.SIMPLE_POSITION__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", appearanceLabel: ");
		result.append(appearanceLabel);
		result.append(')');
		return result.toString();
	}

} //SimplePositionImpl
