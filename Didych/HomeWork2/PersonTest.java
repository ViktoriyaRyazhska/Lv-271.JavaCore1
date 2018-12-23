package HomeWork2;

//Anastasiya Didych

public class PersonTest
{
    public static void main(String[] args)
    {

        Person P1 = new Person("Nastya", 1996);
        Person P2 = new Person("Oles", 1991);
        Person P3 = new Person("Bogdan", 2001);

        Person P4 = new Person();
        P4.setName("Lilya");
        P4.setBirthYear(1997);

        Person P5 = new Person();
        P5.setName("Oleg");
        P5.setBirthYear(1992);
    }
}
