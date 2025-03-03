//Write a Java program to find the sum of diagonal elements in a 2D arr
import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at row " + i + ", column " + j + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int diagonalSum = 0;
        for (int i = 0; i < Math.min(rows, cols); i++) {
            diagonalSum += matrix[i][i];  
        }

        
        for (int i = 0; i < Math.min(rows, cols); i++) {
            diagonalSum += matrix[i][cols - i - 1]; 
        }
        if (rows == cols && rows % 2 != 0) {
            diagonalSum -= matrix[rows / 2][cols / 2];
        }
        System.out.println("The sum of the diagonal elements is: " + diagonalSum);
        scanner.close();
    }
}
