package HomeWork6;

public class Swallow extends FlyinigBird {

	public Swallow(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	public void fly() {
		System.out.println("Swallow also flying");
	}

	@Override
	public String toString() {
		return "Swallow [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

}
