package main.java.com.epam.task0101;

public class Exs01 {
    public static void main(String[] args) {
    	if (args.length == 0) {
            System.err.println("ERROR! Enter parameter consisting of 4 figures.");
        }else{
        	String str = args[0];
        	if(str.length() < 4){
        		System.err.println("ERROR! The first parameter must consist of 4 figures");
        	}else{
        		if(args.length > 1 || str.length() > 4){
        			System.err.println("WARNING! There are must be one parameter made of 4 figures. Only first 4 figures from the first parameter will be used.");
        		}
        		
        		try{
        			int i = Integer.parseInt(str);
        			Statement statement = new Statement(i);
        			System.out.println(statement.isStatementCorrect());       
        		}catch(NumberFormatException e){
        			System.err.println("ERROR! Parameter can not be converted to integer.");
        		}
        	}        		
        } 
    }
}
