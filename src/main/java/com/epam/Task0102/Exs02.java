package main.java.com.epam.Task0102;

public class Exs02 {
	
    public static double calculate(double a, double b, double c){
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))/(2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
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
    	        
    	        Expression exp = new Expression(a, b, c);
    	        System.out.println(exp.resolve());
    	        
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to double.");
    		}
    	}          
    }
}
