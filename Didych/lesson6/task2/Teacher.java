package softserve.lesson6.task2;

// Anastasiya Didych

public class Teacher extends Staff {



    String TYPE_PERSON = "teacher";

    @Override
    int salary() {
        return 4500;
    }

    public Teacher (String name){
        this.name = name;
        //System.out.println();
    }

    @Override
    String  print() {
        System.out.println("My name is " + getName() + ", I am a " + TYPE_PERSON);
        return null;
    }


}
