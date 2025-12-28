package Week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();

	public Deck() {
		String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds" };
		String[] numbers = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };

		for (String suit : suits) {
			int count = 2; // value starts at 2 for "two".
			for (String numberName : numbers) {
				cards.add(new Card(numberName, suit, count));
				count++;
			}
		}
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}

	public void shuffle() {
		Collections.shuffle(this.cards);
	}

	public Card draw() {
		return this.cards.remove(0);
	}
}
