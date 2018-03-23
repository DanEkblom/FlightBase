package se.lexicon.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import se.lexicon.exception.NoMoreSeatsException;
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
			printSplash();
			// Run at least once.
			do {

				// Inner loop error handling
				try {


					System.out.println("Hej och v�lkommen! Vad vill du g�ra?\n"
							+ "1: Flyga Business Class\n"
							+ "2: Flyga Economy class\n"
							+ "3: Lista alla passagerare\n"
							+ "4: Visa summan av Vida Vingar AB:s bruttoint�kter\n"
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

							//TODO: g�r en snygg lista som visar vad kunden har valt som
							//han kan bekr�fta

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

					case "3":
						printPassengers(airplane);
						break;

					case "4":
						printSumRevenue();
						break;

					default:
						System.out.println(option + " �r ett ogiltigt val. Var god f�rs�k igen.");

					}


				} catch (Exception e) {
					System.out.println("Exception caught in inner try : " + e.getMessage());
					e.printStackTrace();

				}//catch


			} while (isRunning);

		} catch (Exception e) {
			System.out.println("Exception caught in outer try : " + e.getMessage());

		} finally {

			// Any tasks needed for cleaning up/saving/etc should be performed here.
			// The scanner auto-closes so don't worry about that.
			printSplash();
		}

	}

	public void printSplash() {
		System.out.println(" _________________________          _____                                 ");
		System.out.println(" |                         \\          \\   \\__      _____               ");
		System.out.println(" | Tack f�r att du flyger   \\__________\\   \\/_______\\___\\_____________ ");
		System.out.println(" | med Vida Vingar AB       /          < /_/   ..................... * `-. ");
		System.out.println(" |_________________________/            `-----------,----,--------------- ");
		System.out.println("                                                  _/____/                 ");
	}

	public FoodItem pickBusinessFood() {
		FoodItem foodItem = null;
		boolean correctInput = false;
		System.out.println("V�nligen v�lj en huvudr�tt ur business-menyn");
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

			default : System.out.println("Du har angett ett ogiltigt val. V�nligen f�rs�k igen.");
			}//switch
		}//while

		return foodItem;
	}

	public FoodItem pickBusinessBeverage() {
		FoodItem foodItem = null;
		boolean correctInput = false;

		System.out.println("V�nligen v�lj n�got uppfriskande ur v�r exklusiva dryckesmeny:");
		System.out.println("1:" + FoodItem.wine.toString());
		System.out.println("2:" + FoodItem.beer.toString());

		while( !correctInput ) {
			option = scanner.nextLine();
			switch(option) {

			case "1":
				foodItem = FoodItem.wine;
				correctInput = true;
				break;

			case "2":
				foodItem = FoodItem.beer;
				correctInput = true;
				break;

			default : System.out.println("Du har angett ett ogiltigt val. V�nligen f�rs�k igen.");
			}
		}
		return foodItem;
	}

	public FoodItem pickEconomyFood() {
		FoodItem foodItem = null;
		boolean correctInput = false;

		System.out.println("V�nligen v�lj en huvudr�tt ur economy-menyn");
		System.out.println("1:"+FoodItem.meatballs.toString());
		System.out.println("2:"+FoodItem.bolognese.toString());
		while( !correctInput ) {
			option = scanner.nextLine();

			switch(option) {
			case "1":
				foodItem = FoodItem.meatballs;
				correctInput = true;
				break;
			case "2":
				foodItem = FoodItem.bolognese;
				correctInput = true;
				break;
			default :
				System.out.println("Du har angett ett ogiltigt val. V�nligen f�rs�k igen.");
			}
		}//while

		return foodItem;
	}

	public FoodItem pickEconomyBeverage() {
		FoodItem foodItem = null;
		boolean correctInput = false;

		System.out.println("V�nligen v�lj n�got uppfriskande ur v�r exklusiva dryckesmeny:");
		System.out.println("1:" + FoodItem.water.toString());
		System.out.println("2:" + FoodItem.lemonade.toString());

		while ( !correctInput) {
			option = scanner.nextLine();
			switch(option) {
			case "1":
				foodItem = FoodItem.water;
				correctInput = true;
				break;
			case "2":
				foodItem = FoodItem.lemonade;
				correctInput = true;
				break;
			default : System.out.println("Du har angett ett ogiltigt val. V�nligen f�rs�k igen.");
			}
		}//while
		return foodItem;
	}


	public Passenger newPassenger() {
		System.out.println("V�nligen ange namn:");
		name = scanner.nextLine();

		if (option.trim().equals(ECONOMY) )
			return new Passenger(name, PassengerType.ECONOMY); 
		
		else return new Passenger(name, PassengerType.BUSINESS); 
		
	}


	public Ticket newBusinessTicket() {

		return new Ticket(newPassenger(), new Menu(pickBusinessFood(), pickBusinessBeverage() ) , 20000, TicketType.BUSINESS, airplane);
	}


	public Ticket newEconomyTicket(){
		return new Ticket(newPassenger(), new Menu(pickEconomyFood(), pickEconomyBeverage() ) , 5000, TicketType.ECONOMY, airplane);

	}

	public void offerOtherTicket(String ticketType) {
		if(!airplane.seatsAvailable()){
			System.out.println("\nPlanet �r fullt, boarding b�rjar om 30 minuter.\n");
		}
		else {

			if(ticketType.equals(BUSINESS)) {
				System.out.println("Vi har tyv�rr inga platser kvar i economy class.\n"
						+ "Vill du ist�llet k�pa en biljett i business class? Det kostar bara fyra g�nger s� mycket.(j/n)");
				option = scanner.nextLine();

				if(option.equals("j")) {
					option = BUSINESS;
					tickets.add(newBusinessTicket());
				}
				else if(option.equals("n")) {
					System.out.println("Vad tr�kigt att h�ra. Gl�m inte att ta del av alla heta erbjudanden vi kommer att spamma din mail med.");
				}
			}

			else {
				System.out.println("Vi har tyv�rr inga platser kvar i business class. Vill du ist�llet k�pa en biljett i economy class?\n"
						+ "S�tena �r lite h�rdare och tr�ngre, och film kan du gl�mma, men det kostar bara 5000 kr.(j/n)");
				option = scanner.nextLine();

				if(option.equals("j")) {
					option = ECONOMY;
					tickets.add(newEconomyTicket());
				}
				else if(option.equals("n")) {
					System.out.println("Vad tr�kigt att h�ra. Gl�m inte att ta del av alla heta erbjudanden vi kommer att spamma din mail med.");
				}
			}
		}
	}//offerOtherTicket

	public void printPassengers(Airplane airplane) {
		for(Passenger p : airplane.getAirplaneSeats()) {
			System.out.println("S�te "+ p.getSeatNo() +" : " + p.getName());
		}

	}

	public void printSumRevenue() {
		int sum = 0;
		for(Ticket t : tickets) {
			sum += t.getPrice() ;
		}
		System.out.println(tickets.size() + " biljetter s�lda. \nTotal oms�ttning: $" + sum +
				"\nVinst: $" + (double)sum * 0.3);
	}
}