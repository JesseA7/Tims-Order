package assignment7_000886545;

import javafx.scene.paint.Color;

import java.util.Scanner;

/**
 * Class that represents a mug object for an order
 */
public class Mug extends TimsProduct {
    /**
     * The color of the mug
     */
    private Color color;

    /**
     * Constructs a new mug
     *
     * @param name  The name of the mug
     * @param color The color of the mug
     * @param cost  The cost of the mug
     * @param price The price of the mug
     */
    private Mug(String name, Color color, double cost, double price) {
        super(name, cost, price);
        this.color = color;
    }

    /**
     * Creates a new mug using user interaction
     *
     * @return A new mug with the given parameters
     */
    public static Mug create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the mug: ");
        String name = scanner.nextLine();
        System.out.print("Enter the color of the mug (e.g. red, blue, green): ");
        String colorString = scanner.nextLine();
        Color color = Color.valueOf(colorString.toUpperCase());
        System.out.print("Enter the cost of the mug: ");
        double cost = scanner.nextDouble();
        System.out.print("Enter the price of the mug: ");
        double price = scanner.nextDouble();
        return new Mug(name, color, cost, price);
    }

    /**
     * Get the color of the mug
     *
     * @return The color of the mug
     */
    public Color getColor() {
        return color;
    }

    /**
     * Method to display the mug information
     *
     * @return The mug information
     */
    @Override
    public String toString() {
        return super.toString() + "\nType... Mug{color=" + this.getColor() + "}";
    }
}
