package decoratorpattern;

public abstract class CondimentDecorator extends Beverage {
	
	Beverage beverage;

	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSize(Size size) {
		beverage.setSize(size);
	}
	
}
