package az.atlacademy.lesson27.ObjectWrite;

import java.io.*;

public class StudentIOApp {
    public static void main(String[] args) {
        Student samir = new Student(24, 15, "samir");
        System.out.println(samir);
        studdentsWriter(samir);
        Object o = objectsReader();
        if (o instanceof Student) {
            System.out.println(o);
        }
    }

    public static void studdentsWriter(Student student) {
        final String path = "src/main/java/az/atlacademy/lesson27/ObjectWrite/a.txt";
        try (ObjectOutputStream ou = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)))) {
            ou.writeObject(student);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public static Object objectsReader() {
        final String path = "src/main/java/az/atlacademy/lesson27/ObjectWrite/a.txt";
        try (ObjectInputStream ou = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)))) {
            return ou.readObject();
        } catch (ClassNotFoundException io) {
            io.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}