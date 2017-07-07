package main.java.com.epam.Task0104;

public class Exs04 {    

    public static void main(String[] args) {
    	if(args.length < 2){
    		System.err.println("ERROR! Enter 2 parameters with type \"double\"");
    	}else{
    		if(args.length > 2){
    			System.err.println("WARNING! There are more than 2 parameters. Only the first 2 will be used.");
    		}
    		
    		try{
    			double x = Double.parseDouble(args[0]);
    	        double y = Double.parseDouble(args[1]);
    	        
    	        Point point = new Point(x, y);
    	        
    	        System.out.println(point.isPointInArea());
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to double.");
    		}
    	}      
        
    }
}
