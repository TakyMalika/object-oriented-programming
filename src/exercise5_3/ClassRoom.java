package exercise5_3;

import java.util.Scanner;

public class ClassRoom extends Room {

	int seat, computer;
	boolean data_projector;

	// Getter / Setter
	public int getSeat() {
		return seat;
	}

	public int getComputer() {
		return computer;
	}

	public boolean isData_projector() {
		return data_projector;
	}
	
	//Method
	public void ask3() {
		super.ask();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many seats: ");
		int seat =  sc.nextInt();
		
		System.out.println("How many computers: ");
		int computer = sc.nextInt();
		
		System.out.println("Is there any data projector? ");
		boolean data_projector = sc.nextBoolean();
	}
	
	// toString
	public String toString() {
		StringBuilder print = new StringBuilder();
		String data_print;
		
		print.append(", seats- " + getSeat() + " computers- " + getComputer() + " data-projector- " + data_projector);
		
		data_print = super.toString() + print.toString();
		return data_print;
	}
}
