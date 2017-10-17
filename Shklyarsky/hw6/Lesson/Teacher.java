package Lesson;

public class Teacher extends Staff {

	private String type = "teacher";
	private int sal = 5000;

	public int salary() {
		return sal;
	}

	public String print() {
		return "I am a" + type;
	}

}
