package iterator;

public class DinnerMenu {
	
	static final int MAX_MENU_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_MENU_ITEMS];
		
		addItem("Vegetarian BLT",
				"(Fakin) Bacon with lettuce & tomato on whole wheat",
				true,
				2.99);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {

		if(numberOfItems >= MAX_MENU_ITEMS)
			System.out.println("Menu is full, cannot add item");
		else {
			MenuItem item = new MenuItem(name, description, vegetarian, price);
			menuItems[numberOfItems] = item;
			numberOfItems++;
		}	
	}

	Iterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
	
}
