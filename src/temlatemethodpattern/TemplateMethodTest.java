package temlatemethodpattern;

public class TemplateMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaffeineBeverage beverage = new Tea();
		
		testBeverage(beverage);
		
		CaffeineBeverage newBeverage = new Coffee();
		
		testBeverage(newBeverage);
		
	}
	
	static void testBeverage(CaffeineBeverage beverage) {
		beverage.prepareRecipe();
		System.out.println("It was delicious\n");
	}

}
