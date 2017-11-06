package homework.lesson10.task3;

public class ThreadTwo implements Runnable {

	public ThreadTwo(String name) {
		super();
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
		ThreadTree threeRun = new ThreadTree("Three  thread");
		Thread three = new Thread(threeRun);
		three.start();

	}

}
