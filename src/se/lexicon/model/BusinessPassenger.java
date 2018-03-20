package se.lexicon.model;

import sun.security.krb5.internal.Ticket;

public class BusinessPassenger extends Passenger {

	// Constructor of all properties
	public BusinessPassenger(Ticket ticket, String name, int age, String passengerId, GenderType gender, String fellowPassenger,
			String passportNumber, String note, String foodAllergies) {

		super(ticket, name, age, passengerId, gender, fellowPassenger, passportNumber, note, foodAllergies);
	}
	
	// Minimum Constructor
	public BusinessPassenger(Ticket ticket, String name, String passengerId, GenderType gender) {
		super(ticket, name, passengerId, gender);
	}


	//�zgurs lekstuga
	public BusinessPassenger(String name, String passengerId) {
		super(name, passengerId);
	}

	
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		s.append("PASSAGERARE:\n");
		s.append("Biljett: Business\n");
		s.append(super.toString());
		return s.toString();
		
	}
}
