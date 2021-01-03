
package controller;

import bo.BOFactory;
import bo.custom.OrderBo;
import bo.custom.impl.OrderBoImpl;
import dto.CustomerDTO;
import dto.ItemDTO;
import dto.OrderDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlaceOrderController {
    
    OrderBo bo = (OrderBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.ORDER);
    
    public ArrayList<CustomerDTO> getCustomers() throws ClassNotFoundException, SQLException{
       return bo.getCustomers();
    }
    
    public ArrayList<ItemDTO> getItems() throws ClassNotFoundException, SQLException{
       return bo.getItems();
    }
    
    public CustomerDTO searchCustomer(String id) throws ClassNotFoundException, SQLException{
       return bo.searchCustomer(id);
    }
    
    public ItemDTO searchItem(String id) throws ClassNotFoundException, SQLException{
       return bo.searchItem(id);
    }
    
    public boolean placeOrder(OrderDTO order) throws ClassNotFoundException, SQLException {
        return bo.placeOrder(order);
    }
    
    public String getOrderId() throws ClassNotFoundException, SQLException{
        return bo.getOrderId();
    }
}
