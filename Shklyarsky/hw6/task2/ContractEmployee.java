package hw6.task2;

public class ContractEmployee extends Employee implements Calculate {

	protected double cnd;
	protected String federalTaxIdmember;

	public ContractEmployee(String id, String name, String federalTaxIdmember, double cnd) {
		super(id, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.cnd = cnd;
	}

	public double calculatePay() {
		return cnd;
	}

}
