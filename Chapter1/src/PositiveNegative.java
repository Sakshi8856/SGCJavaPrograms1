package chapterno1;
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close(); // Close the scanner
    }

	}


