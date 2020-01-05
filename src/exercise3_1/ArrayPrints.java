package exercise3_1;

import java.util.Scanner;
import java.util.ArrayList;

import exercise2_2.Date;

public class ArrayPrints {
	
	public void program() {
		ArrayList<Date> dates = new ArrayList<>();
		System.out.println("Input a date: ");
		Scanner sc = new Scanner(System.in);
		String input;
		input = sc.nextLine();
		
		while(input.length() > 0) {
			dates.add(new Date(input));
			System.out.println("Input a date (empty string indicates end of data): ");
			input = sc.nextLine();
		}
		
		String searchDate ;
		System.out.println("Input the date you want to search: ");
		searchDate = sc.nextLine();
		
		while(searchDate.length() > 0) {
			Date sDate = new Date(searchDate);
			boolean found = false;
	
			for(int i= 0; i < dates.size(); i++ ){	
				if (sDate.equals (dates.get(i)) ) {
					System.out.println(i);
					found = true;
				}
				
			}
			if (found == false) {
			System.out.println("Not found!");
			}
			System.out.println("Input another date if you want to search again: ");
			searchDate = sc.nextLine();
		}
		
		
		System.out.println("Input the year you want to search:");
		int searchYear = sc.nextInt();
		
		for(int i= 0; i<dates.size();i++ ){
			if (searchYear == dates.get(i).getY()) {
				System.out.println(dates.get(i).toString());
			}
		}			
	}
}
