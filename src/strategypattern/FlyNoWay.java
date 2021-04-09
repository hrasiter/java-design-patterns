package strategypattern;

public class FlyNoWay implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("I cannot fly!");

	}

}
