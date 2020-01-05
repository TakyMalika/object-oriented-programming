package exercise1_3_a;

public class Order {

	String name;
	double price, quantity;
	
	public void setName (String n) {
		name = n;
	}
	public String getName() {
		return name;
	} 
	
	public void setPrice (double p) {
		price = p;
	}
	public double getPrice() {
		return price;
	}
	
	public void setQuantity (double q) {
		quantity = q;
	}
	public double getQuantity() {
		return quantity;
	}
	
	public double orderLine() {
		return (price*quantity);
	}
}
