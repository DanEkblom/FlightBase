package se.lexicon.model;

/*
 *  General static methods
 */
public abstract class Utilities {

	/*
	 * —————————————————————————————
	 *  Convert to Swedish routines
	 * —————————————————————————————
	 */
	public static String genderToSwedish(GenderType g, boolean upperCase) {

		if (g == GenderType.FEMALE) {
			if (upperCase) {
				return "KVINNA";
			} else {
				return "Kvinna";
			}
		} else if (g == GenderType.MALE) {
			if (upperCase) {
				return "MAN";
			} else {
				return "Man";
			}
		} else {
			return "N/A"; // UNKNOWN: Should never happens
		}
	}

	public static String passengerTypeToSwedish(PassengerType pt, boolean upperCase) {

		if (pt == PassengerType.BUSINESS) {
			if (upperCase) {
				return "BUSINESS";
			} else {
				return "Business";
			}
		} else if (pt == PassengerType.ECONOMY) {
			if (upperCase) {
				return "EKONOMI";
			} else {
				return "Ekonomi";
			}
		} else {
			return "N/A"; // UNKNOWN: Should never happens
		}
	}

	public static String ticketTypeToSwedish(TicketType tt, boolean upperCase) {
		
		if (tt == TicketType.BUSINESS) {
			if (upperCase) {
				return "BUSINESS";
			} else {
				return "Business";
			}
		} else if (tt == TicketType.ECONOMY) {
			if (upperCase) {
				return "EKONOMI";
			} else {
				return "Ekonomi";
			}
		} else {
			return "N/A"; // UNKNOWN: Should never happens
		}
	}

	
	// Returns a single-space separated sentence of initial-words (begins with an upper-case-letter)
	public static String fixNameInput(String s) {
		
		/*
		 * The split is space-delimited; therefore, other white-space-characters
		 * must be replaced by spaces.
		 */

		s = s.trim(); // Remove surrounding tabs and newLines also.
		s = s.toLowerCase();		
		s = s.replaceAll("\t", " "); // Remove tabs "inside"

		StringBuilder sentence = new StringBuilder();
		String[] splited = s.split(" ");
		String word = new String();
		String firstChar = "";

		for (int i = 0; i < splited.length; i++) {

			word = splited[i];

			// ignore blanks ("==space")
			if (word.equals("") == false) {

				// Convert the very first character to upper case if possible
				firstChar = word.substring(0, 1);
				firstChar = firstChar.toUpperCase();
				if (i != 0) {
					sentence.append(" ");
				}
				sentence.append(firstChar);
				sentence.append(word.substring(1));

			}
		}

		// Single space separated line of initial-words 
		return sentence.toString();

	}

	//Returns a sentence of single space separated words
	//The very first character will get upper-case if firstCharToUpperCase is true.
	public static String fixTextInput(String s, boolean firstCharToUpperCase) {

		/*
		 * The split is space-delimited; therefore, other white-space-characters
		 * must be replaced by spaces.
		 * 
		 */

		s = s.trim(); // Remove surrounding tabs and newLines also.
		s = s.replaceAll("\t", " "); // Remove tabs "inside"

		StringBuilder sentence = new StringBuilder();
		String[] splited = s.split(" ");
		String word = new String();
		String firstChar = "";

		for (int i = 0; i < splited.length; i++) {

			word = splited[i];

			// ignore blanks ("==space")
			if (word.equals("") == false) {

				// The very first word/phrase/character of the sentence
				if (i == 0) {

					if (firstCharToUpperCase) {

						// Convert the very first character to upper case if possible
						firstChar = word.substring(0, 1);
						firstChar = firstChar.toUpperCase();
						sentence.append(firstChar);
						sentence.append(word.substring(1));

					} else {
						sentence.append(word);
					}

					// >= second word/phase
				} else {
					sentence.append(" ");
					sentence.append(word);
				}

			}
		}

		// Single space separated sentence
		return sentence.toString();

	}

}
