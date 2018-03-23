package se.lexicon.exception;

public class NoMoreSeatsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void println() {
		System.out.println("Planet är fullt");
	}
}
