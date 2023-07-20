package Array;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {

        int [] A = {1,2,3,4,5,67,8,8,8,-9};
        String [] names = {"sajib","rony","ridoy","toky","nail","jonson s","tommy mia","a"} ;

        Arrays.sort(A) ;
        Arrays.sort(names) ;

        for(int i = 0; i<A.length-1;i++){
            System.out.print(" "+A[i]);
        }

        System.out.println();

        for(int i = A.length-1; i>=0;i--){
            System.out.print(" "+A[i]);
        }
         System.out.println();

        System.out.println("here for names");
         for(int i = 0; i<names.length-1;i++){
            System.out.print(" "+names[i]);
        }

        System.out.println();

        for(int i = names.length-1; i>=0;i--){
            System.out.print(" "+names[i]);
        }
        
    }
}
