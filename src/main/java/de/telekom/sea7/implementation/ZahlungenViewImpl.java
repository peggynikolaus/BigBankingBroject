package de.telekom.sea7.implementation;

import de.telekom.sea7.interfaces.Zahlung;
import de.telekom.sea7.interfaces.Zahlungen;
import de.telekom.sea7.interfaces.ZahlungenView;

public class ZahlungenViewImpl implements ZahlungenView {

	public void multiOutput(Zahlungen zahlungen) {
		for (Object multiPayment : zahlungen) {
			System.out.println("TEST");
// next step: einzelne Daten ausgeben
		}

	}

}