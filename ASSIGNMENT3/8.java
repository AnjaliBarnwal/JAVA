//Write a Java program to calculate the sum of natural numbers up to a certain range
import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int sum = (n * (n + 1)) / 2;
            System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
        }
        scanner.close();
    }
}

