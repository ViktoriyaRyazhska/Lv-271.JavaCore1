package Lesson4;

//Anastasiya Didych

import java.util.Scanner;

public class DayOfWeek
{
    public static void main(String[] args)
    {
        Scanner numberOfDay = new Scanner(System.in);
        System.out.println("Please, enter the number of day");
        int a = numberOfDay.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("It's Monday/Понеділок/Montag");
                break;
            case 2:
                System.out.println("It's Tuesday/Вівторок/Dienstag");
                break;
            case 3:
                System.out.println("It's Wednesday/Середа/Mittwoch");
                break;
            case 4:
                System.out.println("It's Thursday/Четвер/Donnerstag");
                break;
            case 5:
                System.out.println("It's Friday/П’ятниця/Freitag");
                break;
            case 6:
                System.out.println("It's Saturday/Субота/Samstag");
                break;
            case 7:
                System.out.println("It's Sunday/Неділя/Sontag");
                break;
            default:
                System.out.println("There is no day with this number!");
        }
    }
}
