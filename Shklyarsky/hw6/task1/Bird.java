package hw6.task1;

public abstract class Bird {

	String feathers;
	boolean layEggs;

	public abstract String fly();

	public Bird(String feathers, boolean layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	@Override
	public String toString() {
		return "Bird "+ feathers+ " lay eggs = "+layEggs+" and " ;
	}

}
