import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the dimensions of the first matrix (A)
        System.out.print("Enter the number of rows for the first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int colsA = scanner.nextInt();

        // Ask the user for the dimensions of the second matrix (B)
        System.out.print("Enter the number of rows for the second matrix: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int colsB = scanner.nextInt();

        // Matrix multiplication is possible only if colsA == rowsB
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. The number of columns of the first matrix must equal the number of rows of the second matrix.");
            return;
        }

        // Create the matrices A and B
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] resultMatrix = new int[rowsA][colsB];

        // Take input for matrix A
        System.out.println("Enter the elements of the first matrix (A):");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print("Element at row " + i + ", column " + j + ": ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Take input for matrix B
        System.out.println("Enter the elements of the second matrix (B):");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print("Element at row " + i + ", column " + j + ": ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Matrix multiplication (A * B = Result)
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Display the result of the matrix multiplication
        System.out.println("\nThe result of matrix multiplication (A * B) is:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
