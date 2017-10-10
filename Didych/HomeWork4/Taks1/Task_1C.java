package ob_10_10_2017;

import java.util.Scanner;

//Anastasiya Didych

public class Task_1C
{
    public static void main(String[] args)
    {
        Scanner error = new Scanner(System.in);

        System.out.println("Please, enter the number of error: ");
        int e = error.nextInt();
        switch (e)
        {
            case 400:
                System.out.println(HTTPError.Bad_Request);
                break;
            case 401:
                System.out.println(HTTPError.Unauthorized);
                break;
            case 402:
                System.out.println(HTTPError.Payment_Required);
                break;
            case 403:
                System.out.println(HTTPError.Forbidden);
                break;
            case 404:
                System.out.println(HTTPError.Not_found);
                break;
            default:
                System.out.println("There is no problem with this number!");
                break;
        }
    }

}
