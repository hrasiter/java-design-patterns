package temlatemethodpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	
	@Override
	boolean CustomerWantsCondiments() {
		String answer = getUserInput();
		
		if(answer.toLowerCase().equals("y")) {
			return true;
		}
		else {
			return false;
		}
			
	}

	String getUserInput() {
		String answer = null;
		
		System.out.println("Would you like milk and sugar with your coffee (y/n)? ");
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			answer = in.readLine();
		} catch (IOException e) {
			System.err.println("IO Error while reading user input");
		}
		
		if(answer == null)
			return "n";
		
		return answer;
	}

}
