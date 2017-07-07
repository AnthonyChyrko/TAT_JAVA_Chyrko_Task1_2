package main.java.com.epam.Task0102;

public class Expression {
	double a;
	double b;
	double c;
	
	public Expression(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}	
	 
	 
	 public double resolve(){
		 if (a == 0 || b == 0) {
			 throw new IllegalArgumentException("Parameters 'a' and 'b' must be not 0.");	        
		 }		 
		 
		 if ((b * b + 4 * a * c) < 0){
			 throw new ArithmeticException("Discriminant must be greater than 0.");
		 }
		 
	     return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))/(2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
	 } 

}
