package hw7;

import java.util.ArrayList;
import java.util.List;

import static hw7.Student.printStudent;

public class Task3 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Vasya", 2));
		students.add(new Student("Oksana", 3));
		students.add(new Student("Mykola", 4));
		students.add(new Student("Oleh", 3));
		students.add(new Student("Oleksiy", 5));

		List<Student> list1 = new ArrayList<>();
		list1.addAll(students);
		printStudent(list1, 2);

		System.out.println();

		List<Student> list2 = new ArrayList<Student>();
		list2.addAll(students);
		System.out.println("By name:");

		list2.sort(new Student.NameComparator());
		for (Student student : list2) {
			System.out.println(student);
		}

		System.out.println();

		List<Student> list3 = new ArrayList<Student>();
		list3.addAll(students);
		System.out.println("By course:");
		list3.sort(new Student.CourseComparator());
		for (Student student : list3) {
			System.out.println(student);
		}
	}

}
