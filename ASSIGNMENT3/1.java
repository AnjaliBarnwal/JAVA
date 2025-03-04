//Write a java program to implement BufferedReader class.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class program1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            
            System.out.println("Enter your name:");
            String name = reader.readLine();
            System.out.println("Enter your age:");
            String ageString = reader.readLine();
            int age = Integer.parseInt(ageString);
            System.out.println("Hello, " + name + "! You are " + age + " years old.");

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
