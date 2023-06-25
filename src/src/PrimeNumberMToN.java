package src;

import java.util.Scanner;

public class PrimeNumberMToN {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int m,n;

        System.out.println("enter positive number");

        m = input.nextInt();

         System.out.println("enter positive number");
        n = input2.nextInt();
        int count = 0;

        for(int i = m; i<=n; i++){

            for(int j = 2;j<=i-1;j++){
                if(i%j == 0){
                    count ++;
                    break;
                }
            }
             if(count == 0){
                    System.out.println(""+i);
               }else{
                    count = 0;
               }     
        }


    }
}