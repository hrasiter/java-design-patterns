package iterator;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinnerMenu dinnerMenu;
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu() {
		Iterator dinnerIterator = dinnerMenu.createIterator();
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinnerIterator);
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem item = iterator.next();
			
			System.out.println(item.getName() + ", ");
			System.out.println(item.getPrice() + " -- ");
			System.out.println(item.getDescription());
		}
		
	}
	
	
}
