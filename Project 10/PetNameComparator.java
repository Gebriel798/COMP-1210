import java.util.Comparator;

/**
* This program sets the compare method for pets based on their name.
* COMP 1210 - Project 10.
* @author Grant Haislip - Lab 7
* @version 11/17/2016
*/
public class PetNameComparator implements Comparator<Pet>
{

/**
* This method sets the compare method for pets based on their name.
* @param p1 is the first pet entered.
* @param p2 is the second pet entered.
* @return the value of the compare result.
*/
   public int compare(Pet p1, Pet p2)
   {
      if (p1.getName().charAt(0) > p2.getName().charAt(0)) {
         return 1;
      }
      else if (p1.getName().charAt(0) < p2.getName().charAt(0)) {
         return -1;
      }
      return 0;
   }

}