package main.java.com.epam.Task0107;

import java.util.ArrayList;
import java.util.List;

public class Exs07 {    

    public static List<Double[]> solve(double a, double b, double h){
    	if(Double.isInfinite(a) || Double.isInfinite(b) || Double.isInfinite(h) ||
    			Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(h)){
    		throw new IllegalArgumentException("Invalid input");
    	}
    	
    	if(b <= a){    		
    		throw new IllegalArgumentException("Parameter 'b' must be greater than parameter 'a'");
    	}
    	
    	if(h <= 0){    		
    		throw new IllegalArgumentException("Parameter 'h' must be greater than 0");
    	}   
    	
    	double x = a;         
        double y;
        List<Double[]> arr = new ArrayList<>();               
        while (x <= b){
            y = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
            Double[] d = new Double[2];
            d[0] = x;
            d[1] = y;
            arr.add(d);            
            x += h;
        }
        
        return arr;
    } 
    
    public static void print(List<Double[]> arr){
    	for(Double[] d : arr){
    		System.out.printf("|%20.3f|%20.3f|\n", d[0], d[1]);
    	}    	
    }
    

    public static void main(String[] args) {
    	if(args.length < 3){
    		System.err.println("ERROR! Enter 3 parameters with type \"double\"");
    	}else{
    		if(args.length > 3){
    			System.err.println("WARNING! There are more than 3 parameters. Only the first 3 will be used.");
    		}
    		
    		try{
    			double a = Double.parseDouble(args[0]);
    	        double b = Double.parseDouble(args[1]);
    	        double h = Double.parseDouble(args[2]);  
    	        
    	        System.out.println("a = " + a);
    	        System.out.println("b = " + b);
    	        System.out.println("h = " + h);    	        
    	        
    	        print(solve(a, b, h));   
    	           	        
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to double.");
    		}
    	}        
        
    }
}
