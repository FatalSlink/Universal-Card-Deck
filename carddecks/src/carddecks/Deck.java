package carddecks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        startNormalDeck();
    }
    private void startNormalDeck() {
        for (Suit suit : Suit.values()) {
        if (suit != Suit.NONE) {
        for (Rank rank : Rank.values()) {
        if (rank != Rank.SPECIAL) {
        cards.add(new Card(suit, rank));
   }
     }
  }
    }
    }
    public void addCard(Card card) {
       cards.add(card);
    }
    public void shuffle() {
       Collections.shuffle(cards);
    }
    public Card drawCard() {
       return cards.remove(cards.size() - 1);
    }
    public void printDeck() {
       for (Card card : cards) {
       System.out.println(card);
        }
    }
}
