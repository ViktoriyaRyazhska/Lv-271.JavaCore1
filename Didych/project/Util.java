package softserve.project;

//Anastasiya Didych


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Util {

    static String calcAreaVolume(List<Shape> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).areaVolume() == 0) {
                System.out.println((i + 1) + "  Invalid values. Try again");
            }
        }
        return null;
    }


    static String listSeparation(List<Shape> list, List<Shape> listTwoD, List<Shape> listThreeD) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof TwoDimensional) {
                listTwoD.add(list.get(i));
            } else {
                listThreeD.add(list.get(i));
            }
        }
        return null;
    }


    static List newSortedList(List<Shape> listSorted, List<Shape> listTwoD, List<Shape> listThreeD) {
        listSorted.clear();
        listSorted.addAll(listTwoD);
        listSorted.addAll(listThreeD);
        return listSorted;
    }


    static void writeToFile(List<Shape> list) {
        try {
            FileOutputStream fileOutput = new FileOutputStream("ProjectCollection.txt");

            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);


            for (int i = 0; i < list.size(); i++) {
                objectOutput.writeObject(list.get(i));
            }
            objectOutput.close();

        } catch (FileNotFoundException e2) {
            System.out.println("Error: file not found");
        } catch (IOException e1) {
            System.out.println("IOException");
        }
    }


    static List<Shape> readFromFile() {
        List<Shape> listFromFile = new ArrayList<>();
        FileInputStream fileInput = null;

        try {
            fileInput = new FileInputStream("ProjectCollection.txt");


            ObjectInputStream objectInput = new ObjectInputStream(fileInput);

            Shape fromFile;
            while ((fromFile = (Shape) objectInput.readObject()) != null) {
                listFromFile.add(fromFile);

            }
        } catch (FileNotFoundException e1) {
            System.out.println("File not found. Try again.");

        } catch (IOException e2) {
            System.out.println("\n***Read from file list***");
            return listFromFile;
        } catch (ClassNotFoundException e3) {
            System.out.println("Error: try again.");
        }
        finally{
            if (fileInput != null) {
                try {
                    fileInput.close();
                } catch (IOException e) {
                    System.out.println("Filed was closed wrong.");
                }
            }
        }

        return null;
    }


    static int finalSeeOut(List<Shape> list, List<Shape> listTwoD, List<Shape> listThreeD, List<Shape> listSorted) {
        System.out.println("Main list:\n" + list + "\n");

        System.out.println("Sorted by area list of 2D shapes:\n" + listTwoD + "\n");

        System.out.println("Sorted by volume list of 3D shapes:\n" + listThreeD + "\n");

        System.out.println("Sorted main list:\n" + listSorted);
        System.out.println("\n***Writing into a file***");


        return 0;
    }

}
