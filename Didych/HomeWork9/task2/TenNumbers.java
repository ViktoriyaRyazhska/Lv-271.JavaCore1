package softserve.homework9.task2;

// Anastasiya Didych

import java.util.InputMismatchException;
import java.util.Scanner;

public class TenNumbers {

    static void readNumbers(int start, int end){

        Scanner number = new Scanner(System.in);
        int i = 0;

        try {
            while (i < 10) {
                System.out.println("Input number: ");
                int a = number.nextInt();
                i++;

                if (a > start && a < end) {
                    System.out.println("Number " + a + " is in the range [" + start + ":" + end + "]\n");
                }
            }
        }

        catch (InputMismatchException e){
            throw new InputMismatchException("Input only integers. Try again");
        }
    }
}
