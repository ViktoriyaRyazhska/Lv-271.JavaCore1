package softserve.homework4.Taks1;

import java.util.Arrays;
import java.util.Scanner;

//Anastasiya Didych

public class Task_1B
{
    public static void main(String[] args)
    {

        Scanner number = new Scanner(System.in);
        System.out.println("Please, enter theer numbers : ");
        int t = number.nextInt();
        int r = number.nextInt();
        int y = number.nextInt();

        if (t > r){
            if (r > y){
                System.out.println("Max: " + t + ", " + "min: " + y);
            }else if (y > r && t > y){
                System.out.println("Max: " + t + ", " + "min: " + r);
            }else if (y > t){
                System.out.println("Max: " + y + ", " + "min: " + r);
            }
        }else if (r > y){
            if ( t > y){
                System.out.println("Max: " + r + ", " + "min: " + y);
            }else if(y > t && r > t){
                System.out.println("Max: " + r + ", " + "min: " + t);
            }
        }else if (y > t){
            if (t > r){
                System.out.println("Max: " + y + ", " + "min: " + r);
            }else if(y > t && r > t){
                System.out.println("Max: " + y + ", " + "min: " + t);

            }
        }

    }

}
