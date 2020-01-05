package exercise6_1;

import java.util.ArrayList;

public class MainMethod {

	public static void main(String[] args) {
		ArrayList<Measurable> objects = new ArrayList<>();
		
		Rectangle rec1 = new Rectangle();
		objects.add(rec1);
		
		Circle cir1 = new Circle();
		objects.add(cir1);
		
		for(Measurable obj : objects) {
			if(obj instanceof Rectangle) {
				obj.scale(3);
				System.out.println(obj);	
			}
			if (obj instanceof Circle) {
				obj.scale(0.5);
				System.out.println(obj);
			}
		};
	}
}
