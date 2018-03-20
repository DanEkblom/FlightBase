package se.lexicon.model;

import se.lexicon.model.BusinessTicket;

public class BusinessPassenger extends Passenger {

	// Constructor of all properties
	public BusinessPassenger(TicketBusiness ticket, String name, int age, GenderType gender, String fellowPassenger,
			String passportNumber, String note, String foodAllergies) {

		super(ticket, name, age, gender, fellowPassenger, passportNumber, note, foodAllergies);
		
	}
	
	// Minimum Constructor
	public BusinessPassenger(TicketBusiness ticket, String name, GenderType gender) {
		super(ticket, name, gender);
	}


	//Özgurs lekstuga
	public BusinessPassenger(String name) {
		super(name);
	}

	
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		s.append("PASSAGERARE:\n");
		s.append("Biljett: Business\n");
		s.append(super.toString());
		return s.toString();
		
	}
}
