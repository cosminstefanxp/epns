package tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import se2.e.simulator.runtime.petrinet.RuntimePetriNet;
import se2.e.simulator.runtime.petrinet.TokenMovement;

public class RuntimePetriNetTest {
	
	private RuntimePetriNet runtimePNet = null;
	private PetriNetDoc doc = null;
	
	public RuntimePetriNetTest(){}
	
	public RuntimePetriNetTest(RuntimePetriNet pn, PetriNetDoc doc){
		
		this.runtimePNet = pn;
		this.doc = doc;
	}
	/**
	 * @author Georgios Liassas 
	@BeforeClass
	public void initTestEnvironment(){
		
	
	}*/

	/**
	 * @author Georgios Liassas */
	@Test
	public void testPrintPetri() {
		assertEquals(50, 50);
	}

	/**
	 * @author Georgios Liassas */
	@Test
	public void testInit() {
		
		List<TokenMovement> tm= this.runtimePNet.init(this.doc);
		assertEquals(tm.size(), 1);
	}

	/**
	 * @author Georgios Liassas */
	@Ignore
	public void testFireTransition() {
		fail("Not yet implemented");
	}

	/**
	 * @author Georgios Liassas */
	@Ignore
	public void testFireTransitions() {
		fail("Not yet implemented");
	}

	/**
	 * @author Georgios Liassas */
	@Ignore
	public void testMarkToken() {
		fail("Not yet implemented");
	}

	/**
	 * @author Georgios Liassas */
	@Ignore
	public void testDropTokenOnPlace() {
		fail("Not yet implemented");
	}

	/**
	 * @author Georgios Liassas */
	@Ignore
	public void testGetInputPlaces() {
		fail("Not yet implemented");
	}

}
