package iterator;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu{
	HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();
	
	public CafeMenu() {
		addItem("Veggie Burger and Air Fries",
				"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
				true,
				3.99);
		
		addItem("Soup of the day",
				"A cup of soup of the day with a side salad",
				true,
				3.69);
	}

	private void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		menuItems.put(item.getName(), item);
		
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
}
