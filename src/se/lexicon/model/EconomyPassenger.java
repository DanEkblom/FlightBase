package se.lexicon.model; 

public class EconomyPassenger extends Passenger {

	// Constructor of all properties
	public EconomyPassenger(BusinessTicket ticket, String name, int age, GenderType gender, String fellowPassenger,
			String passportNumber, String note, String foodAllergies) {
		
		super(ticket, name, age, gender, fellowPassenger, passportNumber, note, foodAllergies);

	}

	// Minimum Constructor
	public EconomyPassenger(BusinessTicket ticket, String name, GenderType gender) {
		super(ticket, name, gender);
	}
	
	//Özgurs lekstuga
	public EconomyPassenger(String name) {
		super(name);
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		
		s.append("PASSAGERARE:\n");
		s.append("Biljett: Economy\n");
		s.append(super.toString());
		return s.toString();
		
	}
}
