package se.lexicon.model;

import se.lexicon.exception.NoMoreSeatsException;

/*
 *  Two ticket-types exist: Business or Economy
 */
public class Ticket {

	private Passenger passenger;
	private Menu menu;
	private int ticketNumber;
	private TicketType ticketType;
	private int price;
	private Airplane airplane;
	
	private static int allTicketNumbers = 0;
	
	public final static int BusinessTicket = 20000;
	public final static int EconomyTicket = 5000;

	public Ticket(Passenger passenger, Menu menu, int price, TicketType ticketType, Airplane airplane) throws NoMoreSeatsException {
		this.passenger = passenger;
		this.menu = menu;
		this.price = price;
		this.ticketType = ticketType;
		ticketNumber = ++allTicketNumbers;
		airplane.addPassenger(passenger);
	}

	/**
	 * Gets the ticket type
	 * 
	 * @param ticketType
	 *            Type of ticket
	 * @return ticketType;
	 */
	public TicketType getTicketType() {
		return ticketType;
	}
	
	/**
	 * Returns price, type integer
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * Returns airplane, type Airplane
	 * @return airplane
	 */
	public Airplane getAirplane() {
		return airplane;
	}
	
	/**
	 * Returns the ticket number, type integer
	 * @return ticketNumber
	 */
	public int getTicketNumber(){
		return ticketNumber;
	}
	
	/**
	 * Returns the passenger, type Passenger
	 * @return airplane
	 */
	public Passenger getPassenger() {
		return passenger;
	}
	
	/**
	 * Returns the menu, type Menu
	 * @return menu
	 */
	public Menu getMenu() {
		return menu;
	}
	
	public String toString() {

		StringBuilder sb = new StringBuilder("Passagerare: ");
		sb.append(this.passenger.getName());
		sb.append("\nBokning: ");
		sb.append(Utilities.ticketTypeToSwedish(ticketType, false));
		sb.append("-biljett");
		sb.append("\n\nStolsnummer: ");
		sb.append(passenger.getSeatNo());
		sb.append("\nBiljettnummer: ");
		sb.append(ticketNumber);
		
		sb.append("\n\n");
		if (ticketType.equals(TicketType.BUSINESS)) {
			sb.append(menu.menuItems());
			sb.append("\n\nTotalkostnad: ");
			sb.append(BusinessTicket);
		}else {
			sb.append(menu.toString());
			sb.append("\n\nTotalkostnad: ");
			sb.append(menu.totalFoodCost(menu) + EconomyTicket);
		}
		sb.append(" kr");

		return sb.toString();
	}

}
