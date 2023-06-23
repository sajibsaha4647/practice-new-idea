package src;

import java.util.Scanner;

public class checkVouleAndConsonent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char ch;

        System.out.println("enter any letter");

        ch = input.next().charAt(0);

        if(ch == 'a'){
            System.out.println("this is Vowel");
        }else if(ch == 'e'){
            System.out.println("this is Vowel");
        }else if(ch == 'i'){
            System.out.println("this is Vowel");
        }else if(ch == 'o'){
            System.out.println("this is Vowel");
        }else if(ch == 'u'){
            System.out.println("this is Vowel");
        }else{
            System.out.println("this is consonant");
        }




    }

}
