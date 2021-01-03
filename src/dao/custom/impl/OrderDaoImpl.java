
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.OrderDao;
import entity.Order;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDaoImpl implements OrderDao{

    @Override
    public boolean add(Order entity) throws ClassNotFoundException, SQLException {
        String sql="INSERT INTO Orders values(?,?,?,?,?,?,?)";
        return CrudUtil.executeUpdate(sql,entity.getOid(),entity.getDate(),entity.getCid(),entity.isPaymentState(),entity.isOpeanCloseState(),entity.getAmount(),entity.getRequiredDate());
    }

    @Override
    public boolean update(Order entity) throws ClassNotFoundException, SQLException {
         return CrudUtil.executeUpdate("UPDATE Orders set date=?,cid=?,paymentState=?,openCloseState=?,amount=?,dateOfRequirement=? WHERE oid=?",entity.getDate(),entity.getCid(),entity.isPaymentState(),entity.isOpeanCloseState(),entity.getAmount(),entity.getRequiredDate(),entity.getOid());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        return true;    //not
    }

    @Override
    public Order Search(String id) throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("Select * from Orders where oid=?", id);
        if(rs.next()){
            return new Order(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getBoolean(5), rs.getDouble(6), rs.getString(7));
        }
        return null;
    }

    @Override
    public ArrayList<Order> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("Select * from Orders WHERE paymentState=false AND openCloseState=true order by dateOfRequirement ASC");
        ArrayList<Order> orderPriorityList=new ArrayList();
        while(rs.next()){
            orderPriorityList.add(new Order(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getBoolean(5), rs.getDouble(6), rs.getString(7)));
        }
        return orderPriorityList;
    }

    @Override
    public String getOrderId() throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("SELECT oid FROM Orders ORDER BY oid DESC LIMIT 1");
        if(rs.next()){
            return rs.getString(1);
        }
        return null;
    }

    @Override
    public ArrayList<Order> getCancelledOrder(String dateFrom, String dateTo) throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("select * from Orders WHERE date BETWEEN ? AND ? AND openCloseState=false", dateFrom,dateTo);
        ArrayList<Order> cancelList=new ArrayList();
        while(rs.next()){
            cancelList.add(new Order(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getBoolean(5), rs.getDouble(6), rs.getString(7)));
        }
        return cancelList;
        
    }

    @Override
    public ArrayList<Order> getPlacedOrder(String dateFrom, String dateTo) throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("select * from Orders WHERE date BETWEEN ? AND ?", dateFrom,dateTo);
        ArrayList<Order> placedlList=new ArrayList();
        while(rs.next()){
            placedlList.add(new Order(rs.getString(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getBoolean(5), rs.getDouble(6), rs.getString(7)));
        }
        return placedlList;
    }
    
}
