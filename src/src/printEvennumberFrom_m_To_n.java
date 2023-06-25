package src;

import java.util.Scanner;

public class printEvennumberFrom_m_To_n {

    public static void main(String[] args) {

        //============= print sum of all 1 to 100
        // int sum  = 0;
        // for(int i = 0; i<=100;i++){
        //     sum = sum+i;
        // }
        // System.out.println("sum"+sum);
        //=============

        //=============  print sum of all m to n

        // Scanner input = new Scanner(System.in);
        // Scanner input2 = new Scanner(System.in);
        // int m,n,sum=0;
        // System.out.println("enter positive number m");
        // m = input.nextInt();

        //  System.out.println("enter positive number n");
        // n = input2.nextInt();

        // for(int i = m; i<=n; i++){
        //    sum = sum+i;
        // }
        // System.out.println("number sum"+sum);

        //=============

        //=============  print sum of all even number m to n

        // Scanner input = new Scanner(System.in);
        // Scanner input2 = new Scanner(System.in);
        // int m,n,sum=0;
        // System.out.println("enter positive number m");
        // m = input.nextInt();

        //  System.out.println("enter positive number n");
        // n = input2.nextInt();

        // for(int i = m; i<=n; i++){
        //    if(i%2 == 0){
        //     sum = sum+i;
        //    }else{
        //     continue;
        //    }
        // }
        // System.out.println("number sum"+sum);

      

        //=============

         //=============  print sum of all odd number m to n

         Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int m,n,sum=0;
        System.out.println("enter positive number m");
        m = input.nextInt();

         System.out.println("enter positive number n");
        n = input2.nextInt();

        for(int i = m; i<=n; i++){
           if(i%2 != 0){
            sum = sum+i;
           }else{
            continue;
           }
        }
        System.out.println("number sum"+sum);
      

        //=============
        
    }
    
}
