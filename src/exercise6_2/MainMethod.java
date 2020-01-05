package exercise6_2;

import java.util.ArrayList;
import java.util.Collections;

import exercise2_2.Date;

public class MainMethod {

	public static void main(String[] args) {
		ArrayList<Date> dates = new ArrayList<>();
		
		dates.add(new Date());
		dates.add(new Date(4, 06, 2005));
		dates.add(new Date("06.10.2010"));
		dates.add(new Date(05, 12, 1997));
		dates.add(new Date("21.03.2005"));
		dates.add(new Date(9, 12, 2019));
		dates.add(new Date("19.03.2005"));
		
		Collections.sort(dates, new DatesComparator());
		
		System.out.println("Sorting the dates into an ascending order:");
		for(Date date: dates) {
			System.out.println(date);
		}
	}
}
