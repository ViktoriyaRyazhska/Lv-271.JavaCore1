package softserve.homework5;

//Anastasiya Didych

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner mnth = new Scanner(System.in);

        System.out.println("Please, enter the number of month:");

        int m = mnth.nextInt();

        //варіант 1
        for (int i = m; m < month.length;){

            System.out.println(month[i -1]);
            break;


        /*варіант 2
        for (int i = 0; i < month.length;)
        {
            for (int j = m; m < month.length;)
            {
                System.out.println(month[j-1]);
                break;
            }
            break;
            */
        }

    }
}
