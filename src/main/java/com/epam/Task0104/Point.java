package main.java.com.epam.Task0104;

public class Point {
	private double x;
	private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public boolean isPointInArea(){
        if ((x*x + Math.pow((y+1), 2)) <= 0.5*0.5){
            return false;
        }else if(y >= -3 && y <= 0 && x >= -4 && x <= 4){
            return true;
        }else if (y >= 0 && y <= 4 && x >= -2 && x <= 2){
            return true;
        }else {
            return false;
        }
    }

}
