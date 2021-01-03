
package entity;

public class Item {
    private String iid;
    private String itemName;
    private int itemQty;
    private double itemPrice;

    public Item(String iid, String itemName, int itemQty, double itemPrice) {
        this.iid = iid;
        this.itemName = itemName;
        this.itemQty = itemQty;
        this.itemPrice = itemPrice;
    }

    public Item() {
    }

    /**
     * @return the iid
     */
    public String getIid() {
        return iid;
    }

    /**
     * @param iid the iid to set
     */
    public void setIid(String iid) {
        this.iid = iid;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemQty
     */
    public int getItemQty() {
        return itemQty;
    }

    /**
     * @param itemQty the itemQty to set
     */
    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }

    /**
     * @return the itemPrice
     */
    public double getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    
}
