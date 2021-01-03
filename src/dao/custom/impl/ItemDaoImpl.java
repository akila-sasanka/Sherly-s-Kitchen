
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.ItemDao;
import entity.Customer;
import entity.Item;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ItemDaoImpl implements ItemDao {

    @Override
    public boolean add(Item entity) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("INSERT INTO Item values(?,?,?,?)", entity.getIid(), entity.getItemName(), entity.getItemQty(), entity.getItemPrice());
    }

    @Override
    public boolean update(Item entity) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("UPDATE Item SET itemName=?,itemQty=?,itemPrice=? WHERE iid=?",entity.getItemName(), entity.getItemQty(), entity.getItemPrice(),entity.getIid());
    }

    @Override
    public boolean delete(String id) throws ClassNotFoundException, SQLException {
        return CrudUtil.executeUpdate("DELETE FROM Item WHERE iid=?", id);
    }

    @Override
    public Item Search(String id) throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("SELECT * FROM Item WHERE itemName=?", id);
        if(rs.next()){
            return new Item(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getDouble(4));
        }
        return null;
    }

    @Override
    public ArrayList<Item> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("SELECT * FROM Item");
        ArrayList<Item> itemList=new ArrayList();
        while(rs.next()){
            itemList.add(new Item(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getDouble(4)));
        }
        return itemList;
    }

    @Override
    public String getItemId() throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("SELECT iid FROM Item ORDER BY iid DESC LIMIT 1");
        if(rs.next()){
            return rs.getString(1);
        }
        return null;
    }

    @Override
    public Item getItemFromIid(String iid) throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("SELECT * FROM Item WHERE iid=?", iid);
        if(rs.next()){
            return new Item(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getDouble(4));
        }
        return null;
    }

}
