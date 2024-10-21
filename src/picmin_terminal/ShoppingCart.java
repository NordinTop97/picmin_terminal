package picmin_terminal;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	//TODO Add a fruit cart 
    private List<ProductCart> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(String name, int quantity, double price) {
        CartItem item = new CartItem(name, quantity, price);
        items.add(item);
        System.out.println(name + " added to the cart.");
    }

    public void readItems() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Shopping Cart:");
            for (CartItem item : items) {
                System.out.println(item);
            }
        }
    }
}
