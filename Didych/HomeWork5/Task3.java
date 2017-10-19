package softserve.homework5;

//Anastasiya Didych

import java.util.Scanner;

public class Task3 {
    public static int InputFiveInt(){
        Scanner intNum = new Scanner(System.in);
        System.out.println("Input next number: ");
        int num = intNum.nextInt();
        return num;
    }

    public static int Minimum(int[] arr){
        int i = 0;
        int arrMin = arr[0];
        int iarrMin = 0;
        while (i < arr.length){
            if(arr[i] < arrMin) {
                arrMin = arr[i];
                iarrMin = i;
            }
            i++;
        }
        System.out.println("The minimum is: " + arrMin);
        System.out.println("The minimum is at " + (iarrMin +1) + " position");
        return i;
    }

    public static int SecondPositive (int arr[]){
        int i = 0;
        int count = 0;
        int firstPos = 0;
        for(i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                count++;
            }
            if (count == 2){
                System.out.println("The second positive number is " + arr[i] + " and his position is " + (i+1));
                break;
            }

        }
        return count++;
    }
}
