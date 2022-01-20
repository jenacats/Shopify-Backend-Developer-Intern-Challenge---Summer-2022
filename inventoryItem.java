/**
 * inventoryItem contains the name and units of the item and will be used in the CRUD class
 * for the inventory linked list
 */
public class inventoryItem {
    /**
     * name of the item
     */
    private String name;
    /**
     * total count/units of the item
     */
    private int count;

    /**
     * constructor to make a new inventoryItem
     * @param name String name of the item
     * @param count int count of the item
     */
    public inventoryItem(String name, int count)
    {
        this.name = name;
        this.count = count;
    }

    /**
     * returns the name of the item
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * sets the current name with the new name
     * @param name String name to set to
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns the count of the item
     * @return int count
     */
    public int getCount() {
        return count;
    }

    /**
     * sets the current count with the new count
     * @param count int count to set to
     */
    public void setCount(int count) {
        this.count = count;
    }


}
