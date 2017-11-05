package softserve.project;

//Anastasiya Didych

import java.io.Serializable;

abstract class ThreeDimensional implements Shape, Serializable {
    String name;
    double radius;
    double length;
    double width;
    double height;
    String color;
    double areaVolume;

    public ThreeDimensional(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nthe 3D shape is a " + color + " " + name + " with volume: " + areaVolume;
    }
}