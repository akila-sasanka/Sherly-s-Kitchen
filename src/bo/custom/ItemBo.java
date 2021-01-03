
package bo.custom;

import bo.SuperBo;
import dto.ItemDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBo extends SuperBo{
    public boolean addItem(ItemDTO itemDTO) throws ClassNotFoundException, SQLException;
    public boolean updateItem(ItemDTO itemDTO) throws ClassNotFoundException, SQLException;
    public boolean deleteItem(String id) throws ClassNotFoundException, SQLException;
    public ItemDTO SearchItem(String id) throws ClassNotFoundException, SQLException;
    public ArrayList<ItemDTO> getAllItems() throws ClassNotFoundException, SQLException;
    public String getItemId() throws ClassNotFoundException, SQLException;
    
}
