package softserve.lesson6;

// Anastasiya Didych

import java.util.Arrays;

public class AnimalTest{
    public static void main(String[] args) {
        Cat cat1 = new Cat("meeeeyyy" , "fish");
        Cat cat2 = new Cat("miay", "meat");
        Dog dog1 = new Dog("woof", "bones");
        Dog dog2 = new Dog("wooof - woof", "meat");
        Animal animal[] = {cat1, cat2, dog1, dog2};
        for (int i = 0; i < animal.length;i++){
            System.out.println("The animal says " + animal[i].voice() + " and eats " + animal[i].feed());
        }
    }
}
