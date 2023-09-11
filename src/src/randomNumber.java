package src;

import java.util.Random;

public class randomNumber {

    public static void main(String[] args) {

        Random random = new Random();

        // int randomNumber = random.nextInt(5);
        int randomNumber = (int) Math.random() * 10;

        System.out.println(randomNumber);

    }

}
