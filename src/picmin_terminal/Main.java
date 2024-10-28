package picmin_terminal;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static User loggedInUser = null;
	
    public static void main(String[] args) {
        ProductCRUD productCRUD = new ProductCRUD();
        boolean exit = false;
        
//      added a while statement for when you are not exit and made cases for the choices you could make
//      
//      Hier pas ik iteratie  toe van het imperatief programmeren
//      door middel van een while statement toe te passen waar nadat je niet exit het herhaalt  
        while (!exit) {
            System.out.println("\nPikmin Application");
            //TODO only when logged in as admin case 1,3,4
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.println("6. Login");
            System.out.println("7. Add item to cart");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

//          Hier pas ik 1.4 imperatief programmeren toe in de form van selectie
            switch (choice) {
            
                case 1:
                	if(!isLoggedIn()) {
                		System.out.println("You do not have permission.");
                		break;
                	}
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product origin: ");
                    String origin = scanner.next();
                    System.out.print("Enter product harvest date: ");
                    int harvestDate = scanner.nextInt();
                    System.out.print("Enter product stock: ");
                    int stock = scanner.nextInt();
                    System.out.print("Enter product price: ");
                    float price = scanner.nextFloat();
                    productCRUD.createProduct(name, origin, harvestDate, stock, price);
                    break;

                case 2:
                    productCRUD.readProducts();
                    break;

                case 3:
                    System.out.print("Enter product ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new product name: ");
                    String newName = scanner.next();
                    System.out.print("Enter new product origin: ");
                    String newOrigin = scanner.next();
                    System.out.print("Enter new product harvest date: ");
                    int newHarvestDate = scanner.nextInt();
                    System.out.print("Enter new product stock: ");
                    int newStock = scanner.nextInt();
                    System.out.print("Enter new product price: ");
                    float newPrice = scanner.nextFloat();
                    productCRUD.updateProduct(updateId, newName, newOrigin, newHarvestDate, newStock, newPrice);
                    break;

                case 4:
                    System.out.print("Enter product ID to delete: ");
                    int deleteId = scanner.nextInt();
                    productCRUD.deleteProduct(deleteId);
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting the application.");
                    break;
                    
                case 6:
                    // Invoke the login functionality from LoginApp class
                    User loginInformation = Login.getLoginInfo();
//                    loggedInUser != null;
//                    TODO: loggedInUser = login.Login
//                    loggedInUser != null
                    User account = Login.validateCredentials(loginInformation);
                    loggedInUser = account;
                    if (account != null) {
                        System.out.println("Proceed to protected area...");
                    } else {
                        System.out.println("Access denied. Try again.");
                    }
                    break;
                 
                case 7:
                	//ShoppingCart Case

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        
       
        scanner.close();
    }
    public static boolean isLoggedIn() {
    	return loggedInUser != null;
    }
}
