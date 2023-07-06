package az.atlacademy.lesson26.resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadAndWrite {
    public static void main(String[] args) {

    }

    public static void reader(String filename) throws IOException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader bf=new BufferedReader(fr);
        int read = bf.read();
    }
}
