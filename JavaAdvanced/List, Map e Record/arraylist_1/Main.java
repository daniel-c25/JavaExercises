package arraylist_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(
				new Student(),
				new Student(),
				new Student()				
				));
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("-------------------------------------------");
		students.add(new Student("Lorenzo", 12));
		students.add(new Student("Carla", 15));
		students.add(new Student("Marcello", 15));
		students.add(new Student("Anna", 13));
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
