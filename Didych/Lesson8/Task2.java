package practicaltask;

/**
 * Created by adidytc on 23.10.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        String str1 = "Didych Anastasiya Yuriyivna";
        String NameArr[] =str1.split(" ");
        String surmname = NameArr[0];
        String name = NameArr[1];
        String fathername = NameArr[2];

        System.out.println(surmname + " " + name.charAt(0) + "." + fathername.charAt(0) + ".");
        System.out.println(name);
        System.out.println(name +", " +  fathername + ", " + surmname);
    }
}
