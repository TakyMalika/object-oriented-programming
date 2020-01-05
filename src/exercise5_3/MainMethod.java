package exercise5_3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {

		ArrayList<Room> rooms = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a type of room you want to insert data (Office = 1, Classroom = 2, OtherRoom = 3)");
		int typeOfRoom = sc.nextInt();
		
		
		
		while(typeOfRoom != 0) {
			if(typeOfRoom == 1) {
				Office office = new Office();
				office.ask2();			
				rooms.add(office);
			} else if(typeOfRoom == 2) {
				ClassRoom classroom = new ClassRoom();
				classroom.ask3();
				
				rooms.add(classroom);
			} else if(typeOfRoom == 3) {
				Room otherroom = new Room();
				otherroom.ask();
				
				rooms.add(otherroom);
			} 
			System.out.println("Do you wanna insert another room's info? (No = 0, Office = 1, Classroom = 2, OtherRoom = 3)");
			typeOfRoom = sc.nextInt();
		}
		
		System.out.println("All rooms: ");
		for (Room room: rooms) {
			System.out.println(room + "\n");
		}
		System.out.println("Offices: ");
		for(Room offices: rooms) {
			if(offices instanceof Office) {
				System.out.println(offices + "\n");
			}
		}
		System.out.println("Classrooms: ");
		for(Room classrooms: rooms) {
			if(classrooms instanceof ClassRoom) {
				System.out.println(classrooms + "\n");
			}
		}
		System.out.println("Other rooms: ");
		for(Room otherrooms: rooms) {
			if(!(otherrooms instanceof Office) && !(otherrooms instanceof ClassRoom)) {
				System.out.println(otherrooms + "\n");
			}
		}

		//Room search method
		System.out.println("\nDo you wanna search anything? (No = 0, Room = 1, staff = 2)");
		int search = sc.nextInt();
		int counter=0;  // a variable in case the room or the name is not found
		while(search != 0) {
			if(search == 1) {
				System.out.println("Enter the number of the room you want to search?");
				String roomsearch = sc.next();
				counter=0;
				for ( int i = 0; i<rooms.size() ; i++) {
					if(roomsearch.equalsIgnoreCase(rooms.get(i).getRnumber()))  {
						counter++;
						System.out.println(rooms.get(i).toString());
					}	
				} 
				if (counter==0) {
					System.out.println("Sorry! The room you want to search is not found");
				}
			} else if(search == 2) {
				System.out.println("Enter the name of a staff member you want to seartch");
				String staffsearch =sc.next();
				counter=0;
					for(Room offices: rooms) {
						if((offices instanceof Office)) {
							if (((Office)offices).staffsearch(staffsearch)==true) {
								counter++;
								System.out.println(offices.toString());
							}
						}
					}
				if(counter==0) {
					System.out.println("Staff member is not found");
				}
			}
			System.out.println("Do you wanna search again? (No = 0, Room = 1, staff = 2)");
			search = sc.nextInt();
		}
	}
}
