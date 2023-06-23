package src;

import java.util.Scanner;

public class DigitSpelling {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("enter positive number 0 - 9");
        x = input.nextInt();

        switch (x){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("no result found");


        }

    }
}
