package Lesson;

public class Student extends Person {

	private String type = "student";
	
	public String print() {
		return "I am a" + type;
	}
	
}
