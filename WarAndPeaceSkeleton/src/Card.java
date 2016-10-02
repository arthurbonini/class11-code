/**
 * A Card Object that holds both a suit and value.
 * 
 * @author Arthur Bonini
 * 
 */
public class Card {
	CardSuit suit;
	CardValue value;
	
	/**
	 * Creates a new Card based on a user submitted suit and value.
	 * 
	 * @param suit the card suit [Clubs, Diamonds, Hearts, Spades]
	 * @param value the card value [Two-Ten, Jack, Queen, King, Ace]
	 */
	public Card(CardSuit suit, CardValue value){
		this.suit = suit;
		this.value = value;
	}
	
	/**
	 * Creates a new card based on the based on a number from 0 to 51.
	 *   0-12: Two to Ace (Clubs), 13-25: Two to Ace (Diamonds),
	 *   26-38: Two to Ace (Hearts), 39-51: Two to Ace (Spades)
	 *   
	 * @param cardNum The card sequence number
	 */
	public Card(int cardNum){
		//Takes the whole part of the cardNum/13 to find suit (0-3)
		suit = CardSuit.values()[cardNum / 13];
		//Takes the remainder of cardNum/13 to find the numeric value (0-12)
		value = CardValue.values()[cardNum % 13];
	}
	
	/**
	 * Returns a string representation of the Card [ex. 'Ace of Spaces', 'Two of Hearts'].
	 * 
	 * @return A string representation of the Card.
	 */
	public String toString() {
		return value + " of " + suit;
	}
	
	/**
	 * Returns a string representation of the Card using unicode symbols
	 * 
	 * @return A string representation of the Card using symbols.
	 */
	public String getSymbol() {
		return value.getSymbol() + suit.getSymbol();
	}
	
	/**
	 * Indicates whether another card has a higher value than this one.
	 *   From lowest to highest: 2-A, Suit precedence: Clubs, Diamonds, Hearts, Spades.
	 *   
	 * @param c the Card to compare too.
	 * @return true if this Card has a higher value than c, 
	 *   false if they are the same value or this one is less
	 */
	public boolean winner(Card c) {
		return getValue() > c.getValue();
	}
	
	/**
	 * Returns a numeric value for a card based on its suit and card number.
	 *   
	 * @return a numeric value based on the card suit and number
	 */
	private double getValue(){
		//The card value (2-A) + the card suit/10.  
		//  [ex. Ace of Diamonds = 12.1, Ace of Spades = 12.3]
		return value.getValue() + suit.getValue();
	}
	
}
