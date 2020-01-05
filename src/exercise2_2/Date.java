package exercise2_2;

public class Date {
	private int d, m, y;
	
	//Constructor
	public Date() {
		java.time.LocalDate today = java.time.LocalDate.now(); 
		d = today.getDayOfMonth(); 
		m = today.getMonthValue(); 
		y = today.getYear();
	}
	public Date(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}
	public Date(String day) {
		d = Integer.parseInt(day.substring(0,2));
		m = Integer.parseInt(day.substring(3,5));
		y = Integer.parseInt(day.substring(6));
	}

	//Setter Getter
	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//Array
	public static final String[] MONTHNAMES = {" ", "January", "February",  
			"March", "April", "May", "June", "July", "August",  "September", 
			"October", "November", "December"}; 
	
	//Methods
	public String toString() {
		return d + "." + m + "." + y;
	}
	
	public boolean equals(Date another) {
		if (this.d==another.d && this.m==another.m && this.y==another.y)
			return true;
		else 
			return false;
	}
	
	public String longForm() {
		return "The " + d + "th of " + MONTHNAMES[m] + ", " + y;
 	}
	
	public static int monthNum(String month) {
		for(int i = 1; i < MONTHNAMES.length; i++ ) {
			if(month.equalsIgnoreCase(MONTHNAMES[i])) {
				return i;
			}
		}
		return -1;
	}
	
}
