package exercise8_2;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import exercise5_2.Customer;
import exercise5_2.PreferredCustomer;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		ArrayList<Customer> customers = new ArrayList<>();
		
		String name = "customers";
		String path = "U:\\OOP\\assignments\\src\\Files";
		
		File f = new File(path + "\\" + name + ".txt");
		Scanner sc = new Scanner(f);
		
		String type1 = sc.nextLine();
		int id1 = Integer.parseInt(sc.nextLine());
		String name1 = sc.nextLine();
		String addr1 = sc.nextLine();
		
		String type2 = sc.nextLine();
		int id2 = Integer.parseInt(sc.nextLine());
		String name2 = sc.nextLine();
		String addr2 = sc.nextLine();
		double purchase = Double.parseDouble(sc.nextLine());
		
		Customer customer = new Customer(id1, name1, addr1);
		customers.add(customer);
		
		PreferredCustomer pcustomer = new PreferredCustomer(id2, name2, addr2, purchase);
		customers.add(pcustomer);
		
		System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s\n", "CustomerNumber", "Name", "Address", "Purchase", "Bonus"));
		for(Customer c: customers) {
			System.out.println(c);
		}
		

	}
}
