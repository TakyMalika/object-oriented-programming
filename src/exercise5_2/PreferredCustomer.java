package exercise5_2;

import exercise5_2.Customer;

public class PreferredCustomer extends Customer {

	private double purchase;

	//Constructor
	public PreferredCustomer(int customerNumber, String name, String address, double purchase) {
		super(customerNumber, name, address);
		this.purchase = purchase;
	}

	//Getter/Setter
	public double getPurchase() {
		return purchase;
	}

	public void setPurchases(double purchase) {
		this.purchase = purchase;
	}
	
	//Calculate bonus
	public double calculateBonus() {
		if(purchase >= 500 && purchase <= 1000) {
			return (purchase * 2 / 100);
		}
		if(purchase > 1000) {
			return (purchase * 5 / 100);
		}
		else return 0;
	} 
	
	//toString method
	public String toString() {
		StringBuilder print = new StringBuilder();
		String data_print2;
		
		print.append(String.format("%-20s %-20s", getPurchase(), calculateBonus()));
		
		data_print2 = super.toString() + print.toString();
		return data_print2;
	}
	
}
