package decoratorpattern;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + .30;
	}

}