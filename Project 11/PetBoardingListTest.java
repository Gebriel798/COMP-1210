import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
* This prgram tests the methods of PetBoardingList.
* COMP 1210 - Project 10.
* @author Grant Haislip - Lab 7.
* @version 11/17/2016
*/
public class PetBoardingListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** This tets the getters and setters methods. */
   @Test public void gettersAndSettersTest() 
   {
      PetBoardingList pList = new PetBoardingList();
      Cat catTest = new Cat("Grant", "Stewart", "Mutt", 15, 7, 9);
      Dog dogTest = new Dog("Bob", "Joe", "Mutt", 23, 7); 
      Pet[] petList = new Pet[2];
      String[] excluded = new String[100];
      
      petList[0] = catTest;
      petList[1] = dogTest;
      
      pList.setListName("List");
      pList.setPetList(petList);
      pList.setPetCount(3);
      pList.setExcludedRecords(excluded);
      pList.setExcludedCount(2);
      
      Assert.assertEquals("list name test", "List", pList.getListName());
      Assert.assertArrayEquals("pet list test", petList, pList.getPetList());
      Assert.assertEquals("pet count test", 3, pList.getPetCount());
      Assert.assertArrayEquals("excluded records test",
         excluded, pList.getExcludedRecords());
      Assert.assertEquals("excluded count test", 2,
         pList.getExcludedCount());
   }
   
   /** This tests the list count methods. */
   @Test public void listCountTest()
   {
      PetBoardingList.resetListCount();
      PetBoardingList pList = new PetBoardingList();
   
      Assert.assertEquals("list count test", 1, PetBoardingList.getListCount());
   }
   
   /** This tests teh readPetFile method.
      * @throws IOException for reading a file.
      */
   @Test public void readPetFileTest() throws IOException
   {
      PetBoardingList pList = new PetBoardingList();
      pList.readPetFile("pet_boarding_data.csv");
   
      Assert.assertTrue("readPetFile test",
         pList.generateReport().contains("Barb Jones"));
   }

/** This tests the generateReport method. */
   @Test public void generateReportTest()
   {
      PetBoardingList pList = new PetBoardingList();
      Cat catTest = new Cat("Grant", "Stewart", "Mutt", 15, 7, 9);
      Dog dogTest = new Dog("Bob", "Joe", "Mutt", 23, 7); 
      Pet[] petList = new Pet[2];
      
      petList[0] = catTest;
      petList[1] = dogTest;
      
      pList.setPetList(petList);
      
      Assert.assertTrue("generateReport test", 
         pList.generateReport().contains("Pet Boarding Report for"));
   }

/** This tests the generateReportByOwner method. */
   @Test public void generateReportByOwnerTest()
   {
      PetBoardingList pList = new PetBoardingList();
      Cat catTest = new Cat("Grant", "Stewart", "Mutt", 15, 7, 9);
      Dog dogTest = new Dog("Bob", "Joe", "Mutt", 23, 7); 
      Pet[] petList = new Pet[2];
      
      petList[0] = catTest;
      petList[1] = dogTest;
      
      pList.setPetList(petList);
      
      Assert.assertTrue("generateReportByOwner test",
         pList.generateReportByOwner().contains("(by Owner)"));
   }

/** This tests the generateReportByPetName method. */
   @Test public void generateReportByPetName()
   {
      PetBoardingList pList = new PetBoardingList();
      Cat catTest = new Cat("Grant", "Stewart", "Mutt", 15, 7, 9);
      Dog dogTest = new Dog("Bob", "Joe", "Mutt", 23, 7); 
      Pet[] petList = new Pet[2];
      
      petList[0] = catTest;
      petList[1] = dogTest;
      
      pList.setPetList(petList);
      
      Assert.assertTrue("generateReportByPetName test",
         pList.generateReportByPetName().contains("(by Pet Name)"));
   }

/** This tests the generatereportByBoardingCost method. */
   @Test public void generateReportByBoardingCost()
   {
      PetBoardingList pList = new PetBoardingList();
      Cat catTest = new Cat("Grant", "Stewart", "Mutt", 15, 7, 9);
      Dog dogTest = new Dog("Bob", "Joe", "Mutt", 23, 7); 
      Pet[] petList = new Pet[2];
      
      petList[0] = catTest;
      petList[1] = dogTest;
      
      pList.setPetList(petList);
      
      Assert.assertTrue("generateReportByBoardingCost test",
         pList.generateReportByBoardingCost().contains("(by Boarding Cost)"));
   }

/** This tests the generateExcludedRecords method. */
   @Test public void generateExcludedRecordsReportTest()
   {
      PetBoardingList pList = new PetBoardingList();
      String[] excluded = new String[1];
      String excl = "";
      excluded[0] = excl;
   
      Assert.assertTrue("generateExcludedRecordsReport test",
         pList.generateExcludedRecordsReport().contains("Excluded" 
         + " Records Report"));
   }

   /** A test that always fails. **/
   /*@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }*/
}
