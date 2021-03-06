package decoratorpattern;

import decoratorpattern.Beverage.Size;

public class DecoratorTest {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		beverage.setSize(Size.GRANDE);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		beverage.setSize(Size.VENTI);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		beverage2.setSize(Size.GRANDE);
		
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

	}

}
