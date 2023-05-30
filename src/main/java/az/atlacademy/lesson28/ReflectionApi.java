package az.atlacademy.lesson28;

import java.io.FileOutputStream;
import java.io.IOException;

public class ReflectionApi {
    public static void main(String[] args) {

        final String path = "C:\\Users\\Samir Agayev\\Desktop\\java-questions\\src\\main\\java\\az\\atlacademy\\lesson28\\b.txt";

        try (FileOutputStream fou = new FileOutputStream(path);) {
            byte[] a = "Hello world".getBytes();
            fou.write(a);
        } catch (IOException io) {
            io.printStackTrace();
        }


    }
}
