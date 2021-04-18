package iterator;

public class DinnerMenuIterator implements Iterator{

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

}
