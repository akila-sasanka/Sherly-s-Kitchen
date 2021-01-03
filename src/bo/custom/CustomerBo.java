
package bo.custom;

import bo.SuperBo;
import dto.CustomerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBo extends SuperBo{
    public boolean addCustomer(CustomerDTO customerDTO) throws ClassNotFoundException, SQLException;
    public boolean updateCustomer(CustomerDTO customerDTO) throws ClassNotFoundException, SQLException;
    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException;
    public CustomerDTO SearchCustomer(String id) throws ClassNotFoundException, SQLException;
    public ArrayList<CustomerDTO> getAllCustomer() throws ClassNotFoundException, SQLException;
    public String getCustId() throws ClassNotFoundException, SQLException;
}
