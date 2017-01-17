import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* This program tests the PetNameComparator.
* COMP 1210 - Project 10.
* @author Grant Haislip - Lab 7.
* @version 11/17/2016
*/
public class PetNameComparatorTest extends PetNameComparator
{


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** This tests the compare method. */
   @Test public void compareTest() 
   {
      PetBoardingList pList = new PetBoardingList();
      Cat catTest = new Cat("Grant Haislip", "Alex Hailsip", "Mutt", 15, 7, 9);
      Dog dogTest = new Dog("Bob Jones", "Joe Jones", "Mutt", 23, 7);
      Pet[] petList = new Pet[2];
      
      petList[0] = catTest;
      petList[1] = dogTest;   
      pList.setPetList(petList);
      
   
      Assert.assertTrue("PetNameComparator Test", 
         pList.generateReportByPetName().contains("by Pet Name"));
   }

   /** A test that always fails. **/
   /*@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }*/
}
