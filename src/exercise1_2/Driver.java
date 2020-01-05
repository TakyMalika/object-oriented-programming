package exercise1_2;

public class Driver {

	public static void main(String[] args) {
		Prism p = new Prism();
		p.height = 5;
		p.width = 10;
		p.depth = 2;
		
		System.out.println("Prism 1:\n Height: " + p.height + ", Width: " + p.width + ", Depth: " + p.depth +
				", volume: " + p.volume() );
		
		Prism p2 = new Prism();
		p2.height = 2;
		p2.width = 4;
		p2.depth = 1;
		
		System.out.println("Prism 2:\n Height: " + p2.height + ", Width: " + p2.width + ", Depth: " + p2.depth +
				", volume: " + p2.volume() );
		
	}

}
