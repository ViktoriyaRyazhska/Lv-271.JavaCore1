package Lesson;

public class MainAnimal {
	
	public static void main(String[] args) {

		Animal pet[] = new Animal[4];
		pet[0] = new Cat();
		pet[1] = new Dog();
		pet[2] = new Cat();
		pet[3] = new Dog();

		for (int i = 0; i < pet.length; i++) {
			System.out.println(i + 1 + " animal do " + pet[i].voice() + " and like " + pet[i].feed());
		}

		Person pep[] = new Person[3];
		pep[0] = new Student();
		pep[1] = new Cleaner();
		pep[2] = new Teacher();
		
		for (int i = 0; i < pep.length; i++) {
			System.out.println(pep[i].print());
			if(pep[i] instanceof Staff ) {
			System.out.println("With " +((Staff) pep[i]).salary()+" salary");
			}
		}

	}
	
}
