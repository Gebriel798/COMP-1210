import java.text.DecimalFormat;
/**
* This program is a class for service dogs that extends the dog class.
* COMP 1210 - Lab 7.
* @author - Grant Haislip
* @version - 11/9/2016
*/ 
public class ServiceDog extends Dog
{
   private String service;
   private String[] commands;
   
   /** This is the base rate charged for service dogs. */
   public static final double BASE_RATE = 13;

/**
* This method is the constructor for service dogs.
* @param petOwnerIn is the pet owner name.
* @param petNameIn is the pet name.
* @param petBreedIn is the pet breed.
* @param petWeightIn is the per weight.
* @param daysBoardedIn is the number of days the pet is boarded.
* @param serviceIn is the service the dog provides.
* @param commandsIn is the commands the dog follows.
*/
   public ServiceDog(String petOwnerIn, String petNameIn, String petBreedIn,
      double petWeightIn, int daysBoardedIn,
      String serviceIn, String ... commandsIn)
   {
      super(petOwnerIn, petNameIn, petBreedIn, petWeightIn, daysBoardedIn);
      service = serviceIn;
      commands = commandsIn; 
   }

/**
* This method gets the service the dog provides.
* @return the service the dog provides.
*/
   public String getService()
   {
      return service;
   }

/**
* This method sets the service the dog provides.
* @param serviceIn is the service the dog provides.
*/
   public void setService(String serviceIn)
   {
      service = serviceIn;
   }

/**
* This method gets the commands the dog follows.
* @return the commands the dog follows.
*/
   public String[] getCommands()
   {
      return commands;
   }

/**
* This program sets the commands the dog follows.
* @param commandsIn is the commands the dog follows.
*/
   public void setCommands(String ... commandsIn)
   {
      commands = commandsIn;
   }
   
   /**
   * this method calculates the boarding cost of the service dog.
   * @return the boarding cost.
   */
   public double boardingCost()
   {
      double cost = (BASE_RATE + petWeight * 0.05 + commands.length)
         * daysBoarded;
      return cost;
   }
   
   /**
   * This method gives a summary of the service dog.
   * @return the summary of the service dog.
   */
   public String toString()
   {
      DecimalFormat format = new DecimalFormat("$#,##0.00");
      String result;
      if (commands.length == 0)
      {
         result = "Owner: " + petOwner + "   Pet: " + petName + "   Days: "
            + daysBoarded + "   Boarding Cost: " + format.format(boardingCost())
            + "\n" +  this.getClass().toString().substring(6) + ": " + petBreed
            + "   Weight: " + petWeight + " lbs" + "Service: " + service + "\n";
      }
      
      else
      {
         String commandString = "";
         for (int i = 0; i < commands.length; i++)
         {
            commandString += commands[i] + " ";
         }
         if (commands.length > 0)
         {
            result = "Owner: " + petOwner + "   Pet: " + petName + "   Days: "
               + daysBoarded + "   Boarding Cost: " + format.format(boardingCost())
               + "\n" +  this.getClass().toString().substring(6) + ": " + petBreed
               + "   Weight: " + petWeight + " lbs" + "   Service: " + service + "\n"
               + "Commands: " + commandString + "\n";
         }
         else
         {
            result = "Owner: " + petOwner + "   Pet: " + petName + "   Days: "
               + daysBoarded + "   Boarding Cost: " + format.format(boardingCost())
               + "\n" +  this.getClass().toString().substring(6) + ": " + petBreed
               + "   Weight: " + petWeight + " lbs" + "   Service: " + service;
         }
      }
   
      return result;
   }
}