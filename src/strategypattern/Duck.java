package strategypattern;

public class Duck {
	protected IFlyBehavior flyBehavior;
	protected IQuackBehaviour quackBehavior;
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void setFlyBehavior(IFlyBehavior flyBehaviour) {
		this.flyBehavior = flyBehaviour;
	}
	
	public void setQuackBehavior(IQuackBehaviour quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
