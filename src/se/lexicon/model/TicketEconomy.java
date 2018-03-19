package se.lexicon.model;

/**
 * Public class for TicketEconomy.
 */
public class TicketEconomy extends Ticket {

    private String ticketType;

    public TicketEconomy() {
         this.ticketType = "Economy";
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
