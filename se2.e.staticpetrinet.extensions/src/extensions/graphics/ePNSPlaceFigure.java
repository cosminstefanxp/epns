package extensions.graphics;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure;

import extendedpetrinet.Place;

/**
 * Place figure that shows the tokens of the place.
 * @author Juan, María and Pablo.
 */
public class ePNSPlaceFigure extends PlaceFigure {
	
	private Place place;
	
	public ePNSPlaceFigure(Place place) {
		super(place);
		this.place = place;
	}

	@Override
	public void update() {
		this.repaint();
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		extendedpetrinet.Place p = (extendedpetrinet.Place) this.place;
		if(!p.getTokens().isEmpty()){
			Rectangle rectangle = this.getClientArea();
			graphics.setBackgroundColor(getForegroundColor());
			graphics.fillOval((int) (rectangle.x + 0.325 * rectangle.width), (int) (rectangle.y + 0.375 * rectangle.height),
					          (int) (0.25 * rectangle.width), (int) (0.25 * rectangle.height));
			graphics.drawString(String.valueOf(p.getTokens().size()), (int) (rectangle.x + 0.6 * rectangle.width), 
					(int) (rectangle.y + 0.45 * rectangle.height));
		}		
	}

}
