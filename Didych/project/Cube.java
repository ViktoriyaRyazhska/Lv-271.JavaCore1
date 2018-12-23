package softserve.project;

// Anastasiya Didych

public class Cube extends ThreeDimensional {

    public Cube(String name, String color, double a, double b, double c) {
        super(name, color);
        this.length = a;
        this.width = b;
        this.height = c;
    }

    @Override
    public double areaVolume() {
        return areaVolume = length*width*height;
    }
}
