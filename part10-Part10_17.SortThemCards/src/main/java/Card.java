
import java.util.Comparator;



public class Card implements Comparable<Card>{

    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 2 || value > 14) {
            throw new IllegalArgumentException("Card value must be in range 2...14.");
        }

        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        String cardValue = "" + value;
        switch (value) {
            case 11:
                cardValue = "J";
                break;
            case 12:
                cardValue = "Q";
                break;
            case 13:
                cardValue = "K";
                break;
            case 14:
                cardValue = "A";
                break;
            default:
                break;
        }
        
        return suit + " " + cardValue;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card comparable) {
        
        if(this.value == comparable.getValue()){
            if(this.suit.ordinal() == comparable.getSuit().ordinal()){
                return 0;
            }else if(this.suit.ordinal() > comparable.getSuit().ordinal()){
                return 1;
            }else{
                return -1;
            }    
        }else if(this.value > comparable.getValue()){
            return 1;
        }else{
            return -1;
        }
        
    }

}
