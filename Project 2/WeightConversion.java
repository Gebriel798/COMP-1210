import java.util.Scanner;
/**
* This program converts large amounts of ounces to tons + pounds + ounces.
* 1210 Lab 7.
*
* @author Grant Haislip - Lab 7
* @version 8/30/16
*/
public class WeightConversion
{
/**
* Converts ounces to tons + pounds + ounces.
*
* @param args Command line (not used).
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int totalOunces = 0;
      int ounces = 0;
      int pounds = 0;
      int tons = 0;
      int remainderOunces = 0;
      //Prompt the user for their ounces:
      System.out.print("Enter weight in ounces: ");
      totalOunces = userInput.nextInt();
      //Display Conversion
      if (totalOunces > 500000000) {
         System.out.println("Limit of 500,000,000 ounces exceeded!");
      }
      else {
         System.out.println("Combined Number of Tons, Pounds, and Ounces:");
         tons = totalOunces / 32000;
         System.out.println("\tTons: " + tons);
         remainderOunces = totalOunces % 32000;
         pounds = remainderOunces / 16;
         System.out.println("\tPounds: " + pounds);
         ounces = remainderOunces % 16;
         System.out.println("\tOunces: " + ounces);
         System.out.print(totalOunces + " ounces = ");
         System.out.print(tons + " tons + ");
         System.out.print(pounds + " pounds + ");
         System.out.println(ounces + " ounces");
      }
   }
}