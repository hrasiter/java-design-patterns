package strategypattern;

public class SimpleQuack implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("I just simply quack.");

	}

}
