package se.lexicon.model;

/**
 * Abstract class for Ticket. Provides a base/contract for underlying classes (Business and Economy).
 */
interface TicketInterface {

    /**
     * Sets the ticket type
     * @param ticketType Type of ticket
     * @return ticketType;
     */
    String setTicketType(String ticketType);

    /**
     * Gets the ticket type
     * @param ticketType Type of ticket
     * @return ticketType;
     */
    String getTicketType(String ticketType);

    String toString();
}
