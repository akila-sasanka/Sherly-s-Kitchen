
package bo.custom;

import bo.SuperBo;
import dto.CustomerDTO;
import dto.ItemDTO;
import dto.OrderDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderBo extends SuperBo{
    public ArrayList<CustomerDTO> getCustomers() throws ClassNotFoundException, SQLException;
    public CustomerDTO searchCustomer(String id) throws ClassNotFoundException, SQLException;
    public boolean placeOrder(OrderDTO order) throws ClassNotFoundException, SQLException;
    public String getOrderId() throws ClassNotFoundException, SQLException;
    public ItemDTO searchItem(String id) throws ClassNotFoundException, SQLException;
    public ArrayList<ItemDTO> getItems() throws ClassNotFoundException, SQLException;
    public ArrayList<OrderDTO> getOrdersPriorityWise() throws ClassNotFoundException, SQLException;
    public boolean makePayment(String id) throws ClassNotFoundException, SQLException;
    public boolean cancelOrder(String id) throws ClassNotFoundException, SQLException;
    public ArrayList<OrderDTO> getPlacedOrder(String dateFrom,String dateTo) throws ClassNotFoundException, SQLException;
    public ArrayList<OrderDTO> getCancelledOrder(String dateFrom,String dateTo) throws ClassNotFoundException, SQLException;        
}
