/**
 */
package extendedpetrinet.impl;

import extendedpetrinet.Animations;
import extendedpetrinet.ExtendedpetrinetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredLabelImpl;

import animations.Animation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link extendedpetrinet.impl.AnimationsImpl#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnimationsImpl extends StructuredLabelImpl implements Animations {
	
	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected Animation structure;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnimationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedpetrinetPackage.Literals.ANIMATIONS;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animation getStructure() {
		if (structure != null && structure.eIsProxy()) {
			InternalEObject oldStructure = (InternalEObject)structure;
			structure = (Animation)eResolveProxy(oldStructure);
			if (structure != oldStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExtendedpetrinetPackage.ANIMATIONS__STRUCTURE, oldStructure, structure));
			}
		}
		return structure;
	}
	
    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animation basicGetStructure() {
		return structure;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(Animation newStructure) {
		Animation oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtendedpetrinetPackage.ANIMATIONS__STRUCTURE, oldStructure, structure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtendedpetrinetPackage.ANIMATIONS__STRUCTURE:
				if (resolve) return getStructure();
				return basicGetStructure();
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
			case ExtendedpetrinetPackage.ANIMATIONS__STRUCTURE:
				setStructure((Animation)newValue);
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
			case ExtendedpetrinetPackage.ANIMATIONS__STRUCTURE:
				setStructure((Animation)null);
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
			case ExtendedpetrinetPackage.ANIMATIONS__STRUCTURE:
				return structure != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
     * Method for parsing the text of an animation label. A very simple
     * implementation using the split function here -- the real implementation
     * would do more (probably using Xtext).
     * 
     * @generated NOT
     */
	@Override
	public EObject parse(String input) {
		if (input != null) {
			PetriNetType type = NetFunctions.getPetriNetType(this);
			if (type instanceof ExtendedPetriNetImpl) {
				ExtendedPetriNetImpl epntype = (ExtendedPetriNetImpl) type;
				if (epntype.parser != null) {
					return epntype.parser.parseAnimation(input);
				}
			}
		}
		
		return null;
	}

} //AnimationsImpl