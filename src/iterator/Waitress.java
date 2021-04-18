package iterator;

import java.util.Iterator;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinnerMenu;
	public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu() {
		Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinnerIterator);
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem item = iterator.next();
			
			System.out.println(item.getName() + ", ");
			System.out.println(item.getPrice() + " -- ");
			System.out.println(item.getDescription());
		}
		
	}
	
	
}
