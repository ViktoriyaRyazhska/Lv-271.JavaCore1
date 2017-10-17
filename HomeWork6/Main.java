package HomeWork6;

public class Main {
	public static void main(String[] args) {
		Bird[] b = new Bird[4];

		b[0] = new Eagle("Eagles have feathers", "Eagle have eggs");
		b[1] = new Swallow("Swallows have feathers", "Swallow have eggs");
		b[2] = new Penguin("Penguins don't have feathers", "Penguins  have eggs");
		b[3] = new Chicken("Chickens have feathers", "Chickens  have eggs");

		b[0].fly();
		b[1].fly();
		b[2].fly();
		b[3].fly();
		System.out.println("");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
