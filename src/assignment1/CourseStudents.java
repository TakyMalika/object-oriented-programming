package assignment1;

public class CourseStudents {

	public static void main(String[] args) {
		Student s;
		s = new Student();
		s.setName ("Ann River");
		s.setGrade1(2.5);
		s.setGrade2(3);
		
		Student s2 = new Student();
		s2.setName ("Imamul Irfan");
		s2.setGrade1(4);
		s2.setGrade2(5);
		
		System.out.println(s.getName() + " average: " + s.average());
		System.out.println(s2.getName() + " average: " + s2.average());
	}

}
