
package controller;

import bo.BOFactory;
import bo.SuperBo;
import bo.custom.CustomerBo;
import bo.custom.impl.CustomerBoImpl;
import dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerController {

    CustomerBo bo=(CustomerBo) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);

    public boolean addCustomer(CustomerDTO customerDTO) throws ClassNotFoundException, SQLException {
        return bo.addCustomer(customerDTO);
    }

    public boolean updateCustomer(CustomerDTO customerDTO) throws ClassNotFoundException, SQLException {
        return bo.updateCustomer(customerDTO);
    }

    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException {
        return bo.deleteCustomer(id);
    }

    public CustomerDTO SearchCustomer(String id) throws ClassNotFoundException, SQLException {
        return bo.SearchCustomer(id);
    }

    public ArrayList<CustomerDTO> getAllCustomer() throws ClassNotFoundException, SQLException {
        return bo.getAllCustomer();
    }

    public String getCustId() throws ClassNotFoundException, SQLException {
        return bo.getCustId();
    }
}
