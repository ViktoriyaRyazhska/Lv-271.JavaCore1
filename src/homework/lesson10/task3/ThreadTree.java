package homework.lesson10.task3;

public class ThreadTree implements Runnable {

	public ThreadTree(String name) {
		super();
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread number three");
		}

	}

}
