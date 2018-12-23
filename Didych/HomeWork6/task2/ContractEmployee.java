package softserve.homework6.task2;

// Anastasiya Didych

public class ContractEmployee extends Employee implements Pay {

    private double monthlyPayment;


    public ContractEmployee(String firstname, String lastName, String federalTaxIdMember, double monthlyPayment) {
        super(firstname, lastName);
        this.ID = federalTaxIdMember;
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public double calculatePay() {
        payment = monthlyPayment;
        return payment;
    }

}
