package se2.e.simulator.runtime.petrinet;

/**
 * A factory for creating RuntimePetriNet objects.
 * @author Ruxandra
 */
public class RuntimePetriNetFactory {
	
	/** The rp. */
	RuntimePetriNet rp;
	
	/**
	 * Gets the runtime petri net.
	 *
	 * @return the runtime petri net
	 */
	public  RuntimePetriNet getRuntimePetriNet(){
		if(rp == null){
			rp = new RuntimePetriNetImpl();
		}
		return rp;
	}
}
