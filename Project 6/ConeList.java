import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
* This program evaluates a cone.
* COMP 1210 - Project 4.
* 
* @author Grant Haislip - Lab 7
* @version 9/20/2016
*/
public class ConeList
{
// fields

   private String listName;
   private ArrayList<Cone> tList;
   //private String listTitle = "";
// constructor

/**
* This constructor creates a cone list.
* @param listNameIn is the list name entered by the user.
* @param tListIn is the array list of cone objects given by the user.
*/
   public ConeList(String listNameIn, ArrayList<Cone> tListIn)
   {
      listName = listNameIn;
      tList = tListIn;
   }
   
/**
* This method returns the list name.
* @return returns the list name.
*/
   public String getName()
   {
      return listName;
   }
/**
* This method returns the number of cones of the list.
* @return the list size.
*/
   public int numberOfCones()
   {
      return tList.size();
   }
   
/**
* This method gets the total of the base perimeters.
* @return returns the total.
*/   
   public double totalBasePerimeter()
   {
      double total = 0;
   
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).basePerimeter();
         index++;  
      }   
      return total;
   }

/**
* This method returns the total of the base ares.
* @return returns the total.
*/   
   public double totalBaseArea()
   {
      double total = 0;
   
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).baseArea();
         index++;  
      }   
      return total;
   }
   
/**
* This method returns the total of the slant heights.
* @return returns the total.
*/   
   public double totalSlantHeight()
   {
      double total = 0;
   
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).slantHeight();
         index++;
      }
      return total;
   }
   
/**
* This method returns the total of the side ares.
* @return returns the total.
*/
   public double totalSideArea()
   {
      double total = 0;
   
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).sideArea();
         index++;
      }
      return total;
   }
   
/**
* This method returns the total of the surface areas.
* @return returns the total.
*/
   public double totalSurfaceArea()
   {
      double total = 0;
   
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).surfaceArea();
         index++;
      }
      return total;
   }

/**
* This method returns the total of the volumes.
* @return returns the total.
*/
   public double totalVolume()
   {
      double total = 0;
   
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).volume();
         index++;
      }
      return total;
   }
   
/**
* This method returns the average of the surface areas.
* @return returns the average.
*/
   public double averageSurfaceArea()
   {
      double total = 0;
   
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).surfaceArea();
         index++;
      }
      if (index == 0)
      {
         total = 0;
      }
      else
      {
         total = total / index;
      }
      return total;
   }
   
/**
* This method returns the average of the volumes.
* @return returns the average.
*/
   public double averageVolume()
   {
      double total = 0;
   
      int index = 0;
      while (index < tList.size()) {
         total += tList.get(index).volume();
         index++;
      }
      if (index == 0)
      {
         total = 0;
      }
      else
      {
         total = total / index;
      }
      
      return total;
   }
   
/**
* This method prints the information of the cone list.
* @return returns the information.
*/
   public String toString()
   {
      String result = "\n" + listName + "\n";
      int index = 0;
      while (index < tList.size()) {
         result += "\n" + tList.get(index) + "\n"; 
         index++;  
      }  
      return result;
   }
   
/**
* This method prints informatin of the cone list.
* @return returns thhe information.
*/
   public String summaryInfo()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Cones: " + numberOfCones();
      result += "\nTotal Base Perimeter: " + df.format(totalBasePerimeter()); 
      result += "\nTotal Base Area: " + df.format(totalBaseArea());
      result += "\nTotal Slant Height: "  + df.format(totalSlantHeight());
      result += "\nTotal Side Area: " + df.format(totalSideArea());
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      result += "\nTotal Volume: " + df.format(totalVolume());
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());
      
      return result;
   }
   /**
   * returns the array list of cone objects.
   * @return array list of cones.
   */
   public ArrayList<Cone> getList()
   {
      return null;
   }
   
   /**
   * reads the file containing cones.
   * @throws IOException for scanning file of cones.
   * @param file is the file name read.
   * @return the new cone list.
   */
   public ConeList readFile(String file) throws IOException
   {
      Scanner scan = new Scanner(System.in);
   
      String fileName = "";
      System.out.print("\tFile Name: ");
      fileName = scan.nextLine();
      Scanner scanFile = new Scanner(new File(fileName));
      listName = scanFile.nextLine();
      if (new File(fileName) == null) {
         return null;
      }
      while (scanFile.hasNext()) {
                  
         String labelIn = scanFile.nextLine();
         double heightIn = Double.parseDouble(scanFile.nextLine());
         double radiusIn = Double.parseDouble(scanFile.nextLine());
               
         Cone newCone = new Cone(labelIn, heightIn, radiusIn);
         tList.add(newCone);           
      }
      String listTitle = "";
      ConeList newConeList = new ConeList(listTitle, tList);
      System.out.println("\tFile read in and Cone List created");
      System.out.println("");
      return newConeList;
   }
   
   /** 
   * adds a cone to the array list.
   * @param labelIn is the label entered by the user.
   * @param heightIn is the height entered by the user.
   * @param radiusIn is the radius entered by the user.
   */
   public void addCone(String labelIn, double heightIn, double radiusIn)
   {
      Scanner scan = new Scanner(System.in);
   
      Cone coneAdd = new Cone(labelIn, heightIn, radiusIn);
      System.out.print("\tLabel: ");
      labelIn = scan.nextLine();
      coneAdd.setLabel(labelIn);
            
      System.out.print("\tHeight: ");
      heightIn = scan.nextDouble();
      coneAdd.setHeight(heightIn);
            
      System.out.print("\tRadius: ");
      radiusIn = scan.nextDouble();
      coneAdd.setRadius(radiusIn);
      tList.add(coneAdd);
   }
   
   /**
   * finds a cone in the array list.
   * @param labelIn is the label entered by the user.
   * @return cone found in the list.
   */
   public Cone findCone(String labelIn)
   {
      Cone result = null;
      int index = -1;
      for (Cone t : tList) {
         if (t.getLabel().equalsIgnoreCase(labelIn))
         {
            index = tList.indexOf(t);
            break;
         }
      }
      
      if (index >= 0) {
         result = tList.get(index);
      }
      return result;
   }
   
   /**
   * deletes a cone in the list.
   * @param labelIn is the label entered by the user.
   * @return cone found in the list.
   */
   public Cone deleteCone(String labelIn)
   {
      Cone result = null;
      int index = -1;
      for (Cone t : tList) {
         if (t.getLabel().equalsIgnoreCase(labelIn))
         {
            index = tList.indexOf(t);
            break;
         }
      }
      
      if (index >= 0) {
         result = tList.get(index);
         tList.remove(index);
      }
      return result;
   }
   
   /**
   * edits a cone in the array list.
   * @param labelIn is the label entered by the user.
   * @param height is the height entered by the user.
   * @param radius is the radius entered by the user.
   * @return the cone selected from the list.
   */
   public boolean editCone(String labelIn, double height, double radius)
   {
      Cone result = null;
      int index = -1;
      for (Cone t : tList) {
         if (t.getLabel().equalsIgnoreCase(labelIn))
         {
            index = tList.indexOf(t);
            break;
         }
      }
      
      if (index >= 0) {
         result = tList.get(index);
         result.setHeight(height);
         result.setRadius(radius);
         return true;
      }
      return false;
   }
}