package se2.e.simulator.runtime.petrinet;


import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import extendedpetrinet.Place;
import extendedpetrinet.Token;

/**
 * The Class RuntimePetriNet.
 * @author Ruxandra
 */
public interface RuntimePetriNet {
	/**
	 * Prints the petri.
	 */
	public void printPetri();


	/**
	 * Inits the RuntimePetriNet using the static PetriNet
	 *
	 * @param selectedPetri the static PetriNet
	 * @return the list of tokens that need to be initially animated 
	 */
	public List<TokenMovement> init(PetriNetDoc selectedPetri);

	/**
	 * Fires all the transitions that can be executed.
	 * 
	 * @return the list of {@link Token}s that have been moved and their destination {@link Place}.
	 */
	public List<TokenMovement> fireTransitions();

	/**
	 * Marks a token as being finished.
	 * 
	 * @param token the token
	 */
	public void markToken(RuntimeToken token);
	
	/**
	 * Drop a token on a place.
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
	 * Gets the token map containing each place from the PetriNet and the tokens
	 * that are currently on it. 
	 *
	 * @return the token map
	 */
	public HashMap<Place, List<RuntimeToken>>getTokenMap();

}
