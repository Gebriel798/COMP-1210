import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
* This program tests PetBoardingList2.
* COMP 1210 - Project 10.
* @author Grant Haislip - Lab 7
* @version 11/17/2016
*/
public class PetBoardingPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** This tests the main method.
   * @throws IOException for reading files
   */
   @Test public void mainTest() throws IOException
   {
      String[] args = new String[1];
      args[0] = "pet_boarding_data.csv";
      PetBoardingPart2.main(args);
      String[] args2 = new String[0];
      PetBoardingPart2.main(args2);
      PetBoardingList pList = new PetBoardingList();
      Pet[] petList = new Pet[5];
      pList.setPetList(petList);
      
      pList.readPetFile("pet_boarding_data.csv");
   
      Assert.assertTrue("main test",
         pList.generateReport().contains("Boarding Report"));
      
     //args[0] = "pet_boarding-data.csv";
   }

   /** A test that always fails. **/
   /*@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }*/
}
