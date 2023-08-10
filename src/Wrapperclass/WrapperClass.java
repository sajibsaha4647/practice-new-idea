package Wrapperclass;

public class WrapperClass {

    public static void main(String[] args) {

        //primtive object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println(y);

        //now unboxing
        Integer z = y ;
        System.out.println(z);

        //object primtive data type
        double p = 10.10 ;

        double c = p;

        System.out.println(p);
        System.out.println(c);
        
    }
    
}
