package HomeWork6Task2;

public class SalariedEmployee extends Employee implements calcPay {

	public SalariedEmployee(String employeeID, String name) {
		super(employeeID, name);

	}

	@Override
	public int calculatePay() {
		// TODO Auto-generated method stub
		return 0;
	}

}
