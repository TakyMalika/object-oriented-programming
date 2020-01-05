package homework3;

import java.util.Locale;

public class OwnComponent extends Component {

	private double materialAmount;
	private double unitPrice;
	
	public OwnComponent(String name, int numberInStock, double materialAmount, double unitPrice) {
		super(name, numberInStock);
		this.materialAmount = materialAmount;
		this.unitPrice = unitPrice;
	}

	@Override
	public double inventoryValue() {
		return materialAmount * unitPrice * getNumberInStock();
	}
	
	public String toString() {
		return String.format(Locale.ENGLISH, "OwnComponent: %s, number in stock %d, "
				+ "material amount %.2f m, material unit price %.2f $/m",
				getName(), getNumberInStock(), materialAmount, unitPrice);
	}
	
}
