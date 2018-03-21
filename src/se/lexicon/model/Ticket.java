package se.lexicon.model;

/**
 * Abstract class for Ticket. Provides a base/contract for underlying classes (Business and Economy).
 */
public abstract class Ticket {

	protected Menu menu;
	protected Passenger passenger;
	protected int ticketNumber;
	protected static int allTicketNumbers = 0;
	protected int price;
	protected String ticketType;
	
	public Ticket(Passenger passenger, Menu menu, int price) {
		this.passenger = passenger;
		this.menu = menu;
		this.price = price;
		ticketNumber = ++allTicketNumbers;
	}

    /**
     * Sets the ticket type
     * @param ticketType Type of ticket
     * @return ticketType;
     //when will this be used?
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

    public abstract String toString();
    
}
