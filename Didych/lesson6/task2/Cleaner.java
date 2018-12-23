package softserve.lesson6.task2;

// Anastasiya Didych

public class Cleaner extends Staff {



    String TYPE_PERSON = "cleaner";

    @Override
    int salary() {
        return 2900;
    }

    public Cleaner (String name){
        this.name = name;
        //System.out.println();
    }

    @Override
    String  print() {
        System.out.println("My name is " + getName() + ", I am a " + TYPE_PERSON);
        return null;
    }

}
