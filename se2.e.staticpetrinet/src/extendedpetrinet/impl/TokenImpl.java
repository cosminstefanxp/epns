/**
 */
package extendedpetrinet.impl;

import extendedpetrinet.Appearance;
import extendedpetrinet.ExtendedpetrinetPackage;
import extendedpetrinet.Token;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link extendedpetrinet.impl.TokenImpl#getID <em>ID</em>}</li>
 *   <li>{@link extendedpetrinet.impl.TokenImpl#getAppearance <em>Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenImpl extends EObjectImpl implements Token {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppearance() <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearance()
	 * @generated
	 * @ordered
	 */
	protected Appearance appearance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedpetrinetPackage.Literals.TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.TOKEN__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appearance getAppearance() {
		return appearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(Appearance newAppearance, NotificationChain msgs) {
		Appearance oldAppearance = appearance;
		appearance = newAppearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.TOKEN__APPEARANCE, oldAppearance, newAppearance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearance(Appearance newAppearance) {
		if (newAppearance != appearance) {
			NotificationChain msgs = null;
			if (appearance != null)
				msgs = ((InternalEObject)appearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.TOKEN__APPEARANCE, null, msgs);
			if (newAppearance != null)
				msgs = ((InternalEObject)newAppearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.TOKEN__APPEARANCE, null, msgs);
			msgs = basicSetAppearance(newAppearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.TOKEN__APPEARANCE, newAppearance, newAppearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtendedpetrinetPackage.TOKEN__APPEARANCE:
				return basicSetAppearance(null, msgs);
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
			case ExtendedpetrinetPackage.TOKEN__ID:
				return getID();
			case ExtendedpetrinetPackage.TOKEN__APPEARANCE:
				return getAppearance();
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
			case ExtendedpetrinetPackage.TOKEN__ID:
				setID((Integer)newValue);
				return;
			case ExtendedpetrinetPackage.TOKEN__APPEARANCE:
				setAppearance((Appearance)newValue);
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
			case ExtendedpetrinetPackage.TOKEN__ID:
				setID(ID_EDEFAULT);
				return;
			case ExtendedpetrinetPackage.TOKEN__APPEARANCE:
				setAppearance((Appearance)null);
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
			case ExtendedpetrinetPackage.TOKEN__ID:
				return id != ID_EDEFAULT;
			case ExtendedpetrinetPackage.TOKEN__APPEARANCE:
				return appearance != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TokenImpl
