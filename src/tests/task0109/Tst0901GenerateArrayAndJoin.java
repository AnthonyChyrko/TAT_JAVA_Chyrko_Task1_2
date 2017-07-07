package tests.task0109;

import org.testng.annotations.Test;

import main.java.com.epam.Task0109.Exs09;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.testng.annotations.DataProvider;

public class Tst0901GenerateArrayAndJoin {
	
	
  @Test(dataProvider = "dp4", expectedExceptions = IllegalArgumentException.class)
  public void catchingIllegalArgException(int size) throws Exception {	 
	  try {
		  Exs09.generateArray(size);
	} catch (IllegalArgumentException e) {
		throw new IllegalArgumentException("Size can not be a negative number");		
	}		  		 
  }   
  
  @Test(dataProvider = "dp5")
  public void checkLengthArrayPos(int size, int expSum) throws Exception {	 
	  Exs09.generateArray(size);
	  int actSum = Exs09.generateArray(size).length;	 
	  assertEquals(actSum, expSum);
  } 
  
  @Test(dataProvider = "dp1", expectedExceptions = IllegalArgumentException.class)
  public void catchingIllegalArgExceptionInsertPositionBiggerArrayLength(int[] a, int[] b, int size) throws Exception {
	  try {
		  Exs09.join(a,b,size);
	} catch (IllegalArgumentException e) {
		throw new IllegalArgumentException("k should be less than arr1 size");		
	}		  		 
  }  
  
  @Test(dataProvider = "dp2", expectedExceptions = IllegalArgumentException.class)
  public void catchingIllegalArgExceptionNegativeInsertPosition(int[] a, int[] b, int size) throws Exception {
	  try {
		  Exs09.join(a,b,size);
	} catch (IllegalArgumentException e) {
		throw new IllegalArgumentException("k can not be a negative number");		
	}		  		 
  } 
  
  @Test(dataProvider = "dp3")
  public void checkJoinTwoArrays(int[] a, int[] b, int size, int[] expected) {
	  int[] actual = Exs09.join(a,b,size);	  
	  assertTrue(Arrays.equals(actual, expected));
  }
  
  @DataProvider
  public Object[][] dp3() {
	  return new Object[][] {       	
		 new Object[] { new int[]{1, 2, 5}, new int[]{3, 4}, 2, new int[]{1, 2, 3, 4, 5}},	
		 new Object[] { new int[]{1, 2, 5}, new int[]{3, 4}, 3, new int[]{1, 2, 5, 3, 4}},	
		 new Object[] { new int[]{1, 2, 5}, new int[]{3, 4}, 1, new int[]{1, 3, 4, 2, 5}},
		 new Object[] { new int[]{1, 2, 5}, new int[]{3, 4}, 0, new int[]{3, 4, 1, 2, 5}},	
    };
  }    

  @DataProvider
  public Object[][] dp2() {
	  return new Object[][] {       	
		 new Object[] { new int[5], new int[4], -1},		        	    
    };
  }  
  
  @DataProvider
  public Object[][] dp1() {
    return new Object[][] {         
    	new Object[] { new int[5], new int[5], 6},    
    	new Object[] { new int[0], new int[6], 1},    	
    };
  }

  @DataProvider
  public Object[][] dp5() {
	  return new Object[][] {       	
    	new Object[] { 5, 5},
    	new Object[] { 0, 0},        	    
    };
  }  
  
  @DataProvider
  public Object dp4() {
    return new Object[] {         
      new Integer(-1),    
      new Integer(Integer.MIN_VALUE),  
    };
  }
}
