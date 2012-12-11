package extensions.graphics;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;

import extendedpetrinet.Arc;

/**
 * Arc figure that has a different color depending on the identity of the arc.
 * @author María.
 */
public class ePNSArcFigure extends ArcFigure {

	private Arc arc;
	
	public ePNSArcFigure(Arc arc) {
		super(arc);
		this.arc = arc;
		setColor();
	}
	
	@Override
	public void update() {
		setColor();
		this.repaint();
	}
	
	private void setColor(){
		if(arc.getIdentity() != null)
			this.setForegroundColor(getIdentityColor(arc.getIdentity().getText()));
	}

	private Color getIdentityColor(int index){
		Display display = Display.getCurrent();
		switch(index%12){
			case 0: return display.getSystemColor(SWT.COLOR_BLUE);
			case 1: return display.getSystemColor(SWT.COLOR_RED);
			case 2: return display.getSystemColor(SWT.COLOR_GREEN);
			case 3: return display.getSystemColor(SWT.COLOR_YELLOW);
			case 4: return display.getSystemColor(SWT.COLOR_CYAN);
			case 5: return display.getSystemColor(SWT.COLOR_MAGENTA);
			case 6: return display.getSystemColor(SWT.COLOR_DARK_BLUE);
			case 7: return display.getSystemColor(SWT.COLOR_DARK_RED);
			case 8: return display.getSystemColor(SWT.COLOR_DARK_GREEN);
			case 9: return display.getSystemColor(SWT.COLOR_DARK_YELLOW);
			case 10: return display.getSystemColor(SWT.COLOR_DARK_CYAN);
			case 11: return display.getSystemColor(SWT.COLOR_DARK_MAGENTA);
		}
		return null;
	}

}
