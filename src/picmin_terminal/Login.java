package picmin_terminal;

import java.util.Scanner;

public class Login {

    // Hardcoded credentials (In real applications, fetch from database)
	public static final User ADMIN_USER = new User("admin", "admin", UserType.ADMIN);
//    public static final String USERNAME = "admin";
//    public static final String PASSWORD = "admin";

    public static void login(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        // Validate credentials
        

        scanner.close();
    }

    // Method to validate username and password
    public static User validateCredentials(User inputUser) {
//    	TODO User return
//    	inputUser.username is gelijk aan ADMIN_USER.username
//    	hetzelfde voor wachtwoord
    	
    	if(inputUser.getUsername().equals(ADMIN_USER.getUsername())
    			&& inputUser.getPassword().equals(ADMIN_USER.getPassword())) {
    		return ADMIN_USER;
    	}
    	return null;
    }

	public static User getLoginInfo() {
//		TODO return user
		System.out.println("Login Page");

        // Text for username
        System.out.println("Enter username: ");
        String enteredUsername = Main.scanner.nextLine();

        // Text for password
        System.out.println("Enter password: ");
        String enteredPassword = Main.scanner.nextLine();
        
//        if (validateCredentials(enteredUsername, enteredPassword)) {
//            System.out.println("Login successful! Welcome, " + enteredUsername);
//        } else {
//            System.out.println("Login failed! Invalid username or password.");
//        }
		return new User(enteredUsername,enteredPassword,null);
	}
	
}
