package se.lexicon.model;

import se.lexicon.model.Ticket;

/*
 * Two Passenger-types: BUSINESS or ECONOMY
 */

public class Passenger {

	private Ticket ticket;
	private String name;
	private int age;
	private int passengerId;
	private int seatNo;
	private PassengerType passengerType; 
	private GenderType gender;
	private String fellowPassenger;
	private String passportNumber;
	private String note;
	private String foodAllergies; // GLUTEN, LACTOS, NUTS, ETC.
	
	private static int prevPassengerId;

	// Constructor of all properties
	public Passenger(Ticket ticket, String name, int age, GenderType gender, String fellowPassenger,
			String passportNumber, String note, String foodAllergies, PassengerType passengerType) {

		this.ticket = ticket;
		this.name = Utilities.fixNameInput(name);
		this.age = age;
		this.gender = gender;
		this.fellowPassenger = Utilities.fixNameInput(fellowPassenger);
		this.passportNumber = passportNumber;
		this.note = Utilities.fixTextInput(note, false);
		this.foodAllergies = Utilities.fixTextInput(foodAllergies, false);
		this.passengerType = passengerType;
		
		generatePassengerId();
	}

	// Minimum Constructor
	public Passenger(Ticket ticket, String name, GenderType gender, PassengerType passengerType) {

		this.ticket = ticket;
		this.name = name;
		this.gender = gender;
		this.passengerType = passengerType;
		
		this.fellowPassenger = "";
		this.passportNumber = "";
		this.note = "";
		this.foodAllergies = "";
		
		generatePassengerId();
	}
	
	// Özgurs lekstuga
	public Passenger(String name, PassengerType passengerType) {
		
		this.name = Utilities.fixNameInput(name);
		this.passengerType = passengerType;
		
		this.gender= GenderType.UNKNOWN;
		this.fellowPassenger = "";
		this.passportNumber = "";
		this.note = "";
		this.foodAllergies = "";
		
		generatePassengerId();
	}

	public Passenger() {
		
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
	public int getPassengerId() {
		return passengerId;
	}
	public PassengerType getPassengerType() {
		return passengerType;
	}	
	public int getSeatNo() {
		return seatNo;
	}

	
	/*
	 * Start of Setters
	 * 
	 *  passengerId and passengerType are ONLY available through the Constructors.
	 *  All the remaining properties can be set afterwards. 
	 */
	
	public void setSeat(int seatNo) {
		this.seatNo = seatNo;
	}
	public void setName(String name) {
		this.name = Utilities.fixNameInput(name);
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

	private void generatePassengerId() {
		passengerId = ++prevPassengerId;
	}
	
	/*
	 * Blank none-optional properties are ignored here
	 */	
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		s.append("PASSAGERARE:");
		
		s.append("\nBiljettyp: ");
		s.append(Utilities.passengerTypeToSwedish(passengerType, false));
		
		s.append("\nNamn: ");
		s.append(name);
		
		s.append("\nPassagerarID: ");
		s.append(passengerId);
		
		if (!passportNumber.equals("")){
			s.append("\nPassnummer: ");
			s.append(passportNumber);			
		}
		
		if (age != 0) {
			s.append("\nÅlder: ");
			s.append(age);
		}
		
		s.append("\nKön: ");
		s.append(Utilities.genderToSwedish(gender, false));
		
		if (!fellowPassenger.equals("")) {
			s.append("\nMedpassagerare: ");
			s.append(fellowPassenger);
		}
		
		if (!foodAllergies.equals("")) {
			s.append("\nMatallergier: ");
			s.append(foodAllergies);
		}
		
		if (!note.equals("")) {
			s.append("\nNote: ");
			s.append(note);
		}

		return s.toString();
		
	}//toString
	
}
