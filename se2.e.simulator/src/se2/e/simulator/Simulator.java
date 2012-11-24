package se2.e.simulator;

import se2.e.geometry.Geometry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import appearance.AppearanceModel;

import extendedpetrinet.Appearance;
import extendedpetrinet.ExtendedPetriNet;

import se2.e.engine3d.Engine3D;
import se2.e.engine3d.Engine3DFactory;
import se2.e.engine3d.Engine3DListener;
import se2.e.simulator.runtime.petrinet.RuntimePetriNet;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import se2.e.simulator.runtime.petrinet.TokenMovement;

/**
 * The Class Simulator.
 * 
 * @author Ruxandra, Marius
 */
public class Simulator implements Engine3DListener {

	/** The selected petri. */
	private PetriNetDoc selectedPetri;

	/** The geometry. */
	private Geometry geometry;

	AppearanceModel appearance;

	/** The rpn. */
	private RuntimePetriNet rpn;

	/** The engine. */
	private Engine3D engine;
	
	List<TokenMovement> initialMovements;

	/**
	 * Instantiates a new simulator.
	 * 
	 * @param geometry the geometry
	 * @param selectedPetri the selected petri
	 */
	public Simulator(Geometry geometry, PetriNetDoc selectedPetri, AppearanceModel appearance) {
		rpn = new RuntimePetriNet();
		this.selectedPetri = selectedPetri;
		this.geometry = geometry;
		this.appearance = appearance;
		System.out.println("Constructor Simulator");
	}

	/**
	 * Start simulation.
	 */
	public void startSimulation() {
		initialMovements = rpn.init(selectedPetri);
		engine = Engine3DFactory.getEngine();
		// TODO: add input places labels...
		Set<String> inputPlaces = this.rpn.getInputPlaces();
		engine.init(this.geometry, this.appearance, inputPlaces);
		engine.setEngine3DListener(this);

		/* TO BE REMOVED Test for input place without 3d engine */
		// rpn.dropTokenOnPlace("Signal");
		// List<TokenMovement> tokenMovements = rpn.fireTransitions();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.Engine3DListener#onAnimationFinished(se2.e.simulator.runtime.petrinet.RuntimeToken)
	 */
	@Override
	public void onAnimationFinished(RuntimeToken token) {
		rpn.markToken(token);
		List<TokenMovement> tokenMovements = rpn.fireTransitions();
		for (TokenMovement tokenMovement : tokenMovements) {
			engine.startAnimation(tokenMovement.getToken(), tokenMovement.getAnimation(), tokenMovement.getGeoLabel());

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see se2.e.engine3d.Engine3DListener#onStartSimulation()
	 */
	@Override
	public void onStartSimulation() {
		
		for (TokenMovement tokenMovement : initialMovements) {
			engine.startAnimation(tokenMovement.getToken(), tokenMovement.getAnimation(), tokenMovement.getGeoLabel());
		}
	}

	public void onUserInteraction(String label) {
		// drop token on the place with the label label
		rpn.dropTokenOnPlace(label);
		List<TokenMovement> tokenMovements = rpn.fireTransitions();
		for (TokenMovement tokenMovement : tokenMovements) {
			engine.startAnimation(tokenMovement.getToken(), tokenMovement.getAnimation(), tokenMovement.getGeoLabel());
		}
	}

	public void onStopSimulation() {

	}
}