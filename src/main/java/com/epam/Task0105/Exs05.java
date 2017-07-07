package main.java.com.epam.Task0105;

import java.util.Arrays;

public class Exs05 {
    public static double[] pow(double a, double b, double c){
    	double[] arr = new double[3];
    	arr[0] = a;
    	arr[1] = b;
    	arr[2] = c;
    	for(int i = 0; i < arr.length; i++){
    		if(Double.isInfinite(arr[i]) || Double.isNaN(arr[i])){
    			throw new IllegalArgumentException("Invalid number");
    		}
    	}
    	for(int i = 0; i < arr.length; i++){
    		if (arr[i] >= 0){
    			arr[i] = arr[i] * arr[i]; 
    		}else{
    			arr[i] = arr[i] * arr[i] * arr[i] * arr[i]; 
    		}
    	}
        return arr;
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
    	        double c = Double.parseDouble(args[2]);    	        
    	        
    	        System.out.println(Arrays.toString(pow(a, b, c)));    	        
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to double.");
    		}
    	}         

    }
}
