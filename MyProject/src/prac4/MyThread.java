package prac4;

public class MyThread extends Thread {
	
	private int pause;
	private String text;
	
	public MyThread(int pause, String text) {
		this.pause = pause;
		this.text = text;
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(pause);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(text);
		}

	}

}
