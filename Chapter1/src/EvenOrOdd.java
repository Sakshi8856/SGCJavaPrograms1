import java.util.Scanner;

public class EvenOrOdd {
    
    public static void main(String[] args) {
        // Create a scanner object named t to get user input
        Scanner t = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter an integer: ");
        int number = t.nextInt();
        
        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        // Close the scanner
        t.close();
    }
}
