package se2.e.simulator.runtime.petrinet;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.pnml.tools.epnk.pnmlcoremodel.Page;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;


import extendedpetrinet.Arc;
import extendedpetrinet.Place;
import extendedpetrinet.Token;


/**
 * The Class RuntimePetriNet.
 */
public class RuntimePetriNet {

	/** The transitions. */
	List<Transition> transitions;
	/** The tokens map. */
	HashMap<Place, List<RuntimeToken>> tokensMap;
	/** The preset. */
	HashMap<Transition, List<Place>> preset;
	/** The postset. */
	HashMap<Transition, List<Place>> postset;

	/**
	 * Initialize tokens in place list.
	 *
	 * @param place the place
	 * @author Ruxandra, Marius
	 */
	private void initializeTokensInPlaceList(Place place) {
		List<Token> tempTokens = place.getTokens();
		List<RuntimeToken> tempTokensExt = new ArrayList<RuntimeToken>();
		for (Token token : tempTokens) {
			//TODO:
			tempTokensExt.add(new RuntimeToken(token.getAppearance().getText()));
		}
		tokensMap.put(place, tempTokensExt);
	}

	/**
	 * Initialize presets.
	 *
	 * @param selectedTransition the selected transition
	 * @author Ruxandra, Marius
	 */
	private void initializePresets(Transition selectedTransition) {
		List<Place> places = new ArrayList<Place>();
		for (org.pnml.tools.epnk.pnmlcoremodel.Arc arc : selectedTransition.getIn()) {
			Place place = (Place) arc.getSource();
			places.add(place);
		}
		preset.put(selectedTransition, places);
	}

	/**
	 * Initialize postsets.
	 *
	 * @param selectedTransition the selected transition
	 * @author Ruxandra, Marius
	 */
	private void initializePostsets(Transition selectedTransition) {
		List<Place> places = new ArrayList<Place>();
		for (org.pnml.tools.epnk.pnmlcoremodel.Arc arc : selectedTransition.getOut()) {
			Arc my_arc = (Arc) arc;
			Place place = (Place) arc.getTarget();
			places.add(place);
		}
		postset.put(selectedTransition, places);
	}

	/**
	 * Prints the petri.
	 * @author Ruxandra, Marius
	 */
	public void printPetri() {
		for (Transition transition : transitions) {
			System.out.println(transition.getName() + " :");
			for (Place place : preset.get(transition)) {
				System.out.println("\t" + place.getName());
				for (RuntimeToken token : tokensMap.get(place)) {
					System.out.println("\t\t" + token.isFinished());
				}
			}
			System.out.println();
		}
	}

	/**
	 * Instantiates a new runtime petri net.
	 *
	 * @param selectedPetri the selected petri
	 * @author Ruxandra, Marius
	 */
	public RuntimePetriNet(PetriNet selectedPetri) {
		/* create an internal structure so that it will be easy to fire transitions */
		transitions = new ArrayList<Transition>();
		tokensMap = new HashMap<Place, List<RuntimeToken>>();
		preset = new HashMap<Transition, List<Place>>();
		postset = new HashMap<Transition, List<Place>>();
		Iterator<Page> iter = selectedPetri.getPage().iterator();
		while (iter.hasNext()) {
			//maybe page... maybe... 
			Page item = iter.next();

			if (item instanceof Transition) {
				/* add transition to list */
				transitions.add((Transition) item);
				/* create preset for each transition */
				this.initializePresets((Transition) item);
				/* create postset for each transition */
				this.initializePostsets((Transition) item);
			}
			if (item instanceof Place) {
				/* create a place->tokens hashmap */
				Place place = (Place) item;
				this.initializeTokensInPlaceList(place);
			}
		}
		printPetri();
	}

	/**
	 * Fires a transition.
	 * 
	 * @param selectedTransition the selected transition
	 * @return the list of {@link Token}s that have been moved and their destination {@link Place}.
	 * @author Ruxandra, Marius
	 */
	public List<TokenMovement> fireTransition(Transition selectedTransition) {

		List<Place> selectedTransitionPreset = preset.get(selectedTransition);
		List<Place> selectedTransitionPostset = postset.get(selectedTransition);
		/* check that every preset has a token */
		for (Place place : selectedTransitionPreset) {
			/* check all tokens to see if there is at least one marked */
			boolean atLeastOneMarked = false;
			for (RuntimeToken token : tokensMap.get(place)) {
				if (token.isFinished()) {
					atLeastOneMarked = true;
					System.out.println("Marcat " + selectedTransition.getName());
					break;
				}
			}
			if (!atLeastOneMarked)
				return null;
		}
		List<TokenMovement> tokensMovement = new ArrayList<TokenMovement>();

		/*
		 * To be used for the actual implementation - for maintaining the labels
		 */
		List<RuntimeToken> removedTokens = new ArrayList<RuntimeToken>();

		/* consume tokens from the presets */
		for (Place place : selectedTransitionPreset) {
			RuntimeToken tokenExt = null;
			for (RuntimeToken token : tokensMap.get(place)) {
				if (token.isFinished()) {
					tokensMap.get(place).remove(token);
					tokenExt = token;
					System.out.println("Scot tokenul si-l retin");
					break;
				}
			}
			removedTokens.add(tokenExt);
		}
		int count = 0;
		/* add tokens to postsets */
		for (Place place : selectedTransitionPostset) {
			//TODO: for final version: iterate over removedTokens
			String geomLabel = removedTokens.get(count%removedTokens.size()).getLabel();
			count++;
			RuntimeToken tokenExt = new RuntimeToken(geomLabel);
			tokensMap.get(place).add(tokenExt);
			tokensMovement.add(new TokenMovement(tokenExt, place.getGeoLabel().getText(), place.getAnimations()));
			System.out.println("Adaug token movement!!!");
		}
		return tokensMovement;
	}

	/**
	 * Fires all the transitions possible.
	 * 
	 * @return the list of {@link Token}s that have been moved and their destination {@link Place}.
	 * @author Ruxandra, Marius
	 */
	public List<TokenMovement> fireTransitions() {
		System.out.println("Should be firing transitions");
		List<TokenMovement> tokensMovements = new ArrayList<TokenMovement>();
		for (Transition transition : transitions) {
			System.out.println("Selected transition: " + transition.getName());
			while (true) {
				/* tokenMovement = pair between the token and the place it's moving to */
				List<TokenMovement> movements = fireTransition(transition);
				if (movements == null)
					break;
				else
					tokensMovements.addAll(movements);
			}
		}
		printPetri();
		return tokensMovements;
	}

	/**
	 * Marks a token.
	 * 
	 * @param token the token
	 */
	public void markToken(RuntimeToken token) {
		(token).setFinished(true);
	}
	
	/**
	 * Drop token on place.
	 *
	 * @param placeLabel the place label
	 */
	public void dropTokenOnPlace(String placeLabel) {
		//TODO:
		RuntimeToken droppedToken = new RuntimeToken("none");
		Place placeForLabel = null;
		for(Place place : tokensMap.keySet()) {
			if(place.getGeoLabel().equals(placeLabel)) {
				placeForLabel = place;
				break;
			}		
		}
		tokensMap.get(placeForLabel).add(droppedToken);
	}

}
