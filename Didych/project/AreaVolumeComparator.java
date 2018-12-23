package softserve.project;
/*
*
*Anastasiya Didych
*
*/


import java.util.Comparator;

public class AreaVolumeComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        if (o1.areaVolume() > o2.areaVolume()) {
            return 1;
        } else if (o1.areaVolume() < o2.areaVolume()) {
            return -1;
        } else {
            return 0;
        }
    }
}