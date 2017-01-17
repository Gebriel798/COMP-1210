import java.util.Scanner;
/**
* This program calculates the value of an expression using three variables.
* 1210 - Lab 7.
*
* @author Grant Haislip - Lab 7
* @version 8/30/16
*/
public class FormulaCalculator
{
/**
* Calculates the value of an expression using three variables.
*
* @param args Command line (not used).
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double x = 0;
      double y = 0;
      double z = 0;
   //Display the expression with variables undefined
      System.out.println("result = (3x + 10.5) "
         + "(5y - 6.2) (7z + 1.5) / xyz");
   //Prompt user to enter in x value
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
   //Prompt user to enter in y value
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
   //Prompt user to enter in z value
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
   //Calculate and show result
      if (x * y * z == 0) {
         System.out.println("result = 0.0");
      }
      else {
         System.out.println("result = "
            + (3 * x + 10.5) * (5 * y - 6.2)
            * (7 * z + 1.5) / (x * y * z));
      }
   }
}