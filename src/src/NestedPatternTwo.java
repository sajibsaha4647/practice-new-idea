package src;

import java.util.Scanner;

public class NestedPatternTwo {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int n;
       System.out.println("enter a positive number");

       n = input.nextInt();

       for(int row = n; row>=1; row--){
            for(int col = 1; col<=row;col++){
                System.out.print(""+col);
            }

            System.out.println();
       }

    }
}
