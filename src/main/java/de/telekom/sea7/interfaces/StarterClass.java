package de.telekom.sea7.interfaces;

import de.telekom.sea7.implementation.ApplicationImpl;

public class StarterClass {

	public static void main(String[] args) {
		
		Application application = new ApplicationImpl();
		
		application.run(args);
	}

}
