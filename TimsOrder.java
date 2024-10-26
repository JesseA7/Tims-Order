package assignment7_000886545;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class that represents the order with products
 */
public class TimsOrder {
    /**
     * The name of the order
     */
    private String name;
    /**
     * The list of products in the order
     */
    private List<TimsProduct> products;
    /**
     * The number of products in the order
     */
    private int size;

    /**
     * Constructs a new order with the given name and number of products
     *
     * @param name The name of the order
     * @param size The number of products in the order
     */
    private TimsOrder(String name, int size) {
        this.name = name;
        this.size = size;
        products = new ArrayList<>();
    }

    /**
     * Constructs a new order
     *
     * @return A new order
     */
    public static TimsOrder create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the number of products you want to order: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        TimsOrder order = new TimsOrder(name, size);

        // Manages user interaction to get the information for each product
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the type of product #%d (Mug, Donut, Coffee, Thermos): ", i + 1);
            String type = scanner.nextLine();
            // Validate the input
            if (type.equalsIgnoreCase("Mug")) {
                order.products.add(Mug.create());
            } else if (type.equalsIgnoreCase("Donut")) {
                order.products.add(Donut.create());
            } else if (type.equalsIgnoreCase("Coffee")) {
                order.products.add(Coffee.create());
            } else if (type.equalsIgnoreCase("Thermos")) {
                order.products.add(Thermos.create());
            } else {
                System.out.println("Invalid product type, please try again.");
                i--; // Decrement i to try again
            }
        }
        return order;
    }

    /**
     * Gets the sum of the price of the products in the order
     *
     * @return The sum of the price of the products in the order
     */
    public double getAmountDue() {
        double amountDue = 0;
        // Iterate over items in the order and calculate total cost
        for (TimsProduct product : products) {
            amountDue += product.getRetailPrice();

        }
        return amountDue;
    }

    /**
     * Method for displaying the order and its products
     *
     * @return The order and its products
     */
    public String toString() {
        String output = "Order for: " + name + "\n";
        for (TimsProduct product : products) {
            output += product.toString() + "\n";
        }
        return output;
    }
}
