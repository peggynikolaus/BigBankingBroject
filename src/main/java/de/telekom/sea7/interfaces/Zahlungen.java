package de.telekom.sea7.interfaces;

import java.util.Iterator;

public interface Zahlungen extends Iterable {
	
	void addZahlung(Object zahlung);
	
	Object get(int position);
	
	Iterator iterator();

}
