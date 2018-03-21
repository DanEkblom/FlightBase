package se.lexicon.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import se.lexicon.model.Airplane;
import se.lexicon.model.BusinessPassenger;
import se.lexicon.model.EconomyPassenger;
import se.lexicon.model.FoodItem;
import se.lexicon.model.Menu;
import se.lexicon.model.Passenger;
import se.lexicon.model.Seat;
import se.lexicon.model.BusinessTicket;

public class SystemUI {
	Scanner scanner = new Scanner(System.in);
	String food, beverage, name, option;
	final String BUSINESS = "1";
	final String ECONOMY = "2";

	Airplane airplane = new Airplane("Boeing A320");

	List<BusinessTicket> tickets = new ArrayList<BusinessTicket>();

	// Start the applications UI
	public void start() {

		// Loop-condition
		boolean isRunning = true;

		// Try-with-resources to auto-close scanner on error or exit
		try {

			// Run at least once.
			do {

				// Inner loop error handling
				try {

					printSplash();
					System.out.println("Hej och välkommen! Vad vill du göra?\n"
							+ "1: Flyga Business Class\n"
							+ "2: Flyga Economy class\n"
							+ "0: Avsluta");

					option = scanner.next();

					switch(option) {
					case "0":
						isRunning = false;
						break;

					case "1":

						if( airplane.businessSeatsAvailable() ){

							newBusinessTicket();
							

							//TODO: gör en snygg lista som visar vad kunden har valt som
							//han kan bekräfta

							//tickets.add(new Ticket ())

						}
						else{
							offerOtherTicket();
						}

						break;

					case "2":
						/*
						if( plane.economySeatsAvailable(){

							pickEconomyMenu();

						}
						 */
						break;

					default:
						System.out.println(option + " är ett ogiltigt val. Var god försök igen.");

					}
					if (isRunning) tickets.add( newTicket(newPassenger()) );
				} catch (Exception e) {
					System.out.println("Exception caught in inner try : " + e.getMessage());

				}//catch




			} while (isRunning);

		} catch (Exception e) {
			System.out.println("Exception caught in outer try : " + e.getMessage());

		} finally {

			// Any tasks needed for cleaning up/saving/etc should be performed here.
			// The scanner auto-closes so don't worry about that.

		}

	}

	public void printSplash() {
		System.out.println(" _________________________          _____                                 ");
		System.out.println(" |                         \\          \\   \\__      _____               ");
		System.out.println(" | Tack för att du flyger   \\__________\\   \\/_______\\___\\_____________ ");
		System.out.println(" | med Vida Vingar AB       /          < /_/   ..................... * `-. ");
		System.out.println(" |_________________________/            `-----------,----,--------------- ");
		System.out.println("                                                  _/____/                 ");
	}

	public FoodItem pickBusinessFood() {
		FoodItem foodItem = null;
		System.out.println("Vänligen välj en huvudrätt ur business-menyn");
		System.out.println("1:"+FoodItem.escargo.toString());
		System.out.println("2:"+FoodItem.frogLegs.toString());

		option = scanner.next();

		switch(option) {
		case "1": foodItem = FoodItem.escargo;
		case "2": foodItem = FoodItem.frogLegs;
		default : System.out.println("Du har angett ett ogiltigt val. Vänligen försök igen.");
		}

		return foodItem;
	}

	public FoodItem pickBusinessBeverage() {
		FoodItem foodItem = null;
		System.out.println("Vänligen välj något uppfriskande ur vår exklusiva dryckesmeny:");
		System.out.println("1:" + FoodItem.wine.toString());
		System.out.println("2:" + FoodItem.beer.toString());

		option = scanner.next();
		switch(option) {
		case "1": foodItem = FoodItem.wine;
		case "2": foodItem = FoodItem.beer;
		default : System.out.println("Du har angett ett ogiltigt val. Vänligen försök igen.");
		}

		return foodItem;
	}

	public Passenger newPassenger() {
		System.out.println("Vänligen ange namn:");
		name = scanner.next();
		//TODO metod som genererar unikt newPAssengerID()
		if (option.trim().equals(BUSINESS) ) {
			return new BusinessPassenger(name, "?"); 
		}
		else {
			return new EconomyPassenger(name, "?");
		}
	}
	
	public BusinessTicket newBusinessTicket() {
		return new BusinessTicket(newPassenger(), new Menu(pickBusinessFood(), pickBusinessBeverage() ), 20000 );
	}
	
	public void offerOtherTicket() {
		
	}
}
