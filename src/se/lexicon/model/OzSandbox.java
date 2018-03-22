package se.lexicon.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import se.lexicon.model.Airplane;
import se.lexicon.model.FoodItem;
import se.lexicon.model.Menu;
import se.lexicon.model.Passenger;

public class OzSandbox {

	Scanner scanner = new Scanner(System.in);
	String food, beverage, name, option;
	final String BUSINESS = "1";
	final String ECONOMY = "2";

	Airplane airplane = new Airplane("Boeing A320");

	List<Ticket> tickets = new ArrayList<Ticket>();



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

					option = scanner.nextLine();

					switch(option) {
					case "0":
						isRunning = false;
						break;

					case "1":
						System.out.println("Du har valt Business Class");
						if( airplane.businessSeatsAvailable() ){

							tickets.add( newBusinessTicket() );

							//TODO: gör en snygg lista som visar vad kunden har valt som
							//han kan bekräfta

						}
						else{
							offerOtherTicket(ECONOMY);
						}

						break;

					case "2":
						System.out.println("Du har valt Economy Class");

						if( airplane.economySeatsAvailable()){

							tickets.add(newEconomyTicket());

						}else {
							offerOtherTicket(BUSINESS);
						}

						break;

					default:
						System.out.println(option + " är ett ogiltigt val. Var god försök igen.");

					}

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
		boolean correctInput = false;
		System.out.println("Vänligen välj en huvudrätt ur business-menyn");
		System.out.println("1:"+FoodItem.escargo.toString());
		System.out.println("2:"+FoodItem.frogLegs.toString());

		while( !correctInput) {
			option = scanner.nextLine();
	
			switch(option) {
			
			case "1":
				foodItem = FoodItem.escargo;
				correctInput = true;
				break;
				
			case "2":
				foodItem = FoodItem.frogLegs;
				correctInput = true;
				break;
				
			default : System.out.println("Du har angett ett ogiltigt val. Vänligen försök igen.");
			}//switch
		}//while
		
		return foodItem;
	}

	public FoodItem pickBusinessBeverage() {
		FoodItem foodItem = null;
		boolean correctInput = false;
		
		System.out.println("Vänligen välj något uppfriskande ur vår exklusiva dryckesmeny:");
		System.out.println("1:" + FoodItem.wine.toString());
		System.out.println("2:" + FoodItem.beer.toString());

		while( !correctInput ) {
			option = scanner.next();
			switch(option) {
			
			case "1":
				foodItem = FoodItem.wine;
				correctInput = true;
				break;
				
			case "2":
				foodItem = FoodItem.beer;
				correctInput = true;
				break;
				
			default : System.out.println("Du har angett ett ogiltigt val. Vänligen försök igen.");
			}
		}
		return foodItem;
	}
	
	public FoodItem pickEconomyFood() {
		FoodItem foodItem = null;
		boolean correctInput = false;
	
			System.out.println("Vänligen välj en huvudrätt ur business-menyn");
			System.out.println("1:"+FoodItem.meatballs.toString());
			System.out.println("2:"+FoodItem.bolognese.toString());
		while( !correctInput ) {
			option = scanner.next();

			switch(option) {
			case "1":
				foodItem = FoodItem.meatballs;
				correctInput = false;
				break;
			case "2":
				foodItem = FoodItem.bolognese;
				correctInput = false;
				break;
			default :
				System.out.println("Du har angett ett ogiltigt val. Vänligen försök igen.");
			}
		}//while

		return foodItem;
	}
	
	public FoodItem pickEconomyBeverage() {
		FoodItem foodItem = null;
		boolean correctInput = false;
		
		System.out.println("Vänligen välj något uppfriskande ur vår exklusiva dryckesmeny:");
		System.out.println("1:" + FoodItem.water.toString());
		System.out.println("2:" + FoodItem.lemonade.toString());

		while ( !correctInput) {
			option = scanner.next();
			switch(option) {
			case "1":
				foodItem = FoodItem.water;
				correctInput = true;
				break;
			case "2":
				foodItem = FoodItem.lemonade;
				correctInput = true;
				break;
			default : System.out.println("Du har angett ett ogiltigt val. Vänligen försök igen.");
			}
		}//while
			return foodItem;
	}


	public Passenger newPassenger() {
		System.out.println("Vänligen ange namn:");
		name = scanner.nextLine();
		//TODO metod som genererar unikt newPAssengerID()
		if (option.trim().equals(BUSINESS) ) {
			return new Passenger(name, PassengerType.BUSINESS); 
		}
		else {
			return new Passenger(name, PassengerType.ECONOMY);
		}
	}

	public Ticket newBusinessTicket() {
		
		return new Ticket(newPassenger(), new Menu(pickBusinessFood(), pickBusinessBeverage() ) , 20000, TicketType.BUSINESS);
	}

	public Ticket newEconomyTicket() {
		return new Ticket(newPassenger(), new Menu(pickEconomyFood(), pickEconomyBeverage() ) , 5000, TicketType.ECONOMY);
	}

	public void offerOtherTicket(String ticketType) {
		String ticketString = "";
		if(ticketType.equals(BUSINESS)) {
			System.out.println("Vi har tyvärr inga platser kvar i economy class.\n"
					+ "Vill du istället köpa en biljett i business class? Det kostar bara fyra gånger så mycket.(j/n)");
			option = scanner.next();

			if(option.equals("j")) {
				tickets.add(newBusinessTicket());
			}
			else if(option.equals("n")) {
				System.out.println("Vad tråkigt att höra. Glöm inte att ta del av alla heta erbjudanden vi kommer att spamma din mail med.");
			}
		}
		else {
			System.out.println("Vi har tyvärr inga platser kvar i business class. Vill du istället köpa en biljett i economy class?\n"
					+ "Sätena är lite hårdare och trängre, och film kan du glömma, men det kostar bara 500 kr.(j/n)");
			option = scanner.next();

			if(option.equals("j")) {
				tickets.add(newEconomyTicket());
			}
			else if(option.equals("n")) {
				System.out.println("Vad tråkigt att höra. Glöm inte att ta del av alla heta erbjudanden vi kommer att spamma din mail med.");
			}
		}

	}
}