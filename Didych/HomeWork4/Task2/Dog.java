package ob_10_10_2017;

import java.util.Objects;

//Anastasiya Didych
public class Dog
{
    String name, breed;
    double age;

    public Dog(String name, String breed, double age)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

}

