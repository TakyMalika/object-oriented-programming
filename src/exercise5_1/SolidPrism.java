package exercise5_1;

import exercise1_2.Prism;

public class SolidPrism extends Prism {
	double density;
	
	//method
	public double mass() {
		return (volume() * density);
	}
	
}
