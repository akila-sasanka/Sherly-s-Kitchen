
package bo.custom.impl;

import bo.custom.ItemBo;
import dao.DaoFactory;
import dao.SuperDao;
import dao.custom.ItemDao;
import dao.custom.impl.ItemDaoImpl;
import dto.ItemDTO;
import entity.Item;
import java.sql.SQLException;
import java.util.ArrayList;


public class ItemBoImpl implements ItemBo{
    
    ItemDao dao = (ItemDao) DaoFactory.getInstance().getBO(DaoFactory.DaoTypes.ITEM);
    
    @Override
    public boolean addItem(ItemDTO itemDTO) throws ClassNotFoundException, SQLException {
        return dao.add(new Item(itemDTO.getIid(), itemDTO.getItemName(), itemDTO.getItemQty(), itemDTO.getItemPrice()));
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) throws ClassNotFoundException, SQLException {
        return dao.update(new Item(itemDTO.getIid(), itemDTO.getItemName(), itemDTO.getItemQty(), itemDTO.getItemPrice()));
    }

    @Override
    public boolean deleteItem(String id) throws ClassNotFoundException, SQLException {
        return dao.delete(id);
    }

    @Override
    public ItemDTO SearchItem(String id) throws ClassNotFoundException, SQLException {
        Item item = dao.Search(id);
        return new ItemDTO(item.getIid(), item.getItemName(), item.getItemQty(), item.getItemPrice());
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() throws ClassNotFoundException, SQLException {
        ArrayList<Item> itemList = dao.getAll();
        ArrayList<ItemDTO> listOfItems=new ArrayList<>();
        for(Item item: itemList){
            listOfItems.add(new ItemDTO(item.getIid(), item.getItemName(), item.getItemQty(), item.getItemPrice()));
        }
        return listOfItems;
    }

    @Override
    public String getItemId() throws ClassNotFoundException, SQLException {
        String itemId = dao.getItemId();
        if(itemId!=null){
            String[] temp=itemId.split("P");
            int tempNumber=Integer.parseInt(temp[1]);
            tempNumber++;
            
            if(tempNumber<10){
                itemId="P00"+tempNumber;
            }else if(tempNumber<100){
                itemId="P0"+tempNumber;
            }else{
                itemId="P"+tempNumber;
            }
        }else{
            itemId="P001";
        }
        
        return itemId;
    }
    
}
