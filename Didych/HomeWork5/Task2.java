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
        int count = 0;
        int product = 1;
        for (i = 0; i < 10; i++) {
            System.out.println("Please, input a number: ");
            num[i] = intNum.nextInt();
        }
        for (i = 0; i < 10; i++)
        {
            if (num[i] > 0 && i < 5)
            {
                sum += num[i];
                count++;
            }
            else if (i >= 5)
            {
                product *= num[i];
            }
        }
        System.out.println(count);
        if (count==5)
        {
            System.out.println("The sum of first 5 positive elements is: " + sum);
        }
        else
        {
            System.out.println("The product of last 5 elements is: " + product);
        }
    }
}
