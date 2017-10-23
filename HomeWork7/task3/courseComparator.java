package HomeWork7.task3;

import java.util.Comparator;

public class courseComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {

			return o1.course - o2.course;
		}

	}