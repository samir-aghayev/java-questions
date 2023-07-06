package az.atlacademy.lesson21;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MapApp {
    public static void main(String[] args) {
        HashMap<String, Queue<String>> map = new HashMap<>();

        Queue<String> bolt = new LinkedList<>();
        bolt.add("Doner");
        bolt.add("Ayran");
        map.put("Bolt", bolt);

        Queue<String> wolt = new LinkedList<>();
        wolt.add("cola");
        wolt.add("pepsi");
        map.put("Wolt", wolt);
        System.out.println(map);
    }

}
