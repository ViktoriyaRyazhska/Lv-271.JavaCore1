package softserve.homework5;

//Anastasiya Didych

import java.util.Arrays;

public class Task3Test {
    public static void main(String[] args) {
        int i;
        int arr[] = new int[5];

        for (i = 0; i < 5; i++) {
            arr[i] = Task3.InputFiveInt();
        }

        System.out.println(Arrays.toString(arr));

        Task3.SecondPositive(arr);

        Task3.Minimum(arr);

    }
}
