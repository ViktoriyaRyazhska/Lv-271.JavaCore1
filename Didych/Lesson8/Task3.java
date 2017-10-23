package practicaltask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by adidytc on 23.10.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        String user1 = "Ana5ta5iya";
        String user2 = "Oles_96";
        String user3 = "Natal_1a";
        String user4 = "Vo_Lo_Dia";
        String user5 = "0lenka";

        String arr[] = new String[5];
        arr[0] = user1;
        arr[1] = user2;
        arr[2] = user3;
        arr[3] = user4;
        arr[4] = user5;
        for (int i=0; i<arr.length; i++){
            valid(arr[i]);
        }




    }
    public static void valid(String name){

        String pattern = "[a-zA-Z_0-9]{3,15}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name);
        if (m.matches()){
            System.out.println("Users name " + name + " is valid");
        } else{
            System.out.println("Users name " + name + " is invalid");
        }

    }

}
