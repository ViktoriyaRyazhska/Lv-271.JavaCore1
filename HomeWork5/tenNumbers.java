package HomeWork5;

public class tenNumbers {
	public static void main(String[] args) {

		int[] n = { 20, 2, 3, -4, -15, -6, 7, 88, 9, -10 };
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			if (n[i] >= 0) {
				sum += n[i];
			}
		}
		System.out.println("The sum of first possitive elements: " + sum);
	}

}
