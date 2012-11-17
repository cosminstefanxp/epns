/**
 */
package appearance.impl;

import appearance.AppearancePackage;
import appearance.Shape;

import appearance.Surface;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link appearance.impl.ShapeImpl#getShapeSurface <em>Shape Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ShapeImpl extends AppearanceInfoImpl implements Shape {
	/**
	 * The cached value of the '{@link #getShapeSurface() <em>Shape Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapeSurface()
	 * @generated
	 * @ordered
	 */
	protected Surface shapeSurface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppearancePackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Surface getShapeSurface() {
		return shapeSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapeSurface(Surface newShapeSurface, NotificationChain msgs) {
		Surface oldShapeSurface = shapeSurface;
		shapeSurface = newShapeSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppearancePackage.SHAPE__SHAPE_SURFACE, oldShapeSurface, newShapeSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeSurface(Surface newShapeSurface) {
		if (newShapeSurface != shapeSurface) {
			NotificationChain msgs = null;
			if (shapeSurface != null)
				msgs = ((InternalEObject)shapeSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppearancePackage.SHAPE__SHAPE_SURFACE, null, msgs);
			if (newShapeSurface != null)
				msgs = ((InternalEObject)newShapeSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppearancePackage.SHAPE__SHAPE_SURFACE, null, msgs);
			msgs = basicSetShapeSurface(newShapeSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.SHAPE__SHAPE_SURFACE, newShapeSurface, newShapeSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppearancePackage.SHAPE__SHAPE_SURFACE:
				return basicSetShapeSurface(null, msgs);
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
			case AppearancePackage.SHAPE__SHAPE_SURFACE:
				return getShapeSurface();
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
			case AppearancePackage.SHAPE__SHAPE_SURFACE:
				setShapeSurface((Surface)newValue);
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
			case AppearancePackage.SHAPE__SHAPE_SURFACE:
				setShapeSurface((Surface)null);
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
			case AppearancePackage.SHAPE__SHAPE_SURFACE:
				return shapeSurface != null;
		}
		return super.eIsSet(featureID);
	}

} //ShapeImpl
