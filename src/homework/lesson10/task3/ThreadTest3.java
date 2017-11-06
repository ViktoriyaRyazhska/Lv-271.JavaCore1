package homework.lesson10.task3;

public class ThreadTest3 {

	public static void main(String[] args) {
		ThreadOne oneRun = new ThreadOne("Thread one");
		Thread one = new Thread(oneRun);
		one.start();
		
	}

}
