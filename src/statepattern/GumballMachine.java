package statepattern;

public class GumballMachine {
	State soldOutState;
	State noQuaterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuaterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberGumballs;
		
		if(numberGumballs > 0)
			state = noQuaterState;
		else 
			state = soldOutState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(count != 0)
			count = count -1;
	}
	
	public int getCount() {
		return count;
	}

	public void setState(State state) {
		this.state = state;
		
	}

	public State getSoldoutState() {
		return soldOutState;
	}

	public State getNoQuaterState() {
		return noQuaterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}
	
	public void insertQuarter() {
		state.inserQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void refill(int gumballCount) {
		state.refill(gumballCount);
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\nMighty Gumball, Inc.\n");
		stringBuilder.append("Java-enabled Standing Gumball Model 2021\n");
		stringBuilder.append("Inventory: " + getCount() + " gumballs\n");
		
		if(getCount() == 0)
			stringBuilder.append("Machine is out of Order\n");
		else
			stringBuilder.append("Machine is waiting fow quarter\n");
		
		return stringBuilder.toString();
	}

	public void setCount(int gumballCount) {
		this.count = gumballCount;
		
	}

}
