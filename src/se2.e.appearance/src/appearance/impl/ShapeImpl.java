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
 *   <li>{@link appearance.impl.ShapeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link appearance.impl.ShapeImpl#getXRotation <em>XRotation</em>}</li>
 *   <li>{@link appearance.impl.ShapeImpl#getYRotation <em>YRotation</em>}</li>
 *   <li>{@link appearance.impl.ShapeImpl#getZRotation <em>ZRotation</em>}</li>
 *   <li>{@link appearance.impl.ShapeImpl#getElevation <em>Elevation</em>}</li>
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
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final double SCALE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected double scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXRotation() <em>XRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double XROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXRotation() <em>XRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRotation()
	 * @generated
	 * @ordered
	 */
	protected double xRotation = XROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYRotation() <em>YRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double YROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYRotation() <em>YRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYRotation()
	 * @generated
	 * @ordered
	 */
	protected double yRotation = YROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getZRotation() <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ZROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZRotation() <em>ZRotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZRotation()
	 * @generated
	 * @ordered
	 */
	protected double zRotation = ZROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getElevation() <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected static final double ELEVATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElevation() <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected double elevation = ELEVATION_EDEFAULT;

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
	public double getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(double newScale) {
		double oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.SHAPE__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXRotation() {
		return xRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRotation(double newXRotation) {
		double oldXRotation = xRotation;
		xRotation = newXRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.SHAPE__XROTATION, oldXRotation, xRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYRotation() {
		return yRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYRotation(double newYRotation) {
		double oldYRotation = yRotation;
		yRotation = newYRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.SHAPE__YROTATION, oldYRotation, yRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZRotation() {
		return zRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZRotation(double newZRotation) {
		double oldZRotation = zRotation;
		zRotation = newZRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.SHAPE__ZROTATION, oldZRotation, zRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElevation() {
		return elevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevation(double newElevation) {
		double oldElevation = elevation;
		elevation = newElevation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppearancePackage.SHAPE__ELEVATION, oldElevation, elevation));
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
			case AppearancePackage.SHAPE__SCALE:
				return getScale();
			case AppearancePackage.SHAPE__XROTATION:
				return getXRotation();
			case AppearancePackage.SHAPE__YROTATION:
				return getYRotation();
			case AppearancePackage.SHAPE__ZROTATION:
				return getZRotation();
			case AppearancePackage.SHAPE__ELEVATION:
				return getElevation();
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
			case AppearancePackage.SHAPE__SCALE:
				setScale((Double)newValue);
				return;
			case AppearancePackage.SHAPE__XROTATION:
				setXRotation((Double)newValue);
				return;
			case AppearancePackage.SHAPE__YROTATION:
				setYRotation((Double)newValue);
				return;
			case AppearancePackage.SHAPE__ZROTATION:
				setZRotation((Double)newValue);
				return;
			case AppearancePackage.SHAPE__ELEVATION:
				setElevation((Double)newValue);
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
			case AppearancePackage.SHAPE__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case AppearancePackage.SHAPE__XROTATION:
				setXRotation(XROTATION_EDEFAULT);
				return;
			case AppearancePackage.SHAPE__YROTATION:
				setYRotation(YROTATION_EDEFAULT);
				return;
			case AppearancePackage.SHAPE__ZROTATION:
				setZRotation(ZROTATION_EDEFAULT);
				return;
			case AppearancePackage.SHAPE__ELEVATION:
				setElevation(ELEVATION_EDEFAULT);
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
			case AppearancePackage.SHAPE__SCALE:
				return scale != SCALE_EDEFAULT;
			case AppearancePackage.SHAPE__XROTATION:
				return xRotation != XROTATION_EDEFAULT;
			case AppearancePackage.SHAPE__YROTATION:
				return yRotation != YROTATION_EDEFAULT;
			case AppearancePackage.SHAPE__ZROTATION:
				return zRotation != ZROTATION_EDEFAULT;
			case AppearancePackage.SHAPE__ELEVATION:
				return elevation != ELEVATION_EDEFAULT;
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
		result.append(" (scale: ");
		result.append(scale);
		result.append(", xRotation: ");
		result.append(xRotation);
		result.append(", yRotation: ");
		result.append(yRotation);
		result.append(", zRotation: ");
		result.append(zRotation);
		result.append(", elevation: ");
		result.append(elevation);
		result.append(')');
		return result.toString();
	}

} //ShapeImpl
