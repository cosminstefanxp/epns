package extensions.graphics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;

import extendedpetrinet.Arc;
import extendedpetrinet.ExtendedpetrinetPackage;
import extendedpetrinet.Place;

/**
 * 
 * @generated NOT
 * @author Juan, María and Pablo.
 *
 */
public class ePNSGraphicalExtension extends GraphicalExtension {

	/**
	 * Returns a singleton list with the net type.
	 */
	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		list.add(ExtendedpetrinetPackage.eINSTANCE.getExtendedPetriNet());
		return list;
	}

	/**
	 * Returns a list referring to the EClass Place and the EClass Arc of the Extended Petri Net type,
	 * which are the classes for which new graphics are provided.
	 */
	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		ArrayList<EClass> list = new ArrayList<EClass>();
		if (netType.equals(ExtendedpetrinetPackage.eINSTANCE.getExtendedPetriNet())) {
			list.add(ExtendedpetrinetPackage.eINSTANCE.getPlace());
			list.add(ExtendedpetrinetPackage.eINSTANCE.getArc());
		}
		return list;
	}

	/**
	 * Returns the specific ePNSPlaceFigure for all ePNS places.
	 */
	@Override
	public IUpdateableFigure createPlaceFigure(org.pnml.tools.epnk.pnmlcoremodel.Place place) {
		if (place instanceof Place) {
			return new ePNSPlaceFigure((Place) place);
		}
		return null;
	}
	
	/**
	 * Returns the specific ePNSArcFigure for all ePNS arcs.
	 * @return 
	 */
	@Override
	public ArcFigure createArcFigure(org.pnml.tools.epnk.pnmlcoremodel.Arc arc) {
		if (arc instanceof Arc) {
			return new ePNSArcFigure((Arc) arc);
		}
		return null;
	}

}