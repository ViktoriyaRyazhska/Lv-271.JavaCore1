package softserve.homework5;

//Anastasiya Didych


public class Task4_Test {
    public static void main(String[] args) {

        double product = 1;
        double n;
        while ((n = Task4.NumScan())>= 0) {
            product *= n;
        }

        System.out.println("The product is: " + product);


    }
}

