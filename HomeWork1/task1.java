package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double p;
        double a;
        double r;
        r = Integer.parseInt(br.readLine());
        a = Math.PI * (r*r);
        p = Math.PI * 2 * r;
        System.out.println("Perimeter is " + p );
        System.out.println("Area is " + a);
    }
}
