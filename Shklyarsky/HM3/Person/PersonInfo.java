public class PersonInfo {

	public static void main(String[] args) {

		Person pep1 = new Person ();
		pep1.setName("Butch");
		pep1.setBirthYear(1948);
		
		Person pep2 = new Person("Vincent",1984);
		
		Person pep3 = new Person () ;
		pep3.setName("Mia");
		pep3.setBirthYear(1978);
		
		Person pep4 = new Person("Marsel",1965);
		
		Person pep5 = new Person ();
		pep5.setName("Pumpkin");
		pep5.setBirthYear(1980);
		
		
		pep2.changeName("Vega");
		pep4.changeName("Mike");
		
		pep3.inputInfo("he is smart");
		pep1.inputInfo("he is tall");
		
		System.out.println(pep1);
		System.out.println(pep2);
		System.out.println(pep3);
		System.out.println(pep4);
		System.out.println(pep5);
		
		System.out.println(pep1.getName() + " is " +pep1.getAge());
		System.out.println(pep3.getName() + " is " +pep3.getAge());
		System.out.println(pep5.getName() + " is " +pep5.getAge());
	}

}
