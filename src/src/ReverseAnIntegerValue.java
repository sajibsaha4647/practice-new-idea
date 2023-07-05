package src;

import java.util.Scanner;

public class ReverseAnIntegerValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value ,sum = 0,temp,r;
        System.out.println("enter a positive number");
        value = input.nextInt();
        temp = value;

        while(temp != 0){
            r = temp % 10;
            sum = sum*10+r;
            temp = temp/10;
            System.out.println("print"+sum);
        }

        System.out.println("reverse value are"+sum);







    }
    
}
