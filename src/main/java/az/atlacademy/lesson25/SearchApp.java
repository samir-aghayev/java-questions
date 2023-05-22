package az.atlacademy.lesson25;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SearchApp {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        Integer search = search(list, 9);
        System.out.println(search);

    }

    public static <T> T search(Collection<T> collection, T data) throws DataNotFoundException{
        if (collection.contains(data)) {
            return data;
        } else {
           throw new DataNotFoundException("Date not found");
        }
    }
}