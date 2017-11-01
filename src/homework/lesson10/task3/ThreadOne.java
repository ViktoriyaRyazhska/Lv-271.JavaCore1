package homework.lesson10.task3;

public class ThreadOne implements Runnable {

	public ThreadOne(String name) {
		super();
	}

	@Override
	public void run() {
        ThreadTwo twoRun = new ThreadTwo("Two thread");
        Thread two = new Thread(twoRun);
		two.start();
	}

}
