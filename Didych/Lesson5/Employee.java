package Lesson5Pract;

//Anastasiya Didych

public class Employee
{
    public final String name;

    public double getSalary()
    {
        return salary;
    }

    public int getDep_num()
    {
        return dep_num;
    }

    public final int dep_num;
    public final double salary;

    public String getName()
    {
        return name;
    }

    public  Employee(String name, int dep_num, double salary)
    {
        this.name = name;
        this.dep_num = dep_num;
        this.salary = salary;
    }
    public String toString()
    {
        return (getName() + ", " + getDep_num() + ", " + getSalary());
    }
}
