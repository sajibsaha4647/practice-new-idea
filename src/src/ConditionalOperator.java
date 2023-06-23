package src;

import java.util.Scanner;

public class ConditionalOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        int num,num2,learge;

        System.out.println("enter number one");

        num = input.nextInt();

        System.out.println("enter number two");

        num2 = input2.nextInt();

        learge = num>num2 ? num : num2;

        System.out.println("get learge number"+learge);



    }

}
