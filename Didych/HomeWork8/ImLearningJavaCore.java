package softserve.homework8;

// Anastasiya Didych


import java.util.Arrays;
import java.util.Scanner;

public class ImLearningJavaCore {
    public static void main(String[] args) {

        String str1 = new String("I'm   learning     Java       Core");

//        or
//        Scanner line = new Scanner(System.in);
//        System.out.println("Please, input a sentence: ");
//        String str1 = line.nextLine();

        String array[] = str1.split("\\s+");

        String outputString = String.join(" ", array);
        System.out.println(outputString);
    }
}
