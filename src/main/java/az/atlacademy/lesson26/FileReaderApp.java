package az.atlacademy.lesson26;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderApp {

    private final static String path = "C:\\Users\\Samir Agayev\\Desktop\\java-questions\\src\\main\\java\\az\\atlacademy\\lesson26\\resources\\";

    public static void main(String[] args) throws IOException {
        File file = new File(path + "a.txt");
        try {
//            FileOutputStream ftp = new FileOutputStream(path + "a.txt");
//            ftp.write("Safg".getBytes());
            byte[] bytes;
            try (FileInputStream fip = new FileInputStream(path + "a.txt")) {
                bytes = fip.readAllBytes();
            }
            System.out.println(new String(bytes));
            ByteArrayOutputStream ftp = null;
            ftp.flush();
            ftp.close();
            FileWriter fr = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fr);
            bufferedWriter.write("salam WORLD");
            bufferedWriter.write("salam WORLD");
            bufferedWriter.write("salam WORLD");
            bufferedWriter.newLine();
            bufferedWriter.append('a');
            bufferedWriter.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(file);

        byte[] bytes = Files.readAllBytes(Paths.get(path + "a.txt"));
        Path write = Files.write(Paths.get(path + "a.txt"), bytes);
        System.out.println(write);
        bytes = Files.readAllBytes(Paths.get(path + "a.txt"));
        System.out.println(new String(bytes));
    }
}
