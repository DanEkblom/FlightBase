package se.lexicon.model;

/**
 * Public class for EconomyTicket.
 */
public class EconomyTicket extends Ticket {

    private String ticketType;

    public EconomyTicket(Passenger passenger, Menu menu, int price) {
    	super(passenger, menu, price); 
    	this.ticketType = "Economy";
         price = 5000;
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
     * Implemented in superclass
     
    public String getTicketType(String ticketType) {
        return this.ticketType;
    }
    */
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder("Passagerare ");
    	sb.append(this.passenger.getName());
    	sb.append(" har bokat en ");
    	sb.append(ticketType);
    	sb.append("-biljett för ");
    	sb.append(price);
    	sb.append(":-.");
    	
        //System.out.println(sb);
        return sb.toString();
    }
}
