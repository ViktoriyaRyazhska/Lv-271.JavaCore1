package Lesson;

public class Cleaner extends Staff {

	private String type = "cleaner";
	private int sal = 3500;
	
	public String print() {
		return "I am a" + type;
	}

	public int salary() {
		return sal;
	}

}
