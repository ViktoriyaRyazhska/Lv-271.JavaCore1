package Lesson4;

//Anastasiya Didych

import com.sun.org.apache.xpath.internal.SourceTree;

public class ProductTest
{
    public static void main(String[] args)
    {
        Product pr1 = new Product("Product1",1.5, 2);
        Product pr2 = new Product("Product2",2.0, 4);
        Product pr3 = new Product("Product3",2.5, 6);
        Product pr4 = new Product("Product4",3.0, 8);

        if (pr1.price >= pr2.price && pr2.price > pr3.price && pr3.price>pr4.price)
            System.out.println(pr1.name + ", " + pr1.quantity);
        if (pr2.price > pr1.price && pr2.price>pr3.price && pr2.price > pr4.price)
            System.out.println(pr2.name + ", " + pr2.quantity);
        if (pr3.price >pr1.price && pr3.price > pr2.price && pr3.price > pr4.price)
            System.out.println(pr3.name + ", "+ pr3.quantity);
        if (pr4.price > pr1.price && pr4.price > pr2.price && pr4.price > pr3.price)
            System.out.println(pr4.name +", "+ pr4.quantity);

        if (pr1.quantity > pr2.quantity && pr1.quantity > pr3.quantity && pr1.quantity > pr4.quantity)
            System.out.println(pr1.name);
        if (pr2.quantity > pr1.quantity && pr2.quantity > pr3.quantity && pr2.quantity > pr4.quantity)
            System.out.println(pr2.name);
        if (pr3.quantity > pr1.quantity && pr3.quantity > pr2.quantity && pr3.quantity > pr4.quantity)
            System.out.println(pr3.name);
        if (pr4.quantity > pr1.quantity && pr4.quantity > pr2.quantity && pr4.quantity > pr3.quantity)
            System.out.println(pr4.name);
    }
}