import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* This program tests the methods in the cat class.
* COMP 1210 - Lab 7.
* @author - Grant Haislip
* @version - 11/9/2016
*/
public class CatTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** This method tests the getters and setters methods. */
   @Test public void gettersAndSettersTest()
   {
      Cat c = new Cat("Grant", "Princess Carolyn", "Pink", 15, 5, 9);
      
      c.setOwner("Charlie");
      c.setName("Stewart");
      c.setBreed("Mutt");
      c.setWeight(20);
      c.setDays(10);
   
      Assert.assertEquals("getAndSetOwner test", "Charlie", c.getOwner());
      Assert.assertEquals("getAndSetName test", "Stewart", c.getName());
      Assert.assertEquals("getAndSetBreed test", "Mutt", c.getBreed());
      Assert.assertEquals("getAndSetWeight test", 20, c.getWeight(), .001);
      Assert.assertEquals("getAndSetDays test", 10, c.getDays());
   
      c.setLivesLeft(8);
      Assert.assertEquals("gettersAndSetters test", 8, c.getLivesLeft(), .001);
   }
   
   /** This method tests the boarding cost method. */
   @Test public void boardingCostTest()
   {
      Cat c = new Cat("Grant", "Princess Carolyn", "Pink", 15, 5, 9);
   
      Assert.assertEquals("boardingCost test", 57.5, c.boardingCost(), .001);
   }
   
   /** This method tests the toString method. */
   @Test public void toStringTest()
   {
      Cat c = new Cat("Grant", "Princess Carolyn", "Pink", 15, 5, 9);
   
      Assert.assertTrue("toString test",
         c.toString().contains("Lives Left: 9"));
   }

/** This method tests the get and reset count methods. */
   @Test public void countTest()
   {
      Pet.resetCount();
      Cat c = new Cat("Grant", "Princess Carolyn", "Pink", 15, 5, 9);
   
      Assert.assertEquals("count test", 1, Pet.getCount());
   }

   /** A test that always fails. **/
   /*@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }*/
}
