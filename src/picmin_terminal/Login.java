package picmin_terminal;

import java.util.Scanner;

public class Login {

    // Hardcoded credentials (In real applications, fetch from database)
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "admin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login Page");

        // Text for username
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        // Text for password
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        // Validate credentials
        if (validateCredentials(enteredUsername, enteredPassword)) {
            System.out.println("Login successful! Welcome, " + enteredUsername);
        } else {
            System.out.println("Login failed! Invalid username or password.");
        }

        scanner.close();
    }

    // Method to validate username and password
    public static boolean validateCredentials(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }

	public static boolean login() {
		// TODO Auto-generated method stub
		return false;
	}
}
