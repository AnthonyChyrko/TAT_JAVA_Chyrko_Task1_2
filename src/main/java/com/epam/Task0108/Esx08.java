package main.java.com.epam.Task0108;

import java.util.Arrays;

public class Esx08 {    
    public static void main(String[] args) {
    	if(args.length < 2){
    		System.err.println("ERROR! Enter 2 parameters with type \"int\"");
    	}else{
    		if(args.length > 2){
    			System.err.println("WARNING! There are more than 2 parameters. Only the first 2 will be used.");
    		}
    		
    		try{
    			int size = Integer.parseInt(args[0]);
    	        int k = Integer.parseInt(args[1]);
    	        Array array = new Array(size);
    	        
    	        
    	        System.out.println(Arrays.toString(array.getArr()));
        	    System.out.println("k = " + k);
        	    System.out.println("Sum = " + array.sum(k));    	          	        
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to integer.");
    		}
    	}      
        
        
    }
}
