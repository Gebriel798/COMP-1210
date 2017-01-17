import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* This program tests the methods of the horse class.
* COMP 1210 - Lab 7.
* @author - Grant Haislip
* @version - 11/9/2016
*/
public class HorseTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** This method tests the getters and setters methods. */
   @Test public void gettersAndSettersTest()
   {
      Horse h = new Horse("Grant", "Bojack", "Horseman", 200, 5, 50);
      
      h.setOwner("Charlie");
      h.setName("Secretariat");
      h.setBreed("Mutt");
      h.setWeight(20);
      h.setDays(10);
   
      Assert.assertEquals("getAndSetOwner test", "Charlie", h.getOwner());
      Assert.assertEquals("getAndSetName test", "Secretariat", h.getName());
      Assert.assertEquals("getAndSetBreed test", "Mutt", h.getBreed());
      Assert.assertEquals("getAndSetWeight test", 20, h.getWeight(), .001);
      Assert.assertEquals("getAndSetDays test", 10, h.getDays());
      
      h.setExerciseFee(100);
      Assert.assertEquals("gettersAndSetters test", 100,
         h.getExerciseFee(), .001);
   }
   
   /** This method tests the boarding cost method. */
   @Test public void boardingCostTest()
   {
      Horse h = new Horse("Grant", "Bojack", "Horseman", 200, 5, 50);
   
      Assert.assertEquals("boardingCost test", 335, h.boardingCost(), .001);
   }
   /** This method tests the toString method. */
   @Test public void toStringTest()
   {
      Horse h = new Horse("Grant", "Bojack", "Horseman", 200, 5, 50);
   
      Assert.assertTrue("toString test",
         h.toString().contains("Exercise Fee: $50.00"));
   }

/** This method tests the get and reset count methods. */
   @Test public void countTest()
   {
      Pet.resetCount();
      Horse h = new Horse("Grant", "Bojack", "Horseman", 200, 5, 50);
   
      Assert.assertEquals("count test", 1, Pet.getCount());
   }

   /** A test that always fails. **/
   /*@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }*/
}
