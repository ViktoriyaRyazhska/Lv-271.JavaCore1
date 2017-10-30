package lesson10;

/**
 * Created by adidytc on 30.10.2017.
 */
public class HelloWordTest {
    public static void main(String[] args) throws InterruptedException {

        HelloWord hw1 = new HelloWord("Hello, word", 200);
        HelloWord hw2 = new HelloWord("Peace in the peace", 300);
        hw1.start();
        hw2.start();
        hw1.join();
        hw2.join();
        System.out.println("My name is Anastasiya");
    }
}
