package HomeWork2;

//Anastasiya Didych

public class Person
{
    //two private fields
    private String name;
    private int birthYear;

    //properties for access
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }

    public int getBirthYear()
    {
        return birthYear;
    }


    //constructors
    public Person(){}
    public Person(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }

    //method age
    public int age()
    {
     return (2017 - birthYear);
    }

    //method input
    public void input(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }

    //method output
    public String output()
    {
        return getName() + " " + getBirthYear();
    }

    //method changeName
    public void changeName(String name)
    {
        this.name = name;
    }


}
