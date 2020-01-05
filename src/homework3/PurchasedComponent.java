package homework3;

import java.util.Locale;

public class PurchasedComponent extends Component {
	
	private String supplier;
	private double price;
	
	public PurchasedComponent(String name, int numberInStock, String supplier, double price) {
		super(name, numberInStock);
		this.supplier = supplier;
		this.price = price;
	}

	@Override
	public double inventoryValue() {
		return price * getNumberInStock();
	}
	
	public String toString() {
		return String.format(Locale.ENGLISH, "PurchasedComponent: %s, number in stock %d, "
				+ "supplier %s, price %.2f $",
				getName(), getNumberInStock(), supplier, price);
	}

}
