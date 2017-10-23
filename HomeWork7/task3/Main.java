package HomeWork7.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main extends Student {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Mike", 5));
		students.add(new Student("Vitalii", 5));
		students.add(new Student("John", 1));
		students.add(new Student("Alex", 3));
		students.add(new Student("Jack", 2));

		System.out.println("LIST OF STUDENTS: ");
		for (Student h : students) {
			System.out.println(h);
		}
		System.out.println("");
		System.out.println("STUDENTS SORTED BY NAME: ");
		students.sort(new nameComparator());
		for (Student n : students) {
			System.out.println(n);
		}
		System.out.println("");
		System.out.println("STUDENTS SORTED BY COURSE: ");

		students.sort(new courseComparator());
		for (Student c : students) {
			System.out.println(c);
		}
		System.out.println("");
		
		printStudents(students,5);
		System.out.println("");
		printStudents(students,3);
		
		
		
	}

}
