/*
 * 
 */
package start.popup.actions;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.pnml.tools.epnk.pnmlcoremodel.Object;

import extendedpetrinet.Place;

import se2.e.simulator.runtime.petrinet.RuntimePetriNet;
import se2.e.simulator.runtime.petrinet.RuntimePetriNetFactory;
import se2.e.simulator.runtime.petrinet.RuntimeToken;
import se2.e.simulator.runtime.petrinet.TokenMovement;
import tester.Tester;
import tests.MyTestRunner;



/*
 * @author Georgios Liassas
 */
public class Start implements IObjectActionDelegate {

	private static Tester selectedTester;
	static RuntimePetriNetFactory rpnf;
	private static RuntimePetriNet rpn = null;
	private static List<TokenMovement> tm = null;

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}

	/**
	 * @see IActionDelegate#run(IAction)
	 * if isEnabled returns true, it initializes the simulator
	 */
	public void run(IAction action) {
		if (isEnabled()) {
			
		    rpnf = new RuntimePetriNetFactory();
		    /*Run the JUnit tests being present on that class*/
			MyTestRunner.start();			
		}
	}

	
	/*
	 * @author Georgios Liassas
	 */
	@Before
	public void initTestEnvironment(){
		
		rpn = rpnf.getRuntimePetriNet(); 
		tm = rpn.init(selectedTester.getPetrinet());
	
	}
	
	
	/*
	 * @author Georgios Liassas
	 */
	@Test
	public void testInit() {
		
		/*We know that the first place holds one token*/
		assertEquals(tm.size(), 1);
		
		/*We add more tokens in the first place and we assert that the List<TokenMovement> has size 2*/
		Place place = null;
		Iterator<Object> iter = selectedTester.getPetrinet().getNet().get(0).getPage().get(0).getObject().iterator();
		while(iter.hasNext()){
			
			Object item = iter.next();
			
			if (item instanceof Place) {
				
				place = (Place) item;
				if("G1".equalsIgnoreCase(place.getGeometryLabel().getText()))					
					rpn.getTokenMap().get(place).add(new RuntimeToken("some_random_label"));
				break;
				
			}
		}
		assertEquals(rpn.getTokenMap().get(place).size(), 2); 
		
	}
	
	
	/*
	 * @author Georgios Liassas
	 */
	@Test
	public void testMarkToken(){
		
		boolean isMarked = false;
		Place place = null;
		List<RuntimeToken> rt = null;
		
		/*Assert that the token of the first place is unmarked*/		
		Set<Place> places = rpn.getTokenMap().keySet();
		for(Place pl : places)
			if("G1".equalsIgnoreCase(pl.getGeometryLabel().getText()))
				place = pl;
			
		rt = rpn.getTokenMap().get(place);
		for(RuntimeToken token : rt){
		   isMarked = token.isFinished();	
		   assertTrue("The token is marked as finished, but it should not",!isMarked);
		}  
		
		/*Mark the token and assert again*/
		for(RuntimeToken token : rt){
			rpn.markToken(token); 
			isMarked = token.isFinished();
			assertTrue("The token should be marked as finished",isMarked);
		}	
		
	}
	
	
	
	/*
	 * @author Georgios Liassas
	 */
	@Test
	public void testFireTransition() {
		
		
		/*We add more tokens in the first place and we assert that the List<TokenMovement> has size 2*/
		Place place = null;
		Iterator<Object> iter = selectedTester.getPetrinet().getNet().get(0).getPage().get(0).getObject().iterator();
		while(iter.hasNext()){
			
			Object item = iter.next();
			
			if (item instanceof Place) {
				place = (Place) item;
				if("G1".equalsIgnoreCase(place.getGeometryLabel().getText()))					
					rpn.getTokenMap().get(place).add(new RuntimeToken("some_random_label"));
				break;
				
			}
		}
		assertEquals(rpn.getTokenMap().get(place).size(), 2); 
		
		
		tm = rpn.fireTransitions();
		/*Transition should not fire cause the token is not marked*/
		assertEquals(tm.size(), 0); 
		
		
		/*Mark the token and assert again*/			
		Set<Place> places = rpn.getTokenMap().keySet();
		for(Place pl : places)
			if("G1".equalsIgnoreCase(pl.getGeometryLabel().getText()))
				place = pl;
			
		List<RuntimeToken> rt = rpn.getTokenMap().get(place);
		for(RuntimeToken token : rt)
			rpn.markToken(token);
		
		tm = rpn.fireTransitions();
		assertEquals(tm.size(), 2);
	}
	
	
	
	
	/*
	 * @author Georgios Liassas
	 */
	@Test
	public void testDropTokenOnPlace(){
		
		Place testedInputPlace = null;
		int tokensNum = 0;
		
		/*If there are interactive Places*/
		if(rpn.getInputPlaces().size() > 0){
			
			  /*Find the first interactive Place and count the associated tokens*/	
			  Set<Place> places = rpn.getTokenMap().keySet();
			  for(Place place : places){			  
				  if("G1".equalsIgnoreCase(place.getGeometryLabel().getText())){
					  testedInputPlace = place;
					  tokensNum = rpn.getTokenMap().get(testedInputPlace).size();
					  break;
			      }			  
			  }
		  
		      /*Drop a new token in the same Place found above*/
			  rpn.dropTokenOnPlace(testedInputPlace.getGeometryLabel().getText());
			  
			  /*Assert that the numbers of tokens in that interactive Place is increased by one after the dropping*/
			  assertEquals(tokensNum+1,rpn.getTokenMap().get(testedInputPlace).size());
			 
		}
	}
	
	
	
	@Test
	public void testGetInputPlaces(){
		
		
		List<Place> interPlace = new ArrayList<Place>();
		/*Find all the interactive places*/
		Set<Place> places = rpn.getTokenMap().keySet(); 
		for(Place place : places){
			if(place.getInteractiveInput().isText())
				interPlace.add(place);
		}
		
		/*Assert that every interactive place found interactive indeed*/
		for(Place place : interPlace)
		  assertTrue("Some Place is not interactive", place.getInteractiveInput().isText());
		
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 * 
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selectedTester = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			if (structuredSelection.size() == 1
					&& structuredSelection.getFirstElement() instanceof Tester) {
				selectedTester = (Tester)structuredSelection.getFirstElement();
			}
		}
		action.setEnabled(isEnabled());
	}
	
	
	/**
	 * Checks if is enabled. checks whether the selected Config is null
	 *
	 * @return true, if is enabled
	 */
	public boolean isEnabled() {
		return selectedTester != null;
	}
	
}
