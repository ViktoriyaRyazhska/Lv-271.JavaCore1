package practicaltask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by adidytc on 23.10.2017.
 */
public class Task3Test {
    public static void main(String[] args) {
        String arr[] = new String[5];
        arr[0] = "Ana5ta5iya";
        arr[1] = "Oles_9,6";
        arr[2] = "Natal_1a";
        arr[3] = "Vo_Lo_Dia";
        arr[4] = "0le^nka";
        for (int i=0; i<arr.length; i++){
            Task3.valid(arr[i]);
        }
    }
}
