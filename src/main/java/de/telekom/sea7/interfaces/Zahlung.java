package de.telekom.sea7.interfaces;

public interface Zahlung {
	
	String getEmpfaenger();
	String getEmpfaengerIBAN();
	String getEmpfaengerBIC();
	double getBetrag();
	String getWaehrung();
	String getVerwendungszweck();

}
