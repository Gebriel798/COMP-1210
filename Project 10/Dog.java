/**
* This program is a class for dogs that extends class Pet.
* COMP 1210 -Lab 7.
* @author Grant Haislip
* @version 11/9/2016.
*/
public class Dog extends Pet
{
/** This is the rate charged for dogs. */
   public static final int BASE_RATE = 12;

/**
* This method is a constructor for the dog class.
* @param petOwnerIn is the pet owner name.
* @param petNameIn is the pet name.
* @param petBreedIn is the pet breed.
* @param petWeightIn is the pet weight.
* @param daysBoardedIn is the number of days the pet is boarded.
*/
   public Dog(String petOwnerIn, String petNameIn, String petBreedIn,
      double petWeightIn, int daysBoardedIn)
   {
      super(petOwnerIn, petNameIn, petBreedIn, petWeightIn, daysBoardedIn);
   }
   
   /**
   * This method calculates the boarding cost of dogs.
   * @return the boarding cost.
   */
   public double boardingCost()
   {
      double cost = (BASE_RATE + petWeight * 0.05) * daysBoarded;
      return cost;
   }
   
   /**
   * This method gives a summary of a dog.
   * @return the summary of a dog.
   */
   public String toString()
   {
      return super.toString() + "\n";
   }
}