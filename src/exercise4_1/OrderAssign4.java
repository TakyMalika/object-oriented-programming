package exercise4_1;

import java.util.ArrayList;


import exercise1_3_a.Order;
import exercise2_2.Date;

public class OrderAssign4 {
	int orderId;
	String customer;
	Date orderDate;
	ArrayList<Order> orders = new ArrayList<>();
	
	//Constructor
	public OrderAssign4(int orderId, String customer, Date orderDate) {
		this.orderId = orderId;
		this.customer = customer;
		this.orderDate = orderDate;
	}
	
	// Getter - Setter
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	//method to add new order line
	public void new_order(Order nOrder){
		orders.add(nOrder);
	}

	public double calculateTotal(){
		double total_price = 0;
		for(int i = 0; i < orders.size(); i ++){
			total_price += orders.get(i).orderLine();
		}
		return total_price;
	}
	
	public String toString(){
		StringBuilder print = new StringBuilder();
		String data_print;
		print.append("Order Id: " + orderId + "\n");
		print.append("Customer: " + customer + "\n");
		print.append("Order date: " + orderDate + "\n");
		print.append(String.format("%-40s %-30s %-20s %-10s\n", "Product",  "Price" ,"Quantity" ,"Sum"));
		for (int i=0 ; i<orders.size() ; i++) {
			print.append(String.format("%-40s %-30s %-20s %-10s\n", 
					orders.get(i).getName(),  
					orders.get(i).getPrice(), 
					orders.get(i).getQuantity(),
					orders.get(i).orderLine())
					);
			
		}
		print.append("Total price : " + calculateTotal() );
		data_print = print.toString();
		
		return data_print;
		
	}
	
}