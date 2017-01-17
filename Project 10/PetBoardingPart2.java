import java.io.IOException;

/**
* This program is the main method for PetBoardingList.
* COMP 1210 - Project 10.
* @author Grant Haislip - Lab 7
* @version 11/17/2016
*/
public class PetBoardingPart2
{

/**
* This method is the main method for PetBoardingList.
* @param args Command Line pet_boarding_data.csv.
* @throws IOException for reading a file.
*/
   public static void main(String[] args) throws IOException
   {
      if (args.length > 0) {
         String fileName = args[0];
         PetBoardingList pList = new PetBoardingList();
         pList.readPetFile(fileName);
         
         System.out.println(pList.generateReport());
         System.out.println(pList.generateReportByOwner());
         System.out.println(pList.generateReportByPetName());
         System.out.println(pList.generateReportByBoardingCost());
         System.out.println(pList.generateExcludedRecordsReport());
      }
      else
      {
         System.out.println("File name excpected as "
            + "command line argument.\nProgram ending");
      }
        
   }
}