package se2.geometry.diagram.positionListener;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;


import se2.e.geometry.*;
import se2.e.geometry.impl.*;

/**
 * @generated NOT
 * @author Jerome
 */
public class PositionListener extends EContentAdapter {
	
	@Override
	public void notifyChanged(Notification notification) {
		if (notification.getNotifier() instanceof EObject) {
			super.notifyChanged(notification);
		}
		
		// Get the notifier = graphical object that was changed
		if (notification instanceof ENotificationImpl 
			&& notification.getNotifier() instanceof EObject) { 
			
			ENotificationImpl eNotification = (ENotificationImpl) notification;
			EObject eNotifier = (EObject) eNotification.getNotifier();
			
			// TrackPosition, SimplePosition
			if (eNotifier.eContainer() instanceof Node) {
				Node node = (Node) eNotifier.eContainer();
				
				LayoutConstraint location = node.getLayoutConstraint();
				
				if (location instanceof Location) {
					System.out.println("NODE : x = " + ((Location) location).getX() + " and y = " + ((Location) location).getY());
					
					// We go into the model and try to update the position
					// If it doesn't exist, we create a new object
					View view = (View) eNotifier.eContainer();
					
					// TrackPositions
					if (view.getElement() instanceof TrackPositionImpl) {
						TrackPositionImpl nodeModel = (TrackPositionImpl) view.getElement();
						
						// If the position is null we have to create it
						if (nodeModel.getPosition() == null) {
							nodeModel.setPosition(GeometryFactory.eINSTANCE.createPosition());
						}
						
						Position pos = nodeModel.getPosition();
						pos.setX(((Location) location).getX());
						pos.setY(((Location) location).getY());
						nodeModel.setPosition(pos);
					}
					
					// SimplePositions
					else if (view.getElement() instanceof SimplePositionImpl) {
						SimplePositionImpl nodeModel = (SimplePositionImpl) view.getElement();
						
						// If the position is null we have to create it
						if (nodeModel.getPosition() == null) {
							nodeModel.setPosition(GeometryFactory.eINSTANCE.createPosition());
						}
						
						Position pos = nodeModel.getPosition();
						pos.setX(((Location) location).getX());
						pos.setY(((Location) location).getY());
						nodeModel.setPosition(pos);
					}
				}
				
			}
			
			// Track
			else if (eNotifier.eContainer() instanceof Edge) {
				Edge edge = (Edge) eNotifier.eContainer();
				Bendpoints bendPoints = edge.getBendpoints();
				
				int s_x = 0;
				int s_y = 0;
				EObject obj = edge.getSource();
				if (obj instanceof Node) {
					Node node = (Node) obj;
					LayoutConstraint location = node.getLayoutConstraint();
					
					if (location instanceof Location) {
						System.out.println("SOURCE : x = " + ((Location) location).getX() + " and y = " + ((Location) location).getY());
						s_x = ((Location) location).getX();
						s_y = ((Location) location).getY();
					}
				}
				
				if (bendPoints instanceof RelativeBendpoints) {
					RelativeBendpoints relativeBendpoints = (RelativeBendpoints) bendPoints;
					// Nb of relative bendpoints in GMF
					// -2 because we remove the first and the last one
					int nbBendpoints = relativeBendpoints.getPoints().size() - 2;
					
					// What exists in the model
					View view = (View) eNotifier.eContainer();
					
					// If that's not a track, we return!
					if (!(view.getElement() instanceof TrackImpl))
						return;
					
					TrackImpl arcModel = (TrackImpl) view.getElement();
					// Nb of relative positions existing in the model
					int nbRelativepositions = arcModel.getIntermediatePositions().size();
					// These relative positions (of the model)
					EList<Position> Modelpositions = arcModel.getIntermediatePositions();
					
					// If we have less existing positions
					if (nbRelativepositions < nbBendpoints) {
						// We need to create some positions
						for (int i=0; i< (nbBendpoints -  nbRelativepositions); i++) {
							Modelpositions.add(GeometryFactory.eINSTANCE.createPosition());
						}
					}
					else if (nbRelativepositions > nbBendpoints) {
						// We need to delete some positions
						for (int i=0; i< (nbRelativepositions - nbBendpoints); i++) {
							Modelpositions.remove(nbRelativepositions - i - 1);
						}
					}
					int index = 0;
					// Now we have to update (hurray!)
					for (java.lang.Object pointObj : relativeBendpoints.getPoints() ) {
						if (pointObj instanceof RelativeBendpoint) {
							RelativeBendpoint point = (RelativeBendpoint) pointObj;
							// +2 to have the real nb of bendpoints and -1 because the index start at 0
							if (!(index == 0 || index >= nbBendpoints+1)) {
								// -1 because we remove the 0
								Position pos = Modelpositions.get(index-1);
								pos.setX(point.getSourceX() + s_x);
								pos.setY(point.getSourceY() + s_y);
								Modelpositions.set(index-1, pos);
							}
						}
						index++;
					}
				}
			}
				
		}
	}
}