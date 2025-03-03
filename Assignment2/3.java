/Write a Java program to find the sum of even numbers in an integer array.
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int sumEven = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            }
        }
        System.out.println("The sum of the even numbers in the array is: " + sumEven);
        scanner.close();
    }
}
