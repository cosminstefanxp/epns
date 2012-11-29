/**
 */
package extendedpetrinet.impl;

import extendedpetrinet.ExtendedPetriNet;
import extendedpetrinet.ExtendedpetrinetPackage;

import org.eclipse.emf.ecore.EClass;

import org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl;

import anl.AnimationsParser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExtendedPetriNetImpl extends PetriNetTypeImpl implements ExtendedPetriNet {
	
	// @generated NOT
	final AnimationsParser parser;
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Juan, María and Pablo.
	 */
	public ExtendedPetriNetImpl() {
		super();
		parser = new AnimationsParser();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtendedpetrinetPackage.Literals.EXTENDED_PETRI_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Juan, María and Pablo.
	 */
	@Override
	public String toString() {
		return "ePNS PetriNet";
	}

} //ExtendedPetriNetImpl