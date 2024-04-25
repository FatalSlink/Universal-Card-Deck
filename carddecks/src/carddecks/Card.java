package carddecks;

public class Card {
    private final Suit suit;
    private final Rank rank;
    // Optional for special cards
    private final String specialProperty; 

    public Card(Suit suit, Rank rank) {
        this(suit, rank, null);
    }
    public Card(Suit suit, Rank rank, String specialProperty) {
        this.suit = suit;
        this.rank = rank;
        this.specialProperty = specialProperty;
    }
    public Suit getSuit() {
        return suit;
    }
    public Rank getRank() {
        return rank;
    }
    public String getSpecialProperty() {
        return specialProperty;
    }
    @Override
    public String toString() {
        if (specialProperty != null) {
        return specialProperty + " (" + rank + " of " + suit + ")";
        }
        return rank + " of " + suit;
    }
}