package HomeWork6Task2;

public class ContractEmployee extends Employee implements calcPay {

	public ContractEmployee(String employeeID, String name) {
		super(employeeID, name);

	}

	@Override
	public int calculatePay() {
		// TODO Auto-generated method stub
		return 0;
	}

}
