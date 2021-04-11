package factorypattern;

public class ChicagoStylePepperoniPizza extends Pizza {

	public ChicagoStylePepperoniPizza() {
		name = "Chicago Style Sauce and Pepperoni Pizza";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	void cut() {
		System.out.println("Cutting the pizza into square slices");
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
