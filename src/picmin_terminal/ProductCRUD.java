package picmin_terminal;

import java.util.ArrayList;
import java.util.List;

public class ProductCRUD {
    private List<Product> products;
    private int nextId;

    public ProductCRUD() {
        this.products = new ArrayList<>();
        this.nextId = 1;
    }

    // Create a new product
    public void createProduct(String name, String origin, int harvestDate, int stock, float price) {
        Product newProduct = new Product(nextId++, name, origin, harvestDate, stock, price);
        products.add(newProduct);
        System.out.println("Product added successfully!");
    }

    // Read and display all products
    
//    hier pas ik sequentie toe in de form van if statements
    public void readProducts() {
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    // Update an existing product
    public void updateProduct(int id, String newName, String newOrigin, int newHarvestDate, int newStock, double newPrice) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setOrigin(newOrigin);
                product.setHarvestDate(newHarvestDate);
                product.setStock(newStock);
                product.setPrice(newPrice);
                System.out.println("Product updated successfully!");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Delete a product using it's ID
    public void deleteProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                System.out.println("Product deleted successfully!");
                return;
            }
        }
        System.out.println("Product not found.");
    }
}
