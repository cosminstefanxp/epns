/**
 */
package extendedpetrinet.impl;

import extendedpetrinet.Animations;
import extendedpetrinet.ExtendedpetrinetPackage;
import extendedpetrinet.GeometryLabel;
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
 *   <li>{@link extendedpetrinet.impl.PlaceImpl#getGeoLabel <em>Geo Label</em>}</li>
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
	protected Animations animations;

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
	 * The cached value of the '{@link #getGeoLabel() <em>Geo Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoLabel()
	 * @generated
	 * @ordered
	 */
	protected GeometryLabel geoLabel;

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
	public Animations getAnimations() {
		return animations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimations(Animations newAnimations, NotificationChain msgs) {
		Animations oldAnimations = animations;
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
	public void setAnimations(Animations newAnimations) {
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
	public GeometryLabel getGeoLabel() {
		if (geoLabel != null && geoLabel.eIsProxy()) {
			InternalEObject oldGeoLabel = (InternalEObject)geoLabel;
			geoLabel = (GeometryLabel)eResolveProxy(oldGeoLabel);
			if (geoLabel != oldGeoLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtendedpetrinetPackage.PLACE__GEO_LABEL, oldGeoLabel, geoLabel));
			}
		}
		return geoLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryLabel basicGetGeoLabel() {
		return geoLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeoLabel(GeometryLabel newGeoLabel) {
		GeometryLabel oldGeoLabel = geoLabel;
		geoLabel = newGeoLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.PLACE__GEO_LABEL, oldGeoLabel, geoLabel));
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
			case ExtendedpetrinetPackage.PLACE__GEO_LABEL:
				if (resolve) return getGeoLabel();
				return basicGetGeoLabel();
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
				setAnimations((Animations)newValue);
				return;
			case ExtendedpetrinetPackage.PLACE__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case ExtendedpetrinetPackage.PLACE__GEO_LABEL:
				setGeoLabel((GeometryLabel)newValue);
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
				setAnimations((Animations)null);
				return;
			case ExtendedpetrinetPackage.PLACE__TOKENS:
				getTokens().clear();
				return;
			case ExtendedpetrinetPackage.PLACE__GEO_LABEL:
				setGeoLabel((GeometryLabel)null);
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
			case ExtendedpetrinetPackage.PLACE__GEO_LABEL:
				return geoLabel != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceImpl
