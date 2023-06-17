package src;

import java.util.Scanner;

public class TriangeDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double result,base,height;

        System.out.println("enter base");

        base = input.nextDouble();

        System.out.println("enter height");

        Scanner input2 = new Scanner(System.in);

        height = input2.nextDouble();
        result = .5*base*height;

        System.out.println(result);


        //radious squire
        Scanner inputq = new Scanner(System.in);
        double result2,radious;
        System.out.println("enter radious");

        radious = inputq.nextDouble();

        result2 = 3.1416*radious*radious ;


        System.out.println("here result is:" +result2);



    }
}
