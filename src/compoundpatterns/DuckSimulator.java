package compoundpatterns;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		
		AbstrackDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator.simulate(duckFactory);

	}

	void simulate(AbstrackDuckFactory duckFactory) {
//		Quackable mallardDuck = new QuackCounter(new MallardDuck());
//		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
//		Quackable duckCall = new QuackCounter(new DuckCall());
//		Quackable rubberDuck = new QuackCounter(new RubberDuck());
//		Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));
		
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = duckFactory.createGooseAdapter();
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards = new Flock();
		
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
		
		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		
		simulate(flockOfDucks);
		
		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		
		simulate(flockOfMallards);
		
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
		
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}

}
