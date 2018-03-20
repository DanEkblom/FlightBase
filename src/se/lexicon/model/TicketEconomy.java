package se.lexicon.model;

/**
 * Public class for TicketEconomy.
 */
public class TicketEconomy implements TicketInterface {

    private String ticketType;
    private int ticketPrice;
    private Passenger passenger;

    public TicketEconomy(Passenger passenger) {
         this.ticketType = "Economy";
         this.passenger = passenger;
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
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder("Passagerare ");
    	sb.append(this.passenger.getName());
    	sb.append(" har bokat en ");
    	sb.append(ticketType);
    	sb.append("-biljett för ");
    	sb.append(ticketPrice);
    	sb.append(":-.");
    	
        //System.out.println(sb);
        return sb.toString();
    }
}
