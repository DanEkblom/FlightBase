package se.lexicon.model;

/**
 * Public class for TicketBusiness.
 */
public class TicketBusiness extends Ticket {

    private String ticketType;

    public TicketBusiness(String ticketType) {
        this.ticketType = "Business";
    }

    /**
     * Sets the ticket type
     * @param ticketType
     * @return ticketType;
     */
    public String setTicketType(String ticketType) {
        return this.ticketType;
    }

    /**
     * Gets the ticket type
     * @param ticketType
     * @return ticketType;
     */
    public String getTicketType(String ticketType) {
        return this.ticketType;
    }
}
