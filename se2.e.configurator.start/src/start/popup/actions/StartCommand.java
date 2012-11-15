package start.popup.actions;


import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import se2.e.configurator.Configurator;
import se2.e.simulator.Simulator;


public class StartCommand extends CompoundCommand {

	private Configurator selectedConfig;

	public StartCommand(EditingDomain domain, Configurator selectedConfig) {
		
		super(0);
		Simulator s = new Simulator(selectedConfig.getGeometry(), selectedConfig.getPetrinet(), selectedConfig.getAppearance());
		s.startSimulation();
		System.out.println("Simulation running");
	}

	@Override
	public String getDescription() {
		return getLabel();
	}

	@Override
	public String getLabel() {
		if(selectedConfig == null)
			return "";
		return "Start simulation";
	}

}