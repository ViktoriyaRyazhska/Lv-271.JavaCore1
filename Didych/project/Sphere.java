package softserve.project;

// Anastasiya Didych

public class Sphere extends ThreeDimensional {


    public Sphere(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double areaVolume() {
        return areaVolume = 4 * Math.PI*(radius*radius);
    }
}

