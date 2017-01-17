import java.util.Scanner;
import java.text.DecimalFormat;
/**
* This program calculate and evaluates an expression.
* COMP 1210 - Project 3.
* 
* @author Grant Haislip - Lab 7
* @version 9/11/2016
*/
public class ExpressionEvaluator
{
/**
* This method calculates and evaluates and expression.
*
* @param args Command line (not used).
*/
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      // variables
      double x = 0;
      double insideTerm2 = 0;
      double term2 = 0;
      double insideTerm1 = 0;
      double term1 = 0;
      double result = 0;
      int decimal = 0;
      int length = 0;
      String stringResult = "";
      // prompt user for x
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      // calculate terms of the expression
      insideTerm2 = 3 * Math.pow(x, 5);
      term2 = Math.sqrt(Math.abs(insideTerm2));
      insideTerm1 = 5 * Math.pow(x, 7) - 4 * Math.pow(x, 6);
      term1 = Math.pow(insideTerm1, 2);
      // calculate and print result
      result = Math.sqrt(term1 + term2);
      System.out.println("Result: " + result);
      stringResult = Double.toString(result);
      // calculate number in front of decimal
      decimal = stringResult.indexOf(".");
      System.out.println("# digits to left of decimal point: " + decimal);
      // calculate number behind decimal
      length = stringResult.length();
      System.out.println("# digits to right of decimal point: "
         + (length - (decimal + 1)));
      // round result to four decimal places
      DecimalFormat dFmt = new DecimalFormat("#,##0.0###");
      System.out.print("Formatted Result: " 
         + dFmt.format(result));
      
   }
}

