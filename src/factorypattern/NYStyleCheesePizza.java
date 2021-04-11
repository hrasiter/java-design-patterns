package factorypattern;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		
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
