package Week6;

public class App {
	public static void main(String[] args) {

		// Create and shuffle the deck
		Deck deck = new Deck();
		deck.shuffle();

		// Create two players
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");

		// dealing out 52 cards between each player
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}

		// play 26 rounds
		for (int i = 0; i < 26; i++) {
			System.out.println("Round " + (i + 1));
			System.out.println("---------");
			Card p1Card = player1.flip();
			Card p2Card = player2.flip();
			System.out.print("Player 1 plays: ");
			p1Card.describe();
			System.out.print("Player 2 plays: ");
			p2Card.describe();
			if (p1Card.getValue() > p2Card.getValue()) {
				player1.incrementScore();
				System.out.println("=> Player 1 wins the round.");
			} else if (p2Card.getValue() > p1Card.getValue()) {
				player2.incrementScore();
				System.out.println("=> Player 2 wins the round.");
			} else {
				System.out.println("=> Tie. No points awarded.");
			}
			System.out
					.println("Current Score - Player 1: " + player1.getScore() + " | Player 2: " + player2.getScore());
			System.out.println();
		}

		// results of the game
		System.out.println("Final Scores:");
		System.out.println("Player 1: " + player1.getScore());
		System.out.println("Player 2: " + player2.getScore());
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Winner: Player 1");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Winner: Player 2");
		} else {
			System.out.println("Result: Draw");
		}
	}
}
