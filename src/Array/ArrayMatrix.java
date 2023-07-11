package Array;

import java.util.Scanner;

public class ArrayMatrix {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter 6 integer number");

        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        for(int i = 0;i<2;i++){
            for(int j = 0; j<3;j++){
                 System.out.printf("A[%d][%d]=",i,j);
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("A=");
        for(int i = 0;i<2;i++){
            for(int j = 0; j<3;j++){
                System.out.print(" "+A[i][j]);
            }
            System.out.println();
        }







    }
}
