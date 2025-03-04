//Write java codes to implement the followings – Methods of Stringbuffer class: append(),
//capacity(), charAt(), delete(), deleteCharAt().; ensureCapacity(), getChars(), indexOf(), insert(),
//length(), setCharAt(), setLength(), substring(), toString().
public class program10 {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // append() method - Appends the given string to the end of the current StringBuffer
        sb.append(" World");
        System.out.println("After append: " + sb);

        // capacity() method - Returns the current capacity of the StringBuffer
        System.out.println("Capacity: " + sb.capacity());

        // charAt() method - Returns the character at the specified index
        System.out.println("Character at index 6: " + sb.charAt(6));

        // delete() method - Removes characters from the StringBuffer between the specified start and end index
        sb.delete(5, 11); // Removes " World"
        System.out.println("After delete: " + sb);

        // deleteCharAt() method - Removes the character at the specified index
        sb.deleteCharAt(5); // Removes 'o'
        System.out.println("After deleteCharAt: " + sb);

        // ensureCapacity() method - Ensures that the StringBuffer has a minimum capacity
        sb.ensureCapacity(100);  // Ensures capacity is at least 100
        System.out.println("Capacity after ensureCapacity(100): " + sb.capacity());

        // getChars() method - Copies the characters from the StringBuffer into a character array
        char[] charArray = new char[10];
        sb.getChars(0, sb.length(), charArray, 0);
        System.out.println("getChars() method: " + new String(charArray));

        // indexOf() method - Returns the index of the first occurrence of a specified substring
        System.out.println("Index of 'o': " + sb.indexOf("o"));

        // insert() method - Inserts the specified string at the specified position
        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb);

        // length() method - Returns the length of the StringBuffer (number of characters)
        System.out.println("Length: " + sb.length());

        // setCharAt() method - Sets the character at the specified index
        sb.setCharAt(5, 'G');
        System.out.println("After setCharAt: " + sb);

        // setLength() method - Sets the length of the StringBuffer (may truncate or pad with null characters)
        sb.setLength(10); // Truncates the string
        System.out.println("After setLength(10): " + sb);

        // substring() method - Returns a substring from the StringBuffer
        String subString = sb.substring(0, 5);
        System.out.println("Substring: " + subString);

        // toString() method - Converts the StringBuffer to a String
        String str = sb.toString();
        System.out.println("toString() method: " + str);
    }
}
