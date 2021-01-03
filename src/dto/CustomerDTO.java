
package dto;

public class CustomerDTO {
    private String cid;
    private String name;
    private String mobile;
    private String address;

    public CustomerDTO(String cid,String name, String mobile, String address) {
        this.cid = cid;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
    }

    public CustomerDTO() {
    }

    
    
    public String getCid() {
        return cid;
    }

    /**
     * 
     * @return the name
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

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
    
    
}
