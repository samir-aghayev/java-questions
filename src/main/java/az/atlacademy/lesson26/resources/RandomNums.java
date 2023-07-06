package az.atlacademy.lesson26.resources;

import java.io.*;
import java.util.List;
import java.util.Random;

public interface RandomNums {
    public static void main(String[] args) throws IOException {
        List<Integer> collect = generateNumbers();
        writeFile(collect);
        List<Integer> integers = readFile();
        System.out.println("----");
        integers.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);
    }

    private static List<Integer> generateNumbers() {
        return new Random().ints(10, 0, 100)
                .boxed()
                .toList();
    }

    private static void writeFile(List<Integer> collect) throws IOException {
        final String path = "C:\\Users\\Samir Agayev\\Desktop\\java-questions\\src\\main\\java\\az\\atlacademy\\lesson26\\resources\\a.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        for (Integer integer : collect) {
            bw.write(String.valueOf(integer));
            bw.newLine();
        }
        bw.close();
    }

    private static List<Integer> readFile() throws IOException {
        final String path = "C:\\Users\\Samir Agayev\\Desktop\\java-questions\\src\\main\\java\\az\\atlacademy\\lesson26\\resources\\a.txt";
        BufferedReader bw = new BufferedReader(new FileReader(path));
        List<Integer> list = bw.lines()
                .mapToInt(Integer::parseInt)
                .boxed()
                .toList();
        bw.close();
        return list;

    }
}
