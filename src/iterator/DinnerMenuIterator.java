package iterator;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem>{

	MenuItem[] items;
	int position = 0;
	
public DinnerMenuIterator(MenuItem[] items) {
	this.items = items;
}
	
	@Override
	public boolean hasNext() {
		if(position >= items.length || items[position] == null)
			return false;
		else
			return true;
	}

	@Override
	public MenuItem next() {
		MenuItem item = items[position];
		position = position + 1;
		return item;
	}

	@Override
	public void remove() {
		if(position <= 0) {
			throw new IllegalStateException(
					"You cannot remove Item until you have done at least one next()");
		}
		
		if(items[position-1] != null) {
			for(int i = position -1; i < items.length-1; i++) {
				items[i] = items[i+1];
			}
			
			items[items.length-1] = null;
		}
	}
	
	

}
