package prac4;

public class Practice2 {
	
	public static void main(String[] args) throws InterruptedException  {
		Thread t1 = new MyThread(200,"Hello,world");
		Thread t2 = new MyThread(300, "Peace in the peace");
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("My name is ...");

	}

}
