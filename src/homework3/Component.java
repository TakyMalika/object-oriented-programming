package homework3;
/*
 In a machine manufacturing process in a factory, many different parts of machines are used.
 The stock control needs to know the name and the number in stock of every machine part.
*/

public abstract class Component {
	
	private String name;
	private int numberInStock;
	
	public Component(String name, int numberInStock) {
		super();
		this.name = name;
		this.numberInStock = numberInStock;
	}

	public String getName() {
		return name;
	}

	public int getNumberInStock() {
		return numberInStock;
	}
	
	abstract public double inventoryValue();
	
}
