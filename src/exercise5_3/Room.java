package exercise5_3;

import java.util.Scanner;

public class Room {

	public char[] getseat;
	String rnumber, description;
	
	// Getter
	public String getRnumber() {
		return rnumber;
	}
	
	public String getDescription() {
		return description;
	}
	
	//Method
	public void ask() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a room number: ");
		rnumber = sc.nextLine();
		
		System.out.println("Insert a description: ");
		description = sc.nextLine();	
	}
	

	//toString method
	public String toString() {
		StringBuilder print = new StringBuilder();
		String data_print;
		
		print.append(getRnumber() + ": " + getDescription());
		
		data_print = print.toString();
		return data_print;
	}
}
