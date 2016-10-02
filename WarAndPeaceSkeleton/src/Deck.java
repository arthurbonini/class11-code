import java.util.Random;

public class Deck {
	final private int DECKSIZE = 52;
	private int[] cardDeck;
	public Deck() {
		cardDeck = new int[DECKSIZE];
	}

	public Card draw() {
		Random rand = new Random();
		int index;
		do {
			index = rand.nextInt(DECKSIZE);
		} while (cardDeck[index] == 1);
		
		cardDeck[index] = 1;
		return new Card(index);
	}


}
