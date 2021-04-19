package compositepattern;

public class CompositeTest {

	public static void main(String[] args) {
		
		MenuComponent pancakeHouseMenu = 
				new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinnerMenu = 
				new Menu("DINNER MENU", "Lunch");
		MenuComponent cafeMenu = 
				new Menu("CAFE MENU", "Dinner");
		MenuComponent desertMenu = 
				new Menu("DESERT MENU", "Desert of course!");
		
		MenuComponent allmenus = new Menu("RESTAURANT MENU", "All Menus Combined");
		
		allmenus.add(pancakeHouseMenu);
		allmenus.add(dinnerMenu);
		allmenus.add(cafeMenu);
		
		desertMenu.add(new MenuItem(
				"Apple Pie",
				"Apple pie with a flackey crust",
				true,
				1.59));
		
		dinnerMenu.add(new MenuItem(
				"Pasta",
				"Spaghetti with Marinara Sauce",
				true,
				3.89));
		
		pancakeHouseMenu.add(new MenuItem(
				"K&B's Pancake Breakfast",
				"Pancakes with scrambled eggs, and toast",
				true,
				2.99));
		
		dinnerMenu.add(new MenuItem(
				"Vegetarian BLT",
				"(Fakin) Bacon with lettuce & tomato on whole wheat",
				true,
				2.99));
		
		cafeMenu.add(new MenuItem(
				"Veggie Burger and Air Fries",
				"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
				true,
				3.99));
		cafeMenu.add(new MenuItem(
				"Soup of the day",
				"A cup of soup of the day with a side salad",
				true,
				3.69));
		
		dinnerMenu.add(desertMenu);
		
		Waitress waitress = new Waitress(allmenus);
		
		waitress.printMenu();
	}

}
