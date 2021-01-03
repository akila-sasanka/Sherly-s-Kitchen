
package controller;

import bo.BOFactory;
import bo.custom.OrderBo;
import bo.custom.impl.OrderBoImpl;
import dto.OrderDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReportController {

    OrderBo orderBo = (OrderBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.ORDER);

    public ArrayList<OrderDTO> getPlacedOrder(String dateFrom, String dateTo) throws ClassNotFoundException, SQLException {
           return orderBo.getPlacedOrder(dateFrom, dateTo);
    }

    public ArrayList<OrderDTO> getCancelledOrder(String dateFrom, String dateTo) throws ClassNotFoundException, SQLException {
        return orderBo.getCancelledOrder(dateFrom, dateTo);

    }
}
