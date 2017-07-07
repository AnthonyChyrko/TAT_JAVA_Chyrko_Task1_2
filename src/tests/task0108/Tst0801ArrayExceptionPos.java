package tests.task0108;

import org.testng.annotations.Test;

import main.java.com.epam.Task0108.Array;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;

public class Tst0801ArrayExceptionPos {
	Array arr;
	
  @Test(dataProvider = "dp1", expectedExceptions = IllegalArgumentException.class)
  public void illegalArgExpIncorrectValues(int number) throws Exception {	 
	  try {
		  arr = new Array(number);	
	} catch (IllegalArgumentException e) {
		throw new IllegalArgumentException("Size can not be a negative number");		
	}		  		 
  } 
  
  @Test(dataProvider = "dp2")
  public void arrayCorrectValues(int number){	 
	  try {
		  arr = new Array(number);	
		  assertTrue(true);
	} catch (IllegalArgumentException e) {
		throw new IllegalArgumentException("Size can not be a negative number");		
	}		  		 
  }   
  
  @Test(dataProvider = "dp3")
  public void summCorrectValues(int[] n, int k, int expSum) throws Exception {
	  int[] intArr = n;
	  Array tmpArr = new Array(intArr);
	  int actSum = tmpArr.sum(k);	 
	  assertEquals(actSum, expSum);
  }
  
  @Test(dataProvider = "dp4")
  public void divisionByZero(int[] n, int k, int expSum) throws Exception {
	  int[] intArr = n;
	  Array tmpArr = new Array(intArr);
	  int actSum = tmpArr.sum(k);	 
	  assertEquals(actSum, expSum);
  }
  
  @Test(dataProvider = "dp5", expectedExceptions = IllegalArgumentException.class)
  public void positiveElementOfArray(int[] n, int k, int expSum) throws Exception {
	  int[] intArr = n;
	  Array tmpArr = new Array(intArr);
	  try{
		  tmpArr.sum(k);	 
	  } catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("elements of array should be a positive number");		
	  }		  
  }

@Test(dataProvider = "dp6", expectedExceptions = ArithmeticException.class)
  public void divisionByZeroCatchExp(int[] n, int k, int expSum) throws Exception {
	boolean condition = false;
	  int[] intArr = n;
	  Array tmpArr = new Array(intArr);
	  try{
		  tmpArr.sum(k);
		  assertTrue(condition);
	  } catch (ArithmeticException e) {
		  condition = false;
		  assertTrue(condition);
			throw new ArithmeticException("Division by zero");		
	  }		  
  }

@DataProvider
  public Object[][] dp5() {
	  return new Object[][] {       	
    	new Object[] { new int[]{1, -2 ,3 , 4, 5}, 2, 6},      	    
    };
  } 

@DataProvider
  public Object[][] dp6() {
	  return new Object[][] {       	
    	new Object[] { new int[]{1, 2 ,3 , 4, 5}, 0, 6},      	    
    };
  } 

  @DataProvider
  public Object[][] dp3() {
	  return new Object[][] {       	
    	new Object[] { new int[]{1, 2 ,3 , 4, 5}, 2, 6},
    	new Object[] { new int[]{0, 0, 0, 0, 0}, 2, 0},        	    
    };
  }  
  @DataProvider
  public Object[][] dp4() {
	  return new Object[][] {  
    	new Object[] { new int[]{1, 2 ,3 , 4, 5}, 0, 2},
    };
  }    
  
  @DataProvider
  public Object dp2() {
    return new Object[] {         
      new Integer(0),     
      new Integer(Integer.MAX_VALUE),      
    };
  }
  
  @DataProvider
  public Object dp1() {
    return new Object[] {         
      new Integer(-1),
      new Integer(Integer.MIN_VALUE),          
    };
  }
}
