package de.telekom.sea7.implementation;

import de.telekom.sea7.interfaces.Zahlung;

public class ZahlungImpl implements Zahlung {
	
	private String empfaenger;
	private String empfaengerIBAN;
	private String empfaengerBIC;
	private double betrag;
	private String waehrung;
	private String verwendungszweck;
	
	//Constructor			//Daten die angegeben werden müssen
	public ZahlungImpl(String empfaenger, String empfaengerIBAN, 
			String empfaengerBIC, double betrag, String waehrung, 
			String verwendungszweck ) {
		
		this.empfaenger = empfaenger;
		this.empfaengerIBAN = empfaengerIBAN;
		this.empfaengerBIC = empfaengerBIC;
		this.betrag = betrag;
		this.waehrung = waehrung;
		this.verwendungszweck = verwendungszweck;
	}

	public String getEmpfaenger() {
		return empfaenger;
	}

	public String getEmpfaengerIBAN() {
		return empfaengerIBAN;
	}

	public String getEmpfaengerBIC() {
		return empfaengerBIC;
	}

	public double getBetrag() {
		return betrag;
	}

	public String getWaehrung() {
		return waehrung;
	}

	public String getVerwendungszweck() {
		return verwendungszweck;
	}
	
	

}
