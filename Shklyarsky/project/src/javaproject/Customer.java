package javaproject;

public class Customer {

	int insurance;
	private int driverSkillYears;
	private int carPrice;
	private String brokerName;
	private String customerName;
	private String dealDate;

	public Customer(String brokerName, String customerName, int carPrice, int driverSkillYear, String dealDate) {
		this.brokerName = brokerName;
		this.customerName = customerName;
		this.carPrice = carPrice;
		this.driverSkillYears = driverSkillYear;
		this.dealDate = dealDate;
		insurance = (int) ((carPrice * 0.015) - (driverSkillYears * 8));
	}

	public String toString() {
		return brokerName + " | " + customerName + " |     " + carPrice + "   |            " + driverSkillYears
				+ "         |    " + dealDate + "    | " + insurance + "\n\n";
	}

	public String getBrokerName() {
		return brokerName;
	}

	public String getCustomerName() {
		return customerName;
	}
}
