package ob_10_10_2017;

//Anastasiya Didych

public class DogTest
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fluffy", "PitBull", 2.4);
        Dog dog2 = new Dog("Marz", "Spitz", 3.4);
        Dog dog3 = new Dog("Nutzee", "Poodle", 4.4);
        System.out.println("Are there some dogs with the same name?\n" + (dog1.equals(dog2) || dog1.equals(dog3) || dog3.equals(dog2))+ "\n");
        if (dog1.age > dog2.age && dog1.age > dog3.age)
        {
            System.out.println(dog1.name + " is the oldest dog. He/She is a " + dog1.breed);
        }
        else if (dog2.age > dog1.age && dog2.age > dog3.age)
        {
            System.out.println(dog2.name + " is the oldest dog. He/She is a " + dog2.breed);
        }
        else
        {
            System.out.println(dog3.name + " is the oldest dog. He/She is a " + dog3.breed);
        }



    }

}
