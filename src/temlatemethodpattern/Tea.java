/**
 * 
 */
package temlatemethodpattern;

/**
 * @author aysgl-harun
 *
 */
public class Tea extends CaffeineBeverage {

	/* (non-Javadoc)
	 * @see temlatemethodpattern.CaffeineBeverage#brew()
	 */
	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	/* (non-Javadoc)
	 * @see temlatemethodpattern.CaffeineBeverage#addCondiments()
	 */
	@Override
	void addCondiments() {
		System.out.println("Adding lemon");

	}

}
