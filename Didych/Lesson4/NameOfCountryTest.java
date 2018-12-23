package Lesson4;

//Anastasiya Didych

import java.util.Scanner;

public class NameOfCountryTest
{
    public static void main(String[] args)
    {
        String Country;
        Scanner country = new Scanner(System.in);
        System.out.println("Please, enter the name of country: ");
        Country = country.nextLine();
        switch (Country.toLowerCase())
        {
            case "ukraine":
                System.out.println(NameOfContinent.Europe);
                break;
            case "america":
                System.out.println(NameOfContinent.North_America);
                break;
            case "brazil":
                System.out.println(NameOfContinent.South_America);
                break;
            case "nigeria":
                System.out.println(NameOfContinent.Africa);
                break;
            case "australia":
                System.out.println(NameOfContinent.Australia);
                break;

        }
    }
}
