package src;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celncs,farn;
        System.out.println("please enter cencious value");
        celncs = input.nextDouble();

        farn = 1.8*celncs+32 ;

        System.out.println("result is" + farn);




    }
}
