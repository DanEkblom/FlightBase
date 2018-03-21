package se.lexicon.model;

import se.lexicon.exception.NoMoreSeatsException;

/*
 *  Two ticket-types exist: Business or Economy
 */
public class Ticket {

	protected Passenger passenger;
	protected Menu menu;
	protected int ticketNumber;
	protected TicketType ticketType;
	protected int price;
	private Airplane airplane;
	
	protected static int allTicketNumbers = 0;

	public Ticket(Passenger passenger, Menu menu, int price, TicketType ticketType, Airplane airplane) {
		this.passenger = passenger;
		this.menu = menu;
		this.price = price;
		this.ticketType = ticketType;
		ticketNumber = ++allTicketNumbers;
		try {
			airplane.addPassenger(passenger);
		} catch (NoMoreSeatsException e) {
			System.out.println("Planet är fullt");
			//e.printStackTrace();
		}
	}

    /**
     * Gets the ticket type
     * @param ticketType Type of ticket
     * @return ticketType;
     */
    public TicketType getTicketType() {
    	return ticketType;
    }

    public String toString() {
    	
    	StringBuilder sb = new StringBuilder("Passagerare ");
        sb.append(this.passenger.getName());
        sb.append(" har bokat en \"");
        sb.append(ticketType.toString().toLowerCase());
        sb.append("\"-biljett för ");
        sb.append(price);
        sb.append(":-. Stolnumret är \"");
        sb.append(ticketNumber);
        sb.append("\". Ytterligare val:\n");
        sb.append(menu.toString());
        
        return sb.toString();
    }
    
}
