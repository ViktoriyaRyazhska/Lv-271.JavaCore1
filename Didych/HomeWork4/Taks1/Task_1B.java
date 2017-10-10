package ob_10_10_2017;

import java.util.Arrays;
import java.util.Scanner;

//Anastasiya Didych

public class Task_1B
{
    public static void main(String[] args)
    {
        int[] arr = new int[3];
        Scanner number = new Scanner(System.in);
        System.out.println("Please, enter theer numbers : ");
        int t = number.nextInt();
        int r = number.nextInt();
        int y = number.nextInt();
        arr[0] = t;
        arr[1] = r;
        arr[2] = y;
        Arrays.sort(arr);
        System.out.println("Max: " + arr[2] + ", " + "min: " + arr[0] );
    }
}
