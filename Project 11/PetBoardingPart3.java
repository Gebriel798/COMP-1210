import java.io.IOException;

/**
* This program is the main method for PetBoardingList.
* COMP 1210 - Project 11.
* @author Grant Haislip - Lab 7
* @version 11/30/2016
*/
public class PetBoardingPart3
{

/**
* This method is the main method for PetBoardingList.
* @param args Command Line pet_boarding_data2.csv.
* @throws InvalidCategoryException for reading an incorrect category.
*/
   public static void main(String[] args) throws InvalidCategoryException
   {
      try {
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
            System.out.println("File name expected as "
               + "command line argument.\nProgram ending.");
         }
      }
      catch (IOException error)
      {
         String fileName = args[0];
         System.out.println("Attempted to read file: " + fileName
            + " (No such file or directory)\nProgram ending.");
      }
        
   }
}