package de.telekom.sea7.implementation;

import de.telekom.sea7.interfaces.Zahlung;
import de.telekom.sea7.interfaces.ZahlungView;

public class ZahlungViewImpl implements ZahlungView {

	
	public String singleOutput(Zahlung zahlung) {

		return "Empfänger: " + zahlung.getEmpfaenger() + "\nIBAN Empfänger: " + zahlung.getEmpfaengerIBAN()
				+ "\nBIC Empfänger: " + zahlung.getEmpfaengerBIC() + "\nBetrag: " + zahlung.getBetrag() + " "
				+ zahlung.getWaehrung() + "\nVerwendungszweck: " + zahlung.getVerwendungszweck();

	}

}
