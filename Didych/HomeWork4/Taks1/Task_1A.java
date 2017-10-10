package ob_10_10_2017;

import java.util.Locale;
import java.util.Scanner;

//Anastasiya Didych
public class Task_1A
{
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Please, enter theer numbers with a floating point in range [-5;5]: ");
        float a = number.nextFloat();
        float b = number.nextFloat();
        float c = number.nextFloat();
        if (a >= -5 && a <= 5)
        {
            System.out.println("Value " + a + " is in the range [-5;5]");
        }
        if (b >= -5 && b <= 5)
        {
            System.out.println("Value " + b + " is in the range [-5;5]");
        }
        if (c >= -5 && c <= 5)
        {
            System.out.println("Value " + c + "is in the range [-5;5]");
        }
    }
}

