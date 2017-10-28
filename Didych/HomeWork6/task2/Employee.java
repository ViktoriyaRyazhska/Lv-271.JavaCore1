package softserve.homework6.task2;

// Anastasiya Didych

abstract class Employee {
    private  String lastName;
    private  String firstName;
    public String employeeld;
    public  String ID;
    public double payment;


    public Employee(String firstname, String lastName){
        this.firstName = firstname;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "\nEmployee " + firstName + " with the ID " + ID + " earns " + payment + "$ per month";
    }
}
