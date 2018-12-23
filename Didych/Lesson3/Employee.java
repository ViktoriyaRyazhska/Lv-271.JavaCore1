package Lesson3;

//Anastasiya Didych

public class Employee
{
    private String Name;
    private double Rate;
    private double Hours;
    private static double totalSum;

    public static double getTotalSum()
    {
        return totalSum;
    }

    public static void setTotalSum(double totalSum)
    {
        Employee.totalSum = totalSum;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public double getRate()
    {
        return Rate;
    }

    public void setRate(double rate)
    {
        Rate = rate;
    }

    public double getHours()
    {
        return Hours;
    }

    public void setHours(double hours)
    {
        Hours = hours;
    }

    //constructors
    public Employee()
    {
    }

    public Employee(String name, double rate)
    {
        this.Name = name;
        this.Rate = rate;

    }

    public Employee(String name, double rate, double hours)
    {
        this.Name = name;
        this.Rate = rate;
        this.Hours = hours;

    }
    public double getSalary()
    {
        return Rate*Hours;
    }
    public String toString()
    {
        return ("Name: " + getName() + "Rate: " + getRate() + "Hours: " + getHours());
    }
    public void changeRate(double Rate)
    {
        this.Rate = Rate;
    }
    public double bonuses()
    {
        return 0.1*getSalary();
    }


}