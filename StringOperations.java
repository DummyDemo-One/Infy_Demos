package myjavademos;

public class StringOperations {

	public static void main(String[] args) {
	      // Student info
        String studentName = "Tommy";
        String className = "Playgroup A";
        System.out.println("=== Original Strings ===");
        System.out.println("Student Name: " + studentName);
        System.out.println("Class Name: " + className);
        
        System.out.println("\n=== String Methods Examples ===");
        // 1. length()
        System.out.println("Name Length: " + studentName.length());
        // 2. charAt()
        System.out.println("First Character of Name: " + studentName.charAt(0));
        
        // 3. toUpperCase() / toLowerCase()
        System.out.println("Uppercase Name: " + studentName.toUpperCase());
        System.out.println("Lowercase Name: " + studentName.toLowerCase());

        // 4. substring()
        System.out.println("First 3 letters of Name: " + studentName.substring(0, 3));
        
        // 5. contains()
        System.out.println("Name contains 'Tom'? " + studentName.contains("Tom"));

        // 6. startsWith() / endsWith()
        System.out.println("Class starts with 'Play'? " + className.startsWith("Play"));
        System.out.println("Class ends with 'B'? " + className.endsWith("B"));
        /*
         * indexOf(): Returns the index of the first occurrence of a character or substring.
lastIndexOf(): Returns the index of the last occurrence of a character or substring.
         */
        // 7. indexOf() / lastIndexOf()
        System.out.println("Index of 'm' in Name: " + studentName.indexOf('m'));
        System.out.println("Last Index of 'm' in Name: " + studentName.lastIndexOf('m'));

        // 8. equals() / equalsIgnoreCase()
        System.out.println("Name equals 'Tommy'? " + studentName.equals("Tommy"));
        System.out.println("Name equals 'tommy' (ignore case)? " + studentName.equalsIgnoreCase("tommy"));
        // 9. trim()
        String messyName = "  Tommy  ";
        System.out.println("Trimmed Name: '" + messyName.trim() + "'");
        
        // 10. replace() / replaceAll()
        System.out.println("Replace 'o' with 'a': " + studentName.replace('o', 'a'));
        System.out.println("Replace 'Tommy' with 'Jerry': " + studentName.replaceAll("Tommy", "Jerry"));

        // 11. split()
        String sentence = "Chennai,Coimbatore,Salem";
        String[] words = sentence.split(",");
        System.out.println("Length: "+words.length);        
        System.out.println("Split sentence into words:");
        for (String word : words) {
            System.out.println(word);
        }
        
        // 12. concat()
        String fullInfo = studentName.concat(" - ").concat(className);
        System.out.println("Concatenated Info: " + fullInfo);
/*
 * isEmpty(): Returns true only if the string is completely empty ("").

isBlank(): Returns true if the string is either empty or consists only of whitespace characters (spaces, tabs, newlines).
 */
        // 13. isEmpty() / isBlank()
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());
        System.out.println("Is blankStr blank? " + blankStr.isBlank());

        String str1 = "123456";  // A string containing only digits
        String str2 = "abc123";  // A string containing letters and digits

        // Regular expression to match only digits
        //\\d means any digit, and + means one or more
        String regex = "\\d+";  // \\d matches one or more digits

        System.out.println("Is str1 a valid number? " + str1.matches(regex));
        System.out.println("Is str2 a valid number? " + str2.matches(regex));

/*
 * ^: Asserts the start of the string.
 * $: Asserts the end of the string.
 * [A-Z]: Matches the first character, which must be an uppercase letter (A-Z).

[a-zA-Z]*: Matches zero or more alphabetic characters (both lowercase a-z and uppercase A-Z).
 */
     // Regular expression to match a name that starts with an uppercase letter and contains only letters
        String regex1 = "^[A-Z][a-zA-Z]*$";

        // Test names
        String[] names = {
            "John",        // Valid
            "alice",       // Invalid (starts with lowercase letter)
            "Bob",         // Valid
            "alice123",    // Invalid (contains digits)
            "JohnDoe",     // Valid
            "John_Doe",    // Invalid (contains underscore)
            "Mary Ann",    // Invalid (contains space)
            "O'Connor"     // Invalid (contains apostrophe)
        };

        // Check each name
        for (String name : names) {
            System.out.println("Is '" + name + "' a valid name? " + name.matches(regex1));
        }

	}

}
