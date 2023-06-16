package src;

import java.util.Scanner;

public class ArithMaticOperator {

    public static void main(String[] args) {


        int number1,number2,result;

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("enter number one");

        number1 = input.nextInt();

        System.out.println("enter number two");

        number2 =input2.nextInt();


        result = number1+number2;
        System.out.println(result);

        result = number2-number1;
        System.out.println(result);

        result = number2*number1;
        System.out.println(result);

        result = number2/number1;
        System.out.println(result);

        result = number2%number1;
        System.out.println(result);




    }

}
