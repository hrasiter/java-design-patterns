package iterator;

import java.util.Iterator;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinnerMenu;
	Menu cafeMenu;
	public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {
		Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinnerIterator);
		System.out.println("\nDINNER");
		printMenu(cafeIterator);
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem item = iterator.next();
			
			System.out.print(item.getName() + ", ");
			System.out.print(item.getPrice() + " -- ");
			System.out.println(item.getDescription());
		}
		
	}
	
	
}
