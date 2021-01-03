
package controller;

import bo.BOFactory;
import bo.custom.OrderBo;
import bo.custom.impl.OrderBoImpl;
import dto.OrderDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ManageOrderController {

    OrderBo orderBo = (OrderBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.ORDER);

    public ArrayList<OrderDTO> getOrdersPriorityWise() throws ClassNotFoundException, SQLException {
        return orderBo.getOrdersPriorityWise();
    }

    public boolean makePayment(String id) throws ClassNotFoundException, SQLException {
        return orderBo.makePayment(id);
    }

    public boolean cancelOrder(String id) throws ClassNotFoundException, SQLException {
        return orderBo.cancelOrder(id);
    }
}
