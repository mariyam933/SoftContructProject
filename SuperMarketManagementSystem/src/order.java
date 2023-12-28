/**
 * The `order` class represents an order for a product in the grocery management system.
 * Each order includes details such as product ID, name, quantity, total price, and type.
 */
public class order {

    // Private fields to store order information
    private int ID;
    private String name;
    private int quantity;
    private double totalPrice;
    String type;

    /**
     * Constructor for creating an order with the specified details.
     *
     * @param ID The unique identifier for the product.
     * @param name The name of the product.
     * @param quantity The quantity of the product in the order.
     * @param totalPrice The total price of the order for the specified quantity.
     * @param type The type of the order (e.g., "curr" for current cart items).
     */
    public order(int ID, String name, int quantity, double totalPrice, String type) {
        this.ID = ID;
        this.name = name;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.type=type;
    }


    /**
     * Sets the ID of the product in the order.
     *
     * @param ID The unique identifier for the product.
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Sets the name of the product in the order.
     *
     * @param name The name of the product.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the quantity of the product in the order.
     *
     * @param quantity The quantity of the product in the order.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    /**
     * Sets the total price of the order for the specified quantity.
     *
     * @param totalPrice The total price of the order.
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    /**
     * Gets the ID of the product in the order.
     *
     * @return The unique identifier for the product.
     */
    public int getID() {
        return ID;
    }
    
    /**
     * Gets the name of the product in the order.
     *
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Gets the quantity of the product in the order.
     *
     * @return The quantity of the product in the order.
     */
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Gets the total price of the order for the specified quantity.
     *
     * @return The total price of the order.
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Gets the type of the order.
     *
     * @return The type of the order (e.g., "curr" for current cart items).
     */    
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the order.
     *
     * @param type The type of the order (e.g., "curr" for current cart items).
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns a string representation of the order.
     *
     * @return A string containing the order details in the format: ID, name, quantity, totalPrice.
     */
    public String toString()
    {
        return getID()+","+getName()+","+getQuantity()+","+getTotalPrice();
    }

}
