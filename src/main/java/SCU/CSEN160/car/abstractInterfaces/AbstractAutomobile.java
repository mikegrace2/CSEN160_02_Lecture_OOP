package SCU.CSEN160.car.abstractInterfaces;

import java.util.Random;

public abstract class AbstractAutomobile {
	public int reference;
	
	public AbstractAutomobile() {
		Random rnd=new Random();
		this.reference=rnd.nextInt(1000);
	}

	public int getReference() {
		return this.reference;
	}
	
	public abstract void calcAmount();
}
