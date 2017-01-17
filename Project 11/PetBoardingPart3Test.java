import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
* This program tests the PetBoardingPart3 program.
* COMP 1210 - Project 11.
* @author Grant Haislip - Lab 7
* @version 11/30/2016
*/
public class PetBoardingPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** This tests the main method.
   * @throws IOException for reading files
   * @throws InvalidCategoryException for invalid categories
   */
   @Test public void mainTest() throws IOException, InvalidCategoryException
   {
      String[] args = new String[1];
      args[0] = "pet_boarding_data2.csv";
      PetBoardingPart3.main(args);
      String[] args2 = new String[0];
      PetBoardingPart3.main(args2);
      PetBoardingList pList = new PetBoardingList();
      Pet[] petList = new Pet[7];
      pList.setPetList(petList);
      
      pList.readPetFile("pet_boarding_data2.csv");
   
      Assert.assertTrue("main test",
         pList.generateReport().contains("Boarding Report"));
      
   }

   /** A test that always fails. **/
   /*@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }*/
}
