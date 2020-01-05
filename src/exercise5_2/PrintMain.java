package exercise5_2;

import java.util.ArrayList;



public class PrintMain {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<>();
		
		customers.add(new Customer(6, "Emon", "Vaasa"));
		
		customers.add(new PreferredCustomer(1, "Irfan", "Modhubag", 900));
		customers.add(new PreferredCustomer(2, "Afrin", "Jyvaskula", 1800));
		customers.add(new PreferredCustomer(3, "Sakif", "Modhubag", 500));
		customers.add(new PreferredCustomer(4, "Alvi", "Gulshan", 200));
		
		System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s\n", "CustomerNumber", "Name", "Address", "Purchase", "Bonus"));
		for(Customer c: customers) {
			System.out.println(c);
		}
	}

}
