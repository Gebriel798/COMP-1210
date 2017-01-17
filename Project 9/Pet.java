import java.text.DecimalFormat;

/**
* This program is an abstract class for pets.
* COMP 1210 - Lab 7.
* @author Grant Haislip
* @version 11/9/2016
*/
public abstract class Pet
{
   protected String petOwner;
   protected String petName;
   protected String petBreed;
   protected double petWeight;
   protected int daysBoarded;
   protected static int petCount;
   
   /**
   * This method is a constructor for Pets.
   * @param petOwnerIn is the pet owner.
   * @param petNameIn is the pet name.
   * @param petBreedIn is the pet breed.
   * @param petWeightIn is the pet weight.
   * @param daysBoardedIn is the number of days the pet is boarded.
   */
   public Pet(String petOwnerIn, String petNameIn, String petBreedIn,
      double petWeightIn, int daysBoardedIn)
   {
      petOwner = petOwnerIn;
      petName = petNameIn;
      petBreed = petBreedIn;
      petWeight = petWeightIn;
      daysBoarded = daysBoardedIn;
   
      petCount = 0;
      petCount++;
   }
   
   /**
   * This method gets the Owner name.
   * @return the pet owner name.
   */
   public String getOwner()
   {
      return petOwner;
   }
   
   /**
   * This method sets the pet owner name.
   * @param petOwnerIn is the pet owner name.
   */
   public void setOwner(String petOwnerIn)
   {
      petOwner = petOwnerIn;
   }
   
   /**
   * This method gets the name of the pet.
   * @return the pet name.
   */
   public String getName()
   {
      return petName;
   }
   
   /**
   * This method sets the name of the pet.
   * @param petNameIn is the name of the pet.
   */
   public void setName(String petNameIn)
   {
      petName = petNameIn;
   }

/**
* This method gets the breed of the pet.
* @return the pet breed.
*/
   public String getBreed()
   {
      return petBreed;
   }

/**
* This method sets the breed of the pet.
* @param petBreedIn is the breed of the pet.
*/
   public void setBreed(String petBreedIn)
   {
      petBreed = petBreedIn;
   }

/**
* This method gets the weight of the pet.
* @return the weight of the pet.
*/
   public double getWeight()
   {
      return petWeight;
   }

/**
* This method sets the weight of the pet.
* @param petWeightIn is the pet weight.
*/
   public void setWeight(double petWeightIn)
   {
      petWeight = petWeightIn;
   }

/**
* This method gets the number of days the pet is boarded.
* @return the number of days the pet is boarded.
*/
   public int getDays()
   {
      return daysBoarded;
   }

/**
* This method sets the number of days the pet is boarded.
* @param daysBoardedIn is the number of days the pet is boarded.
*/
   public void setDays(int daysBoardedIn)
   {
      daysBoarded = daysBoardedIn;
   }

/**
* This method gets the number of pets created.
* @return the number of pets created.
*/
   public static int getCount()
   {
      return petCount;
   }

/**
* This method resets the number of pets created.
*/
   public static void resetCount()
   {
      petCount = 0;
   }
   
   /**
   * This abstract method sets up the boarding cost for each pet.
   * @return the boarding cost.
   */
   public abstract double boardingCost();
   
   /**
   * This method is gives the summary of a pet.
   * @return the summary.
   */
   public String toString()
   {
      DecimalFormat format = new DecimalFormat("$#,##0.00");
   
      return "Owner: " + petOwner + "   Pet: " + petName + "   Days: "
         + daysBoarded + "   Boarding Cost: " + format.format(boardingCost())
         + "   " +  this.getClass().toString().substring(6) + ": " + petBreed
         + "   Weight: " + petWeight + " lbs";
   }
   
   public int compareTo(Pet petIn)
   {
      return petName.toLowerCase().compareTo(petIn.getName().toLowerCase());
   }
}