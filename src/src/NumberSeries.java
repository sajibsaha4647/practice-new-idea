package src;

import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {

        // ================ 1+2+3+ ...+n

        // Scanner input = new Scanner(System.in);
        // int n,sum=0;
        // System.out.println("enter a positive number");
        // n = input.nextInt();

        // for(int i = 0; i<=n;i++){
        //     sum = sum+i;
        // }
        // System.out.println("result is"+sum);

        // ================




        // ================ 1+3+5+ ...+n

        // Scanner input = new Scanner(System.in);
        // int n,sum=1;
        // System.out.println("enter a positive number");
        // n = input.nextInt();
        
        // for(int i = 1; i<=n;i =i+2){
        //     // sum = sum+i;  
        //     System.out.println("result is"+i);
        // }
        

        // ================




        // ================ 1.5+2.5+3.5+ ...+n

        //  Scanner input = new Scanner(System.in);
        // int n;
        // System.out.println("enter a positive number");
        // n = input.nextInt();
        
        // for(double i = 1.5; i<=n;i =i+1){
        //     // sum = sum+i;  
        //     System.out.println("result is"+i);
        // }

        // ================




        // ================ 1^2+2^2+3^2+4^2 ...+n^2

          Scanner input = new Scanner(System.in);
        int n;
        System.out.println("enter a positive number");
        n = input.nextInt();
        
        for(int i = 1; i<=n;i =i+1){
            // sum = sum+i;  
            System.out.println("result is"+i*2);
        }

        // ================
        
    }
}
