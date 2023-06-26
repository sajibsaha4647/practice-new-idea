package src;

import java.util.Scanner;

public class SumOfDigits {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter positive number");
            int n ,sum = 0,temp,r;
         n = input.nextInt();

         temp = n;

        while(temp != 0){
            r = temp% 10;
            sum = sum+r;
            temp = temp/10;
        }
         System.out.println("result "+ sum);
        
    }

}
