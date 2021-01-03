
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.CustomerDao;
import entity.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean add(Customer entity) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("INSERT INTO Customer values(?,?,?,?)",entity.getCid(),entity.getName(),entity.getMobile(),entity.getAddress());
    }

    @Override
    public boolean update(Customer entity) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("UPDATE Customer SET name=?,mobile=?,address=? WHERE cid=?", entity.getName(),entity.getMobile(),entity.getAddress(),entity.getCid());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE cid=?", id);
    }

    @Override
    public Customer Search(String id) throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("SELECT * FROM Customer WHERE mobile=?", id);
        if(rs.next()){
            return new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
        }
        return null;
    }

    @Override
    public ArrayList<Customer> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("SELECT * FROM Customer");
        ArrayList<Customer> customerList=new ArrayList();
        while(rs.next()){
            customerList.add(new Customer(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)));
        }
        return customerList;
    }

    @Override
    public String getCustId() throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("SELECT cid FROM Customer ORDER BY cid DESC LIMIT 1");
        if(rs.next()){
            return rs.getString(1);
        }
        return null;
    }

    
    

}
