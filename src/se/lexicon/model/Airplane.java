package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

public class Airplane {

    String airplaneName;
    List<Passenger> airplaneSeats = new ArrayList<Passenger>();
    List<Seat> seats = new ArrayList<Seat>(10);
    
    /**
     * Airplane Constructor
     * @param airplaneName Airplane unique identifier
     * @param airplaneSeats Total number of seats available
     */

    public Airplane(String airplaneName) {
       this.airplaneName = airplaneName;
    }
    
    public Airplane(String airplaneName, List<Passenger> airplaneSeats) {
        this.airplaneName = airplaneName;
        this.airplaneSeats = airplaneSeats;
    }

    /**
     * Returns airplane name. Useful in toStrings.
     * @return airplaneName
     */
    public String getAirplaneName() {
        return airplaneName;
    }

    /**
     * Sets airplane name. Useful when creating new Airplanes.
     * @param airplaneName Airplane name
     */
    // TODO: Redundant method?
    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    /**
     * Returns list of airplaneSeats. Used to determine if the plane is fully booked or not.
     * @return airplaneSeats
     */
    public List<Passenger> getAirplaneSeats() {
        return airplaneSeats;
    }

    /**
     * Sets list of airplaneSeats. Used to determine if the plane is fully booked or not.
     * @param airplaneSeats Number of airplane seats
     */
    // TODO: Redundant method? Useful when creating new Airplanes with different number of seats.
    public void setAirplaneSeats(List<Passenger> airplaneSeats) {
        this.airplaneSeats = airplaneSeats;
    }

    @Override
    public String toString() {
        //return "Flygplan " + airplaneName + " har " + airplaneSeats.size() + " bokade platser.";
        StringBuilder sb = new StringBuilder("Flygplan ");
    	sb.append(airplaneName);
    	sb.append(" har ");
    	sb.append(airplaneSeats.size());
    	sb.append(" bokade platser.");
    	
        //System.out.println(sb);
        return sb.toString();
    }

    public void addPassenger(Passenger passenger) {
    	airplaneSeats.add(passenger);
    }
    
    
}
