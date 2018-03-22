package se.lexicon.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import se.lexicon.model.Airplane;
import se.lexicon.model.FoodItem;
import se.lexicon.model.Menu;
import se.lexicon.model.OzSandbox;
import se.lexicon.model.Passenger;
import se.lexicon.model.PassengerType;
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
    	//new OzSandbox().start();
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
    	
    	
    	Airplane cessna = new Airplane("Cessna320");
    	if (!cessna.businessSeatsAvailable() && !cessna.economySeatsAvailable()) {
    		System.out.println("Planet är fullt");
    	} else {
    		System.out.println("Det finns plats");
    	}
    	*/
    	OzSandbox oz = new OzSandbox();
    	
    }
}
