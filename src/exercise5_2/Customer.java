package exercise5_2;

public class Customer {

	private String name, address;
	private int customerNumber;
	
	//Constructor
	public Customer(int customerNumber, String name, String address) {
		super();
		this.name = name;
		this.address = address;
		this.customerNumber = customerNumber;
	}

	// Getter/Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	// Method
	public String toString() {
		StringBuilder print = new StringBuilder();
		String data_print1;
		
		print.append(String.format("%-20s %-20s %-20s ", getCustomerNumber(), getName(), getAddress()));
		
		data_print1 = print.toString();
		return data_print1;	
	}
	
	
}
