public class App {

	public static void main(String[] args) {

		Employee pr1 = new Employee();
		pr1.setName("Ostap");
		pr1.setHours(145);	
		pr1.setRate(11.5);
		Employee pr2 = new Employee("Oksana",9);
		pr2.setHours(168);
		Employee pr3 = new Employee ("Oleh",176,12);
		
		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println(pr3);
		System.out.println(pr1.getName()+" has "+(pr1.getHours()*pr1.getRate()));
		System.out.println(pr2.getName()+" has "+(pr2.getHours()*pr2.getRate()));
		System.out.println(pr3.getName()+" has "+(pr3.getHours()*pr3.getRate()));
		System.out.println("Together they have " + Employee.totSalary());
		
		pr2.giveBonus(0.1);
		System.out.println(pr2.getName()+" has "+(pr2.getHours()*pr2.getRate()));
		
		
		
	}

}
