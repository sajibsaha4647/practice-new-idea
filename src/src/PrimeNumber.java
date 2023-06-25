package src;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("enter a positive value");
        x = input.nextInt();

        int count = 0;

        for(int i = 2; i<x;i++){
            if(x%i == 0){
                count ++;
            }
        }

        if(count == 0){
            System.out.println("Prime number");
        }else{
              System.out.println("Not Prime number");
        }

    }
}
