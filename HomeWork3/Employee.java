package HomeWork3;

public class Employee {
	private String name;
	private int rate;
	private int hours;
	private static int totalSum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public static int getTotalSum() {
		return totalSum;
	}
	
	public Employee() {}
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	public int salary() {
		return rate * hours;
		
	}
	public double bonuses() {
		return salary() * 0.10;
	}
	
	public void changeRate(int nRate) {
		this.rate = nRate;
	}
	
	
	public static void main (String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee("John",7,8);
		
		e1.setName("Vitalii");
		e1.setRate(2);
		e1.setHours(3);
		
		e2.setName("Andrew");
		e2.setRate(4);
		e2.setHours(5);
		
		totalSum = e1.salary() + e2.salary() + e3.salary();
		System.out.println("Salary of the first person: " + e1.salary() + "$.");
		System.out.println("");
		System.out.println(e2);
		e2.changeRate(20);
		System.out.println(e2 + " rate is changed.");
		System.out.println("");
		System.out.println("Bonus 10% from salary of the thirty person: " +  e3.bonuses());
		System.out.println("");
		System.out.println("The total salary of all workers: " + totalSum + "$." );
		
        
		
		
		
	}
	
}
