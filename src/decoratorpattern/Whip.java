package decoratorpattern;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		double cost =  beverage.cost();
		
		if(beverage.getSize() == Size.SHORT)
			cost += .10;
		else if (beverage.getSize() == Size.TALL)
			cost += .15;
		else if (beverage.getSize() == Size.GRANDE)
			cost += .20;
		else if (beverage.getSize() == Size.VENTI)
			cost += .25;
		
		return cost;
	}

}
