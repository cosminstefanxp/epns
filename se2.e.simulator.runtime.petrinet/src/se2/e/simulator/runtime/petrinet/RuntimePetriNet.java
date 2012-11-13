package se2.e.simulator.runtime.petrinet;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import petrinet.Arc;
import petrinet.Item;
import petrinet.PetriNet;
import petrinet.Place;
import petrinet.Token;
import petrinet.impl.PetriNetImpl;
import petrinet.impl.PlaceImpl;
import petrinet.impl.TransitionImpl;

/**
 * The Class RuntimePetriNet.
 */
public class RuntimePetriNet {

	/** The transitions. */
	List<TransitionImpl> transitions;
	/** The tokens map. */
	HashMap<PlaceImpl, List<RuntimeToken>> tokensMap;
	/** The preset. */
	HashMap<TransitionImpl, List<PlaceImpl>> preset;
	/** The postset. */
	HashMap<TransitionImpl, List<PlaceImpl>> postset;

	/**
	 * Initialize tokens in place list.
	 *
	 * @param place the place
	 * @author Ruxandra, Marius
	 */
	private void initializeTokensInPlaceList(PlaceImpl place) {
		List<Token> tempTokens = place.getPtoken();
		List<RuntimeToken> tempTokensExt = new ArrayList<RuntimeToken>();
		for (Token token : tempTokens) {
			tempTokensExt.add(new RuntimeToken(token));
		}
		tokensMap.put(place, tempTokensExt);
	}

	/**
	 * Initialize presets.
	 *
	 * @param selectedTransition the selected transition
	 * @author Ruxandra, Marius
	 */
	private void initializePresets(TransitionImpl selectedTransition) {
		List<PlaceImpl> places = new ArrayList<PlaceImpl>();
		for (Arc arc : selectedTransition.getTargetof()) {
			PlaceImpl place = (PlaceImpl) arc.getSource();
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
	private void initializePostsets(TransitionImpl selectedTransition) {
		List<PlaceImpl> places = new ArrayList<PlaceImpl>();
		for (Arc arc : selectedTransition.getSourceof()) {
			PlaceImpl place = (PlaceImpl) arc.getTarget();
			places.add(place);
		}
		postset.put(selectedTransition, places);
	}

	/**
	 * Prints the petri.
	 * @author Ruxandra, Marius
	 */
	public void printPetri() {
		for (TransitionImpl transition : transitions) {
			System.out.println(transition.getName() + " :");
			for (PlaceImpl place : preset.get(transition)) {
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
		transitions = new ArrayList<TransitionImpl>();
		tokensMap = new HashMap<PlaceImpl, List<RuntimeToken>>();
		preset = new HashMap<TransitionImpl, List<PlaceImpl>>();
		postset = new HashMap<TransitionImpl, List<PlaceImpl>>();
		Iterator<Item> iter = selectedPetri.getPNitems().iterator();
		while (iter.hasNext()) {
			Item item = iter.next();

			if (item instanceof TransitionImpl) {
				/* add transition to list */
				transitions.add((TransitionImpl) item);
				/* create preset for each transition */
				this.initializePresets((TransitionImpl) item);
				/* create postset for each transition */
				this.initializePostsets((TransitionImpl) item);
			}
			if (item instanceof PlaceImpl) {
				/* create a place->tokens hashmap */
				PlaceImpl place = (PlaceImpl) item;
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
	public List<TokenMovement> fireTransition(TransitionImpl selectedTransition) {

		List<PlaceImpl> selectedTransitionPreset = preset.get(selectedTransition);
		List<PlaceImpl> selectedTransitionPostset = postset.get(selectedTransition);
		/* check that every preset has a token */
		for (PlaceImpl place : selectedTransitionPreset) {
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
		for (PlaceImpl place : selectedTransitionPreset) {
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
		for (PlaceImpl place : selectedTransitionPostset) {
			//TODO: for final version: iterate over removedTokens
			String geomLabel = removedTokens.get(count%removedTokens.size()).getLabel();
			count++;
			RuntimeToken tokenExt = new RuntimeToken(geomLabel);
			tokensMap.get(place).add(tokenExt);
			tokensMovement.add(new TokenMovement(tokenExt, place.getLabel(), place.getAnimation()));
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
		for (TransitionImpl transition : transitions) {
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
		for(Place place : tokensMap.keys()) {
			if(place.getLabel().equals(placeLabel)) {
				placeForLabel = place;
				break;
			}		
		}
		tokensMap.get(place).add(droppedToken);
	}

}
