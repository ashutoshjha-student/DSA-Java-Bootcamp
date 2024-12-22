package HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();


        // Insertion
        map.put("India", 120);
        map.put("China", 30);
        map.put("US", 150);
        System.out.println(map);

        map.put("China",180 );
        System.out.println(map);

        // Search
        if (map.containsKey("US")) {
            System.out.println("Key is Present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("US"));  // key exists
        System.out.println(map.get("Nepal"));  // key doesnt exists

        // Iterator
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Delete
        map.remove("china");
    }
}
