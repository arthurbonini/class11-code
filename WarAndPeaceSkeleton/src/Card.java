
public class Card {
	CardSuit suit;
	CardValue value;
	
	public Card(int cardNum){
		suit = CardSuit.values()[cardNum / 13];
		value = CardValue.values()[cardNum % 13];
	}
	
	public String toString() {
		return value + " of " + suit;
	}
	public String toString(boolean symbols) {
		if (symbols) {
			return value.getSymbol() + suit.getSymbol();
		} else {
			return toString();
		}
	}
	

	public boolean winner(Card c) {
		return getValue() > c.getValue();
	}
	
	private double getValue(){
		return value.ordinal() + (suit.ordinal()/10.0);
	}
	
}
