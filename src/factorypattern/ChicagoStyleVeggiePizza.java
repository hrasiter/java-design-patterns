package factorypattern;

public class ChicagoStyleVeggiePizza extends Pizza {
	
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Style Sauce and Veggie Pizza";
		
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
