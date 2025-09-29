package subclasses;

import abstractInterfaces.AbstractAutomobile;

public class TeslaRoadster extends AbstractAutomobile{
	private int odometer;
	private int gas;
	
	public int getOdometer() {
		return odometer;
	}
	
	public int getGas() {
		return gas;
	}

	@Override
	public void calcAmount() {
		// TODO Auto-generated method stub
	}
}