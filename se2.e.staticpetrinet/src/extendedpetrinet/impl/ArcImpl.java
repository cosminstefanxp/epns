/**
 */
package extendedpetrinet.impl;

import extendedpetrinet.Arc;
import extendedpetrinet.ExtendedpetrinetPackage;
import extendedpetrinet.Identity;
import extendedpetrinet.IgnoreAnimation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link extendedpetrinet.impl.ArcImpl#getIgnoreAnimation <em>Ignore Animation</em>}</li>
 *   <li>{@link extendedpetrinet.impl.ArcImpl#getIdentity <em>Identity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.ArcImpl implements Arc {
	/**
	 * The cached value of the '{@link #getIgnoreAnimation() <em>Ignore Animation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreAnimation()
	 * @generated
	 * @ordered
	 */
	protected IgnoreAnimation ignoreAnimation;

	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected Identity identity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedpetrinetPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnoreAnimation getIgnoreAnimation() {
		return ignoreAnimation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIgnoreAnimation(IgnoreAnimation newIgnoreAnimation, NotificationChain msgs) {
		IgnoreAnimation oldIgnoreAnimation = ignoreAnimation;
		ignoreAnimation = newIgnoreAnimation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.ARC__IGNORE_ANIMATION, oldIgnoreAnimation, newIgnoreAnimation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreAnimation(IgnoreAnimation newIgnoreAnimation) {
		if (newIgnoreAnimation != ignoreAnimation) {
			NotificationChain msgs = null;
			if (ignoreAnimation != null)
				msgs = ((InternalEObject)ignoreAnimation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.ARC__IGNORE_ANIMATION, null, msgs);
			if (newIgnoreAnimation != null)
				msgs = ((InternalEObject)newIgnoreAnimation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.ARC__IGNORE_ANIMATION, null, msgs);
			msgs = basicSetIgnoreAnimation(newIgnoreAnimation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.ARC__IGNORE_ANIMATION, newIgnoreAnimation, newIgnoreAnimation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identity getIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentity(Identity newIdentity, NotificationChain msgs) {
		Identity oldIdentity = identity;
		identity = newIdentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.ARC__IDENTITY, oldIdentity, newIdentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(Identity newIdentity) {
		if (newIdentity != identity) {
			NotificationChain msgs = null;
			if (identity != null)
				msgs = ((InternalEObject)identity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.ARC__IDENTITY, null, msgs);
			if (newIdentity != null)
				msgs = ((InternalEObject)newIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.ARC__IDENTITY, null, msgs);
			msgs = basicSetIdentity(newIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.ARC__IDENTITY, newIdentity, newIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtendedpetrinetPackage.ARC__IGNORE_ANIMATION:
				return basicSetIgnoreAnimation(null, msgs);
			case ExtendedpetrinetPackage.ARC__IDENTITY:
				return basicSetIdentity(null, msgs);
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
			case ExtendedpetrinetPackage.ARC__IGNORE_ANIMATION:
				return getIgnoreAnimation();
			case ExtendedpetrinetPackage.ARC__IDENTITY:
				return getIdentity();
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
			case ExtendedpetrinetPackage.ARC__IGNORE_ANIMATION:
				setIgnoreAnimation((IgnoreAnimation)newValue);
				return;
			case ExtendedpetrinetPackage.ARC__IDENTITY:
				setIdentity((Identity)newValue);
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
			case ExtendedpetrinetPackage.ARC__IGNORE_ANIMATION:
				setIgnoreAnimation((IgnoreAnimation)null);
				return;
			case ExtendedpetrinetPackage.ARC__IDENTITY:
				setIdentity((Identity)null);
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
			case ExtendedpetrinetPackage.ARC__IGNORE_ANIMATION:
				return ignoreAnimation != null;
			case ExtendedpetrinetPackage.ARC__IDENTITY:
				return identity != null;
		}
		return super.eIsSet(featureID);
	}

} //ArcImpl
