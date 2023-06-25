package src;

import java.util.Scanner;

public class FactorialNumber {

   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    int x,sum=1;
    System.out.println("enter a positive number");

    x = input.nextInt();

    for(int i = x; i>=1; i--){
        System.out.println("here"+i);
        sum = sum*i;
    }

    System.out.println("result"+sum);


   }

   
    
}
