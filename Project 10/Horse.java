import java.text.DecimalFormat;
/**
* This program is a class for horses that extends class Pet.
* COMP 1210 - Lab 7.
* @author - Grant Haislip
* @version - 11/9/2016
*/
public class Horse extends Pet
{
   private double exerciseFee;
   
   /** This is the base rate charged for horses. */
   public static final double BASE_RATE = 15;

/**
* This method is the constructor for the horse class.
* @param petOwnerIn is the pet owner name.
* @param petNameIn is the pet name.
* @param petBreedIn is the pet breed.
* @param petWeightIn is the pet weight.
* @param daysBoardedIn is the number of days the pet is boarded.
* @param exerciseFeeIn is the exercise fee for the horse.
*/
   public Horse(String petOwnerIn, String petNameIn, String petBreedIn,
      double petWeightIn, int daysBoardedIn, double exerciseFeeIn)
   {
      super(petOwnerIn, petNameIn, petBreedIn, petWeightIn, daysBoardedIn);
      exerciseFee = exerciseFeeIn;
   }

/**
* This method gets the exercise fee of the horse.
* @return the exercise fee.
*/
   public double getExerciseFee()
   {
      return exerciseFee;
   }

/** 
* This method sets the exercise fee of the horse.
* @param exerciseFeeIn is the exercise fee.
*/
   public void setExerciseFee(double exerciseFeeIn)
   {
      exerciseFee = exerciseFeeIn;
   }

/**
* This method calculates the boarding cost of the horse.
* @return the boarding cost.
*/
   public double boardingCost()
   {
      double cost = (BASE_RATE + petWeight * 0.01 + exerciseFee) * daysBoarded;
      return cost;
   }

/**
* This method gives a summary for the horse.
* @return the summary.
*/
   public String toString()
   {
      DecimalFormat format = new DecimalFormat("$#,##0.00");
   
      String result = super.toString()
         + "   Exercise Fee: " + format.format(exerciseFee) + "\n";
      return result;
   }

}