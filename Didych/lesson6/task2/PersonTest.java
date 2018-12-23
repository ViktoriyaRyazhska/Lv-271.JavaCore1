package softserve.lesson6.task2;

// Anastasiya Didych

public class PersonTest {
    public static void main(String[] args) {
        Student st1 = new Student("Vasya");
        Student st2 = new Student("Olenka");
        Teacher t1 = new Teacher("Muroslava");
        Teacher t2 = new Teacher("Oleksandr");
        Cleaner cl = new Cleaner("Ostap");
        Person persons[] = {st1, st2, t1, t2, cl};


      for (int i = 0; i < persons.length; i++) {
          persons[i].print();
          if (persons[i] instanceof Staff){
              System.out.println("My salary is: " + ((Staff)persons[i]).salary());
          }
      }
    }
}

