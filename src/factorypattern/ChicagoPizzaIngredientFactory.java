package factorypattern;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new MozzarellaCheese();
	}

}
