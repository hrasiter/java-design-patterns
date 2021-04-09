package strategypattern;

public class MuteQuack implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("I cannot make noise!!");
	}

}
