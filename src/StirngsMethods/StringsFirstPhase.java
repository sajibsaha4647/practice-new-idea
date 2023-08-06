package StirngsMethods;

public class StringsFirstPhase {
    public static void main(String[] args) {
        
        String s1 = "this is java" ;
        String s2 = new String("this is new java");
        char[] s3= {'j','a','v','a'} ;

        StringBuffer s4 = new StringBuffer("name is java list");


        System.out.println(s1);
        System.out.println("===");
        System.out.println(s2);
        System.out.println("===");
        System.out.println(s3);
        System.out.println("===");
        System.out.println(s1.concat(s2));
        System.out.println("===");
        String s24 = s2.toUpperCase() ;
        System.out.println(s24);

        s4.delete(0, 5);

        //

    }
}
