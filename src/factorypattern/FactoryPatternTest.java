package factorypattern;

public class FactoryPatternTest {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		
		System.out.println("First order: " + pizza + "\n");
		
		PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		pizza = chicagoPizzaStore.orderPizza("veggie");
		
		System.out.println("Secod order: " + pizza + "\n");
	}

}
