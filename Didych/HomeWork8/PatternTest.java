package softserve.homework8;

// Anastasiya Didych

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {

        String pattern = "[$0-9]+[.][0-9]{2}";
        Pattern myPattern = Pattern.compile(pattern);

//        or
//        Scanner line = new Scanner(System.in);
//        System.out.println("Input the value in this format $0.00: ");
//        String currency = line.nextLine();
//
        String currency = "$45.55";

        Matcher mather = myPattern.matcher(currency);
        if (mather.matches()){
            System.out.println("The format is correct! " + currency);
        }
        else{
            System.out.println("The wrong input. Try again");
        }

    }
}
