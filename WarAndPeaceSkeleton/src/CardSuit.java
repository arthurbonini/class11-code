/**
 * Suits that can be used in the Card Class
 * 
 * @author Arthur Bonini
 *
 */
public enum CardSuit {
	/**
	 * Clubs (Value of 0.0)
	 */
	Clubs, 
	
	/**
	 * Diamonds (Value of 0.1)
	 */
	Diamonds, 
	
	/**
	 * Hearts (Value of 0.2)
	 */
	Hearts, 
	
	/**
	 * Spades (Value of 0.3)
	 */
	Spades;
	
	//Unicode symbols for the four suits
	private char symbol[] = {'\u2663', '\u2666', '\u2764', '\u2660'};
	
	/**
	 * Returns the Unicode character associated with the selected Card Suit
	 * 
	 * @return a unicode character
	 */
	public char getSymbol(){
		return symbol[ordinal()];
	}
	
	/**
	 * Returns the specified value of the Suit
	 * 
	 * @return a numeric value of the suit
	 */
	public double getValue(){
		return ordinal()/10.0;
	}
}
