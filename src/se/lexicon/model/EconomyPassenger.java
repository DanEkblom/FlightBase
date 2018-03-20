package se.lexicon.model;

import sun.security.krb5.internal.Ticket;

public class EconomyPassenger extends Passenger {

	public EconomyPassenger(Ticket ticket, String name, int age, String passengerId, GenderType gender, String fellowPassenger,
			String passportNumber, String note, String foodAllergies) {
		
		super(ticket, name, age, passengerId, gender, fellowPassenger, passportNumber, note, foodAllergies);

	}

	//�zgurs lekstuga
	public EconomyPassenger(String name, String passengerId) {
		super(name, passengerId);
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		
		s.append("PASSAGERARE:\n");
		s.append("Biljett: Economy\n");
		s.append(super.toString());
		return s.toString();
		
	}
}
