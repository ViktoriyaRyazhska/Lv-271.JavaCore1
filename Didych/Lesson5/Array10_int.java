package Lesson5Pract;

//Anastasiya Didych

public class Array10_int
{
    public static void main(String[] args)
    {
        int[] arr = {1, -1, 2, -2, 3, -3, 4, -4, 5, -5 };
        int sump = 0, sumn = 0;
        int amountn = 0, amountp = 0;
        int imax = arr[0];
        int imin = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {sump +=arr[i];}
            else { sumn += arr[i];}

            if (arr[i]<0) {amountn +=1;}
            if (arr[i]>0) {amountp +=1;}

            if (arr[i]> imax) {imax = arr[i];}

            if (arr[i] < imin) {imin = arr[i];}
        }
        System.out.println("The sum of positive numbers is: " + sump);
        System.out.println("The sum of negativa numbers is: " + sumn);
        System.out.println("The amount of negative numbers is: " + amountn);
        System.out.println("The biggest number is: " + imax);
        System.out.println("The smallest number is: " + imin);

        if (amountn > amountp) {
            System.out.println("There are more negative numbers");
        }
        else if (amountp > amountn) {
            System.out.println("There are more positive numbers");
        }
        else {
            System.out.println("The number of positive and negative integers is the same");
        }
    }


}
