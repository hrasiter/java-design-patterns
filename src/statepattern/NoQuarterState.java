package statepattern;

public class NoQuarterState implements State {
	GumballMachine gumbleMachine;
	
	public NoQuarterState(GumballMachine gumbleMachine) {
		this.gumbleMachine = gumbleMachine;
	}

	@Override
	public void inserQuarter() {
		System.out.println("You inserted a quater");
		gumbleMachine.setState(gumbleMachine.getHasQuarterState());

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter!");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there is no quarter!");

	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first!");

	}

	@Override
	public void refill(int gumballCount) {
		System.out.println("Waiting for quarter not for the gumballs!");
	}

}
