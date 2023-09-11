package Binary;

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a number");
        int num = input.nextInt();

        String value = "101010";

        // binary to decimal
        Integer decimal = Integer.parseInt(value, 2);
        System.out.println(decimal);

        // Decimal To Binary, octal, hexadecimal
        int decim = 15;

        String binaryString = Integer.toBinaryString(decim);
        String hexString = Integer.toHexString(decim);

        System.out.println(hexString);
    }

}