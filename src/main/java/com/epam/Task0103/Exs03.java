package main.java.com.epam.Task0103;

public class Exs03 {    

    public static void main(String[] args) {
    	if(args.length < 2){
    		System.err.println("ERROR! Enter 2 parameters with type \"double\"");
    	}else{
    		if(args.length > 2){
    			System.err.println("WARNING! There are more than 2 parameters. Only the first 2 will be used.");
    		}
    		
    		try{
    			double a = Double.parseDouble(args[0]);
    	        double b = Double.parseDouble(args[1]);
    	        
    	        Triangle triangle = new Triangle(a, b);    	        
    	        
    	        System.out.println("S = " + triangle.getArea());
    	        System.out.println("P = " + triangle.getPerimeter()); 	        	
    	        
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to double.");
    		}
    	}          
    }
}
