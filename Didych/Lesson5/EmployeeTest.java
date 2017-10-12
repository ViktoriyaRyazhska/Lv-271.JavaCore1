package Lesson5Pract;

//Anastasiya Didych

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest
{
    public static void main(String[] args)
    {

        int i, j;
        Employee e1 = new Employee("Roman", 1, 8000.0);
        Employee e2 = new Employee("Nastya", 1, 3000.0);
        Employee e3 = new Employee("Oles", 3, 5000.0);
        Employee e4 = new Employee("Marta", 3, 4000.0);
        Employee e5 = new Employee("Taras", 19, 1000.5);
        Scanner departNumber = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Please, enter the number of department [1/2/3/19]: ");
        int depNum = departNumber.nextInt();

        //creating an array of employees
        Employee Emp[] = {e1, e2, e3, e4, e5};



        //sorting by department number

        for (i = 0; i < Emp.length; i++)
        {
            if (depNum == Emp[i].getDep_num())
            {
                System.out.println("In department №" + Emp[i].getDep_num() + " works " + Emp[i]);
            }
        }

        // sorting by salary
        for (i = 0; i < Emp.length - 1; i++)
        {
            for (j = i+1; j < Emp.length; j++)
            {
                if( Emp[i].getSalary() < Emp[j].getSalary())
                {
                    Employee tmp = Emp[i];
                    Emp[i] = Emp[j];
                    Emp[j] = tmp;
                }
            }
        }
        System.out.println("Sorted by salary list looks that like:\n" + Arrays.toString(Emp));
    }
}
