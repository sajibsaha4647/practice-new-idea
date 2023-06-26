package src;

import java.util.Scanner;

public class FebonacciSeries {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n,first=0,second=1,fibo;

        System.out.println("enter positive number");

        n = input.nextInt();

        System.out.println(first+""+second);

        for(int i = 3;i<=n;i++){

            fibo = first+second;

            System.out.println(" "+fibo);

            first = second;

            second = fibo;


        }



    }
    
}
