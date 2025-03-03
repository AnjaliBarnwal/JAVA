/Write a java program to create a simple array and access array element.
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nArray elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        scanner.close();
    }
}
