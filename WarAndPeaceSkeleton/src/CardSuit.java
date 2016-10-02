
public enum CardSuit {
	Clubs, Diamonds, Hearts, Spades;
	
	private char symbol[] = {'\u2663', '\u2666', '\u2764', '\u2660'};
	public char getSymbol(){
		return symbol[ordinal()];
	}
}
