package se.lexicon.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import se.lexicon.exception.NoMoreSeatsException;

public class Airplane {

	private String airplaneName;
	private List<Passenger> airplaneSeats = new LinkedList<Passenger>();
	private int currentFreeBusinessSeat = 0;
	private int currentFreeEconomySeat = 5;

	/**
	 * Airplane Constructor
	 * @param airplaneName Airplane unique identifier
	 * @param airplaneSeats Total number of seats available
	 */

	public Airplane(String airplaneName) {
		this.airplaneName = airplaneName;
		for(int i=0; i<10; i++) {
			airplaneSeats.add(new Passenger());
		}
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

		return sb.toString();
	}

	public void addPassenger(Passenger passenger) throws NoMoreSeatsException{
		if( businessSeatsAvailable() && passenger.getPassengerType() == PassengerType.BUSINESS) {
			passenger.setSeat(currentFreeBusinessSeat + 1);
			airplaneSeats.add(currentFreeBusinessSeat, passenger);
			airplaneSeats.remove(++currentFreeBusinessSeat);
		}
		else if( economySeatsAvailable() && passenger.getPassengerType() == PassengerType.ECONOMY){
			passenger.setSeat(currentFreeEconomySeat + 1);
			airplaneSeats.add(currentFreeEconomySeat++, passenger);
			airplaneSeats.remove(10);
		}
		
		else throw new NoMoreSeatsException();

	}//addPassenger

	public boolean businessSeatsAvailable() {
		return (currentFreeBusinessSeat < 5);
	}

	public boolean economySeatsAvailable() {
		return (currentFreeEconomySeat < 10);
	}//economySeatsAvailable
	
	
}
