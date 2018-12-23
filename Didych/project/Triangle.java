package softserve.project;

// Anastasiya Didych

public class Triangle extends TwoDimensional {
    public Triangle(String name, String color, double a, double b, double c) {
        super(name, color);
        this.length = a;
        this.width = b;
        this.height = c;
    }

    @Override
    public double areaVolume() {
        double p = 0.5*(length+width+height);
        double d = p - width;
        double b = p - length;
        double c = p - height;
        double k = p*d*b*c;
        return areaVolume = Math.sqrt(k);
    }
}
