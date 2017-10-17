package HomeWork6;

public class Eagle extends FlyinigBird {

	public Eagle(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	public void fly() {
		System.out.println("Eagle flying");
	}

	@Override
	public String toString() {
		return "Eagle [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

}
