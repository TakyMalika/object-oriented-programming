package exercise5_3;

import exercise5_3.Room;
import java.util.ArrayList;
import java.util.Scanner;

public class Office extends Room {
	
	String staffMember;
	ArrayList<String> staffMembers = new ArrayList<>();
	
	// Getter/Setter
	public String getStaffMember() {
		return staffMember;
	}
	
	// Methods
	public void ask2() {
		super.ask();
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a name of staff member (empty string indicates end of names): ");
		String staff = sc.nextLine();
		staffMembers.add(staff);
		
		while(staff.length() > 0) {	
			staff = sc.nextLine();
			staffMembers.add(staff);
		}
	}
	
	// Search method
	public boolean staffsearch(String searchstaff) {    // a method to search for a staff member
		boolean decision=false;
		for(int i=0 ; i< staffMembers.size() ; i++) {       
			if(searchstaff.equalsIgnoreCase(staffMembers.get(i))) {
				decision=true;
			}
		}
		return decision;
	}
	
	// toString method
	public String toString() {
		StringBuilder print = new StringBuilder();
		String data_print;
		
		print.append(", staff members- " + staffMembers);
		
		data_print = super.toString() + print.toString();
		return data_print;
	}

}
