package strategypattern;

public class TestDuck {

	public static void main(String[] args) {
		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		
		model.setFlyBehavior(new FlyWithWings());
		model.setQuackBehavior(new MuteQuack());
		
		model.performFly();
		model.performQuack();
		
		
	}

}
