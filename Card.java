
import java.util.*;

public class Card
{
    private int rank;
    private int suit;
    
   public Card(int ranks, int suits)
   {
       rank = ranks;
       suit = suits;
   }
   public int getRank()
   {
       return rank;
   }
   
   public int getSuit()
   {
       return suit;
   }
   public String toString()
   {
       switch(suit)
       {
           case 0:
               return rank + "\u2660";  //spade
           case 1:
               return rank + "\u2663";  // Club
           case 2:
               return rank + "\u2665";  //Heart
           case 3:
               return rank + "\u2666";  // Diamond
           default: return null;
       }
   }
}