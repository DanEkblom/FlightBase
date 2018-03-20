package se.lexicon.model;

public class Seat {

	boolean occupied = false;
	int seatNr;
	Airplane airplane;
	
	public Airplane getAirplane() {
		return airplane;
	}

	public Seat(Airplane airplane, int seatNr) {
		this.seatNr = seatNr;
		this.airplane = airplane;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied() {
		this.occupied = occupied;
	}
	
	public void switchOccupied() {
		occupied = !occupied;
	}

	public int getSeatNr() {
		return seatNr;
	}
	
}
