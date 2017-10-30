package lesson10;

/**
 * Created by adidytc on 30.10.2017.
 */
public class IStudyJava extends Thread{


    @Override
    public void run() {
        for(int i = 0; i < 10; i++){

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
            System.out.println("I study Java");
        }
    }
}
