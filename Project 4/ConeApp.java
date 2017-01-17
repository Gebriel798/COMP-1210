import java.util.Scanner;
/**
* This program outputs information on a given cone.
* COMP 1210 - Project 4.
*
* @author Grant Haislip - Lab 7
* @version 9/20/2016
*/
public class ConeApp
{
/** This method outputs information on a given cone.
* 
* @param args Command line(not used).
*/
   public static void main(String[] args)
   {
      double height = 0;
      double radius = 0;
      String label = "";
      Scanner userInput = new Scanner(System.in);
      
   // program output
      System.out.println("Enter label, height, and radius for a cone.");
      // enter label
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      // enter height
      System.out.print("\theight: ");
      height = Double.parseDouble(userInput.nextLine());
      if (height <= 0)
      {
         System.out.println("Error: height must be greater than 0");
         return;
      }
      // enter radius
      System.out.print("\tradius: ");
      radius = Double.parseDouble(userInput.nextLine());
      if (radius <= 0)
      {
         System.out.println("Error: radius must be greater than 0");
         return;
      }
      // instance methods
      Cone newCone = new Cone(label, height, radius);
      
      System.out.println(newCone.toString());
      
   }
}