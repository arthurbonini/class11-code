/**
 * Values that can be used for in the Card Class
 * 
 * @author Arthur Bonini
 *
 */
public enum CardValue {
	/**
	 * Two (Value of 0)
	 */
	Two, 
	
	/**
	 * Three (Value of 1)
	 */
	Three, 
	
	/**
	 * Four (Value of 2)
	 */
	Four, 
	
	/**
	 * Five (Value of 3)
	 */
	Five, 
	
	/**
	 * Six (Value of 4)
	 */
	Six, 
	
	/**
	 * Seven (Value of 5)
	 */
	Seven, 
	
	/**
	 * Eight (Value of 6)
	 */
	Eight, 
	
	/**
	 * Nine (Value of 7)
	 */
	Nine, 
	
	/**
	 * Ten (Value of 8)
	 */
	Ten, 
	
	/**
	 * Jack (Value of 9)
	 */
	Jack, 
	
	/**
	 * Queen (Value of 10)
	 */
	Queen, 
	
	/**
	 * King (Value of 11)
	 */
	King, 
	
	/**
	 * Ace (Value of 12)
	 */
	Ace;
	
	//Short string representations of the Card Values
	private String symbol[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	
	/**
	 * Returns a short string representation of the Card Value
	 * 
	 * @return a string representation of the Card Value
	 */
	public String getSymbol(){
		return symbol[ordinal()];
	}
	
	/**
	 * Returns the specified value of the each Card Value
	 * 
	 * @return a numeric value of the Card Value
	 */
	public double getValue(){
		return ordinal();
	}
}
