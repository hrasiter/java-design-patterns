package temlatemethodpattern;

public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(CustomerWantsCondiments())
			addCondiments();
	}

	boolean CustomerWantsCondiments() {
		return true;
	}

	void boilWater() {
		System.out.println("Boiling water");
	}

	private void pourInCup() {
		System.out.println("Pouring into cup");
	}

	abstract void brew();
	
	abstract void addCondiments();
}
