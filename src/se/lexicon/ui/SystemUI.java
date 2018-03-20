package se.lexicon.ui;

import java.util.Scanner;

public class SystemUI {

	// Start the applications UI
	public void start() {

		// Loop-condition
		boolean isRunning = true;

		String option;
		
		// Try-with-resources to auto-close scanner on error or exit
		try(Scanner scanner = new Scanner(System.in)) {

			// Run at least once.
			do {

				// Inner loop error handling
				try {

					printSplash();
					System.out.println("Hej och välkommen! Vad vill du göra?\n"
							+ "1: Flyga Buissness Class\n"
							+ "2: Flyga Economy class\n"
							+ "0: Avsluta");
					
					option = scanner.next();
					
					switch(option) {
					case "0":
						isRunning = false;
						break;
						
					case "1":
						/*
						if( plane.buisnessSeatsAvailable() ){
						
							pickBuisnessMenu();
						
						}
						else{
							offerOtherClass();
						}
						*/
						break;
						
					case "2":
						/*
						if( plane.economySeatsAvailable(){
						
							pickEconomyMenu();
						
						}
						*/
					
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

	public void pickBuisnessMenu() {
		System.out.println("Vänligen välj en huvudrätt ur Buisness-menyn");
	}
	
}
