package az.atlacademy.lesson20;

import java.util.HashMap;

public class MapApp {
    public static void main(String[] args) {
        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put(null, "Go");
        stringMap.put(null, null);
        stringMap.put("Musa", "Comp");
        System.out.println(stringMap.get("Elvin"));
        System.out.println(stringMap.get("elvin"));
        System.out.println(stringMap);
        stringMap.clear();
        System.out.println(stringMap);
    }
}
