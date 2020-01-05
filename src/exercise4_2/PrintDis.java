package exercise4_2;

public class PrintDis {
	Distribution d;

	public PrintDis(Distribution d) {
		super();
		this.d = d;
	}
	
	public void print() {
		System.out.println( "The frquency of score 0 is : " + d.frequency(0));
		System.out.println( "The frquency of score 1 is : " + d.frequency(1));
		System.out.println( "The frquency of score 2 is : " + d.frequency(2));
		System.out.println( "The frquency of score 3 is : " + d.frequency(3));
		System.out.println( "The frquency of score 4 is : " + d.frequency(4));
		System.out.println( "The frquency of score 5 is : " + d.frequency(5));
		System.out.println("The average is " + d.average());
		
	}
	
}
