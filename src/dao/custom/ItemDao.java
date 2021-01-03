
package dao.custom;

import dao.CrudDao;
import entity.Item;
import java.sql.SQLException;

public interface ItemDao extends CrudDao<Item, String>{
    public String getItemId() throws ClassNotFoundException, SQLException;    
    public Item getItemFromIid(String iid) throws ClassNotFoundException, SQLException;
}
