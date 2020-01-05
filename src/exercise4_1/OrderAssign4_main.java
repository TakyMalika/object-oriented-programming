package exercise4_1;

import exercise1_3_a.Order;
import exercise2_2.Date;

public class OrderAssign4_main {

	public static void main(String[] args) {
		Date n_date = new Date();
		OrderAssign4 order1 = new OrderAssign4(1056 , "Charlie Brwon" , n_date);
		
		Order Item1 = new Order();
		Item1.setName("Pencil");
		Item1.setPrice(2.50);
		Item1.setQuantity(100);
		
		Order Item2 = new Order();
		Item2.setName("Notbook");
		Item2.setPrice(5.00);
		Item2.setQuantity(20);
		
		Order Item3 = new Order();
		Item3.setName("Pencil Case");
		Item3.setPrice(14.95);
		Item3.setQuantity(10);
		
		
		
		order1.new_order(Item1);
		order1.new_order(Item2);
		order1.new_order(Item3);
		order1.calculateTotal();
		System.out.println(order1.toString());
	}

}
