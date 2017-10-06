public class Employee {

	private String name;
	private double hours;
	private double rate;
	private static double sumHours;
	private static double sumRate;
	
	public Employee() {
		sumHours += hours;
		sumRate += rate;
	}
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		sumHours += hours;
		sumRate  += rate;
		
		//constructor with 
		//2 parameters correct?
	}
	public Employee(String name, int hours, int rate ) {
		this.name = name;
		this.hours = hours;
		this.rate = rate;
		sumHours += hours;
		sumRate += rate;
	}
	
	public static double totSalary() {
		return sumHours*sumRate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public void changeRate(double rate) {
		this.rate = rate;
	}
	
	public void giveBonus(double bonus) {
		rate = rate * (1 + bonus);
	}
	
	@Override
	public String toString() {
		return "Employee [Name " + name + ", hours " + hours + ", rate " + rate + "]";
	}

	
	
	
}
