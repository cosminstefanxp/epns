package se2.e.geometry.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

import se2.e.geometry.Track;


public class TrackWithDiffStartAndEndPosOnly extends AbstractModelConstraint{

	Track track = null;
	
	@Override
	public IStatus validate(IValidationContext ctx) {
		
		EObject object = ctx.getTarget();
		
		// if the Track has the same starting and ending positions
		if(!isTrackValid(object))
			return ctx.createFailureStatus(new Object[] {track, "Not legitimate Track!"});
			
		
		return ctx.createSuccessStatus();
		
	}
	
	
	
	private boolean isTrackValid(Object obj){
		System.err.println("CONSTRAINT CALLED");
		double startPointX, startPointY, endPointX, endPointY;
		if(obj instanceof Track){
			
			track = (Track) obj;	
			//calculate the start and end point of the track object
			startPointX = track.getStartPosition().getPosition().getX();
			startPointY = track.getStartPosition().getPosition().getY();
			endPointX = track.getEndPosition().getPosition().getX();
			endPointY = track.getEndPosition().getPosition().getY();
			
		  
		   if( (startPointX == endPointX) && (startPointY == endPointY))
			  return false;			
		  
		}
	
		return true;		
		
	} 
	

}
