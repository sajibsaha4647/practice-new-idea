package src;

public class BitwiseOperator {

    public static void main(String[] args) {

        //  32  16   8   4   2  1 //convert binary

        //   1   0    0   0    0  0 // value of a

        //   0   0    1    1    0  0 //value of b
        //  ======================================
        // &= 0   0     0    0   0   0 //result of and operator // all input should be height

        //|=  1   0     1    1    0   0 //result of or operator // any input get high

        //^ = 1   0     1     1   0    0 //result of  Exor operator // any odd input get high then high

        // >> = // result of right shift is get devide by 2 and with declare times of top convert binary which i wirte .  that means a>> 3
        // here started from left and devide 3 times and gets result 4 . 32/2 = 16, 16/2 = 8, 8/2 =4 the result is 4


        int a = 32;
        int b = 12 ;
        int c;

        c = a&b;

        System.out.println("bitwise and " + c);

        c = a|b ;

        System.out.println("bitwise or"+ c);

        c = a^b;

        System.out.println("bitwise exor"+ c);

        c = a>>3;

        System.out.println("right shift always devided from 32 / 2 with 3 times " + c );


        c = a<<3;

        System.out.println("left shift always multiply by 2 with  started from 32*2 3 time  " + c);







    }

}
