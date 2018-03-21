package se.lexicon.model;

/**
 * Abstract class for Ticket. Provides a base/contract for underlying classes (Business and Economy).
 */
public abstract class Ticket {

	protected Menu menu;
	protected Passenger passenger;
	protected int price;
	protected String ticketType;
	
	public Ticket(Passenger passenger, Menu menu, int price) {
		this.passenger = passenger;
		this.menu = menu;
		this.price = price;
	}
	
    /**
     * Sets the ticket type
     * @param ticketType Type of ticket
     * @return ticketType;
     */
    public String setTicketType(String ticketType) {
    	return null;
    }

    /**
     * Gets the ticket type
     * @param ticketType Type of ticket
     * @return ticketType;
     */
    public String getTicketType() {
    	return this.getClass().getName();
    }

    public String toString() {
    	return null;
    }
}
