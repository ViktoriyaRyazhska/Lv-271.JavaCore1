package softserve.project;

// Anastasiya Didych

import java.io.*;
import java.util.*;

public class ShapeTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Shape> list = new ArrayList<>();
        List<Shape> listThreeD = new ArrayList<>();
        List<Shape> listTwoD = new ArrayList<>();
        List<Shape> listSorted = new ArrayList<>();


        list.add(new Circle("circle", "blue", 1));
        list.add(new Triangle("triangle", "pink", 1, 3, 4));
        list.add(new Square("square", "green", 2, 2));
        list.add(new Sphere("sphere", "yellow", 1));
        list.add(new Cube("cube", "grey", 2, 3, 2));
        list.add(new Pyramid("pyramid", "brown", 1, 1, 3));

        Util.calcAreaVolume(list);

        Util.listSeparation(list, listTwoD, listThreeD);

        Collections.sort(listTwoD, new AreaVolumeComparator());
        Collections.sort(listThreeD, new AreaVolumeComparator());

        Util.newSortedList(listSorted, listTwoD, listThreeD);

        Util.finalSeeOut(list, listTwoD, listThreeD, listSorted);

        Util.writeToFile(listSorted);

        List<Shape> shapes = Util.readFromFile();
        System.out.println(shapes);

    }
}
