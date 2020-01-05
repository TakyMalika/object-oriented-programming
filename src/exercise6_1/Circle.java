package exercise6_1;

/*
 * A circle in a coordinate system
 */
public class Circle implements Measurable {

    private double cx = 0; // centre x
    private double cy = 0; // centre y
    private double r = 1; // radius

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getR() {
        return r;
    }

    //Methods
    public double area() {
        return Math.PI * r * r;
    }
	public double perimeter() {
		return Math.abs(2 * Math.PI * r );
	}
	public void scale(double scaleValue) {
		r = Math.abs(r * scaleValue);
	}
	public String toString() {
		StringBuilder print_cir = new StringBuilder();
		String data;
		print_cir.append("Area of the circle is " + area() + "\n"
						+ "Perimeter of a circle is " + perimeter() + "\n");
		
		data = print_cir.toString();
		return data;
	}
} // End of Circle class