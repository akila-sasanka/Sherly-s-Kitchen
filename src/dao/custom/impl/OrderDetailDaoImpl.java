
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.OrderDetailDao;
import entity.OrderDetail;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailDaoImpl implements OrderDetailDao{

    @Override
    public boolean add(OrderDetail entity) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("INSERT INTO OrderDetail VALUES(?,?,?,?)", entity.getOid(),entity.getIid(),entity.getQty(),entity.getUnitPrice());
    }

    @Override
    public boolean update(OrderDetail entity) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrderDetail Search(String id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<OrderDetail> getAll() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
