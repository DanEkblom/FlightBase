package se.lexicon.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import se.lexicon.exception.NoMoreSeatsException;
import se.lexicon.model.Airplane;
import se.lexicon.model.FoodItem;
import se.lexicon.model.Menu;
import se.lexicon.model.OzSandbox;
import se.lexicon.model.Passenger;
import se.lexicon.model.PassengerType;
import se.lexicon.model.Ticket;
import se.lexicon.model.TicketType;
import se.lexicon.ui.SystemUI;

public class Main {

    public static void main(String[] args) {
    /*
    	List<String> example = new ArrayList<>();
    	example.add("Ett");
    	example.add("Tvï¿½");
    	example.add("Tre");
    	example.add("Fyra");
    	
//    	for(String text : example) {
//    		if(text.equalsIgnoreCase("tvï¿½")) example.remove(text);
//    	}
    	
    	Iterator<String> it = example.iterator();
    	while(it.hasNext()) {
    		String current = it.next();
    		if(current.equalsIgnoreCase("tvï¿½")) it.remove();
    	}
    	
    	example.forEach(System.out::println);
    	
    	
    	
//        SystemUI ui = new SystemUI();
//        ui.start();
    
    	System.out.println(FoodItem.chicken.toString());
*/
    	
    	/*
    	Airplane airForceOne = new Airplane("Air Force One");
    	Passenger trump = new BusinessPassenger("Donald J Trump");
    	Menu menu = new Menu(FoodItem.bolognese, FoodItem.water);
    	BusinessTicket ticket = new BusinessTicket(trump, menu, 20000);
    	
    	System.out.println(airForceOne.addPassenger(new BusinessPassenger("Stefan")));
    	System.out.println(airForceOne.addPassenger(new BusinessPassenger("Stefan")));
    	System.out.println(airForceOne.addPassenger(new BusinessPassenger("Stefan")));
    	System.out.println(airForceOne.addPassenger(new BusinessPassenger("Stefan")));
    	System.out.println(airForceOne.addPassenger(new BusinessPassenger("Stefan")));
    	System.out.println(airForceOne.addPassenger(new BusinessPassenger("Stefan")));
    	
    	new OzSandbox().start();
*/
    	Airplane cessna = new Airplane("Cessna320");
    	
//    	if (!cessna.businessSeatsAvailable() && !cessna.economySeatsAvailable()) {
//    		System.out.println("Planet är fullt");
//    	} else {
//    		System.out.println("Det finns plats");
//    	}
    	
//    	String name, PassengerType passengerType
//    	Passenger passenger, Menu menu, int price, TicketType ticketType
    	
    	/*
    	Passenger busi1 = new Passenger("Dan", PassengerType.BUSINESS);
    	Passenger busi2 = new Passenger("Pekka", PassengerType.BUSINESS);
    	Passenger busi3 = new Passenger("Peio", PassengerType.BUSINESS);
    	Passenger busi4 = new Passenger("Magdalena", PassengerType.BUSINESS);
    	Passenger busi5 = new Passenger("Andreas", PassengerType.BUSINESS);
    	Passenger busi6 = new Passenger("Kate", PassengerType.BUSINESS);

    	Passenger eco1 = new Passenger("Linus", PassengerType.ECONOMY);
    	Passenger eco2 = new Passenger("OmParKesh", PassengerType.ECONOMY);
    	Passenger eco3 = new Passenger("Sverker", PassengerType.ECONOMY);
    	Passenger eco4 = new Passenger("Valter", PassengerType.ECONOMY);
    	Passenger eco5 = new Passenger("Ulf", PassengerType.ECONOMY);
    	Passenger eco6 = new Passenger("Roger", PassengerType.ECONOMY);

    	FoodItem foodItem = new FoodItem("Dans favorit", 45);
    	FoodItem foodItem2 = new FoodItem("Dans läsk", 15);

    	try {
			cessna.addPassenger(busi1);
			cessna.addPassenger(eco1);
			cessna.addPassenger(busi2);
			cessna.addPassenger(busi3);
			cessna.addPassenger(busi4);
			cessna.addPassenger(busi5);
			

		} catch (NoMoreSeatsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
    	*/
    	//SystemUI ui = new SystemUI();
    	//Ticket ticket = ui.newBusinessTicket();
    	new OzSandbox().start();
    	//Ticket ticket = oz.newBusinessTicket();
    	
    	
    	//String ticketToString = ticket.toString();
    	//System.out.println(ticketToString);
    	
    	//Ticket ticket = new Ticket(new Passenger("Dan", PassengerType.BUSINESS), new Menu(foodItem, foodItem2), 500000, TicketType.BUSINESS, new Airplane("Dans plan") );
    	//System.out.println(ticket.toString());

    	
    }
}
