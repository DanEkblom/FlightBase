package se.lexicon.model;

/**
 * Abstract class for Ticket. Provides a base/contract for underlying classes (Business and Economy).
 */
public abstract class Ticket {

	private Menu menu;
	
	public Ticket(Menu menu) {
		this.menu = menu;
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
