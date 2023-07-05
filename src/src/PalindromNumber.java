package src;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a positive number");

        int num,sum = 0,r,temp;
        num = input.nextInt();
        temp = num;
        while(temp != 0){
            r = temp % 10;
            sum = sum * 10 +r;
            temp = temp/10 ;
        }
        if(num == sum){
            System.out.println("palindrom number"+sum);
        }else{
              System.out.println("not a palindrom number"+num);
        }
        

    }
}
