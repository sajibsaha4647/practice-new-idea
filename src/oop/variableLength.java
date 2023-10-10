package oop;

public class variableLength {

    public static void main(String[] args) {
        addsomevalue(12, 12, 12, 12);

    }

    static void addsomevalue(int... num) {

        int sum = 0;

        for (int x : num) {

            sum = sum + x;

        }

        System.out.println(sum);

    }

}
