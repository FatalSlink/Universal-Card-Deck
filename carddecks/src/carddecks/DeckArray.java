package carddecks;

public class DeckArray {
    private Card[] cards;
    // Index of the top card in the deck
    private int top; 

    public DeckArray() {
        cards = new Card[52];
        top = 0;
        startNormalDeck();
}
    private void startNormalDeck() {
        int index = 0;
        for (Suit suit : Suit.values()) {
        if (suit != Suit.NONE) {
        for (Rank rank : Rank.values()) {
        if (rank != Rank.SPECIAL) {
        cards[index++] = new Card(suit, rank);
        }
}
        }
}
    }
    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
        int randomIndex = (int) (Math.random() * cards.length);
        Card temp = cards[i];
        cards[i] = cards[randomIndex];
        cards[randomIndex] = temp;
}
}
    public Card drawCard() {
        if (top < cards.length) {
        return cards[top++];
        } else {
        // Indicates that there are no cards left to draw
        return null; 
}
}
    public void printDeck() {
        for (int i = top; i < cards.length; i++) {
            System.out.println(cards[i]);
  }
    }
}
