package src;

import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a positive number");
        int num,sum = 0,temp,r;
        num = input.nextInt();
        temp = num;

        while(temp != 0){
            r = temp%10;
            sum = sum+r*r*r;
            temp = temp/10;
        }

        if(sum == num){
            System.out.println("this is an armstrong number");
        }else{
            System.out.println("this was not an armstrong number");
        }

    }
}