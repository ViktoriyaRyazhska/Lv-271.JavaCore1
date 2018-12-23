package softserve.homework5;

//Anastasiya Didych

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //
        Scanner intNum = new Scanner(System.in);
        int num[] = new int[10];
        int i;
        int sum = 0;
        boolean counter = true;
        int product = 1;
        for (i = 0; i < 10; i++) {
            System.out.println("Please, input a number: ");
            num[i] = intNum.nextInt();
        }
        for (i = 0; i < 5; i++) {
            if (num[i] > 0) {
                sum += num[i];

            } else {
                counter = false;
                break;
            }
        }

        if (!counter) {
            for (i = 5; i < num.length; i++) {

                product *= num[i];
            }
            System.out.println("\nThe product of last 5 elements is: " + product);
        } else {

            System.out.println("\nThe sum of first 5 positive elements is: " + sum);
        }
    }
}
