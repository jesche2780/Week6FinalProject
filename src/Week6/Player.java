package Week6;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;

	public Player(String name) {
		this.name = name;
		this.score = 0;
	}

// describe() prints player info and each card in hand
	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand (" + hand.size() + " cards):");
		for (Card card : hand) {

			card.describe();
		}
	}

// flip() removes and returns the top card from the hand
	public Card flip() {
		return hand.remove(0);
	}

// draw() method used to take a card from the deck and add it to the hand
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		hand.add(drawnCard);
	}

//incrementScore() adds 1 to the score
	void incrementScore() {
		score++;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}
}
