package assignment7_000886545;

/**
 * Class that represents a product for an order
 */
public class TimsProduct implements Commodity {
    /**
     * The name of the product
     */
    private String name;
    /**
     * The production cost of the product
     */
    private double cost;
    /**
     * The retail price of the product
     */
    private double price;

    /**
     * Construct a new product
     *
     * @param name  The name of the product
     * @param cost  The cost of the product
     * @param price The price of the product
     */
    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /**
     * Get the name of the product
     *
     * @return The name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Get the cost of the product
     *
     * @return The cost of the product
     */
    @Override
    public double getProductionCost() {
        return cost;
    }

    /**
     * Get the price of the product
     *
     * @return The price of the product
     */
    @Override
    public double getRetailPrice() {
        return price;
    }

    /**
     * Method for displaying the product information
     *
     * @return The product information
     */
    public String toString() {
        return "TimsProduct{name=" + this.getName() + ", cost=" + this.getProductionCost() + ", price=" + this.getRetailPrice() + "}";
    }
}
