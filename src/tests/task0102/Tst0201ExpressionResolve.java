package tests.task0102;

import org.testng.annotations.Test;

import main.java.com.epam.Task0102.Expression;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;

public class Tst0201ExpressionResolve {
	Expression express;
  @Test(dataProvider = "dp1", expectedExceptions = IllegalArgumentException.class)
  public void checkResolveCatchIllegalArgExpIncorrectValues(double a, double b, double c) throws Exception {	  
	  express = new Expression(a, b, c);
	  try{
		  express.resolve();
	  } catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Parameters 'a' and 'b' must be not 0.");		
	  }	  
  }
  
  @Test(dataProvider = "dp2")
  public void checkResolveNOCatchIllegalArgExpValidValues(double a, double b, double c) throws Exception {	  
	  express = new Expression(a, b, c);
	  try{
		  express.resolve();
		  assertTrue(true);
	  } catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Parameters 'a' and 'b' must be not 0.");		
	  }	  
  }
  
  @Test(dataProvider = "dp3", expectedExceptions = ArithmeticException.class)
  public void checkResolveCatchArithmeticExpIncorrectValues(double a, double b, double c) throws Exception {	  
	  express = new Expression(a, b, c);
	  try{
		  express.resolve();
	  } catch (ArithmeticException e) {
			throw new ArithmeticException("Discriminant must be greater than 0.");		
	  }	  
  }
  
  @Test(dataProvider = "dp4")
  public void checkResolveNOCatchArithmeticExpValidValues(double a, double b, double c) throws Exception {	  
	  express = new Expression(a, b, c);
	  try{
		  express.resolve();
		  assertTrue(true);
	  } catch (ArithmeticException e) {
			throw new ArithmeticException("Discriminant must be greater than 0.");		
	  }	  
  }
  
  @Test(dataProvider = "dp5")
  public void checkResolveValidValue(double a, double b, double c, double expected) {	  
	  express = new Expression(a, b, c);	  
		  double actual = express.resolve();	
		  assertEquals(actual, expected);
  }

  @DataProvider
  public Object[][] dp5() {
    return new Object[][] {   
      new Object[] { 1, 2, 3, 0.25},      
      new Object[] { 4, 5, 6, -381.96},
      new Object[] { -1, -2, -3, -3.75},
    };
  }  

  @DataProvider
  public Object[][] dp4() {
    return new Object[][] {   
      new Object[] { -1, -2, -33},
      new Object[] { -2, -1, 0},
      new Object[] { Double.MAX_VALUE,Double.MIN_VALUE , 0},
    };
  }  

  @DataProvider
  public Object[][] dp3() {
    return new Object[][] {   
      new Object[] { -100, 1, 3},
      new Object[] { 1, 1, -3},
      new Object[] { -1, -1, 7},
      new Object[] { Double.NaN, Double.NaN, Double.NaN},
    };
  }  

  @DataProvider
  public Object[][] dp2() {
    return new Object[][] {   
      new Object[] { 1, 2, 3},
      new Object[] { -2, -1, 0},
      new Object[] { Double.MAX_VALUE,Double.MIN_VALUE , 0},
      new Object[] { Double.NaN, Double.NaN, Double.NaN},
    };
  } 

  @DataProvider
  public Object[][] dp1() {
    return new Object[][] {   
      new Object[] { 1, 0, 3},
      new Object[] { 0, -1, -3},
      new Object[] { 0, 0, 7},
      new Object[] { Double.NaN, Double.NaN, Double.NaN},     
    };
  }  

}
