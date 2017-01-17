/**
* This program is a class for cats that extends class Pet.
* COMP 1210 - Lab 7.
* @author - Grant Haislip
* @version - 11/9/2016
*/
public class Cat extends Pet
{
   private int livesLeft;
   
   /** This is the base rate for cats. */
   public static final double BASE_RATE = 10;

/**
* This method is the constructor for cats.
* @param petOwnerIn is the pet owner name.
* @param petNameIn is the pet name.
* @param petBreedIn is the pet breed.
* @param petWeightIn is the pet weight.
* @param daysBoardedIn is the number of days the pet is boarded.
* @param livesLeftIn is the number of lives the cat has left.
*/
   public Cat(String petOwnerIn, String petNameIn, String petBreedIn,
      double petWeightIn, int daysBoardedIn, int livesLeftIn)
   {
      super(petOwnerIn, petNameIn, petBreedIn, petWeightIn, daysBoardedIn);
      livesLeft = livesLeftIn;
   }
   
   /**
   * This method gets the number of lives left of the cat.
   * @return the number of lives left.
   */
   public int getLivesLeft()
   {
      return livesLeft;
   }
   
   /**
   * This method sets the number of lives left of the cat.
   * @param livesLeftIn is the lives left.
   */
   public void setLivesLeft(int livesLeftIn)
   {
      livesLeft = livesLeftIn;
   }
   
   /**
   * This method calculates the boarding cost of the cat.
   * @return the boarding cost.
   */
   public double boardingCost()
   {
      double cost = (BASE_RATE + petWeight * 0.10)
         * daysBoarded * (9.0 / livesLeft);
      return cost;
   }

/**
* This method gives a summary of the cat.
* @return the summary.
*/
   public String toString()
   {
      return super.toString() + "   Lives Left: " + livesLeft +"\n";
   }
}