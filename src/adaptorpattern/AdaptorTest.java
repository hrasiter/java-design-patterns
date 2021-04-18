package adaptorpattern;

public class AdaptorTest {

	public static void main(String[] args) {

		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		
		TurkeyAdaptor turkeyAdaptor = new TurkeyAdaptor(turkey);
		
		System.out.println("Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("Duck says....");
		testDuck(duck);
		
		System.out.println("Turkey adaptor says.....");
		testDuck(turkeyAdaptor);
		
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
