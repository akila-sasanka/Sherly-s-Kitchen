
package controller;

import bo.BOFactory;
import bo.custom.CustomerBo;
import bo.custom.ItemBo;
import bo.custom.impl.CustomerBoImpl;
import bo.custom.impl.ItemBoImpl;
import dto.CustomerDTO;
import dto.ItemDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemController {

    ItemBo bo = (ItemBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.ITEM);

    public boolean addItem(ItemDTO itemDTO) throws ClassNotFoundException, SQLException {
        return bo.addItem(itemDTO);
    }

    public boolean updateItem(ItemDTO itemDTO) throws ClassNotFoundException, SQLException {
        return bo.updateItem(itemDTO);
    }

    public boolean deleteItem(String id) throws ClassNotFoundException, SQLException {
        return bo.deleteItem(id);
    }

    public ItemDTO SearchItem(String id) throws ClassNotFoundException, SQLException {
        return bo.SearchItem(id);
    }

    public ArrayList<ItemDTO> getAllItem() throws ClassNotFoundException, SQLException {
        return bo.getAllItems();
    }

    public String getItemId() throws ClassNotFoundException, SQLException {
        return bo.getItemId();
    }
}
