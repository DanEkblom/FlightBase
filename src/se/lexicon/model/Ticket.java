package se.lexicon.model;

/**
 * Abstract class for Ticket. Provides a base/contract for underlying classes (Business and Economy).
 */
interface TicketInterface {

    /**
     * Sets the ticket type
     * @param ticketType
     * @return ticketType;
     */
    abstract String setTicketType(String ticketType);

    /**
     * Gets the ticket type
     * @param ticketType
     * @return ticketType;
     */
    abstract String getTicketType(String ticketType);
}
