package HomeWork6;

public class Chicken extends NonFlyingBird {

	public Chicken(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	public void fly() {
		System.out.println("Chickens cant fly :(");
	}

	@Override
	public String toString() {
		return "Chicken [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

}
