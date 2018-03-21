package se.lexicon.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import se.lexicon.model.Airplane;
import se.lexicon.model.BusinessPassenger;
import se.lexicon.model.FoodItem;
import se.lexicon.model.Passenger;
import se.lexicon.ui.SystemUI;

public class Main {

    public static void main(String[] args) {
    /*
    	List<String> example = new ArrayList<>();
    	example.add("Ett");
    	example.add("Tv�");
    	example.add("Tre");
    	example.add("Fyra");
    	
//    	for(String text : example) {
//    		if(text.equalsIgnoreCase("tv�")) example.remove(text);
//    	}
    	
    	Iterator<String> it = example.iterator();
    	while(it.hasNext()) {
    		String current = it.next();
    		if(current.equalsIgnoreCase("tv�")) it.remove();
    	}
    	
    	example.forEach(System.out::println);
    	
    	
    	
//        SystemUI ui = new SystemUI();
//        ui.start();
    
    	System.out.println(FoodItem.chicken.toString());
*/
//    	new SystemUI().start();
    	
    	new Airplane("Boeing").addPassenger(new BusinessPassenger("Stefan"));
    	
    }
}
