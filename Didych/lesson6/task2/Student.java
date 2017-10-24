package softserve.lesson6.task2;

// Anastasiya Didych

public class Student extends Person {



    String TYPE_PERSON = "student";


    public Student (String name){
        this.name = name;
        //System.out.println();
    }

    @Override
    String print() {
        System.out.println("My name is " + getName() + ", I am a " + TYPE_PERSON);
        return null;
    }
}
