package compoundpatterns;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {
	
	ArrayList<Observer> observers = new ArrayList<Observer>();
	Quackable duck;
	
	public Observable(Quackable duck) {
		this.duck = duck;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}

	}

}
