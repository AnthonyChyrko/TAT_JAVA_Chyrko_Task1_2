package tests.task0106;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import main.java.com.epam.Task0106.Exs06;

import org.testng.annotations.DataProvider;

public class Tst0601SumMinAndMax {	
  @Test(dataProvider = "dp1")
  public void summMinAndMaxValidValue(double a, double b, double c, double expected) throws Exception {	  
	  double actual = Exs06.sumMinAndMax(a,b,c);
	  assertEquals(actual, expected);
  }
  
  @Test(dataProvider = "dp2")
  public void minValidValue(double a, double b, double expected) throws Exception {	  
	  double actual = Exs06.min(a,b);
	  assertEquals(actual, expected);
  }
  
  @Test(dataProvider = "dp3")
  public void maxValidValue(double a, double b, double expected) throws Exception {	  
	  double actual = Exs06.max(a,b);
	  assertEquals(actual, expected);
  }

  @DataProvider
  public Object[][] dp3() {
    return new Object[][] {   
    	new Object[] { 0.0, 0.0, 0.0},    	
    	new Object[] { -1.0, -2.0, -1.0},
    	new Object[] { -1.0, 2.0, 2.0}  ,
    	new Object[] { 1.0, 2.0, 2.0}       
    };
  }  

  @DataProvider
  public Object[][] dp2() {
    return new Object[][] {   
    	new Object[] { 0.0, 0.0, 0.0},    	
    	new Object[] { -1.0, -2.0, -2.0},
    	new Object[] { -1.0, 2.0, -1.0}  ,
    	new Object[] { 1.0, 2.0, 1.0}       
    };
  }  

  @DataProvider
  public Object[][] dp1() {
    return new Object[][] {   
    	new Object[] { 0.0, 0.0, 0.0, 0.0},    	
    	new Object[] { -1.0, -2.0, -3.0, -4.0},
    	new Object[] { -1.0, 0.0, 3.0, 2.0}       
    };
  }  

}
