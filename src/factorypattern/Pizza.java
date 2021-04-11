package factorypattern;

import java.util.ArrayList;

public abstract class Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	String name;
	
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	
	ArrayList<String> toppings = new ArrayList<String>();
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into the diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return  getName() + " with " + dough + ", "+ cheese + ", " + sauce;
	}

	public void setName(String name) {
		this.name = name;
	}

}
