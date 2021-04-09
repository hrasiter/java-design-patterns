package strategypattern;

public class FlyWithWings implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can fly with wings");

	}

}
