package softserve.project;

// Anastasiya Didych

public class Square extends TwoDimensional{

    public Square(String name, String color,  double latitude, double longitude){
        super(name, color);
        this.length = latitude;
        this.width = longitude;
    }

    @Override
    public double areaVolume(){
        return areaVolume = length*width;
    }
}
