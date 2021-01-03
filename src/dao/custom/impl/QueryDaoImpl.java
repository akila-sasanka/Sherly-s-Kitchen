
package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.QueryDao;
import entity.CustomEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QueryDaoImpl implements QueryDao{

    @Override
    public ArrayList<CustomEntity> getAllOrderDetail(String oid) throws ClassNotFoundException, SQLException {
        ResultSet rs = CrudUtil.executeQuery("SELECT Orders.oid,OrderDetail.iid,OrderDetail.qty FROM Orders INNER JOIN OrderDetail ON Orders.oid=OrderDetail.oid WHERE OrderDetail.oid=?", oid);
        ArrayList<CustomEntity> list=new ArrayList<>();
        
        while(rs.next()){
            list.add(new CustomEntity(rs.getString(2),rs.getString(1),rs.getInt(3)));
        }
        return list;
    }
    
}
