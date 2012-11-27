package start.popup.actions;


import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import se2.e.configurator.Configurator;
import se2.e.simulator.Simulator;


public class StartCommand extends CompoundCommand {

	/** The selected config. */
	private Configurator selectedConfig;

	/**
	 * Instantiates a new start command.
	 *
	 * @param domain the domain
	 * @param selectedConfig the selected config
	 */
	public StartCommand(EditingDomain domain, Configurator selectedConfig) {
		
		super(0);
		Simulator s = new Simulator(selectedConfig.getGeometry(), selectedConfig.getPetrinet(), selectedConfig.getAppearance(), selectedConfig.getDefaultTrackWidth());
		s.startSimulation();
		System.out.println("Simulation running");
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.CompoundCommand#getDescription()
	 */
	@Override
	public String getDescription() {
		return getLabel();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.command.CompoundCommand#getLabel()
	 */
	@Override
	public String getLabel() {
		if(selectedConfig == null)
			return "";
		return "Start simulation";
	}

}