package lesson9.task2;

import java.util.Arrays;

/**
 * Created by adidytc on 25.10.2017.
 */
public class PlantTest {
    public static void main(String[] args) {
        Plant plnt1 = new Plant(2, "Anemones", "blue");
        Plant plnt2 = new Plant(10, "Calendulas", "yellow");
        Plant plnt3 = new Plant(3, "Daisyes", "white");
        Plant plnt4 = new Plant(5, "Crocuses", "pink");
        Plant plnt5 = new Plant(29, "Roses", "red");
        Plant plants[] = {plnt1, plnt2, plnt3, plnt4, plnt5};

        System.out.println(Arrays.toString(plants));
    }


}
