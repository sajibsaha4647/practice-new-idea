package StirngsMethods;

public class StringPalindrom {
 public static void main(String[] args) {
    String name = "java";
    StringBuffer sb = new StringBuffer(name);
      String rev =   sb.reverse().toString();


      if(rev.equals(name)){
        System.out.println("palindrom");
      }else{
        System.out.println("not a palindrom number");
      }



 }   

    

    
}
