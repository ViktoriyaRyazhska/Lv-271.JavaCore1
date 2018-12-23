package softserve.homework5;

//Anastasiya Didych

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    private final String type;
    private final int year;
    private final int capacity;

    //getter for year
    public int getYear() {
        return year;
    }

    //tostring
    @Override
    public String toString() {
        return type + ", " + year + ", " + capacity;
    }

    //getter for type
    public String getType() {
        return type;
    }

    //constructor for car object
    public Car(String type, int year, int capacity) {
        this.type = type;
        this.year = year;
        this.capacity = capacity;
    }

    //certain model year
    public static int InputCarYear(Car car[]) {
        Scanner year = new Scanner(System.in);
        System.out.println("Please, input car year: ");
        int CarYear = year.nextInt();
        for (int i = 0; i < car.length; i++) {
            if (CarYear == car[i].getYear()) {
                System.out.println("Cars, that where collected in the " + CarYear + " year: " + car[i].getType());
            }
        }
        return CarYear;
    }

    //method for ordered by year list
    public static int SortedList(Car car[]){
        for (int i = 0; i < car.length - 1; i++)
        {
            for(int j = i +1; j < car.length; j++)
            {
                if (car[i].getYear() > car[j].getYear()){
                    Car tmp = car[i];
                    car[i]=car[j];
                    car[j]= tmp;

                }
            }
        }
        System.out.println("Sorted by year car list: " + Arrays.toString(car));
        return car[1].getYear();
    }
}
