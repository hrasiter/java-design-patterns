package statepattern;

public interface State {
	public void inserQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	public void refill(int gumballCount);
}
