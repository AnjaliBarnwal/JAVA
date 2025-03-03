//7. Implementation of default, no argument Constructor.
public class Program7 {

    private String name;
    private int age;
    public Program7() {
        this.name = "Anjali";
        this.age = 22;
        System.out.println("No-argument constructor called!");
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Program7 person1 = new Program7(); 
        person1.displayDetails(); 
    }
}
