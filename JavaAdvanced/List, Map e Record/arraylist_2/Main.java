package arraylist_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import arraylist_1.Student;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(
				new Student("Luca", 15),
				new Student("Alessandra", 12),
				new Student("Marco", 12),
				new Student("Marcello", 17),
				new Student("Gianmarco", 15),
				new Student("Paola", 13),
				new Student("Vittoria", 14),
				new Student("Francesco", 14),
				new Student("Raffaele", 16),
				new Student("Michele", 18),
				new Student("Lorena", 18),
				new Student("Gabriele", 17)
				));
		for (Student student : students) {
			System.out.println(student);
		}
		students.sort(new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				if(student1.getName().equals(student2.getName())) {					
					return 0;
				}
				return student1.getName().compareToIgnoreCase(student2.getName())<0 ? -1 : 1;
			}
		});
		System.out.println("----------------");
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
