package compositepattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	@Override
	public void add(MenuComponent component) {
		menuComponents.add(component);
	}
	@Override
	public void remove(MenuComponent component) {
		menuComponents.remove(component);
	}
	@Override
	public void getChild(int i) {
		// TODO Auto-generated method stub
		super.getChild(i);
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", "+ getDescription());
		System.out.println("---------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while(iterator.hasNext()) {
			MenuComponent component = iterator.next();
			component.print();
		}
	}
	
	
}
