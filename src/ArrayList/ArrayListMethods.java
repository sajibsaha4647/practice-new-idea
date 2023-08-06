package ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<Integer>() ;
        ArrayList <Integer> numbers2 = new ArrayList<Integer>() ;

        numbers.add(23);
        numbers.add(24);
        numbers.add(25);
        numbers.add(26);
        numbers.add(27);

      

        boolean check = numbers.isEmpty();
        boolean contain = numbers.contains(23);
        int index = numbers.indexOf(23);
       int addnumber = numbers.set(4, 50);

         for(int i : numbers){
            System.out.println(i);
        }


        numbers2.addAll(numbers);

        System.out.println("============");

         for(int i : numbers2){
            System.out.println(i);
        }

        boolean checking = numbers.equals(numbers2);

        System.out.println(checking);





    }
}
