package exercise2_1;

public class Rectangle {
	private double x1;	//x coordinate of lower left corner
	private double y1; //y coordinate of lower left corner
	private double x2; //x coordinate of upper right corner
	private double y2; //y coordinate of upper right corner 


//Constructor
	public Rectangle() {
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 1;
		this.y2 = 1;
	}
	public Rectangle(double x2, double y2) {
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = x2;
		this.y2 = y2;
	}
	public Rectangle(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
//Setter and getter
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public double getX1() {
		return x1;
	}
	
	public void setY1(double y1) {
		this.y1 = y1;
	}
	public double getY1() {
		return y1;
	}
	
	public void setX2(double x2) {
		this.x2 = x2;
	}
	public double getX2() {
		return x2;
	}
	
	public void setY2(double y2) {
		this.y2 = y2;
	}
	public double getY2() {
		return y2;
	}
	
//Other methods
	//Width of rectangle
	public double width() {
		return Math.abs(x2 - x1);
	}
	//Height of rectangle
	public double height() {
		return Math.abs(y2 - y1);
	}
	// Area of the rectangle
	public double area() {
		return Math.abs(x2 - x1)*Math.abs(y2 - y1);
	}
	
}