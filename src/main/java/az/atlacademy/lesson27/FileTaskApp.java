package az.atlacademy.lesson27;

import java.io.*;
import java.util.Random;

public class FileTaskApp {
    public static final String path = "C:\\Users\\Samir Agayev\\Desktop\\java-questions\\src\\main\\java\\az\\atlacademy\\lesson27\\";

    public static void main(String[] args) throws IOException {
        File filename = new File(path + "a.txt");
        BufferedWriter bf=new BufferedWriter(new FileWriter(filename));
        new Random()
                .ints(10, 0, 100)
                .forEach(num -> {
                    try {
                        bf.write(num);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });

        System.out.println("--------------------");
        BufferedReader br=new BufferedReader(new FileReader(filename));
        System.out.println(br.read());
    }
}
