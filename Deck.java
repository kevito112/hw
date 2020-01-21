import java.util.*;

public class Deck
{
    private int i;
    private int j;
    Card card = new Card(i,j);
    private ArrayList<String> ArraylistofCard = new ArrayList<>();
    public Deck()
    {
        for(i = 0; i < 4; i++)  //suits
        {
            for (j = 0; j < 14; j++)  //ranks
            {
                ArraylistofCard.add(new Card(j,i).toString());
            }            
        }
    }
    public String toString()
    {
        return ArraylistofCard.toString();
    }
}