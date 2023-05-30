package az.atlacademy.lesson28;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class JsonPersonApp {

    public static void main(String[] args) {
        String path = "src/main/java/az/atlacademy/lesson28/resources/b.txt";
        Person rte = new Person("RTE", "T");

        byte[] personBytes = jsonBytes(rte);

        writerObjectToFile(path, personBytes);

        Object object = readerObjectToFile(path);

        if (object instanceof Person person) {
            System.out.println(person);
        }
    }

    private static byte[] jsonBytes(Person rte) {
        ObjectMapper om = new ObjectMapper();
        try {
            return om.writeValueAsBytes(rte);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writerObjectToFile(String path, byte[] personBytes) {
        try (ObjectOutputStream ous = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)))) {
            ous.write(personBytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object readerObjectToFile(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
