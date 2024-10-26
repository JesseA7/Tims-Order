package assignment7_000886545;

import java.util.Scanner;

/**
 * Class that represents a coffee consumable object for an order
 */
public class Coffee extends TimsProduct implements Consumable {
    /**
     * The description of the coffee
     */
    private String description;
    /**
     * The number of calories in the coffee
     */
    private int calorieCount;

    /**
     * Constructs a new coffee
     *
     * @param name         The name of the coffee
     * @param description  The description of the coffee
     * @param calorieCount The number of calories in the coffee
     * @param cost         The cost of the coffee
     * @param price        The price of the coffee
     */
    private Coffee(String name, String description, int calorieCount, double cost, double price) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calorieCount;
    }

    /**
     * Creates a new coffee using user interaction
     *
     * @return A new coffee with the given parameters
     */
    public static Coffee create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the coffee: ");
        String name = scanner.nextLine();
        System.out.print("Enter the description of the coffee: ");
        String description = scanner.nextLine();
        System.out.print("Enter the number of calories in the coffee: ");
        int calorieCount = scanner.nextInt();
        System.out.print("Enter the cost of the coffee: ");
        double cost = scanner.nextDouble();
        System.out.print("Enter the price of the coffee: ");
        double price = scanner.nextDouble();
        return new Coffee(name, description, calorieCount, cost, price);
    }

    /**
     * Gets the description of the coffee
     *
     * @return The description of the coffee
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the number of calories in the coffee
     *
     * @return The number of calories in the coffee
     */
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     * Gets the consumption method of the coffee
     *
     * @return The consumption method of the coffee
     */
    @Override
    public String getConsumptionMethod() {
        return "Drink it";
    }

    /**
     * Method to display the coffee information
     *
     * @return The coffee information
     */
    @Override
    public String toString() {
        return super.toString() + "\nType... Coffee{description=" + getDescription() + ", calorieCount=" + getCalorieCount() + "}";
    }
}
