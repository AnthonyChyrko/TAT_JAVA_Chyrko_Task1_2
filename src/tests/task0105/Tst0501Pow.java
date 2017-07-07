package tests.task0105;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import main.java.com.epam.Task0105.Exs05;

import org.testng.annotations.DataProvider;

public class Tst0501Pow {	
  @Test(dataProvider = "dp1")
  public void pow_ValidValues(double a, double b, double c, double[] expected) throws Exception {	  
	  double[] actual = Exs05.pow(a,b,c);
	  assertTrue(Arrays.equals(actual, expected));
  } 

  @DataProvider
  public Object[][] dp1() {
    return new Object[][] {   
    	new Object[] { 0.0, 0.0, 0.0, new double[]{ 0.0, 0.0, 0.0}},    	
    	new Object[] { -0.0, -0.0, -0.0, new double[]{ 0.0, 0.0, 0.0}},
      new Object[] { -2.0, 2.0, 2.0, new double[]{ 16.0, 4.0, 4.0}},
      new Object[] {  3.0, -2.0, 3.0, new double[]{ 9.0, 16.0, 9.0}},
      new Object[] {  4.0, 3.0, -4.0, new double[]{ 16.0, 9.0, 256.0}},
      new Object[] {  4, 3, -4, new double[]{ 16.0, 9.0, 256.0}},       
      new Object[] { Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, new double[]{ Math.pow(Double.MAX_VALUE, 2), 
  			Math.pow(Double.MAX_VALUE, 2), Math.pow(Double.MAX_VALUE, 2)}},
  	new Object[] { -Double.MAX_VALUE, -Double.MAX_VALUE, -Double.MAX_VALUE, new double[]{ Math.pow(Double.MAX_VALUE, 4), 
  			Math.pow(Double.MAX_VALUE, 4), Math.pow(Double.MAX_VALUE, 4)}},
    };
  }  

}
