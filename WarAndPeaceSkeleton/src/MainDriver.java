
public class MainDriver {

	static final int HANDS = 52;
	
	public static void main(String[] args) {

		
		Deck player1 = new Deck();
		Deck player2 = new Deck();
		
		int player1Score = 0, player2Score = 0;
		int tie = 0;
		
		// TODO: gameplay
		
		Card p1Card, p2Card;
		System.out.println("P1\tvs\tP2");
		System.out.println("---------------------------------------");
		
		for (int i = 0; i < HANDS; i++){
			p1Card = player1.draw();
			p2Card = player2.draw();
			
			System.out.printf("%s\tvs\t%s\t", p1Card.toString(true), p2Card.toString(true));
			
			if (p1Card.winner(p2Card)){
				player1Score++;
				System.out.println(" --Player 1 Wins!");
			} else if(p2Card.winner(p1Card)){
				player2Score++;
				System.out.println(" --Player 2 Wins!");
			} else {
				tie++;
				System.out.println(" --Tie!");
			}
		}
		System.out.println("---------------------------------------");
		System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
		
		
	}

}
