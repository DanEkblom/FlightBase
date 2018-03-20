package se.lexicon.model;

import se.lexicon.model.BusinessTicket;

public abstract class Passenger {

	BusinessTicket ticket;
	String name;
	int age;
	int passengerId;
	GenderType gender;
	String fellowPassenger;
	String passportNumber;
	String note;
	String foodAllergies; // GLUTEN, LACTOS, NUTS, ETC.
	
	private static int prevPassengerId;

	// Constructor of all properties
	public Passenger(TicketBusiness ticket, String name, int age, GenderType gender, String fellowPassenger,
			String passportNumber, String note, String foodAllergies) {

		this.ticket = ticket;
		this.name = Utilities.fixNameInput(name);
		this.age = age;
		this.gender = gender;
		this.fellowPassenger = Utilities.fixNameInput(fellowPassenger);
		this.passportNumber = passportNumber;
		this.note = Utilities.fixTextInput(note, false);
		this.foodAllergies = Utilities.fixTextInput(foodAllergies, false);
		
		generatePassengerId();
	}

	// Minimum Constructor
	public Passenger(TicketBusiness ticket, String name, GenderType gender) {

		this.ticket = ticket;
		this.name = name;
		this.gender = gender;
		
		this.fellowPassenger = "";
		this.passportNumber = "";
		this.note = "";
		this.foodAllergies = "";
		
		generatePassengerId();
	}
	
	// Özgurs lekstuga
	public Passenger(String name) {
		this.name = Utilities.fixNameInput(name);	
		generatePassengerId();
	}

	/*
	 * Start of Getters
	 * 
	 * All local properties are available to get ! 
	 */
	
	public String getName() {
		return name;
	}
	public BusinessTicket getTicket() {
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
	public int getPassengerId() {
		return passengerId;
	}

	/*
	 * Start of Setters
	 * 
	 * All except passengerId are available to be set afterwards ! 
	 */

	public void setName(String name) {
		this.name = Utilities.fixNameInput(name);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	public void setTicket(BusinessTicket ticket) {
		this.ticket = ticket;
	}
	public void setFellowPassenger(String fellowPassenger) {
		this.fellowPassenger = Utilities.fixNameInput(fellowPassenger);
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public void setNote(String note) {
		this.note = Utilities.fixTextInput(note, false);
	}
	public void setFoodAllergies(String foodAllergies) {
		this.foodAllergies = Utilities.fixTextInput(foodAllergies, false);
	}

	public void generatePassengerId() {
		passengerId = ++prevPassengerId;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		s.append("Namn: ");
		s.append(name);
		s.append("\nPassagerarID: ");
		s.append(passengerId);
		
		if (!passportNumber.equals("")){
			s.append("/nPassnummer: ");
			s.append(passportNumber);			
		}
		
		if (age != 0) {
			s.append("/nÅlder: ");
			s.append(age);
		}
		
		s.append("/nKön: ");
		s.append(Utilities.genderToSwedish(gender));
		
		if (!fellowPassenger.equals("")) {
			s.append("/nMedpassagerare: ");
			s.append(fellowPassenger);
		}
		
		if (!foodAllergies.equals("")) {
			s.append("/nMatallergier: ");
			s.append(foodAllergies);
		}
		
		if (!note.equals("")) {
			s.append("/nNote: ");
			s.append(note);
		}

		return s.toString();
		
	}//toString
	
}
