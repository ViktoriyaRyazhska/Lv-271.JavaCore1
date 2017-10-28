package softserve.homework6.task2;

// Anastasiya Didych

public class SalariedEmployee extends Employee implements Pay {

    private double hoursRate;
    private double workHours;

    public SalariedEmployee(String firstname, String lastName, String socialSecurityNumber, double hoursRate, double workHours) {
        super(firstname, lastName);
        this.ID = socialSecurityNumber;
        this.hoursRate = hoursRate;
        this.workHours = workHours;
    }

    @Override
    public double calculatePay(){
        payment = hoursRate * workHours;
        return payment;
    }

}
