package src;

import java.util.Scanner;

public class CheckSmallLetterandCapitalLetter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char ch;

        System.out.println("enter any input char");

        ch = input.next().charAt(0);

        if(ch >='a' && ch<='z'){
            System.out.println("small letter");
        }else{
            System.out.println("capital letter");
        }


    }

}
