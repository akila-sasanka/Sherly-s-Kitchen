
package dao.custom;

import dao.SuperDao;
import entity.CustomEntity;
import java.sql.SQLException;
import java.util.ArrayList;

public interface QueryDao extends SuperDao{
    public ArrayList<CustomEntity> getAllOrderDetail(String oid) throws ClassNotFoundException, SQLException;
}
