package statepattern;

public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumbleMachine) {
		this.gumballMachine = gumbleMachine;
	}
	
	@Override
	public void inserQuarter() {
		System.out.println("Out of service!");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Out of service!");

	}

	@Override
	public void turnCrank() {
		System.out.println("Out of service!");

	}

	@Override
	public void dispense() {
		System.out.println("Out of service!");

	}

	@Override
	public void refill(int gumballCount) {
		if(gumballCount > 0) {
			System.out.println("Great, back to work again");
			gumballMachine.setCount(gumballCount);
			gumballMachine.setState(gumballMachine.getNoQuaterState());
		}
		else {
			System.out.println("You should really refill with gumballs!");
		}
		
	}

}
