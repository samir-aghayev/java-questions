package az.atlacademy.lesson28;

import java.io.*;

public class SerializationApp {
    public static final String RESOURCE = "src/main/java/az/atlacademy/module01/lesson19/resource/";

    public static void main(String[] args) {
        Person rte = new Person(1, "RTE", "T");

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(RESOURCE + "people.ser")))) {
            oos.writeObject(rte);
            System.out.println(rte);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(RESOURCE + "people.ser")))) {
            Person rteRead = (Person) ois.readObject();
            System.out.println(rteRead);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
