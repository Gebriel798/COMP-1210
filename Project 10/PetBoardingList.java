import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
* This program is the class for pet boarding lists.
* COMP 1210 - Project 10.
* @author Grant Haislip - Lab 7.
* @version 11/17/2016
*/
public class PetBoardingList
{
   private String listName;
   private Pet[] petList;
   private int petCount;
   private String[] excludedRecords;
   private int excludedCount;
   private static int listCount = 0;
   
   /**
   * This method is the constructor for PetBoardingList.
   */
   public PetBoardingList()
   {
      listName = "";
      petList = new Pet[100];
      petCount = 0;
      excludedRecords = new String[30];
      excludedCount = 0;
      listCount++;
   }
   
   /**
   * This method returns the list name.
   * @return the list name.
   */
   public String getListName()
   {
      return listName;
   }
   
   /**
   * This method sets the list name.
   * @param nameIn is the name entered.
   */
   public void setListName(String nameIn)
   {
      listName = nameIn;
   }
   
   /**
   * This method gets the pet list.
   * @return the pet list.
   */
   public Pet[] getPetList()
   {
      return petList;
   }
   
   /**
   * This method sets the pet list.
   * @param listIn is the list entered.
   */
   public void setPetList(Pet[] listIn)
   {
      petList = listIn;
   }
   
   /**
   * This method gets the pet count.
   * @return the pet count.
   */
   public int getPetCount()
   {
      return petCount;
   }
   
   /**
   * This method sets the pet count.
   * @param countIn is the pet count entered.
   */
   public void setPetCount(int countIn)
   {
      petCount = countIn;
   }
   
   /**
   * This method gets the excluded records.
   * @return the excluded records.
   */
   public String[] getExcludedRecords()
   {
      return excludedRecords;
   }
   
   /**
   * This method sets the excluded records.
   * @param recordsIn is the records entered.
   */
   public void setExcludedRecords(String[] recordsIn)
   {
      excludedRecords = recordsIn;
   }
   
   /**
   * This method gets the excluded count.
   * @return the excluded count.
   */
   public int getExcludedCount()
   {
      return excludedCount;
   }
   
   /**
   * This method sets the excluded count.
   * @param countIn is the excluded count entered.
   */
   public void setExcludedCount(int countIn)
   {
      excludedCount = countIn;
   }
   
   /**
   * This method gets the list count.
   * @return the list count.
   */
   public static int getListCount()
   {
      return listCount;
   }
   
   /**
   * This method resets the list count.
   */
   public static void resetListCount()
   {
      listCount = 0;
   }
   
   /**
   * This method reads the pet file.
   * @param file is the file title in the project folder.
   * @throws IOException for reading the file.
   */
   public void readPetFile(String file) throws IOException
   {
      Scanner scanFile = new Scanner(new File(file));
      listName = scanFile.nextLine();
      String[] commandsFinal;
      while (scanFile.hasNext())
      {
         String line = scanFile.nextLine();
         Scanner scanPet = new Scanner(line);
         scanPet.useDelimiter(",");
         char choice = scanPet.next().charAt(0);
         String petOwnerIn = scanPet.next();
         String petNameIn = scanPet.next();
         String petBreedIn = scanPet.next();
         double petWeightIn = Double.parseDouble(scanPet.next());
         int daysBoardedIn = Integer.parseInt(scanPet.next());
         Pet p;
         switch (choice)
         {
            case 'C':
               int livesLeftIn = 
                  Integer.parseInt(scanPet.next());
               p = new Cat(petOwnerIn, petNameIn, petBreedIn,
                  petWeightIn, daysBoardedIn, livesLeftIn);
               petList[petCount] = p;
               petCount++;
               break;
         
            case 'D':
               p = new Dog(petOwnerIn, petNameIn,
                  petBreedIn, petWeightIn, daysBoardedIn);
               petList[petCount] = p;
               petCount++;
               break;
         
            case 'H':
               double exerciseFeeIn =
                  Double.parseDouble(scanPet.next());
               p = new Horse(petOwnerIn, petNameIn, petBreedIn,
                  petWeightIn, daysBoardedIn, exerciseFeeIn);
               petList[petCount] = p;
               petCount++;
               break;
         
            case 'S':
               String[] commandsIn = new String[100];
               int i = 0;
               
               String serviceIn = scanPet.next();
               
               while (scanPet.hasNext())
               {
                  String command = scanPet.next();
                  commandsIn[i] = command;
                  i++;
               }
               commandsFinal = Arrays.copyOf(commandsIn, i);
               p = new ServiceDog(petOwnerIn, petNameIn, petBreedIn,
                  petWeightIn, daysBoardedIn, serviceIn, commandsFinal);
               petList[petCount] = p;
               petCount++;
               break;
               
            default:
               String noPet = "*** invalid category ***" + " " + line;
               excludedRecords[excludedCount] = noPet;
               excludedCount++;
               break;
               
         }
         
      }
      scanFile.close();
   }
   
   /**
   * This method generates a report of the pets.
   * @return the report.
   */
   public String generateReport()
   {
      Pet[] sortedList = Arrays.copyOf(petList, petCount);
   
      String result = "";
      for (Pet x: sortedList)
      {
         result += x.toString() + "\n";
      }
      return "\n----------------------------------------\n"
         + "Pet Boarding Report for " + listName
         + "\n----------------------------------------\n\n" + result;
   }
   
   /**
   * This method generates a report of the pets sorted in order by owner.
   * @return the sorted report.
   */
   public String generateReportByOwner()
   {
      Pet[] fixedList = Arrays.copyOf(petList, petCount);
      Arrays.sort(fixedList);
      
      String result = "";
      for (Pet x: fixedList)
      {
         result += x.toString() + "\n";
      }
      return "\n----------------------------------------\n"
         + "Pet Boarding Report for " + listName + " (by Owner)"
         + "\n----------------------------------------\n\n" + result;
   }
   
   /**
   * This method generates a report of the pets sorted by the pet names.
   * @return the sorted report.
   */
   public String generateReportByPetName()
   {
      Pet[] fixedList = Arrays.copyOf(petList, petCount);
      Arrays.sort(fixedList, new PetNameComparator());
   
      String result = "";
      for (Pet x: fixedList)
      {
         result += x.toString() + "\n";
      }
      return "\n----------------------------------------\n"
         + "Pet Boarding Report for " + listName + " (by Pet Name)"
         + "\n----------------------------------------\n\n" + result;
   }
   
   /**
   * This method generates a report of the pets sorted by the boarding cost.
   * @return the report.
   */
   public String generateReportByBoardingCost()
   {
      Pet[] fixedList = Arrays.copyOf(petList, petCount);
      Arrays.sort(fixedList, new BoardingCostComparator());
   
      String result = "";
      for (Pet x: fixedList)
      {
         result += x.toString() + "\n";
      }
      return "\n----------------------------------------\n"
         + "Pet Boarding Report for " + listName + " (by Boarding Cost)"
         + "\n----------------------------------------\n\n" + result;
   }
   
   /**
   * This method generates a report of the excluded records.
   * @return the report.
   */
   public String generateExcludedRecordsReport()
   {
      String[] fixedList = Arrays.copyOf(excludedRecords, excludedCount);
      String result = "";
      for (String x: fixedList)
      {
         result += x.toString() + "\n";
      }
      return "\n----------------------------------------\n"
         + "Excluded Records Report"
         + "\n----------------------------------------\n\n" + result;
   }
   
}