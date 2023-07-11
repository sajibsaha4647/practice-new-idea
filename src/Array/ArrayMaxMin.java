package Array;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("enter number");

        int[] number = new int[5];
        int max;

        System.out.println("enter 5 number");

        for(int i=0;i<number.length;i++){
            number[i] = input.nextInt();
        }

        max = number[0];
       int min = number[0];

        for(int i = 1; i<5;i++){
            if(max<number[i]){
                max = number[i];
            }else{
                min = number[i];
            }
        }

        System.out.println("maximum number in array"+max);
        System.out.println("maximum number in array"+min);

        
    }
}
