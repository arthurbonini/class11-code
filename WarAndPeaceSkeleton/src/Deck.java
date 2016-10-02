import java.util.Random;

/**
 * A Deck Object that keeps track of which Cards have been played.
 * 
 * @author Arthur Bonini
 *
 */
public class Deck {
	final private int DECKSIZE = 52;
	private int[] cardDeck;
	
	/**
	 * Creates a new Deck with DECKSIZE cards
	 */
	public Deck() {
		//initialize the deck array
		cardDeck = new int[DECKSIZE];
	}

	/**
	 * Returns a Card from the Deck that has not yet been played
	 * 
	 * @return a Card that has not been played
	 */
	public Card draw() {
		//Use the random object to get a random card from the deck
		Random rand = new Random();
		int index;
		
		//Continuously generate random numbers until you find a value that has not
		//  yet been selected [0 = unselected, 1 = selected]
		do {
			index = rand.nextInt(DECKSIZE);
		} while (cardDeck[index] == 1);
		
		//When a card is selected, set its value to 1 so it cannot be chosen again
		cardDeck[index] = 1;
		
		//Create and return a new Card based on that index
		return new Card(index);
	}


}
