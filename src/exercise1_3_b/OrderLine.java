package exercise1_3_b;

import exercise1_3_a.Order;
import java.util.Scanner;

public class OrderLine {
	
	public void process() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many orders?");
		int number = sc.nextInt();
        Order[] orders = new Order[number]; //array allocation
        
        for(int i = 0; i < number; i++){
            sc.nextLine(); //skip the line break
            
            orders[i] = new Order(); //object creation
            System.out.print("Item's name?");
            orders[i].setName(sc.nextLine());
            System.out.print("How much?");
            orders[i].setPrice(sc.nextDouble());
            System.out.print("Item's quantity?");
            orders[i].setQuantity(sc.nextDouble());
        }
        
        double total = 0;
        
        System.out.println("Order List");
        System.out.println("Item\tPrice");
        for(int i = 0; i < number; i++){
            System.out.println(orders[i].getName() + "\t" + String.format("%.2f", orders[i].orderLine()));
            total += orders[i].orderLine();
        }
        System.out.println("Total Price: " + total );
	}
}
