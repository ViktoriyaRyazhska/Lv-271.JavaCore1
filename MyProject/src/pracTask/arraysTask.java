package pracTask;

public class arraysTask {
	public static void main(String[] args) {
		int [] ar = {1,2,-3,-4,5,6,7,8,-9,10};
		
		int max = ar[0];
		int i = 0;
		
		while (i < ar.length) {
			
			if (ar[i] > max) {
				max = ar[i];
			}
			i++;
			
		}
		System.out.println("Max is " + max);
		
	}

}
