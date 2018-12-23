package Lesson4;

//Anastasiya Didych

import java.util.Scanner;

public class TheeNumbers
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner numbers = new Scanner(System.in);
        System.out.println("Please, enter thee numbers: ");
        int a = numbers.nextInt();
        int b = numbers.nextInt();
        int c = numbers.nextInt();
        if (a % 2 == 1)
        {
            count ++;
        }
        if (b % 2 == 1)
        {
            count ++;
        }
        if (c % 2 == 1)
        {
            count ++;
        }
        if (count == 1)
        {
            System.out.println("there is  " + count + " odd number");

        }
        else
        {
            System.out.println("there are " + count + " odd numbers");
        }
    }
}
