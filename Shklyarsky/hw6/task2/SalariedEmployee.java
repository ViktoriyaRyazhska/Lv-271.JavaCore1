package hw6.task2;

public class SalariedEmployee extends Employee implements Calculate {

	protected int hour;
	protected double rate;
	protected String socialSecurityNumber;

	public SalariedEmployee(String id, String name, String socialSecurityNumber, int hour, int rate) {
		super(id, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hour = hour;
		this.rate = rate;
	}

	public double calculatePay() {
		return hour * rate;
	}

}
