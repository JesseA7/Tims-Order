package assignment7_000886545;

/**
 * Class for testing the classes, enabling user interaction, and displaying the total price of the order
 * March 24, 2023
 *
 * @author Jesse Atkinson
 */
public class TestClass {
    public static void main(String[] args) {
        TimsOrder t = TimsOrder.create();
        System.out.println(t);
        System.out.printf("Total Price: $%.2f\n", t.getAmountDue());
    }
}
