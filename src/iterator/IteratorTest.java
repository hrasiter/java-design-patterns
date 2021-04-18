package iterator;

import java.util.ArrayList;

public class IteratorTest {
	public static void main(String[] args) {
	
		ArrayList<Menu> menus = new ArrayList<Menu>();
		
		menus.add(new PancakeHouseMenu());
		menus.add(new DinnerMenu());
		menus.add(new CafeMenu());
		
		Waitress waitress = new Waitress(menus);
		
		waitress.printMenu();
	}
}
