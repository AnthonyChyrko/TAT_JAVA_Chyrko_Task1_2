package main.java.com.epam.Task0103;

public class Triangle {
	
	private double a; 
	private double b;
	private double c;
	
	public Triangle(double a, double b){
		if(a <=0 || b <= 0){
			throw new IllegalArgumentException("Parameters 'a' and 'b' must be greater than 0.");	
		}
        this.a = a;
        this.b = b; 
        this.c = Math.sqrt(a*a + b*b);
    }
	
	public double getArea(){
        return (a + b)/2;
    }

    public double getPerimeter(){
        return a + b + c;
    }    

}
