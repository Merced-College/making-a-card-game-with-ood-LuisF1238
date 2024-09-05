public class Card {

    private String suit;
    private int value;
    private String rank;

    public Card(int value, String suit, String rank) {

        this.value = value;
        this.suit = suit;
        this.rank = rank;
    }
 public String getSuit() {
     return suit;
 }
 public int getValue() {
     return value;
 }
 public String getRank() {
     return rank;
 }

 public String toString(){
        return "Suit = " + suit + ", " + "Rank = " + rank + ", " + "Vaule = " + value;

 }


}





