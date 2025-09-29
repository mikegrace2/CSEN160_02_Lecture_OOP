package SCU.CSEN160.car.subclasses;

import SCU.CSEN160.car.abstractInterfaces.CarInterface;
import SCU.CSEN160.car.superclasses.AutomobileSuper;

public class Ford_F150 extends AutomobileSuper implements CarInterface{
	private TeslaRoadster tesla=new TeslaRoadster();
	
	public void driveF150Lightning() {
		System.out.println("Driving F150");
	}

	public void drive() {
		this.driveF150Lightning();
	}
	
	public void steer() {
		System.out.println("Steering F150");
	}

	public void stop() {
		System.out.println("Stopping F150");
	}

	public void accelerate() {
		System.out.println("Accelerating F150");
	}
}