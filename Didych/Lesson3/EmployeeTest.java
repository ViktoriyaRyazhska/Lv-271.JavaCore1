package Lesson3;

//Anastasiya Didych

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Oles", 1.2, 10);
        Employee e2 = new Employee("Nastya", 1.1, 8);
        Employee e3 = new Employee("Oleg",0.9,6);
        System.out.println(e1.getSalary() + e2.getSalary() + e3.getSalary());
    }

}
