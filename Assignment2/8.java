//Implementation of parameterized constructor.
public class Program8 {

    // Instance variables (attributes)
    private String name;
    private int age;

    // Parameterized constructor
    public Program8(String name, int age) {
        // Initializing instance variables with values passed during object creation
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of the Person class using the parameterized constructor
        Program8 person1 = new Program8("John", 25); // Passing values to the constructor
        person1.displayDetails(); // Displaying the details of person1

        // Creating another object with different values
        Program8 person2 = new Program8("Alice", 30); // Passing different values to the constructor
        person2.displayDetails(); // Displaying the details of person2
    }
}
