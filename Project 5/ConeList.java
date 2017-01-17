import java.util.ArrayList;
import java.text.DecimalFormat;
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
}