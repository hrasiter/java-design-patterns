package factorypattern;

public class NYStylePepperoniPizza extends Pizza {

	public NYStylePepperoniPizza() {
		name = "NY Style Sauce and Pepperoni Pizza";
		
		toppings.add("Greated Regiano Cheese");
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (String topping: toppings) {
			System.out.println("    "+ topping);
		}
	};
}
