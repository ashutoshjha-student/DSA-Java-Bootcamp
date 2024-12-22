import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        
        //Creating
        HashSet<Integer> set = new HashSet<>();

        // The set only contain unique elements, it ignores the duplicate or repeated elements.

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Search
        if (set.contains(1)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        // Delete
        set.remove(3);
        if (!set.contains(3)) {
            System.out.println("False");
        }

        // Size
        System.out.println("Size of set is : " + set.size());

        // print all elements
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();

        // it = null -> 1 -> 2 -> 3;
        // it.next = 1;             
        // it.next = 2;             it.hasNext() = true or false
        // it.next = 3;

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
    }
}