package softserve.homework9;

// Anastasiya Didych

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DivisionTest {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int a, b;

        try{

            System.out.println("Input number: ");
            a = number.nextInt();

            System.out.println("Input number: ");
            b = number.nextInt();

            System.out.println("The result of division is: " + a / b);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero. Try again\n");
        }
        catch (InputMismatchException e){
            System.out.println("\n\nInput only integers. Try again\n");

        }

    }
}


