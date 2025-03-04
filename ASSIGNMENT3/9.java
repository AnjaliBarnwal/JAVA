//9. Write java codes to implement the followings – Basic string handling concepts- Concept of
//mutable and immutable string, Methods of String class-charAt(), compareTo(), equals(),
//equalsIgnoreCase(), indexOf(), length() , substring().; toCharArray(), toLowerCase(), toString(),
//toUpperCase() , trim() , valueOf() methods

public class StringMethodsExample {
    public static void main(String[] args) {
        // Demonstrating basic string handling methods
        
        String str1 = "Hello World";
        
        // charAt() method
        System.out.println("Character at index 4: " + str1.charAt(4));
        
        // compareTo() method
        String str2 = "Hello";
        System.out.println("Comparison result: " + str1.compareTo(str2));
        
        // equals() method
        System.out.println("str1 equals str2: " + str1.equals(str2));
        
        // equalsIgnoreCase() method
        System.out.println("str1 equals str2 (ignore case): " + str1.equalsIgnoreCase("hello world"));
        
        // indexOf() method
        System.out.println("First occurrence of 'o': " + str1.indexOf('o'));
        
        // length() method
        System.out.println("Length of str1: " + str1.length());
        
        // substring() method
        System.out.println("Substring from index 6: " + str1.substring(6));
        
        // toCharArray() method
        char[] charArray = str1.toCharArray();
        System.out.println("Character array: " + java.util.Arrays.toString(charArray));
        
        // toLowerCase() method
        System.out.println("Lowercase: " + str1.toLowerCase());
        
        // toUpperCase() method
        System.out.println("Uppercase: " + str1.toUpperCase());
        
        // toString() method (useful for non-String objects)
        Integer num = 42;
        System.out.println("String representation of num: " + num.toString());
        
        // trim() method
        String str3 = "  Hello Java  ";
        System.out.println("Trimmed string: '" + str3.trim() + "'");
        
        // valueOf() method
        double pi = 3.14159;
        System.out.println("String value of pi: " + String.valueOf(pi));
        
        // Immutable String example
        String str4 = "Immutable";
        str4 = str4 + " String";
        System.out.println("Modified immutable string: " + str4);
        
        // Mutable String using StringBuilder
        StringBuilder strBuilder = new StringBuilder("Mutable");
        strBuilder.append(" String");
        System.out.println("Modified mutable string: " + strBuilder);
    }
}
