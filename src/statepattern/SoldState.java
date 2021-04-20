package statepattern;

public class SoldState implements State {

	GumballMachine gumBallMachine;
	
	public SoldState(GumballMachine gumbleMachine) {
		this.gumBallMachine = gumbleMachine;
	}
	
	@Override
	public void inserQuarter() {
		System.out.println("Please wait, we're already giving you a gumball!");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank!");

	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice does not get you another gumball!");

	}

	@Override
	public void dispense() {
		gumBallMachine.releaseBall();
		
		if(gumBallMachine.getCount() > 0) {
			gumBallMachine.setState(gumBallMachine.getNoQuaterState());
		}
		else {
			System.out.println("Gumball machine runs out of gumballs!");
			gumBallMachine.setState(gumBallMachine.getSoldoutState());
		}

	}

	@Override
	public void refill(int gumballCount) {
		System.out.println("Machine is busy!");
		
	}

}
