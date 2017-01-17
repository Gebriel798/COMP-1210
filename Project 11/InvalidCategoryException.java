   /**
   * This program is an exception for invalid categories.
   * COMP 1210 - Project 11.
   * @author Grant Haislip - Lab 7
   * @version 11/30/2016
   */
public class InvalidCategoryException extends Exception
{

/**
* This method is the constructor for the exception.
@param category is the category of the entry.
*/
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
   
}