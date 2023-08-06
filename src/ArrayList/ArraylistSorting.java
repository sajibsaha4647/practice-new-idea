package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistSorting {
    public static void main(String[] args) {

        ArrayList<Integer> collection = new ArrayList<Integer>();

        collection.add(24);
        collection.add(26);
        collection.add(27);
        collection.add(28);
        collection.add(29);
        collection.add(34);
        collection.add(35);

        Collections.sort(collection);

        System.out.println(collection);
        
       Collections.sort(collection,Collections.reverseOrder());

       System.out.println("=========");
       System.out.println(collection);

    }
}
