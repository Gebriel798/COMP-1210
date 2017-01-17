import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
* This program evaluates a cone.
* COMP 1210 - Project 8.
* 
* @author Grant Haislip - Lab 7
* @version 10/18/2016
*/
public class ConeList2
{
// fields

   private String listName;
   private Cone[] tList = new Cone[100];
   private int elements;
   //private String listTitle = "";
// constructor

/**
* This constructor creates a cone list.
* @param listNameIn is the list name entered by the user.
* @param tListIn is the array list of cone objects given by the user.
* @param elementsIn is the number of cones in the array entered by the user.
*/
   public ConeList2(String listNameIn, Cone[] tListIn, int elementsIn)
   {
      listName = listNameIn;
      tList = tListIn;
      elements = elementsIn;
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
      return elements;
   }
   
/**
* This method gets the total of the base perimeters.
* @return returns the total.
*/   
   public double totalBasePerimeter()
   {
      double total = 0;
   
      int index = 0;
      while (index < elements) {
         total += tList[index].basePerimeter();
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
      while (index < elements) {
         total += tList[index].baseArea();
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
      while (index < elements) {
         total += tList[index].slantHeight();
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
      while (index < elements) {
         total += tList[index].sideArea();
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
      while (index < elements) {
         total += tList[index].surfaceArea();
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
      while (index < elements) {
         total += tList[index].volume();
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
      while (index < elements) {
         total += tList[index].surfaceArea();
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
      while (index < elements) {
         total += tList[index].volume();
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
      while (index < elements) {
         result += "\n" + tList[index] + "\n"; 
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
   * returns the array of cone objects.
   * @return array list of cones.
   */
   public Cone[] getList()
   {
      return tList;
   }
   
   /**
   * reads the file containing cones.
   * @throws IOException for scanning file of cones.
   * @param fileName is the file name read.
   * @return the new cone list.
   */
   public ConeList2 readFile(String fileName) throws IOException
   {
      Scanner scan = new Scanner(System.in);
      //int numCones;
      //String fileName = "";
   
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
         tList[elements] = newCone;
         elements++;           
      }
      ConeList2 newConeList = new ConeList2(listName, tList, elements);
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
   
      tList[elements] = coneAdd;
      elements++;
   }
   
   /**
   * finds a cone in the array list.
   * @param labelIn is the label entered by the user.
   * @return cone found in the list.
   */
   public Cone findCone(String labelIn)
   {
      Cone result = null;
      for (int i = 0; i < elements; i++) {
         if (tList[i].getLabel().equalsIgnoreCase(labelIn))
         {
            result = tList[i];
            
            break;
         }
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
      int elementsIn = 0;
      for (int i = 0; i < elements; i++)
      {
         if (tList[i].getLabel().equalsIgnoreCase(labelIn))
         {
            result = tList[i];
            for (int j = i; j <= elements - 1; j++)
            {
               tList[j] = tList[j + 1];
            }
            tList[elements - 1] = null;
            elements--;
            break;
         }
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
      //int elementsIn = 0;
      //int index = -1;
      
      
      for (int i = 0; i < elements; i++) {
         if (tList[i].getLabel().equalsIgnoreCase(labelIn))
         {
            tList[i].setHeight(height);
            tList[i].setRadius(radius);
            result = tList[i];
            
            return true;
         }
      }
      return false;
   }
}