
import java.util.*;

public class Deck {

    private ArrayList<Card> ArraylistofCard = new ArrayList<>();

    public Deck() {
        int i = 0;
        int j = 0;
        for (i = 0; i < 4; i++) //suits
        {
            for (j = 2; j < 15; j++) //ranks
            {
                ArraylistofCard.add(new Card(j, i));
            }
        }
    }

    public Card top() {
        return ArraylistofCard.get(ArraylistofCard.size() - 1);
    }

    public void shuffle() {
        Random rand = new Random();
       
        for (int y = 1; y < 5; y++) 
        {
            for (int x = 0; x < 53; x++) 
            {
                Card current = ArraylistofCard.get(x);                       // current is the value of the card at index x (current card)
                int randomIndex = rand.nextInt(53);                          // random int created saved (INDEX)
                System.out.println(randomIndex);
                Card randomValue = ArraylistofCard.get(randomIndex);         // randomValue is the value of the card at randomIndex
                ArraylistofCard.add(x, randomValue);                         // adds the value of the card at a randomValue to index x
                ArraylistofCard.add(randomIndex, current);                   // adds the value of the card at current to randomIndex
            }
        }
        System.out.println("Shuffled is" + ArraylistofCard);                 // problem is in the arraylistofcard.add(). It is ma
    }

    public String toString() {
        return ArraylistofCard.toString();
    }
}
