
import java.util.Scanner;
public class WhileLoop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = sc.nextInt();
        while (i <= j) {
            System.out.println(i);
            i += 2;
        }
    }
}
