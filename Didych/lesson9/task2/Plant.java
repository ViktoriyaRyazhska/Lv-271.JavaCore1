package lesson9.task2;

/**
 * Created by adidytc on 25.10.2017.
 */
public class Plant {
    private String  color;
    private String type;
    int size;

    public Plant(int size, String type, String color){
        this.size = size;
        this.type = type;
        this.color = color;

    }


    @Override
    public String toString() {
        return "There are " + size + "  " + color + " " + type;
    }

}
