package superclasses;

public class AutomobileSuper extends Object{
	protected int odometer;
	protected int gas;
	
	public int getOdometer() {
		return odometer;
	}
	
	public int getGas() {
		return gas;
	}
	
	public void setGas(int value) {
		this.gas=this.gas+value;
	}
	
	public void drive() {
		
	}
	
	public void stop() {

	}	
}
