package se2.e.simulator.runtime.petrinet;

public class RuntimePetriNetFactory {
	RuntimePetriNet rp;
	
	public  RuntimePetriNet getRuntimePetriNet(){
		if(rp == null){
			rp = new RuntimePetriNetImpl();
		}
		return rp;
	}
}
