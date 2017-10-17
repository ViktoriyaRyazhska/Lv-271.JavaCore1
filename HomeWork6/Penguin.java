package HomeWork6;

public class Penguin extends NonFlyingBird {

	public Penguin(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	public void fly() {
		System.out.println("Penguins cant fly :(");
	}

	@Override
	public String toString() {
		return "Penguin [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

}
