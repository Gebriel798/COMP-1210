import java.util.Comparator;

/**
* This program sets the compare method for pets based on their boarding cost.
* COMP 1210 - Project 10.
* @author Grant Haislip - Lab 7
* @version 11/17/2018
*/
public class BoardingCostComparator implements Comparator<Pet>
{

/**
* This method sets the compare method for pets based on their boarding cost.
* @param p1 is the first pet entered.
* @param p2 is the second pet entered.
* @return the value of the compare result.
*/
   public int compare(Pet p1, Pet p2)
   {
      if (p1.boardingCost() > p2.boardingCost()) {
         return -1;
      }
      else if (p1.boardingCost() < p2.boardingCost()) {
         return 1;
      }
      return 0;
   }
      
}