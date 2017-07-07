package tests.task0101;

import org.testng.annotations.Test;

import main.java.com.epam.task0101.Statement;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;

public class Tst0101Statement {
	Statement statement;
	
  @Test(dataProvider = "dp1", expectedExceptions = IllegalArgumentException.class)
  public void checkIllegalArgExpLargerMAXValue(int number) throws Exception {	 
	  try {
		  statement = new Statement(number);	
	} catch (IllegalArgumentException e) {
		throw new IllegalArgumentException("Argument must be a 4-digit pisitive number.");		
	}		  		 
  } 
  
  @Test(dataProvider = "dp2", expectedExceptions = IllegalArgumentException.class)
  public void checkIllegalArgExpLessMINValue(int number) throws Exception {	 
	  try {
		  statement = new Statement(number);	
	} catch (IllegalArgumentException e) {
		throw new IllegalArgumentException("Argument must be a 4-digit pisitive number.");		
	}		  		 
  } 
  
  @Test(dataProvider = "dp3")
  public void checkNOillegalArgExpValidValues(int number) throws Exception {	 
	  try {
		  statement = new Statement(number);
		  assertTrue(true);
	} catch (IllegalArgumentException e) {
		throw new IllegalArgumentException("Argument must be a 4-digit pisitive number.");		
	}		  		 
  }   
  
  @Test(dataProvider = "dp4")
  public void checkMethIsStatementCorrectValidValuesTrue(int number){	 	 
	  statement = new Statement(number);	
	  assertTrue(statement.isStatementCorrect());
  }   
  
  @Test(dataProvider = "dp5")
  public void checkMethIsStatementCorrectValidValuesFalse(int number){	 	 
	  statement = new Statement(number);	
	  assertFalse(statement.isStatementCorrect());
  }   
  
  @DataProvider
  public Object[][] dp5() {	  
    return new Object[][] {    		
      new Object[]{1101},      
      new Object[]{1342},
      new Object[]{8991},         
    };	
  }
  
  @DataProvider
  public Object[][] dp4() {	  
    return new Object[][] {    		
      new Object[]{1111},      
      new Object[]{1322},
      new Object[]{7254},         
    };	
  }  
  
  @DataProvider
  public Object dp3() {
    return new Object[] {      
      new Integer(1000),
      new Integer(9999),
      new Integer(5555),           
    };
  }
  
  @DataProvider
  public Object dp2() {
    return new Object[] {
      new Integer(999),     
      new Integer(Integer.MIN_VALUE),        
    };
  }
  
  @DataProvider
  public Object dp1() {
    return new Object[] {            
      new Integer(10000),     
      new Integer(Integer.MAX_VALUE),      
    };
  }
}
