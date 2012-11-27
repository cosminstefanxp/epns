/**
 */
package extendedpetrinet.impl;

import extendedpetrinet.AnimationLabel;
import extendedpetrinet.ExtendedpetrinetPackage;
import extendedpetrinet.GeometryLabel;
import extendedpetrinet.InputPlaceAppearanceLabel;
import extendedpetrinet.InteractiveInput;
import extendedpetrinet.Place;
import extendedpetrinet.Token;

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
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link extendedpetrinet.impl.PlaceImpl#getInteractiveInput <em>Interactive Input</em>}</li>
 *   <li>{@link extendedpetrinet.impl.PlaceImpl#getAnimations <em>Animations</em>}</li>
 *   <li>{@link extendedpetrinet.impl.PlaceImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link extendedpetrinet.impl.PlaceImpl#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link extendedpetrinet.impl.PlaceImpl#getGeometryLabel <em>Geometry Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl implements Place {
	/**
	 * The cached value of the '{@link #getInteractiveInput() <em>Interactive Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractiveInput()
	 * @generated
	 * @ordered
	 */
	protected InteractiveInput interactiveInput;

	/**
	 * The cached value of the '{@link #getAnimations() <em>Animations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimations()
	 * @generated
	 * @ordered
	 */
	protected AnimationLabel animations;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> tokens;

	/**
	 * The cached value of the '{@link #getAppearance() <em>Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearance()
	 * @generated
	 * @ordered
	 */
	protected InputPlaceAppearanceLabel appearance;

	/**
	 * The cached value of the '{@link #getGeometryLabel() <em>Geometry Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryLabel()
	 * @generated
	 * @ordered
	 */
	protected GeometryLabel geometryLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedpetrinetPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractiveInput getInteractiveInput() {
		return interactiveInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractiveInput(InteractiveInput newInteractiveInput, NotificationChain msgs) {
		InteractiveInput oldInteractiveInput = interactiveInput;
		interactiveInput = newInteractiveInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.PLACE__INTERACTIVE_INPUT, oldInteractiveInput, newInteractiveInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractiveInput(InteractiveInput newInteractiveInput) {
		if (newInteractiveInput != interactiveInput) {
			NotificationChain msgs = null;
			if (interactiveInput != null)
				msgs = ((InternalEObject)interactiveInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.PLACE__INTERACTIVE_INPUT, null, msgs);
			if (newInteractiveInput != null)
				msgs = ((InternalEObject)newInteractiveInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.PLACE__INTERACTIVE_INPUT, null, msgs);
			msgs = basicSetInteractiveInput(newInteractiveInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.PLACE__INTERACTIVE_INPUT, newInteractiveInput, newInteractiveInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationLabel getAnimations() {
		return animations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimations(AnimationLabel newAnimations, NotificationChain msgs) {
		AnimationLabel oldAnimations = animations;
		animations = newAnimations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.PLACE__ANIMATIONS, oldAnimations, newAnimations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimations(AnimationLabel newAnimations) {
		if (newAnimations != animations) {
			NotificationChain msgs = null;
			if (animations != null)
				msgs = ((InternalEObject)animations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.PLACE__ANIMATIONS, null, msgs);
			if (newAnimations != null)
				msgs = ((InternalEObject)newAnimations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.PLACE__ANIMATIONS, null, msgs);
			msgs = basicSetAnimations(newAnimations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.PLACE__ANIMATIONS, newAnimations, newAnimations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getTokens() {
		if (tokens == null) {
			tokens = new EObjectContainmentEList<Token>(Token.class, this, ExtendedpetrinetPackage.PLACE__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPlaceAppearanceLabel getAppearance() {
		return appearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearance(InputPlaceAppearanceLabel newAppearance, NotificationChain msgs) {
		InputPlaceAppearanceLabel oldAppearance = appearance;
		appearance = newAppearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.PLACE__APPEARANCE, oldAppearance, newAppearance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearance(InputPlaceAppearanceLabel newAppearance) {
		if (newAppearance != appearance) {
			NotificationChain msgs = null;
			if (appearance != null)
				msgs = ((InternalEObject)appearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.PLACE__APPEARANCE, null, msgs);
			if (newAppearance != null)
				msgs = ((InternalEObject)newAppearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.PLACE__APPEARANCE, null, msgs);
			msgs = basicSetAppearance(newAppearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.PLACE__APPEARANCE, newAppearance, newAppearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryLabel getGeometryLabel() {
		return geometryLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometryLabel(GeometryLabel newGeometryLabel, NotificationChain msgs) {
		GeometryLabel oldGeometryLabel = geometryLabel;
		geometryLabel = newGeometryLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.PLACE__GEOMETRY_LABEL, oldGeometryLabel, newGeometryLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometryLabel(GeometryLabel newGeometryLabel) {
		if (newGeometryLabel != geometryLabel) {
			NotificationChain msgs = null;
			if (geometryLabel != null)
				msgs = ((InternalEObject)geometryLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.PLACE__GEOMETRY_LABEL, null, msgs);
			if (newGeometryLabel != null)
				msgs = ((InternalEObject)newGeometryLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExtendedpetrinetPackage.PLACE__GEOMETRY_LABEL, null, msgs);
			msgs = basicSetGeometryLabel(newGeometryLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.PLACE__GEOMETRY_LABEL, newGeometryLabel, newGeometryLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExtendedpetrinetPackage.PLACE__INTERACTIVE_INPUT:
				return basicSetInteractiveInput(null, msgs);
			case ExtendedpetrinetPackage.PLACE__ANIMATIONS:
				return basicSetAnimations(null, msgs);
			case ExtendedpetrinetPackage.PLACE__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
			case ExtendedpetrinetPackage.PLACE__APPEARANCE:
				return basicSetAppearance(null, msgs);
			case ExtendedpetrinetPackage.PLACE__GEOMETRY_LABEL:
				return basicSetGeometryLabel(null, msgs);
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
			case ExtendedpetrinetPackage.PLACE__INTERACTIVE_INPUT:
				return getInteractiveInput();
			case ExtendedpetrinetPackage.PLACE__ANIMATIONS:
				return getAnimations();
			case ExtendedpetrinetPackage.PLACE__TOKENS:
				return getTokens();
			case ExtendedpetrinetPackage.PLACE__APPEARANCE:
				return getAppearance();
			case ExtendedpetrinetPackage.PLACE__GEOMETRY_LABEL:
				return getGeometryLabel();
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
			case ExtendedpetrinetPackage.PLACE__INTERACTIVE_INPUT:
				setInteractiveInput((InteractiveInput)newValue);
				return;
			case ExtendedpetrinetPackage.PLACE__ANIMATIONS:
				setAnimations((AnimationLabel)newValue);
				return;
			case ExtendedpetrinetPackage.PLACE__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case ExtendedpetrinetPackage.PLACE__APPEARANCE:
				setAppearance((InputPlaceAppearanceLabel)newValue);
				return;
			case ExtendedpetrinetPackage.PLACE__GEOMETRY_LABEL:
				setGeometryLabel((GeometryLabel)newValue);
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
			case ExtendedpetrinetPackage.PLACE__INTERACTIVE_INPUT:
				setInteractiveInput((InteractiveInput)null);
				return;
			case ExtendedpetrinetPackage.PLACE__ANIMATIONS:
				setAnimations((AnimationLabel)null);
				return;
			case ExtendedpetrinetPackage.PLACE__TOKENS:
				getTokens().clear();
				return;
			case ExtendedpetrinetPackage.PLACE__APPEARANCE:
				setAppearance((InputPlaceAppearanceLabel)null);
				return;
			case ExtendedpetrinetPackage.PLACE__GEOMETRY_LABEL:
				setGeometryLabel((GeometryLabel)null);
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
			case ExtendedpetrinetPackage.PLACE__INTERACTIVE_INPUT:
				return interactiveInput != null;
			case ExtendedpetrinetPackage.PLACE__ANIMATIONS:
				return animations != null;
			case ExtendedpetrinetPackage.PLACE__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case ExtendedpetrinetPackage.PLACE__APPEARANCE:
				return appearance != null;
			case ExtendedpetrinetPackage.PLACE__GEOMETRY_LABEL:
				return geometryLabel != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceImpl
