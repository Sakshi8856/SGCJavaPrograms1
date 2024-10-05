
public class Casting6 {
	   public static void main(String[] args) {
           double num = 5.78;
           int result = (int)num;  // Error: incompatible types: possible lossy conversion from double to int
           System.out.println("Int value: " + result);
       }

}
