package pracTask;

public class amountOfNeg {
	public static void main (String[] args) {
		int [] ar = {1,2,-3,-4,5,6,7,8,-9,10};
		
		int amount1 = 0;
		int amount = 0;
		for (int a : ar) {
			if (a < 0 && a <= 10) { amount++; }
		}
		
		for (int b : ar) {
			if (b > 0 && b <=10) {amount1++; }
		}
		
		System.out.println("Amount of negative numbers = " + amount);
		System.out.println("Amount of poss nubmers = " + amount1);
		System.out.println(" ");
		
		if (amount > amount1) {
			System.out.println("negative numbers more than poss");
		}
		else {
			System.out.println("poss nubmers more than negative");
		}

		
	}

}
