package softserve.project;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test implements Serializable {
    private String name;

    public Test(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //declare listFromFile/listToFile
        List<Test> listFromFile = new ArrayList<>();
        List<Test> listToFile = new ArrayList<>();

        //fill listToFile with test data
        listToFile.add(new Test("aa"));
        listToFile.add(new Test("ab"));

        try {
            sendToFile(listToFile);
            listFromFile = getFromFile();

        } catch (Exception e) {
            System.out.println("An exception has occurred during write/read information from/to file");
        }

        //read data from listFromFile collection
        System.out.println(listFromFile);
    }

    public static void sendToFile(List<Test> listToFile) throws IOException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (int i = 0; i < listToFile.size(); i++) {
            oos.writeObject(listToFile.get(i));
        }
        oos.close();
    }

    public static List<Test> getFromFile() throws IOException {
        List<Test> listFromFile = new ArrayList<>();
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("output.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            Test fromFile;
            while ((fromFile = (Test) ois.readObject()) != null) {
                listFromFile.add(fromFile);
            }
        } catch (EOFException e) {
            System.out.println("File ended");
            return listFromFile;
        } catch (ClassNotFoundException e) {
            System.out.println("Class of a serialized object cannot be found.");
        } finally {
            if (fin != null) {
                fin.close();
            }
        }
        return listFromFile;
    }
}