package exercise5_1;

public class SolidPrismMain {

	public static void main(String[] args) {
		SolidPrism prism = new SolidPrism();
		
		prism.height = 5;
		prism.width = 10;
		prism.depth = 2;
		prism.density = 4;
		
		System.out.println(String.format("%-20s %-20s %-20s %-20s", "Height", "Width", "Depth", "Density"));
		System.out.println(String.format("%-20s %-20s %-20s %-20s\n", 
				prism.height, 
				prism.width,
				prism.depth,
				prism.density
				));
		System.out.println("The volume is : " + prism.volume());
		System.out.println("The mass is : " + prism.mass());

	}

}
