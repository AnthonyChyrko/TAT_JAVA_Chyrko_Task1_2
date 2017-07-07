package main.java.com.epam.Task0110;

import java.util.Arrays;

public class Exs10 {    

    public static int[][] generate(int size){
    	if(size < 0){
    		throw new IllegalArgumentException("Size can not be a negative number");
    	}
    	int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i += 2){
        	for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = j + 1;
            }
        }
        
        for (int i = 1; i < arr.length; i += 2){
        	for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = arr[i].length - j;
            }
        }
            
        return arr;
    }

    public static void print(int[][] arr){        
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }
    }    
    

    public static void main(String[] args) {
    	if(args.length < 1){
    		System.err.println("ERROR! Enter 1 parameter with type \"int\"");
    	}else{
    		if(args.length > 1){
    			System.err.println("WARNING! There are more than 1 parameter. Only the first will be used.");
    		}
    		
    		try{
    			int size = Integer.parseInt(args[0]);     			
    			   
    			int[][] arr = generate(size);
    			print(arr);    			    
    	          	        
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to integer.");
    		}
    	}        
        
    }
}
