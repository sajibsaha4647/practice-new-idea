package Array;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int [][] A = new int[3][3] ;

        int sumOfDiagonalElements = 0;
        int sumofUppertraingle = 0;
        int sumOfLowerTriangle = 0;

        for(int row = 0;row<3;row++){
            for(int col = 0;col<3;col++){
                A[row][col]= input.nextInt();
            }
        }

        //diagonal matrix
        for(int row = 0;row<3;row++){
            for(int col = 0;col<3;col++){
               if(row==col){
                sumOfDiagonalElements = sumOfDiagonalElements+A[row][col];
               }
            }
        }

        //upper traingle matrix
        for(int row = 0;row<3;row++){
            for(int col = 0;col<3;col++){
               if(row<col){
                sumofUppertraingle = sumofUppertraingle+A[row][col];
               }
            }
        }


          //lower traingle matrix
        for(int row = 0;row<3;row++){
            for(int col = 0;col<3;col++){
               if(row>col){
                sumOfLowerTriangle = sumOfLowerTriangle+A[row][col];
               }
            }
        }

        System.out.println("A"+sumOfDiagonalElements);
        System.out.println("B"+sumofUppertraingle);
        System.out.println("c"+sumOfLowerTriangle);




        
    }
}
