package statepattern;

public class WinnerState implements State {

	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumbleMachine) {
		this.gumballMachine = gumbleMachine;
	}
	
	@Override
	public void inserQuarter() {
		System.out.println("We're already giving you a gumball!");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you turned the crank!");

	}

	@Override
	public void turnCrank() {
		System.out.println("You've already turned crank!");

	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldoutState());
		}
		else {
			gumballMachine.releaseBall();
			System.out.println("YOU'RE THE WINNER! You got two gumballs for your quarter");
			if(gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuaterState());
			}
			else {
				System.out.println("Out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldoutState());
			}
		}

	}

	@Override
	public void refill(int gumballCount) {
		System.out.println("You should come another day when it machine is empty!");
		
	}

}
