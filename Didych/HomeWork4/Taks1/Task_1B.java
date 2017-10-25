package softserve.homework4.Taks1;

import java.util.Arrays;
import java.util.Scanner;

//Anastasiya Didych

public class Task_1B {
    public static void main(String[] args) {


        Scanner number = new Scanner(System.in);
        System.out.println("Please, input three numbers: ");
        int t = number.nextInt();
        int max = t;
        int min = t;
        int n = number.nextInt();
        int k = number.nextInt();
        if (n > max){
            max = n;
        }
        if (n < min){
            min = n;
        }
        if (k > max){
            max = k;
        }
        if (k < min){
            min = k;
        }
        System.out.println("max: " + max + ", min: " + min);


    }
}
