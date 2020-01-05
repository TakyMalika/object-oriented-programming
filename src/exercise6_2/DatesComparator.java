package exercise6_2;

import java.util.Comparator;

import exercise2_2.Date;

public class DatesComparator implements Comparator<Date> {
	 public int compare(Date d1, Date d2) {
		if(d1.getY() < d2.getY()) {
			return -1;
		}
		else if (d1.getY() > d2.getY()) {
			return 1;
		}
		else if (d1.getM() < d2.getM()) {
			return -1;
		}
		else if (d1.getM() > d2.getM()) {
			return 1;
		}
		else if (d1.getD() < d2.getD()) {
			return -1;
		}
		else if (d1.getD() > d2.getD()) {
			return 1;
		}
		return 0;
		 
	 };
}
