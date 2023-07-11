package Array;

import java.util.Scanner;

public class MatrixOfsum {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        System.out.println("enter value of A");
       for(int i = 0;i<2;i++){
            for(int j = 0; j<3;j++){
                 System.out.printf("A[%d][%d]=",i,j);
                A[i][j] = input.nextInt();
            }
            System.out.println();
        }

 System.out.println("enter value of B");
        for(int i = 0;i<2;i++){
            for(int j = 0; j<3;j++){
                 System.out.printf("B[%d][%d]=",i,j);
                B[i][j] = input.nextInt();
            }
            System.out.println();
        }


        for(int i = 0;i<2;i++){
            for(int j = 0; j<3;j++){
                 System.out.println("result is"+(A[i][j]+B[i][j]));
            }
        }

        
    }
}
