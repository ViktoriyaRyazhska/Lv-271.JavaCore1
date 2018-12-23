package softserve.project;

// Anastasiya Didych


public class Circle extends TwoDimensional implements Shape {


    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double areaVolume() {

        return areaVolume = Math.PI*radius*radius;
    }

}

