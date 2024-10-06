package picmin_terminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductCRUD productCRUD = new ProductCRUD();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nProduct Management System");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product origin: ");
                    String origin = scanner.next();
                    System.out.print("Enter product harvest date: ");
                    int harvestDate = scanner.nextInt();
                    System.out.print("Enter product stock: ");
                    int stock = scanner.nextInt();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
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
                    double newPrice = scanner.nextDouble();
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

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
