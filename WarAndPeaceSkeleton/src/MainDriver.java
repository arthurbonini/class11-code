/**
 * A class to test the functionality of the Deck and Card Classes
 * 
 * @author Arthur Bonini
 *
 */
public class MainDriver {
	//HANDS can be MAXIMUM 52
	static final int HANDS = 52;
	
	public static void main(String[] args) {

		Deck player1 = new Deck();
		Deck player2 = new Deck();
		
		int player1Score = 0, player2Score = 0;
		
		//Create Card objects to hold the drawn player cards
		Card p1Card, p2Card;
		
		System.out.println("    P1\tvs  P2");
		System.out.println("---------------------------------------");
		
		//Play the game for HANDS rounds (max 52)
		for (int i = 0; i < HANDS; i++){
			//Draw cards from each players hands
			p1Card = player1.draw();
			p2Card = player2.draw();
			
			//Print out the cards values
			System.out.printf("%2d: %s\tvs%4s\t", i+1, p1Card.getSymbol(), p2Card.getSymbol());
			
			//Check the winner and add points
			if (p1Card.winner(p2Card)){
				player1Score++;
				System.out.println(" --Player 1 Wins!");
			} else if(p2Card.winner(p1Card)){
				player2Score++;
				System.out.println(" --Player 2 Wins!");
			} else {
				System.out.println(" --Tie!");
			}
		}
		System.out.println("---------------------------------------");
		System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
		
		
	}

}
