package main.java.com.epam.Task0106;

public class Exs06 {
    public static double sumMinAndMax(double a, double b, double c){
    	if (Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(c)
                || Double.isInfinite(a) || Double.isInfinite(b) || Double.isInfinite(c)){
    		throw new IllegalArgumentException("Invalid number"); 
    	}
        double min = min(min(a, b), c);
        double max = max(max(a, b), c);
        return min + max;
    }

    public static double min(double a, double b){
        return a <= b ? a : b;
    }

    public static double max(double a, double b){
        return a >= b ? a : b;
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
    	        
    	        System.out.println(sumMinAndMax(a, b, c));
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to double.");
    		}
    	}        
    }
}








