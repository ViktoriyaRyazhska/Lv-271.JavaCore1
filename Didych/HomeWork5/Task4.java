package softserve.homework5;

//Anastasiya Didych

import java.util.Locale;
import java.util.Scanner;

public class Task4 {

    public static double NumScan() {
        Scanner numbr = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Input next number: ");
        double Num = numbr.nextDouble();
        return Num;
    }
}

