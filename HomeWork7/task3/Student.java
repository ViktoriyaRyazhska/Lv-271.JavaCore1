package HomeWork7.task3;

import java.util.Iterator;
import java.util.List;

public class Student {
	String name;
	int course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public Student() {
	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public static void printStudents(List<Student> students, Integer course) {
		Student st = new Student();
		for(Iterator<Student> iterator = students.iterator();iterator.hasNext();) {
			st = iterator.next();
			if (st.getCourse() == course) {
				System.out.println("Student of "+ course + " course: " + st.getName());
			}
		}

	}

}
