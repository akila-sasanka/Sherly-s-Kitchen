
package entity;

public class CustomEntity {
    private String cid;
    private String name;
    private String mobile;
    private String address;
    
    private String iid;
    private String itemName;
    private int itemQty;
    private double itemPrice;
    
    private String oid;
    private String date;
    private boolean paymentState;
    private boolean opeanCloseState;
    private double amount;
    private String requiredDate;   
    private int qty;
    private double unitPrice;

    public CustomEntity(String iid, String oid, int qty) {
        this.iid = iid;
        this.oid = oid;
        this.qty = qty;
    }

    public CustomEntity() {
    }

    public CustomEntity(String cid, String name, String mobile, String address, String iid, String itemName, int itemQty, double itemPrice, String oid, String date, boolean paymentState, boolean opeanCloseState, double amount, String requiredDate, int qty, double unitPrice) {
        this.cid = cid;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.iid = iid;
        this.itemName = itemName;
        this.itemQty = itemQty;
        this.itemPrice = itemPrice;
        this.oid = oid;
        this.date = date;
        this.paymentState = paymentState;
        this.opeanCloseState = opeanCloseState;
        this.amount = amount;
        this.requiredDate = requiredDate;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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

    /**
     * @return the oid
     */
    public String getOid() {
        return oid;
    }

    /**
     * @param oid the oid to set
     */
    public void setOid(String oid) {
        this.oid = oid;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the paymentState
     */
    public boolean isPaymentState() {
        return paymentState;
    }

    /**
     * @param paymentState the paymentState to set
     */
    public void setPaymentState(boolean paymentState) {
        this.paymentState = paymentState;
    }

    /**
     * @return the opeanCloseState
     */
    public boolean isOpeanCloseState() {
        return opeanCloseState;
    }

    /**
     * @param opeanCloseState the opeanCloseState to set
     */
    public void setOpeanCloseState(boolean opeanCloseState) {
        this.opeanCloseState = opeanCloseState;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the requiredDate
     */
    public String getRequiredDate() {
        return requiredDate;
    }

    /**
     * @param requiredDate the requiredDate to set
     */
    public void setRequiredDate(String requiredDate) {
        this.requiredDate = requiredDate;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    
    
    
}
