package assignment7_000886545;

/**
 * Interface for defining the production cost and retail price for all commodities
 */
public interface Commodity {
    /**
     * Gets cost of the product
     *
     * @return The cost of the product
     */
    public double getProductionCost();

    /**
     * Gets the price of the product
     *
     * @return The price of the product
     */
    public double getRetailPrice();
}
