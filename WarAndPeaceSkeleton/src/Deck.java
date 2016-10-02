import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	final private int cardsInDeck = 52;
	private ArrayList<Card> cardDeck;
	public Deck() {
		cardDeck = new ArrayList<Card>();
		for (int i = 0; i<cardsInDeck; i++){
			cardDeck.add(new Card(i));
		}
		//http://stackoverflow.com/questions/16112515/how-to-shuffle-an-arraylist
		Collections.shuffle(cardDeck);
	}

	public Card draw() {
		Card drawn = cardDeck.get(0);
		cardDeck.remove(0);
		return drawn;
	}


}
