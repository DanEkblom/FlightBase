package se.lexicon.model;

/**
 * Public class for TicketEconomy.
 */
public class TicketEconomy extends Ticket {

    private String ticketType;
    private int ticketPrice;

    public TicketEconomy() {
         this.ticketType = "Economy";
         ticketPrice = 5000;
    }

    /**
     * Sets the ticket type
     * @param ticketType Economy class ticket
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
