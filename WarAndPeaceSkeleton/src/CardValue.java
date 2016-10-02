
public enum CardValue {
	Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace;
	
	private String symbol[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	public String getSymbol(){
		return symbol[ordinal()];
	}
}
