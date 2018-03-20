package se.lexicon.model;

import sun.security.krb5.internal.Ticket;

public abstract class Passenger {

	Ticket ticket;
	String name;
	int age;
	String passengerId;
	GenderType gender;
	String fellowPassenger;
	String passportNumber;
	String note;
	String foodAllergies; // GLUTEN, LACTOS, NUTS, ETC.

	// Constructor for all properties
	public Passenger(Ticket ticket, String name, int age, String passengerId, GenderType gender, String fellowPassenger,
			String passportNumber, String note, String foodAllergies) {

		this.ticket = ticket;
		this.name = name;
		this.age = age;
		this.passengerId = passengerId;
		this.gender = gender;
		this.fellowPassenger = fellowPassenger;
		this.passportNumber = passportNumber;
		this.note = note;
		this.foodAllergies = foodAllergies;
	}

	// Minimum Constructor
//	public Passenger(Ticket ticket, String name, int age, String passengerId, GenderType gender, String fellowPassenger,
//			String passportNumber, String note, String foodAllergies) {
//
//		this.ticket = ticket;
//		this.name = name;
//		this.age = age;
//		this.passengerId = passengerId;
//		this.gender = gender;
//		this.fellowPassenger = fellowPassenger;
//		this.passportNumber = passportNumber;
//		this.note = note;
//		this.foodAllergies = foodAllergies;
//	}
	
	
	
	// Özgurs lekstuga
	public Passenger(String name, String passengerId) {
		this.name = name;
		this.passengerId = passengerId;
	}

	/*
	 * Start of Getters
	 * 
	 * All local properties are available to get ! 
	 */
	
	public String getName() {
		return name;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public int getAge() {
		return age;
	}
	public GenderType getGender() {
		return gender;
	}
	public String getFellowPassenger() {
		return fellowPassenger;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public String getNote() {
		return note;
	}
	public String getFoodAllergies() {
		return foodAllergies;
	}
	public String getPassengerId() {
		return passengerId;
	}

	/*
	 * Start of Setters
	 * 
	 * All except passengerId are available to be set afterwards ! 
	 */

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public void setFellowPassenger(String fellowPassenger) {
		this.fellowPassenger = fellowPassenger;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public void setFoodAllergies(String foodAllergies) {
		this.foodAllergies = foodAllergies;
	}


	public String toString() {
		StringBuilder s = new StringBuilder();
		
		s.append("Namn: ");
		s.append(name);
		s.append("\nPassagerID: ");
		s.append(passengerId);
		return s.toString();
		
	}
	
	
}
