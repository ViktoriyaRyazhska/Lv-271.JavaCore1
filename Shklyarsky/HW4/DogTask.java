public class DogTask {

	public static void main(String[] args) {

		Dog d1 = new Dog("Rory", Breed.Aidi, 2);
		Dog d2 = new Dog ("Ariya", Breed.Bulldog, 2);
		Dog d3 = new Dog("Alex", Breed.Husky, 5);
				
		if (d1.getName().equals(d2.getName()) || d1.getName().equals(d3.getName())||d2.getName().equals(d3.getName()) ) {
			System.out.println("There are two or more dogs with same names");
		}
		else {
			System.out.println("All dogs have unique names");
		}
		
		if (d1.getAge()>d2.getAge() && d1.getAge()> d3.getAge() ) {
			System.out.println(d1.toString());
		} 
		else if(d2.getAge()>d1.getAge() && d2.getAge()> d3.getAge()){
			System.out.println(d2.toString());
		}
		else {
			System.out.println(d3.toString());
		}
	}

}
