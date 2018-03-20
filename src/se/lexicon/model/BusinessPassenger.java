package se.lexicon.model;

import se.lexicon.model.TicketBusiness;

public class BusinessPassenger extends Passenger {

	// Constructor of all properties
	public BusinessPassenger(TicketBusiness ticket, String name, int age, String passengerId, GenderType gender, String fellowPassenger,
			String passportNumber, String note, String foodAllergies) {

		super(ticket, name, age, passengerId, gender, fellowPassenger, passportNumber, note, foodAllergies);
	}
	
	// Minimum Constructor
	public BusinessPassenger(TicketBusiness ticket, String name, String passengerId, GenderType gender) {
		super(ticket, name, passengerId, gender);
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
