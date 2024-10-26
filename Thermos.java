package assignment7_000886545;

import javafx.scene.paint.Color;

import java.util.Scanner;

/**
 * Class that represents a thermos object for an order
 */
public class Thermos extends TimsProduct {
    /**
     * The color of the thermos
     */
    private Color color;

    /**
     * Constructs a new thermos
     *
     * @param name  The name of the thermos
     * @param color The color of the thermos
     * @param cost  The cost of the thermos
     * @param price The price of the thermos
     */
    private Thermos(String name, Color color, double cost, double price) {
        super(name, cost, price);
        this.color = color;
    }

    /**
     * Creates a new thermos using user interaction
     *
     * @return A new thermos with the given parameters
     */
    public static Thermos create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the thermos: ");
        String name = scanner.nextLine();
        System.out.print("Enter the color of the thermos (e.g. red, blue, green): ");
        String colorString = scanner.nextLine();
        Color color = Color.valueOf(colorString.toUpperCase());
        System.out.print("Enter the cost of the thermos: ");
        double cost = scanner.nextDouble();
        System.out.print("Enter the price of the thermos: ");
        double price = scanner.nextDouble();
        return new Thermos(name, color, cost, price);
    }

    /**
     * Get the color of the thermos
     *
     * @return The color of the thermos
     */
    public Color getColor() {
        return color;
    }

    /**
     * Method to display the thermos information
     *
     * @return The thermos information
     */
    @Override
    public String toString() {
        return super.toString() + "\nType... Thermos{color=" + this.getColor() + "}";
    }
}
