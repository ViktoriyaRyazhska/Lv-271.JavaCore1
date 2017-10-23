package practicaltask;

//Anastasiya Didych

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
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
