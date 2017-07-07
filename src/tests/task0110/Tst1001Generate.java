package tests.task0110;

import org.testng.annotations.Test;

import main.java.com.epam.Task0110.Exs10;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.testng.annotations.DataProvider;

public class Tst1001Generate {
	
	
  @Test(dataProvider = "dp1", expectedExceptions = IllegalArgumentException.class)
  public void catchingIllegalArgExceptionNegativeValue(int size) throws Exception {	 
	  try {
		  Exs10.generate(size);
	} catch (IllegalArgumentException e) {
		throw new IllegalArgumentException("Size can not be a negative number");		
	}		  		 
  }  
  
  @Test(dataProvider = "dp2")
  public void catchingIllegalArgExceptionInegerMAXValue(int size) {	
	  boolean condition = true;
	  try {
		  Exs10.generate(size);
		  assertTrue(condition);
	} catch (OutOfMemoryError e) {
		condition =false;
		assertTrue(condition);
		throw new OutOfMemoryError("Size can not be a negative number");
	}		  		 
  } 
  
  @Test(dataProvider = "dp3")
  public void checkReturnedArray(int size, int[][] expected) throws Exception {	 
	  int[][]actual = Exs10.generate(size);	
	  boolean condition = false;
	  for (int i = 0; i < actual.length; i++) {
		 if(Arrays.equals(actual[i], expected[i])){
			 condition = true;
		 }else{
			 condition = false;
		 }
	}
	  assertTrue(condition);
	 
  } 

  @DataProvider
  public Object[][] dp3() {
	  return new Object[][] {       	
    	new Object[] { 5, new int[][]{ new int[]{1, 2, 3, 4, 5},
    									new int[]{5, 4, 3, 3, 1}, 
    									new int[]{1, 2, 3, 4, 5},
    									new int[]{5, 4, 3, 2, 1},
    									new int[]{1, 2, 3, 4, 5},}},
    	      	    
    };
  }  
  
  @DataProvider
  public Object[][] dp2() {
    return new Object[][]{         
    	new Object[] { Integer.MAX_VALUE},    	
    };
  }
  
  @DataProvider
  public Object[][] dp1() {
    return new Object[][]{         
    	new Object[] { -1}, 
    };
  }
}
