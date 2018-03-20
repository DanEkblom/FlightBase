package se.lexicon.model;

/**
 * Public class for BusinessTicket.
 */
public class BusinessTicket extends Ticket {

    private String ticketType;
    private int ticketPrice;
    private Passenger passenger;
    private int ticketNr;

    public BusinessTicket(Passenger passenger, Seat seat, Menu menu) {
        super(passenger, menu);
    	this.ticketType = "Business";
        this.passenger = passenger;
        ticketPrice = 20000;
    }

    public BusinessTicket(Passenger passenger, Menu menu) {
        super(passenger, menu);
    	this.ticketType = "Business";
        this.passenger = passenger;
        ticketPrice = 20000;
    }

    
    /**
     * Sets the ticket type
     * @param ticketType Business class ticket
     * @return ticketType;
     */
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
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
