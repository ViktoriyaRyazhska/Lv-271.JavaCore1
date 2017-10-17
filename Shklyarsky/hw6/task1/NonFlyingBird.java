package hw6.task1;

public class NonFlyingBird extends Bird {

	public String fly() {
		return "can't fly";
	}

	public NonFlyingBird(String feathers, boolean layEggs) {
		super(feathers, layEggs);

	}

}
