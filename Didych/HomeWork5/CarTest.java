package softserve.homework5;

//Anastasiya Didych

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("Sedan", 1998, 2);
        Car car2 = new Car("Hatchback", 2011, 3);
        Car car3 = new Car("Truck", 2003, 4);
        Car car4 = new Car("Minivan", 2000, 5);

        Car car[] = new Car[4];
        car[0] = car1;
        car[1] = car2;
        car[2] = car3;
        car[3] = car4;

        Car.InputCarYear(car);

        Car.SortedList(car);
    }
}