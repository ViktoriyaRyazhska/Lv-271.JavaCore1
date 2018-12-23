package softserve.homework6.task2;

// Anastasiya Didych

import java.util.Arrays;

public class PayTest {
    public static void main(String[] args) {

        SalariedEmployee s1 = new SalariedEmployee("Ivan", "Rohachev", "111-111-111", 18.2, 49);
        SalariedEmployee s2 = new SalariedEmployee("Olya", "Hrobovchuk", "222-222-222", 22.0, 34);
        ContractEmployee c1 = new ContractEmployee("Orest", "Ivanchukevuch", "34558-12", 920);
        ContractEmployee c2 = new ContractEmployee("Nataliya", "Nazarzhuck", "94348-01", 1080);
        Pay employee[] = {s1, s2, c1, c2};

        for (int i = 0; i < employee.length; i++) {
            employee[i].calculatePay();
        }

        System.out.println(Arrays.toString(employee));
    }
}
