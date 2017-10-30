package lesson10;

/**
 * Created by adidytc on 30.10.2017.
 */
public class HelloWord extends Thread {

    private String message;
    private int pause;

    public HelloWord(String message, int pause){
        this.pause = pause;
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
            System.out.println(message);
        }
    }
}