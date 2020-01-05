package homework3;

import java.util.ArrayList;
import java.util.Locale;

/*
 Write a main method that stores all the machine parts in one ArrayList collection.
 Create some machine parts and add those in the ArrayList collection.
 Print out the objects in the ArrayList using their toString method.
 Write another loop that prints out the names and inventory values of machine parts.
 */

public class ComponentStock {

	public static void main(String[] args) {
		ArrayList<Component> components = new ArrayList<>();
		components.add(new OwnComponent("Cover", 20, 0.51, 12));
		components.add(new PurchasedComponent("Relay", 100, "ABB", 25.50));
		components.add(new OwnComponent("Box", 5, 2, 200));
		components.add(new PurchasedComponent("Adapter", 2, "Power", 41.90));
		
		System.out.println("Components in Stock");
		for(Component c: components) {
			System.out.println(c);
		}
		
		System.out.println("\nInventory Values");
		for(Component c: components) {
			System.out.println(String.format(Locale.ENGLISH, "%-12s %8.2f $",
					c.getName(), c.inventoryValue()));
		}
	}

}
