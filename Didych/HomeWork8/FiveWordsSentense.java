package softserve.homework8;

// Anastasiya Didych

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FiveWordsSentense {
    public static void main(String[] args) {

        String str1 = new String("Enter sentence of five words");

        /* or
        Scanner word = new Scanner(System.in);
        System.out.println("input a five word sentence: ");
        String str1 = word.nextLine();*/
        //but then I need to white a "try-cath" to cath the InputMismatchException


        String array[] = str1.split(" ");

        System.out.println(Arrays.toString(array));

        int position = 0;
        int max = array[0].length();
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
                position = i;

            }
            if (i == 1) {
                System.out.println("The second word in the sentence is: '" + array[i] + "'");

            }
        }
        System.out.println("The longest word in the sentens is: '" + array[position] + "'");
        System.out.println("The word '" + array[position] + "' consist of " + max + " letters");
    }
}