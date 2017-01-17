import java.util.Scanner;
import java.io.IOException;
/**
* This program gives the user 8 options to evaluate a cone list file.
* COMP 1210 - Project 8.
* 
* @author Grant Haislip - Lab 7
* @version 10/18/2016
*/
public class ConeList2MenuApp  {

/**
* This method gives the user 8 option to evaluate a cone list file.
*
* @param args Command Line (not used).
* @throws IOException for scanning file.
*/
   public static void main(String[] args) throws IOException
   {
      char choice = 'Q';
      String labelIn = "";
      double heightIn = 0;
      double radiusIn = 0;
      String fileName = "";
   // ----------------------
      String coneListName = "*** no list name assigned ***";
      Cone[] noCone = new Cone[100];
      ConeList2 noConeList = new ConeList2(coneListName, noCone, 0);
      //Cone holder = new Cone("placeholder", 2, 4);
      //noCone[0] = holder;
      Scanner scan = new Scanner(System.in);
      
      
   // ----------------------
      System.out.println("Cone List System Menu"
         + "\nR - Read File and Create Cone List"
         + "\nP - Print Cone List"
         + "\nS - Print Summary"
         + "\nA - Add Cone"
         + "\nD - Delete Cone"
         + "\nF - Find Cone"
         + "\nE - Edit Cone"
         + "\nQ - Quit");
      
         
      do
      {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         choice = scan.nextLine().toUpperCase().charAt(0);
         
         
         
         switch (choice)
         {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
               noConeList = noConeList.readFile(fileName);
               
               System.out.println("\tFile read in and Cone List created");
               System.out.println("");
            
               break;
               
            case 'P':
               System.out.println(noConeList.toString());
               break;
               
            case 'S':
               System.out.println(noConeList.summaryInfo());
               break;
               
            case 'A':
               Cone coneAdd = new Cone(labelIn, heightIn, radiusIn);
            
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
               coneAdd.setLabel(labelIn);
            
               System.out.print("\tHeight: ");
               heightIn = Double.parseDouble(scan.nextLine());
               coneAdd.setHeight(heightIn);
            
               System.out.print("\tRadius: ");
               radiusIn = Double.parseDouble(scan.nextLine());
               coneAdd.setRadius(radiusIn);
              
               System.out.println("\t*** Cone added ***");
               System.out.println("");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
            
               if (noConeList.deleteCone(labelIn) == null) {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
                 
               }
               else {
                  System.out.println("\t\"" + labelIn + "\" deleted\n");
               }
               break;
               
            case 'F':
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
            
               if (noConeList.findCone(labelIn) == null)
               {
                  System.out.println("\t\"" + labelIn + "\" not found");
                  System.out.println("");
                  
               }
               else
               {
                  System.out.println(noConeList.findCone(labelIn).toString());
                  System.out.println("");
               }
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               labelIn = scan.nextLine();
               
               System.out.print("\tHeight: ");
               heightIn = Double.parseDouble(scan.nextLine());
               
               System.out.print("\tRadius: ");
               radiusIn = Double.parseDouble(scan.nextLine());
               
               if (noConeList.findCone(labelIn) == null)
               {
                  System.out.println("\t\"" + labelIn + "\" not found");
                  System.out.println("");
               }
               else
               {
                  noConeList.editCone(labelIn, heightIn, radiusIn);
                  
                  System.out.println("\t\""
                     + labelIn + "\" successfully edited");
                  System.out.println("");
               }
               break;
               
            case 'Q':
               
               break;
               
            default:
               System.out.println("\t*** invalid code ***");
               System.out.println("");
         }
      
      }
      while (choice != 'Q');
      
      
   }
}