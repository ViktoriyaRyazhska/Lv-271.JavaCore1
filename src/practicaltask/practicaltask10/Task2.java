package practicaltask.practicaltask10;

public class Task2 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread first = new Thread(mt, "MyThead");
		MyThread2 mt2 = new MyThread2();
		Thread second = new Thread(mt2, "MyThread2");
		second.start();
		first.start();
		try {
			first.join();
			second.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("My name is Jhon");
	}
}
