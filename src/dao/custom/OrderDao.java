
package dao.custom;

import dao.CrudDao;
import entity.Order;
import java.sql.SQLException;
import java.util.ArrayList;


public interface OrderDao extends CrudDao<Order, String>{
    public String getOrderId() throws ClassNotFoundException, SQLException;
    public ArrayList<Order> getCancelledOrder(String dateFrom,String dateTo) throws ClassNotFoundException, SQLException;
    public ArrayList<Order> getPlacedOrder(String dateFrom,String dateTo) throws ClassNotFoundException, SQLException;
}
