package lesson10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by adidytc on 30.10.2017.
 */
public class ReadContextTest {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = null;
        String str = null;
        int count = 0;
        ArrayList<String> array = new ArrayList();
        reader = new BufferedReader(new FileReader("D:\\Didych\\itacademyprojects\\src\\lesson10\\file.txt"));
        while ((str = reader.readLine()) != null){
            array.add(str);
            count ++;
        }
        for(count = 0; count < array.size(); count++){
         array.get(count).length();
        }
        System.out.println(array.get(count));



//        System.out.println(array);
    }
}
