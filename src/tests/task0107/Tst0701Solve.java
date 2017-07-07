package tests.task0107;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.java.com.epam.Task0107.Exs07;

import org.testng.annotations.DataProvider;

public class Tst0701Solve {	

@Test(dataProvider = "dp")
  public void f(Double[] param, Double[] expected){	 
	  Double[] expRes = new Double[2] ;
	  int k = 0;
	  Double a = param[0];
	  Double b = param[1];
	  Double h = param[2];	  
	   
	  List<Double[]> actual = Exs07.solve(a,b,h);	  
	  boolean condition = true;

		  for (int i = 0; i < actual.size(); i++) {
			  expRes[0] = expected[k];
			  expRes[1] = expected[k+1];
				if(Arrays.equals(actual.get(i), expRes)){
					System.out.println("Я тут TRYEEEEEEEEEEEEEEEEEE");
					condition = true;
					k++;
				}else{
					System.out.println("FALSEFALSEFALSEFALSEFALSEFALSEFALSEFALSEFALSEFALSEFALSEFALSEFALSEFALSEFALSE");
					condition = false;
					k++;
				}
		  }
	  assertTrue(condition);
  }

  @DataProvider
  public Object[][] dp() {
	  return new Object[][] {   
    	new Object[][] {new Double[]{0.0, 2.0, 1.0}, new Double[]{0.0, -1.0, 1.0, 1.124, 2.0, 1.48}},    	      
    };
  }  

}
