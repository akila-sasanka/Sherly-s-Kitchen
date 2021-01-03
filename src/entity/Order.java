
package entity;

public class Order {
   private String oid;
    private String date;
    private String cid;
    private boolean paymentState;
    private boolean opeanCloseState;
    private double amount;
    private String requiredDate;

    public Order(String oid, String date, String cid, boolean paymentState, boolean opeanCloseState, double amount, String requiredDate) {
        this.oid = oid;
        this.date = date;
        this.cid = cid;
        this.paymentState = paymentState;
        this.opeanCloseState = opeanCloseState;
        this.amount = amount;
        this.requiredDate = requiredDate;
    }

    public Order() {
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
    
    
}
