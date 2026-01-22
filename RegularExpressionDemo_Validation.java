package myjavademos;
/*

===============================================================
| Field            | Regex Pattern                                                | Meaning / Rules                                                                                               | Example Valid          | Example Invalid                 |
| ---------------- | ------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------- | ---------------------- | ------------------------------- |
| **Email**        | `^[\w.-]+@[\w.-]+\.\w{2,}$`                                  | Start → username (letters/digits/.*-) → @ → domain (letters/digits/.*-) → dot → extension (min 2 chars) → End | `alice@example.com`    | `alice@.com`, `@domain.com`     |
| **Password**     | `^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{6,12}$` | Must contain 1 digit, 1 lowercase, 1 uppercase, 1 special char (@#$%^&+=), length 6–12                        | `Alice@123`, `Abc#456` | `alice123`, `ALICE@12`, `abc@1` |
| **Phone Number** | `^\d{10}$`                                                   | Exactly 10 digits, start to end                                                                               | `9876543210`           | `987654321`, `98765abc10`       |
| **Pincode**      | `^\d{6}$`                                                    | Exactly 6 digits, start to end                                                                                | `560001`               | `56001`, `56A001`, `5600011`    |


| Email Part      | Meaning                                                                                       |
| --------- | --------------------------------------------------------------------------------------------- |
| `^`       | Start of string                                                                               |
| `[\w.-]+` | One or more word characters (a-z, A-Z, 0-9, `_`), dot `.` or dash `-` — matches username part |
| `@`       | Literal `@` symbol                                                                            |
| `[\w.-]+` | One or more word characters, dot, or dash — domain name                                       |
| `\.`      | Literal dot `.` before domain extension                                                       |
| `\w{2,}`  | At least 2 word characters — domain extension (like com, org)                                 |
| `$`       | End of string                                                                                 |


| Password Part               | Meaning                                                       |
| ------------------ | ------------------------------------------------------------- |
| `^`                | Start of string                                               |
| `(?=.*[0-9])`      | Must contain at least one digit (0-9)                         |
| `(?=.*[a-z])`      | Must contain at least one lowercase letter                    |
| `(?=.*[A-Z])`      | Must contain at least one uppercase letter                    |
| `(?=.*[@#$%^&+=])` | Must contain at least one special character `@ # $ % ^ & + =` |
| `.{6,12}`          | Total length between 6 and 12 characters                      |
| `$`                | End of string                                                 |
*/

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpressionDemo_Validation {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter Email: ");
	        String email = sc.nextLine();

	        System.out.print("Enter Password: ");
	        String password = sc.nextLine();

	        System.out.print("Enter Phone Number: ");
	        String phone = sc.nextLine();

	        System.out.print("Enter Pincode: ");
	        String pincode = sc.nextLine();


	        // Validation
	        boolean isEmailValid = Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$", email);
	        boolean isPasswordValid = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{6,12}$", password);
	        boolean isPhoneValid = Pattern.matches("^\\d{10}$", phone);
	        boolean isPincodeValid = Pattern.matches("^\\d{6}$", pincode);

	        // Results
	        System.out.println("\nValidation Results:");
	        System.out.println("Email valid? " + isEmailValid);
	        System.out.println("Password valid? " + isPasswordValid);
	        System.out.println("Phone valid? " + isPhoneValid);
	        System.out.println("Pincode valid? " + isPincodeValid);

	}

}
/*
Enter Email: abcgmail
Enter Password: 4@fA455
Enter Phone Number: 9789962180
Enter Pincode: 600059

Validation Results:
Email valid? false
Password valid? true
Phone valid? true
Pincode valid? true
*/

/*
Enter Email: ff@gmailcom
Enter Password: 43rgf335
Enter Phone Number: 9789962180
Enter Pincode: 600059

Validation Results:
Email valid? false
Password valid? false
Phone valid? true
Pincode valid? true
*/