package HomeWork5;

public class fiveNumbers {

	public static int findPosition(int[] Massive, int needFind) {
		for (int i = 0; i < Massive.length; i++) {
			if (needFind == Massive[i]) {
				return i + 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] f = { 22, -5, -6, -8, 10 };
		int min = f[0];

		for (int i = 0; i < f.length; i++) {
			if (f[i] < min) {
				min = f[i];

			}

		}

		System.out.println("Minimum in the array: " + min);
		System.out.println("Position this number in the array: " + findPosition(f, min));
		System.out.println("");
		System.out.println("Possitive numbers in the array: ");

		for (int p : f) {
			if (p > 0) {
				System.out.println(p);
			}

		}
		System.out.println("Position of second possitive number: " + findPosition(f, 10));

	}

}
