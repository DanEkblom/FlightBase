package se.lexicon.model;

/**
 * Public class for TicketBusiness.
 */
public class TicketBusiness extends Ticket {

    private String ticketType;
    private int ticketPrice;

    public TicketBusiness() {
        this.ticketType = "Business";
        ticketPrice = 20000;
    }

    /**
     * Sets the ticket type
     * @param ticketType Business class ticket
     * @return ticketType;
     */
    public String setTicketType(String ticketType) {
        return this.ticketType;
    }

    /**
     * Gets the ticket type
     * @return ticketType;
     */
    public String getTicketType(String ticketType) {
        return this.ticketType;
    }
}
