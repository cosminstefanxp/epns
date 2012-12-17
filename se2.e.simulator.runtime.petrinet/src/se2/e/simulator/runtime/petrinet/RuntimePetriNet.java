package se2.e.simulator.runtime.petrinet;


import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import extendedpetrinet.Place;
import extendedpetrinet.Token;

/**
 * The Class RuntimePetriNet.
 */
public interface RuntimePetriNet {
	/**
	 * Prints the petri.
	 */
	public void printPetri();


	/**
	 * Inits the.
	 *
	 * @param selectedPetri the selected PetriNet
	 * @return the list
	 */
	public List<TokenMovement> init(PetriNetDoc selectedPetri);

	/**
	 * Fires all the transitions possible.
	 * 
	 * @return the list of {@link Token}s that have been moved and their destination {@link Place}.
	 */
	public List<TokenMovement> fireTransitions();

	/**
	 * Marks a token.
	 * 
	 * @param token the token
	 */
	public void markToken(RuntimeToken token);
	
	/**
	 * Drop token on place.
	 *
	 * @param geometryLabel the place's GEOMETRY label
	 * @return true, if successful
	 */
	public Place dropTokenOnPlace(String geometryLabel);

	
	/**
	 * Gets all the input places from the PetriNet.
	 *
	 * @return the input places
	 */
	public Set<String> getInputPlaces();
	
	/**
	 * Gets the token map.
	 *
	 * @return the token map
	 */
	public HashMap<Place, List<RuntimeToken>>getTokenMap();

}
