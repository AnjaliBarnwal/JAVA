//Write a Java program to calculate Sum of two 2-dimensional arrays.
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] array1 = new int[rows][cols];
        int[][] array2 = new int[rows][cols];
        int[][] sumArray = new int[rows][cols];
        System.out.println("Enter the elements of the first 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at row " + i + ", column " + j + ": ");
                array1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of the second 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at row " + i + ", column " + j + ": ");
                array2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("\nThe sum of the two 2D arrays is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println(); 
        }
        scanner.close();
    }
}

