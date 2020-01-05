package exercise2_1;

public class Printmethod {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println("Rectangle 1:\nThe lower left corner is (" + r1.getX1()
			+ ", " + r1.getY1() + ") and the upper right corner is (" + r1.getX2()
			+ ", " + r1.getY2() + ") \n Width: " + r1.width() + ", Height: "
			+ r1.height() + " and the Area is " + r1.area() + "\n"
		);
		
		Rectangle r2 = new Rectangle(6 , 3);
		System.out.println("Rectangle 2:\nThe lower left corner is (" + r2.getX1()
			+ ", " + r2.getY1() + ") and the upper right corner is (" + r2.getX2()
			+ ", " + r2.getY2() + ") \n Width: " + r2.width() + ", Height: "
			+ r2.height() + " and the Area is " + r2.area() + "\n"
		);
		
		Rectangle r3 = new Rectangle(10 , 5, 2, 2);
		System.out.println("Rectangle 3:\nThe lower left corner is (" + r3.getX1()
			+ ", " + r3.getY1() + ") and the upper right corner is (" + r3.getX2()
			+ ", " + r3.getY2() + ") \n Width: " + r3.width() + ", Height: "
			+ r3.height() + " and the Area is " + r3.area() + "\n"
		);

	}

}
