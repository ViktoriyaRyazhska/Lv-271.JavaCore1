package lesson9;

import java.util.Scanner;

/**
 * Created by adidytc on 25.10.2017.
 */
public class Task1 {


    public static int squareRectangle(int a, int b) throws MyInputException {
        if (a > 0 && b > 0) {
            int sqrtRect = a * b;
            System.out.println("The square is " + sqrtRect);
            return sqrtRect;
        }else{
            throw new MyInputException("The inputet value is invalid");
        }
    }
}
