package hw6.task2;

public class MainEmployee {

	public static void main(String[] args) {

		Employee[] emp = new Employee[4];
		emp[0] = new SalariedEmployee("160", "Vasya", "54875484", 168, 110);
		emp[1] = new ContractEmployee("144", "Sasha", "00215487", 18000);
		emp[2] = new ContractEmployee("112", "Dasha", "00456789", 17500);
		emp[3] = new SalariedEmployee("184", "Masha", "54876487", 240, 100);

		Employee temp = new Employee();
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].calculatePay() < emp[j].calculatePay()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].toString());
		}
	}

}
