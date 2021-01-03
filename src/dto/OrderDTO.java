
package dto;

import java.util.ArrayList;

public class OrderDTO {
    private String oid;
    private String date;
    private String cid;
    private boolean paymentState;
    private boolean opeanCloseState;
    private double amount;
    private String requiredDate;
    private ArrayList<OrderDetailDTO> list=new ArrayList<>();

    public OrderDTO(String oid, String date, String cid, boolean paymentState, boolean opeanCloseState, double amount,String requiredDate) {
        this.oid = oid;
        this.date = date;
        this.cid = cid;
        this.paymentState = paymentState;
        this.opeanCloseState = opeanCloseState;
        this.amount = amount;
        this.requiredDate=requiredDate;
    }

    public OrderDTO() {
    }

    public String getOid() {
        return oid;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(String requiredDate) {
        this.requiredDate = requiredDate;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public boolean isPaymentState() {
        return paymentState;
    }

    public void setPaymentState(boolean paymentState) {
        this.paymentState = paymentState;
    }

    public boolean isOpeanCloseState() {
        return opeanCloseState;
    }

    public void setOpeanCloseState(boolean opeanCloseState) {
        this.opeanCloseState = opeanCloseState;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ArrayList<OrderDetailDTO> getList() {
        return list;
    }

    public void setList(ArrayList<OrderDetailDTO> list) {
        this.list = list;
    }
    
    
    
}
