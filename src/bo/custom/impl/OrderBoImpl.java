
package bo.custom.impl;

import bo.custom.OrderBo;
import dao.DaoFactory;
import dao.SuperDao;
import dao.custom.CustomerDao;
import dao.custom.ItemDao;
import dao.custom.OrderDao;
import dao.custom.OrderDetailDao;
import dao.custom.QueryDao;
import dao.custom.impl.CustomerDaoImpl;
import dao.custom.impl.ItemDaoImpl;
import dao.custom.impl.OrderDaoImpl;
import dao.custom.impl.OrderDetailDaoImpl;
import dao.custom.impl.QueryDaoImpl;
import db.DbConnection;
import dto.CustomerDTO;
import dto.ItemDTO;
import dto.OrderDTO;
import dto.OrderDetailDTO;
import entity.CustomEntity;
import entity.Customer;
import entity.Item;
import entity.Order;
import entity.OrderDetail;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


public class OrderBoImpl implements OrderBo {
    ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getBO(DaoFactory.DaoTypes.ITEM);
    CustomerDao custDao = (CustomerDao) DaoFactory.getInstance().getBO(DaoFactory.DaoTypes.CUSTOMER);
    OrderDao orderDao = (OrderDao) DaoFactory.getInstance().getBO(DaoFactory.DaoTypes.ORDER);
    OrderDetailDao orderDetailDao = (OrderDetailDao) DaoFactory.getInstance().getBO(DaoFactory.DaoTypes.ORDERDETAIL);
    QueryDao queryDao = (QueryDao) DaoFactory.getInstance().getBO(DaoFactory.DaoTypes.QUERY);

    @Override
    public ArrayList<CustomerDTO> getCustomers() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> customerList = custDao.getAll();
        ArrayList<CustomerDTO> listOfCustomer = new ArrayList<>();
        for (Customer customer : customerList) {
            listOfCustomer.add(new CustomerDTO(customer.getCid(), customer.getName(), customer.getMobile(), customer.getAddress()));
        }
        return listOfCustomer;
    }

    @Override
    public CustomerDTO searchCustomer(String id) throws ClassNotFoundException, SQLException {
        Customer customer = custDao.Search(id);
        if (customer != null) {
            return new CustomerDTO(customer.getCid(), customer.getName(), customer.getMobile(), customer.getAddress());
        }
        return null;

    }

    @Override
    public boolean placeOrder(OrderDTO order) throws ClassNotFoundException, SQLException {
        Connection con = DbConnection.getInstance().getConnection();
        con.setAutoCommit(false);
        boolean isaAdd = orderDao.add(new Order(order.getOid(), order.getDate(), order.getCid(), order.isPaymentState(), order.isOpeanCloseState(), order.getAmount(), order.getRequiredDate()));

        if (!isaAdd) {
            con.rollback();
            con.setAutoCommit(true);
            return false;
        } else {
            for (OrderDetailDTO orderDto : order.getList()) {
                boolean add = orderDetailDao.add(new OrderDetail(orderDto.getOid(), orderDto.getIid(), orderDto.getQty(), orderDto.getUnitPrice()));
                //update Stock Level
                Item item = itemDao.getItemFromIid(orderDto.getIid());
                int qtyLevel = item.getItemQty() - orderDto.getQty();
                item.setItemQty(qtyLevel);
                boolean updateStck = itemDao.update(item);

                if (!add || !updateStck) {
                    con.rollback();
                    con.setAutoCommit(true);
                    return false;
                }
            }
        }
        con.commit();
        con.setAutoCommit(true);
        return true;
    }

    @Override
    public String getOrderId() throws ClassNotFoundException, SQLException {
        String orderId = orderDao.getOrderId();
        if (orderId != null) {
            String[] temp = orderId.split("O");
            int tempNumber = Integer.parseInt(temp[1]);
            tempNumber++;

            if (tempNumber < 10) {
                orderId = "O00" + tempNumber;
            } else if (tempNumber < 100) {
                orderId = "O0" + tempNumber;
            } else {
                orderId = "O" + tempNumber;
            }
        } else {
            orderId = "O001";
        }

        return orderId;
    }

    @Override
    public ItemDTO searchItem(String id) throws ClassNotFoundException, SQLException {
        Item item = itemDao.Search(id);
        if (item != null) {
            return new ItemDTO(item.getIid(), item.getItemName(), item.getItemQty(), item.getItemPrice());
        }
        return null;
    }

    @Override
    public ArrayList<ItemDTO> getItems() throws ClassNotFoundException, SQLException {
        ArrayList<Item> itemList = itemDao.getAll();
        ArrayList<ItemDTO> listOfItems = new ArrayList<>();
        for (Item item : itemList) {
            listOfItems.add(new ItemDTO(item.getIid(), item.getItemName(), item.getItemQty(), item.getItemPrice()));
        }
        return listOfItems;
    }

    @Override
    public ArrayList<OrderDTO> getOrdersPriorityWise() throws ClassNotFoundException, SQLException {
        ArrayList<Order> all = orderDao.getAll();
        ArrayList<OrderDTO> orderDTo = new ArrayList<>();
        for (Order order : all) {
            orderDTo.add(new OrderDTO(order.getOid(), order.getDate(), order.getCid(), order.isPaymentState(), order.isOpeanCloseState(), order.getAmount(), order.getRequiredDate()));
        }
        return orderDTo;
    }

    @Override
    public boolean makePayment(String id) throws ClassNotFoundException, SQLException {
        Order order = orderDao.Search(id);
        if (order != null) {
            order.setPaymentState(true);
            return orderDao.update(order);
        }
        return false;
    }

    @Override
    public boolean cancelOrder(String id) throws ClassNotFoundException, SQLException {
        Connection con = DbConnection.getInstance().getConnection();
        con.setAutoCommit(false);
        Order order = orderDao.Search(id);
        System.out.println("Order id " + id);
        if (order != null) {
            order.setOpeanCloseState(false);
            boolean update = orderDao.update(order);
            if (update) {
                ArrayList<CustomEntity> allOrderDetail = queryDao.getAllOrderDetail(id);
                //update qty according to the cancellation
                for (CustomEntity custom : allOrderDetail) {
                    Item item = itemDao.getItemFromIid(custom.getIid());
                    int itemQty = item.getItemQty();
                    itemQty += custom.getQty();
                    item.setItemQty(itemQty);
                    boolean updateStock = itemDao.update(item);

                    if (!updateStock) {
                        con.rollback();
                        con.setAutoCommit(true);
                        return false;
                    }
                }
                con.commit();
                con.setAutoCommit(true);
                return true;
            }
        }
        con.rollback();
        con.setAutoCommit(true);
        return false;

    }

    @Override
    public ArrayList<OrderDTO> getPlacedOrder(String dateFrom, String dateTo) throws ClassNotFoundException, SQLException {
        ArrayList<Order> placedOrder = orderDao.getPlacedOrder(dateFrom, dateTo);
        ArrayList<OrderDTO> orderDTo = new ArrayList<>();
        for (Order order : placedOrder) {
            orderDTo.add(new OrderDTO(order.getOid(), order.getDate(), order.getCid(), order.isPaymentState(), order.isOpeanCloseState(), order.getAmount(), order.getRequiredDate()));
        }
        return orderDTo;
    }

    @Override
    public ArrayList<OrderDTO> getCancelledOrder(String dateFrom, String dateTo) throws ClassNotFoundException, SQLException {
        ArrayList<Order> cancelledOrder = orderDao.getCancelledOrder(dateFrom, dateTo);
        ArrayList<OrderDTO> orderDTo = new ArrayList<>();
        for (Order order : cancelledOrder) {
            orderDTo.add(new OrderDTO(order.getOid(), order.getDate(), order.getCid(), order.isPaymentState(), order.isOpeanCloseState(), order.getAmount(), order.getRequiredDate()));
        }
        return orderDTo;
    }
}
