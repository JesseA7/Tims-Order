package assignment7_000886545;

/**
 * Interface for defining the calorie count and consumption method for all consumables
 */
public interface Consumable {
    /**
     * Gets the number of calories in the consumable
     *
     * @return The number of calories
     */
    public int getCalorieCount();

    /**
     * Gets the consumption method for the consumable
     *
     * @return The consumption method for the consumable
     */
    public String getConsumptionMethod();
}
