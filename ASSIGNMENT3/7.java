//Write a Java program to convert a Binary Number to Decimal and Decimal to Binary.
import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter a binary number: ");
            String binaryString = scanner.next();
            int decimal = binaryToDecimal(binaryString);
            System.out.println("Binary " + binaryString + " is Decimal " + decimal);
        } else if (choice == 2) {
            System.out.print("Enter a decimal number: ");
            int decimal = scanner.nextInt();
            String binary = decimalToBinary(decimal);
            System.out.println("Decimal " + decimal + " is Binary " + binary);
        } else {
            System.out.println("Invalid choice!");
        }
        scanner.close();
    }
    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int base = 1;  

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2; 
        }

        return decimal;
    }
    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        if (decimal == 0) {
            return "0";
        }
        while (decimal > 0) {
            binary.insert(0, decimal % 2); 
            decimal /= 2;
        }

        return binary.toString();
    }
}

