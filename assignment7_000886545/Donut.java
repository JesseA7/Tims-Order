package assignment7_000886545;

import java.util.Scanner;

/**
 * Class that represents a donut consumable object for an order
 */
public class Donut extends TimsProduct implements Consumable {
    /**
     * The description of the donut
     */
    private String description;
    /**
     * The number of calories in the donut
     */
    private int calorieCount;

    /**
     * Constructs a new donut
     *
     * @param name         The name of the donut
     * @param description  The description of the donut
     * @param calorieCount The number of calories in the donut
     * @param cost         The cost of the donut
     * @param price        The price of the donut
     */
    private Donut(String name, String description, int calorieCount, double cost, double price) {
        super(name, cost, price);
        this.description = description;
        this.calorieCount = calorieCount;
    }

    /**
     * Creates a new donut using user interaction
     *
     * @return A new donut with the given parameters
     */
    public static Donut create() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the donut: ");
        String name = scanner.nextLine();
        System.out.print("Enter the description of the donut: ");
        String description = scanner.nextLine();
        System.out.print("Enter the number of calories in the donut: ");
        int calorieCount = scanner.nextInt();
        System.out.print("Enter the cost of the donut: ");
        double cost = scanner.nextDouble();
        System.out.print("Enter the price of the donut: ");
        double price = scanner.nextDouble();
        return new Donut(name, description, calorieCount, cost, price);
    }

    /**
     * Gets the description of the donut
     *
     * @return The description of the donut
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the number of calories in the donut
     *
     * @return The number of calories in the donut
     */
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     * Gets the consumption method of the donut
     *
     * @return The consumption method of the donut
     */
    @Override
    public String getConsumptionMethod() {
        return "Eat it";
    }

    /**
     * Method to display the donut information
     *
     * @return The donut information
     */
    @Override
    public String toString() {
        return super.toString() + "\nType... Donut{description=" + getDescription() + ", calorieCount=" + getCalorieCount() + "}";
    }
}
