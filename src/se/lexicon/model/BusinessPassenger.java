package se.lexicon.model;

import sun.security.krb5.internal.Ticket;

public class BusinessPassenger extends Passenger {

	public BusinessPassenger(Ticket ticket, String name, int age, String passengerId, GenderType gender, String fellowPassenger,
			String passportNumber, String note, String foodAllergies) {

		super(ticket, name, age, passengerId, gender, fellowPassenger, passportNumber, note, foodAllergies);
	}

	//Özgurs lekstuga
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
