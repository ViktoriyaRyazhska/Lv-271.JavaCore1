package lesson9;

import java.util.Scanner;

/**
 * Created by adidytc on 25.10.2017.
 */
public class Task1_Test {
    public static void main(String[] args) {
        System.out.println("Input two values: ");
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        try {
            Task1.squareRectangle(a, b);
        } catch (MyInputException e) {
            e.printStackTrace();
        }
        System.out.println("Everything works!");


    }
}
