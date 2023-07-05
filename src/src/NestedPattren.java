package src;

import java.util.Scanner;

public class NestedPattren {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("enter a positive number");

        int num = input.nextInt();

        for(int row = 1;row<=num;row++){
        System.out.print(" row"+row);
            for(int col = 1;col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }

}
