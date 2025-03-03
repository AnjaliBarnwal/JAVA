public class program10 {
    public static void program10(String[] args) {
        int x = 10;
        System.out.println("Before method call: x = " + x);
        changeValue(x);
        System.out.println("After method call: x = " + x);
    }

    public static void changeValue(int x) {
        x = 20;
        System.out.println("Inside method: x = " + x);
    }

    public static void program10(String[] args) {
        Dog dog = new Dog("Max");
        System.out.println("Before method call: dog.name = " + dog.name);
        changeName(dog);
        System.out.println("After method call: dog.name = " + dog.name);
    }

    public static void changeName(Dog dog) {
        dog.name = "Buddy";
        System.out.println("Inside method: dog.name = " + dog.name);
    }
}

class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }
}


