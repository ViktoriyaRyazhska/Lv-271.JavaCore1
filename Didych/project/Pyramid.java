package softserve.project;

// Anastasiya Didych

public class Pyramid extends ThreeDimensional {


    public Pyramid(String name, String color, double a, double b, double c) {
        super(name, color);
        this.length = a;
        this.width = b;
        this.height = c;
    }

    @Override
    public double areaVolume() {
        double s0 = length*width;
        double v0 = s0*height;
        return areaVolume = v0/3;
    }
}
