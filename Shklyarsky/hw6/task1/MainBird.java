package hw6.task1;

public class MainBird {

	public static void main(String[] args) {

		Bird b[] = new Bird[4];
		b[0] = new Eagle("eag",true);
		b[1] = new Swallow("Swal",false);
		b[2] = new Penguin("Peng",true);
		b[3] = new Chicken("Kfc",true);
		
		for(int i = 0; i<b.length;i++) {
			System.out.println(b[i].toString()+b[i].fly());
					
		}
		
		

		
	}

}
