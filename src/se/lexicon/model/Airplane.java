package se.lexicon.model;

import java.util.ArrayList;

public class Airplane {

    String airplaneName;
    List<> airplaneSeats = ArrayList<Passenger>(10);

    /**
     * Airplane Constructor
     * @param airplaneName
     * @param airplaneSeats
     */
    public Airplane(String airplaneName, List<> airplaneSeats) {
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
     * Sets airplane name
     * @return airplaneName
     */
    // TODO: Redundant method? Useful when creating new Airplanes.
    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    /**
     * Returns list of airplaneSeats. Used to determine if the plane is fully booked or not.
     * @return airplaneSeats
     */
    public List<> getAirplaneSeats() {
        return airplaneSeats;
    }

    /**
     * Sets list of airplaneSeats. Used to determine if the plane is fully booked or not.
     * @return airplaneSeats
     */
    // TODO: Redundant method? Useful when creating new Airplanes with differing number of seats.
    public void setAirplaneSeats(List<> airplaneSeats) {
        this.airplaneSeats = airplaneSeats;
    }

    @Override
    public String toString() {
        return "Flygplan " + airplaneName + " har " + airplaneSeats + " bokade platser.";
    }
}
