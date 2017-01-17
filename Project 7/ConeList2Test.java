import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/**
* This program tests methods in the ConeList2 class.
* COMP 1210 - Project 7.
*
* @author Grant Haislip - Lab 7
* @version 10/26/2016
*/
public class ConeList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/** This method is a test for the getters methods. **/
   @Test public void gettersTest()
   {
      Cone[] tList = new Cone[100];
      ConeList2 cList = new ConeList2("label", tList, 3);
   
      Assert.assertEquals("getName test", "label", cList.getName());
      Assert.assertArrayEquals("getList test", tList, cList.getList());
   }
   
   /** This method is a test for the numberOfCones method. **/
   @Test public void numberOfConesTest()
   {
      Cone[] tList = new Cone[100];
      ConeList2 cList = new ConeList2("label", tList, 3);
      
      Assert.assertEquals("numberOfCones test", 3, cList.numberOfCones());
   }
   
   /** This method is a test for the totalBasePerimeter method. **/
   @Test public void totalBasePerimeterTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("label", 3, 4);
      tList[0] = c;
      tList[1] = d;
      ConeList2 cList = new ConeList2("label", tList, 2);
      
      Assert.assertEquals("totalBasePerimeter test",
         Math.PI * (2 * 2) + Math.PI * (4 * 2),
         cList.totalBasePerimeter(), .001);
      
   }
   
   /** This method is a test for the totalBaseArea method. **/
   @Test public void totalBaseAreaTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("label", 3, 4);
      tList[0] = c;
      tList[1] = d;
      ConeList2 cList = new ConeList2("label", tList, 2);
      
      Assert.assertEquals("totalBaseArea test",
         Math.pow(2, 2) * Math.PI + Math.pow(4, 2) * Math.PI,
         cList.totalBaseArea(), .001);
   }
   
   /** This method is a test for the totalSlantHeight method. **/
   @Test public void totalSlantHeightTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("label", 3, 4);
      tList[0] = c;
      tList[1] = d;
      ConeList2 cList = new ConeList2("label", tList, 2);
      
      Assert.assertEquals("totalSlantHeight test",
         Math.sqrt(Math.pow(1, 2) + Math.pow(2, 2)) + Math.sqrt(Math.pow(3, 2)
            + Math.pow(4, 2)), cList.totalSlantHeight(), .001);
   }
   
   /** This method is a test for the totalSideArea method. **/
   @Test public void totalSideAreaTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("label", 3, 4);
      tList[0] = c;
      tList[1] = d;
      ConeList2 cList = new ConeList2("label", tList, 2);
      
      Assert.assertEquals("totalSideArea test", c.slantHeight() * 2 * Math.PI
         + d.slantHeight() * 4 * Math.PI, cList.totalSideArea(), .001);
   }
   
   /** This method is a test for the totalSurfaceArea method. **/
   @Test public void totalSurfaceAreaTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("label", 3, 4);
      tList[0] = c;
      tList[1] = d;
      ConeList2 cList = new ConeList2("label", tList, 2);
      
      Assert.assertEquals("totalSurfaceArea test",
         (c.baseArea() + c.sideArea()) + (d.baseArea() + d.sideArea()),
         cList.totalSurfaceArea(), .001);
   }
   
   /** This method is a test for the totalVolume method. **/
   @Test public void totalVolumeTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("label", 3, 4);
      tList[0] = c;
      tList[1] = d;
      ConeList2 cList = new ConeList2("label", tList, 2);
      
      Assert.assertEquals("totalVolume test",
         Math.pow(2, 2) * (1.0 / 3) * Math.PI
         + Math.pow(4, 2) * (3 / 3) * Math.PI,
         cList.totalVolume(), .001);
   }
   
   /** This method is a test for the averageSurfaceArea method. **/
   @Test public void averageSurfaceAreaTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("label", 3, 4);
      tList[0] = c;
      tList[1] = d;
      ConeList2 cList = new ConeList2("label", tList, 2);
      
      Assert.assertEquals("averageSurfaceArea test",
         ((c.baseArea() + c.sideArea()) + (d.baseArea() + d.sideArea())) / 2,
         cList.averageSurfaceArea(), .001);
         
      Cone[] dList = new Cone[100];
      ConeList2 eList = new ConeList2("label", tList, 0);
      Assert.assertEquals("averageVolume test for 0 elements",
         0, eList.averageSurfaceArea(), .001);
   }
   
   /** This method is a test for the averageVolume method. **/
   @Test public void averageVolumeTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("label", 3, 4);
      tList[0] = c;
      tList[1] = d;
      ConeList2 cList = new ConeList2("label", tList, 2);
      
      Assert.assertEquals("averageVolume test",
         (Math.pow(2, 2) * (1.0 / 3) * Math.PI
         + Math.pow(4, 2) * (3 / 3) * Math.PI) / 2,
         cList.averageVolume(), .001);
         
      Cone[] dList = new Cone[100];
      ConeList2 eList = new ConeList2("label", tList, 0);
      Assert.assertEquals("averageVolume test for 0 elements",
         0, eList.averageVolume(), .001);
   }
   
   /** This method is a test for the toString method. **/
   @Test public void toStringTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      tList[0] = c;
      ConeList2 cList = new ConeList2("label", tList, 3);
      
      Assert.assertTrue("toString test",
         cList.toString().contains("is a cone with height = 1.0 units"));
   }
   
   /** This method is a test for the summaryInfo method. **/
   @Test public void summaryInfoTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      tList[0] = c;
      ConeList2 cList = new ConeList2("cones", tList, 1);
      
      Assert.assertTrue("summaryInfo test",
         cList.summaryInfo().contains("Number of Cones: 1"));
   }
   
   /** This method is a test for the readFile method.
   * @throws IOException for scanning a file.
   **/
   @Test public void readFileTest() throws IOException
   {
      Cone[] tList = new Cone[100];
      ConeList2 cList = new ConeList2("label", tList, 1);
   
      cList.readFile("cone_1.dat");
   
      Assert.assertEquals("readFile test", "Cone List 1", cList.getName());
   }
   
   /** This method is a test for the addCone method. **/
   @Test public void addConeTest()
   {
      Cone[] tList = new Cone[100];
      ConeList2 cList = new ConeList2("label", tList, 0);
      cList.addCone("c", 1, 2);
      
      Assert.assertEquals("addCone test", 1, cList.numberOfCones());
   }
   
   /** This method is a test for the findCone method. **/
   @Test public void findConeTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("cone", 1, 2);
      Cone c1 = new Cone("cone1", 1, 2);
      Cone c2 = new Cone("cone2", 1, 2);
      tList[0] = c;
      tList[1] = c1;
      tList[2] = c2;
      ConeList2 cList = new ConeList2("label", tList, 3);
      
      Assert.assertEquals("findCone test", c1, cList.findCone("Cone1"));
   }
   
   /** This method is a test for the deleteCone method. **/
   @Test public void deleteConeTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("cone", 1, 2);
      Cone c2 = new Cone("cone2", 1, 2);
      Cone c3 = new Cone("cone3", 1, 2);
      tList[0] = c;
      tList[1] = c2;
      tList[2] = c3;
     
      ConeList2 cList = new ConeList2("label", tList, 3);
      
      cList.deleteCone("Cone2");
      
      Assert.assertEquals("deleteCone test", null, tList[2]);
   }
   
   /** This method is a test for the editCone method. **/
   @Test public void editConeTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("cone", 1, 2);
      Cone c2 = new Cone("cone1", 3, 4);
      Cone c3 = new Cone("cone2", 5, 6);
      tList[0] = c;
      tList[1] = c2;
      tList[2] = c3;
      ConeList2 cList = new ConeList2("label", tList, 3);
      
      cList.editCone("Cone2", 7, 8);
      
      Assert.assertEquals("editCone test", 7, tList[2].getHeight(), .001);
   }
   
   /** This method is a test for the findConeWithSmallestHeight method. **/
   @Test public void findConeWithSmallestHeightTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 3, 4);
      Cone d = new Cone("different", 1, 2);
      Cone e = new Cone("other", 5, 6);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      ConeList2 cList = new ConeList2("array", tList, 3);
      
      Cone f = cList.findConeWithSmallestHeight();
      
      Assert.assertEquals("findConeWithSmallestHeight test", d, f);
   }
   
   /** This method is a test for the null output of
   the findConeWithSmallestHeight method. **/
   @Test public void findConeWithSmallestHeightTestNegative()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("different", 3, 4);
      Cone e = new Cone("other", 5, 6);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      ConeList2 cList = new ConeList2("array", tList, 0);
      
      Cone f = cList.findConeWithSmallestHeight();
      
      Assert.assertEquals("findConeWithSmallestHeight test", null, f);
   }
   
   /** This method is a test for the findConeWithLargestHeight method. **/
   @Test public void findConeWithLargestHeightTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("different", 5, 6);
      Cone e = new Cone("other", 3, 4);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      ConeList2 cList = new ConeList2("array", tList, 3);
      
      Cone f = cList.findConeWithLargestHeight();
      
      Assert.assertEquals("findConeWithLargestHeight test", d, f);
   }
   
   /** This method is a test for the null output of
   the findConeWithLargestHeight method. **/
   @Test public void findConeWithLargestHeightTestNegative()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("different", 3, 4);
      Cone e = new Cone("other", 5, 6);
      tList[0] = c;
      tList[1] = d;
      ConeList2 cList = new ConeList2("array", tList, 0);
      
      Cone f = cList.findConeWithLargestHeight();
      
      Assert.assertEquals("findConeWithLargestHeight test", null, f);
   }
   
   /** This method is a test for the findConeWithSmallestRadius method. **/
   @Test public void findConeWithSmallestRadiusTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 3, 4);
      Cone d = new Cone("different", 1, 2);
      Cone e = new Cone("other", 5, 6);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      ConeList2 cList = new ConeList2("array", tList, 3);
      
      Cone f = cList.findConeWithSmallestRadius();
      
      Assert.assertEquals("findConeWithSmallestRadius test", d, f);
   }
   
   /** This method is a test for the null output of
   the findConeWithSmallestRadius method. **/
   @Test public void findConeWithSmallestRadiusTestNegative()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("different", 3, 4);
      Cone e = new Cone("other", 5, 6);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      ConeList2 cList = new ConeList2("array", tList, 0);
      
      Cone f = cList.findConeWithSmallestRadius();
      
      Assert.assertEquals("findConeWithSmallestRadius test", null, f);
   }
   
   /** This method is a test for the findConeWithLargestRadius method. **/
   @Test public void findConeWithLargestRadiusTest()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("different", 5, 6);
      Cone e = new Cone("other", 3, 4);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      ConeList2 cList = new ConeList2("array", tList, 3);
      
      Cone f = cList.findConeWithLargestRadius();
      
      Assert.assertEquals("findConeWithLargestRadius test", d, f);
   }
   
   /** This method is a test for the null output
   of the findConeWithLargestHeight method. **/
   @Test public void findConeWithLargestRadiusTestNegative()
   {
      Cone[] tList = new Cone[100];
      Cone c = new Cone("label", 1, 2);
      Cone d = new Cone("different", 3, 4);
      Cone e = new Cone("other", 5, 6);
      tList[0] = c;
      tList[1] = d;
      tList[2] = e;
      ConeList2 cList = new ConeList2("array", tList, 0);
      
      Cone f = cList.findConeWithLargestRadius();
      
      Assert.assertEquals("findConeWithLargestRadius test", null, f);
   }
   /** A test that always fails. **/
   /*@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }*/
}
