public class DogTask {

	public static void main(String[] args) {

		Dog[] haf = new Dog[3];
		haf[0] = new Dog("Rory", Breed.Aidi, 2);
		haf[1] = new Dog("Arya", Breed.Bulldog, 1);
		haf[2] = new Dog("Alex", Breed.Husky, 4);

		int count = 0;
		int old = haf[0].getAge();
		String oldest = null;

		for (int i = 0; i < haf.length - 1; i++) {

			for (int j = i + 1; j < haf.length; j++) {

				if (haf[i].getName().equals(haf[j].getName())) {
					count++;
				}
			}
		}

		if (count == 0)
			System.out.println("all dogs have unique names");

		if (count != 0) {
			System.out.println("some dogs have same names");
		}

		for (int i = 0; i < haf.length; i++) {
			if (old < haf[i].getAge()) {
				oldest = haf[i].toString();
			}
		}
		System.out.println(oldest);

	}
}
