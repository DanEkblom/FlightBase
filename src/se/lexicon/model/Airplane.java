package se.lexicon.model;

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
	 * 
	 * @param airplaneName
	 *            Airplane unique identifier
	 * @param airplaneSeats
	 *            Total number of seats available
	 */

	public Airplane(String airplaneName) {
		this.airplaneName = airplaneName;
		for (int i = 0; i < 10; i++) {
			airplaneSeats.add(new Passenger());
		}
	}

	public Airplane(String airplaneName, List<Passenger> airplaneSeats) {
		this.airplaneName = airplaneName;
		this.airplaneSeats = airplaneSeats;
	}

	/**
	 * Returns airplane name. Useful in toStrings.
	 * 
	 * @return airplaneName
	 */
	public String getAirplaneName() {
		return airplaneName;
	}

	/**
	 * Sets airplane name. Useful when creating new Airplanes.
	 * 
	 * @param airplaneName
	 *            Airplane name
	 */
	// TODO: Redundant method?
	public void setAirplaneName(String airplaneName) {
		this.airplaneName = airplaneName;
	}

	/**
	 * Returns list of airplaneSeats. Used to determine if the plane is fully booked
	 * or not.
	 * 
	 * @return airplaneSeats
	 */
	public List<Passenger> getAirplaneSeats() {
		return airplaneSeats;
	}

	/**
	 * Sets list of airplaneSeats. Used to determine if the plane is fully booked or
	 * not.
	 * 
	 * @param airplaneSeats
	 *            Number of airplane seats
	 */
	// TODO: Redundant method? Useful when creating new Airplanes with different
	// number of seats.
	public void setAirplaneSeats(List<Passenger> airplaneSeats) {
		this.airplaneSeats = airplaneSeats;
	}

	public void addPassenger(Passenger passenger){

		if (passenger.getPassengerType() == PassengerType.BUSINESS) {
			passenger.setSeat(currentFreeBusinessSeat + 1);
			airplaneSeats.add(currentFreeBusinessSeat, passenger);
			airplaneSeats.remove(++currentFreeBusinessSeat);
		}
		else {
			passenger.setSeat(currentFreeEconomySeat + 1);
			airplaneSeats.add(currentFreeEconomySeat++, passenger);

			airplaneSeats.remove(10);
		}

	}// addPassenger

	public boolean seatsAvailable(){
		return ( businessSeatsAvailable() || economySeatsAvailable() );
			
	}
	public boolean businessSeatsAvailable() {
		return (currentFreeBusinessSeat < 5);
	}

	public boolean economySeatsAvailable() {
		return (currentFreeEconomySeat < 10);
	}// economySeatsAvailable

	@Override
	public String toString() {

		// Airplane-data:
		StringBuilder sb = new StringBuilder("Flygplan: ");
		sb.append(airplaneName);
		sb.append("\nAntal säten: ");
		sb.append(airplaneSeats.size());

		// Count of booked Business and Economy-seats
		int businessSeats = 0;
		int economySeats = 0;
		for (int i = 0; i < airplaneSeats.size(); i++) {
			if (airplaneSeats.get(i).getSeatNo() != 0) {
				if (airplaneSeats.get(i).getPassengerType() == PassengerType.BUSINESS) {
					businessSeats++;
				} else {
					economySeats++;
				}
			}
		}
		if (businessSeats + economySeats == 0) {
			sb.append("\nBokningar: saknas");
		} else {
			if (businessSeats > 0) {
				sb.append("\nBokade business-platser: ");
				sb.append(businessSeats);
			}
			if (economySeats > 0) {
				sb.append("\nBokade ekonomiplatser: ");
				sb.append(economySeats);
			}
		}

		//Skapa en lista på alla bokade passagerare:
		// Kanske använda toString för Ticket-instanserna
		// Räkna samtidigt ihop samtliga inkomster och
		// i slutet sammanfatta som totalinkomst resp. totalvinst (30%)

		return sb.toString();
	}

}
