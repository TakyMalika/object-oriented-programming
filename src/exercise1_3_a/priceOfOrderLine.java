package exercise1_3_a;

public class priceOfOrderLine {

	public static void main(String[] args) {
		Order o1 = new Order();
		o1.setName("Milk");
		o1.setPrice(3.00);
		o1.setQuantity(2);
		
		System.out.println("Product: " + o1.getName() + "\n price: " + o1.getPrice() + ", quantity: " + o1.getQuantity()
			+ ", total: " + o1.orderLine()
				);
		
		Order o2 = new Order();
		o2.setName("Ice-Cream");
		o2.setPrice(5.00);
		o2.setQuantity(3);
		
		System.out.println("Product: " + o2.getName() + "\n price: " + o2.getPrice() + ", quantity: " + o2.getQuantity()
			+ ", total: " + o2.orderLine()
				);
	}

}
