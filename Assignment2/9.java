//Implementation of returning the value from the caller method.
public class program9 {
        public static void main(String[] args) {
            int result = addNumbers(5, 7);
            System.out.println("The result is: " + result);
        }
    
        public static int addNumbers(int num1, int num2) {
            int sum = num1 + num2;
            return sum; // Return the sum to the caller method
        }
    }
      

