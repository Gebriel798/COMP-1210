import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* This program tests the methods in the service dog class.
* COMP 1210 - Lab 7.
* @author - Grant Haislip
* @version - 11/9/2016
*/
public class ServiceDogTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** This method tests the getters and setters methods. */
   @Test public void gettersAndSettersTest()
   {
      ServiceDog s = new ServiceDog("Grant", "Butch", "Bulldog", 60, 5,
         "Attack Dog", "Kill", "Injure", "Ignore");
         
      s.setOwner("Charlie");
      s.setName("Snoopy");
      s.setBreed("Mutt");
      s.setWeight(20);
      s.setDays(10);
   
      Assert.assertEquals("getAndSetOwner test", "Charlie", s.getOwner());
      Assert.assertEquals("getAndSetName test", "Snoopy", s.getName());
      Assert.assertEquals("getAndSetBreed test", "Mutt", s.getBreed());
      Assert.assertEquals("getAndSetWeight test", 20, s.getWeight(), .001);
      Assert.assertEquals("getAndSetDays test", 10, s.getDays());
   
      s.setService("Blind Assistant");
      s.setCommands("Don't Kill", "Don't Injure", "Lead Owner");
   
      Assert.assertEquals("getAndSetService test",
         "Blind Assistant", s.getService());
      Assert.assertEquals("getAndSetCommands test", 3, s.getCommands().length);
   }
   
   /** This method tests the boarding cost method. */
   @Test public void boardingCostTest()
   {
      ServiceDog s = new ServiceDog("Grant", "Butch", "Bulldog", 60, 5,
         "Attack Dog", "Kill", "Injure", "Ignore");
   
      Assert.assertEquals("boardingCost test", 95, s.boardingCost(), .001);
   }
   
   /** This method tests the toString method. */
   @Test public void toStringTest()
   {
      ServiceDog s = new ServiceDog("Grant", "Butch", "Bulldog", 60, 5,
         "Attack Dog", "Kill", "Injure", "Ignore");
      ServiceDog t = new ServiceDog("Grant", "Butch", "Bulldog", 60, 5,
         "Attack Dog");
   
      Assert.assertTrue("toString test for >0 commands",
         s.toString().contains("Commands: Kill"));
      Assert.assertTrue("toString test for 0 commands",
         t.toString().contains("Days: 5"));
   
   }

/** This method tests the get and reset count methods. */
   @Test public void countTest()
   {
      Pet.resetCount();
      ServiceDog s = new ServiceDog("Grant", "Butch", "Bulldog", 60, 5,
         "Attack Dog", "Kill", "Injure", "Ignore"); 
   
      Assert.assertEquals("count test", 1, Pet.getCount());
   }
   /** A test that always fails. **/
   /*@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }*/
}
