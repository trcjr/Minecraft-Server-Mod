
/**
 *
 * @author James
 */
public class Item {

    private int itemId = 1, amount = 1;
    private String name = "";

    /**
     * Create an item with an id of 1 and amount of 1
     */
    public Item() {
    }

    /**
     * Creates an item with specified id, amount and name
     * @param itemId
     * @param amount
     * @param name
     */
    public Item(int itemId, int amount, String name) {
        this(itemId, amount);
        this.name = name;
    }

    /**
     * Creates an item with specified id and name
     * @param itemId
     * @param name
     */
    public Item(int itemId, String name) {
        this(itemId);
        this.name = name;
    }

    /**
     * Creates an item with specified id and amount
     * @param itemId
     * @param amount
     */

    public Item(int itemId, int amount) {
        this(itemId);
        this.amount = amount;
    }

    /**
     * Creates and item with the specified id
     * @param itemId
     */
    public Item(int itemId) {
        this.itemId = itemId;
        this.amount = 0;
    }

    /**
     * Sets the item name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets item id to specified id
     * @param itemId
     */
    public void setId(int itemId) {
        this.itemId = itemId;
    }

    /**
     * Returns the item id
     * @return itemId
     */
    public int getId() {
        return itemId;
    }

    /**
     * Returns the amount
     * @return amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the amount
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Returns true if specified item id is a valid item id.
     * @param itemId
     * @return
     */
    public static boolean isValidItem(int itemId) {
        if (itemId < ez.c.length)
            return ez.c[itemId] != null;
        return false;
    }
}
