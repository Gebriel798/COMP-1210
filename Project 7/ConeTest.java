import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* This program tests methods in the Cone class.
* COMP 1210 - Project 7.
*
* @author Grant Haislip - Lab 7
* @version 10/26/2016
*/
public class ConeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
/** This method is a test for getters and setters methods. **/
   @Test public void gettersSettersTest()
   {
      Cone c = new Cone("label", 1, 2);
   
      Assert.assertEquals("getLabel test", "label", c.getLabel());
      Assert.assertEquals("getHeight test", 1, c.getHeight(), .001);
      Assert.assertEquals("getRadius test", 2, c.getRadius(), .001);
      
      Assert.assertTrue("setLabel test", c.setLabel("new label"));
      Assert.assertFalse("setLabel test", c.setLabel(null));
      
      Assert.assertTrue("setHeight test", c.setHeight(3));
      Assert.assertFalse("setHeight test", c.setHeight(-1));
      
      Assert.assertTrue("setRadius test", c.setRadius(4));
      Assert.assertFalse("setRadius test", c.setRadius(-1));
   }
   /** This method is a test for the basePerimeter method. **/
   @Test public void basePerimeterTest()
   {
      Cone c = new Cone("label", 1, 2);
   
      Assert.assertEquals("basePerimeter test", 
         (2 * 2) * Math.PI, c.basePerimeter(), .001);
   }
   
   /** This method is a test for the baseArea method. **/
   @Test public void baseAreaTest()
   {
      Cone c = new Cone("label", 1, 2);
   
      Assert.assertEquals("baseArea test",
         Math.PI * Math.pow(2, 2), c.baseArea(), .001);
   }
   
   /** This method is a test for the slantHeight method. **/
   @Test public void slantHeightTest()
   {
      Cone c = new Cone("label", 1, 2);
   
      Assert.assertEquals("slantHeight test", 
         Math.sqrt(Math.pow(1, 2) + Math.pow(2, 2)), c.slantHeight(), 001);
   }
   
   /** This method is a test for the sideArea method. **/
   @Test public void sideAreaTest()
   {
      Cone c = new Cone("label", 1, 2);
   
      Assert.assertEquals("sideArea test",
         c.slantHeight() * 2 * Math.PI, c.sideArea(), .001);
   }
   
   /** This method is a test for the surfaceArea method. **/
   @Test public void surfaceAreaTest()
   {
      Cone c = new Cone("label", 1, 2);
   
      Assert.assertEquals("surfaceArea test",
         c.baseArea() + c.sideArea(), c.surfaceArea(), .001);
   }
   
   /** This method is a test for the volume method. **/
   @Test public void volumeTest()
   {
      Cone c = new Cone("label", 1, 2);
   
      Assert.assertEquals("volume test",
         Math.pow(2, 2) * (1.0 / 3.0) * Math.PI, c.volume(), .001);
   }
   
   /** This method is a test for the toString method. **/
   @Test public void toStringTest()
   {
      Cone c = new Cone("label", 1, 2);
   
      Assert.assertTrue("toString test",
         c.toString().contains("is a cone with height = 1.0 units"));
   }
   
   /** This method is a test for the get and reset count method. **/
   @Test public void getresetCountTest()
   {
      Cone d = new Cone("label", 1, 2);
      d.resetCount();
      Cone c = new Cone("label", 1, 2);
   
      Assert.assertEquals("getCount test", 1, c.getCount());
   }
   
   /** This method is a test for the equals method. **/
   @Test public void equalsTest()
   {
      Cone c = new Cone("Label", 1, 2);
      String d = "";
      Cone a = c;
   
      Assert.assertTrue("equals test", c.equals(a));
      Assert.assertFalse("equals test", c.equals(d));
   }
   
   /** This method is a test for the hashcode method. **/
   @Test public void hashCodeTest()
   {
      Cone c = new Cone("label", 1, 2);
   
      Assert.assertEquals("hashCode test", 0, c.hashCode());
   }
   
   
   /** A test that always fails. **/
   /*@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }*/
}
