package tests.task0103;

import org.testng.annotations.Test;

import main.java.com.epam.Task0103.Triangle;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;

public class Tst0301Triangle {
	Triangle triangle;
  @Test(dataProvider = "dp1", expectedExceptions = IllegalArgumentException.class)
  public void triangleIllegalArgExpIncorrectValue(double a, double b) throws Exception {		  
	  try{
		  triangle = new Triangle(a, b);
	  } catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Parameters 'a' and 'b' must be greater than 0.");		
	  }	  
  }
  
  @Test(dataProvider = "dp2")
  public void triangleIllegalArgExpValidValue(double a, double b){	  
	  
	  try{
		  triangle = new Triangle(a, b);
		  assertTrue(true);
	  } catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Parameters 'a' and 'b' must be greater than 0.");		
	  }	  
  }
  
  @Test(dataProvider = "dp3")
  public void getAreaValidValue(double a, double b, double expected) throws Exception {	  
		  triangle = new Triangle(a, b);
		  double actual = triangle.getArea();
		  assertEquals(actual, expected);
  }
  
  @Test(dataProvider = "dp4")
  public void getPerimeterValidValue(double a, double b, double expected) throws Exception {	  
		  triangle = new Triangle(a, b);
		  double actual = triangle.getPerimeter();
		  assertEquals(actual, expected);
  }

  @DataProvider
  public Object[][] dp4() {
    return new Object[][] {   
      new Object[] { 1.0, 1.0, Math.sqrt(1.0 + 1.0) + 1.0 + 1.0},
      new Object[] { 2.5, 2.5, Math.sqrt(Math.pow(2.5, 2) + Math.pow(2.5, 2)) + 2.5 + 2.5},
      new Object[] { 3.5, 4.5, Math.sqrt(Math.pow(3.5, 2)+Math.pow(4.5, 2)) + 3.5 + 4.5},   
      new Object[] { Double.MIN_VALUE, Double.MIN_VALUE, Math.sqrt(Math.pow(Double.MIN_VALUE, 2)+Math.pow(Double.MIN_VALUE, 2)) 
    		  + Double.MIN_VALUE + Double.MIN_VALUE},
    };
  }  

  @DataProvider
  public Object[][] dp3() {
    return new Object[][] {   
      new Object[] { 1, 1, 0.5},
      new Object[] { 2, 2, 2},
      new Object[] { 3, 4, 6},             
    };
  }  

  @DataProvider
  public Object[][] dp2() {
    return new Object[][] {   
    	new Object[] { Double.MAX_VALUE, Double.MAX_VALUE},    	
    	new Object[] { 0.1, 0.1},    	          
    };
  }  

  @DataProvider
  public Object[][] dp1() {
    return new Object[][] {   
      new Object[] { 0, 0},
      new Object[] { -1, -1},
      new Object[] { 0, -1},
      new Object[] { -1, 0},
      new Object[] { 0.1, -1},
      new Object[] { -1, 0.1},
      new Object[] { -1.1, -1.1},
      new Object[] { -5E-324, -1},
      new Object[] { -Double.MIN_VALUE, -Double.MIN_VALUE},     
    };
  }  

}
