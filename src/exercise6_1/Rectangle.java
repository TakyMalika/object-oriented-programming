package exercise6_1;

public class Rectangle implements Measurable {
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
	// Perimeter of the rectangle
	public double perimeter() {
		return Math.abs(2 * (Math.abs(x2 - x1) + Math.abs(y2 - y1)));
	}
	// Scale of the rectangle
	public void scale(double scaleValue) {
		x2 = x1 + scaleValue * width();
		y2 = y1 + scaleValue * height();
	}
	public String toString() {
		StringBuilder print_rect = new StringBuilder();
		String data;
		print_rect.append("Area of the rectangle is " + area() + "\n"
					+ "Perimeter of the rectangle is " + perimeter() + "\n"
				);
		
		data = print_rect.toString();
		return data;
		
	}
	
}