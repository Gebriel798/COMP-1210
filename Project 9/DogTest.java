import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* This program tests the dog class.
* COMP 1210 - Lab 7.
* @author Grant Haislip
* @version - 11/9/2016
*/
public class DogTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/** This method tests the gets and sets methods. */
   @Test public void gettersAndSettersTest()
   {
      Dog d = new Dog("Grant", "Mr. PeanutButter", "Retriever", 40, 5);
   
      d.setOwner("Charlie");
      d.setName("Snoopy");
      d.setBreed("Mutt");
      d.setWeight(20);
      d.setDays(10);
   
      Assert.assertEquals("getAndSetOwner test", "Charlie", d.getOwner());
      Assert.assertEquals("getAndSetName test", "Snoopy", d.getName());
      Assert.assertEquals("getAndSetBreed test", "Mutt", d.getBreed());
      Assert.assertEquals("getAndSetWeight test", 20, d.getWeight(), .001);
      Assert.assertEquals("getAndSetDays test", 10, d.getDays());
   }
/** This method tests the boardingCost method. */
   @Test public void boardingCostTest()
   {
      Dog d = new Dog("Grant", "Mr. PeanutButter", "Retriever", 40, 5);
   
      Assert.assertEquals("boardingCost test", 70, d.boardingCost(), .001);
   }
   
   /** This method tests the toString method. */
   @Test public void toStringTest()
   {
      Dog d = new Dog("Grant", "Mr. PeanutButter", "Retriever", 40, 5);
   
      Assert.assertTrue("toString test", d.toString().contains("Owner: Grant"));
   }
   
   /** This method tests the get and reset count methods. */
   @Test public void countTest()
   {
      Pet.resetCount();
      Dog d = new Dog("Grant", "Mr. PeanutButter", "Retriever", 40, 5);
   
      Assert.assertEquals("count test", 1, Pet.getCount());
   }

   /** A test that always fails. **/
   /*@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }*/
}
