package exercise2_2;

import java.util.Scanner;

public class Printmethod {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		
		Date date2 = new Date(30, 9, 2019);
		System.out.println(date2.toString());
		
		Date date3 = new Date("06-10-2019");
		System.out.println(date3.toString());
		
		if (date2.equals(date3)) {
			System.out.println("\nDate2 and Date3 are same\n");	
		}
		else {
			System.out.println("\nDate2 and Date3 are not same\n");
		}
		
		
		Scanner scan = new Scanner(System.in);
		
		
        System.out.print("Write a date: ");
        Date date4 = new Date(scan.nextLine());
        
		if (date2.equals(date4)) {
			System.out.println("Date2 and Date4 are same\n");	
		}
		else
			{System.out.println("Date2 and Date4 are not same\n");}
		
		System.out.println(date4.longForm());
		
		
		System.out.println("Write name of a month: ");
		System.out.println(Date.monthNum(scan.nextLine()));

	}

}
