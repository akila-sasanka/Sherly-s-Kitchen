
package bo.custom.impl;

import bo.custom.CustomerBo;
import dao.DaoFactory;
import dao.SuperDao;
import dao.custom.CustomerDao;
import dto.CustomerDTO;
import entity.Customer;
import java.sql.SQLException;
import java.util.ArrayList;


public class CustomerBoImpl implements CustomerBo {

    CustomerDao dao = (CustomerDao) DaoFactory.getInstance().getBO(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws ClassNotFoundException, SQLException {
        return dao.add(new Customer(customerDTO.getCid(), customerDTO.getName(), customerDTO.getMobile(), customerDTO.getAddress()));
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws ClassNotFoundException, SQLException {
        return dao.update(new Customer(customerDTO.getCid(), customerDTO.getName(), customerDTO.getMobile(), customerDTO.getAddress()));
    }

    @Override
    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException {
        return dao.delete(id);
    }

    @Override
    public CustomerDTO SearchCustomer(String id) throws ClassNotFoundException, SQLException {
        Customer customer = dao.Search(id);
        if (customer != null) {
            return new CustomerDTO(customer.getCid(), customer.getName(), customer.getMobile(), customer.getAddress());
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomer() throws ClassNotFoundException, SQLException {
        ArrayList<Customer> customerList = dao.getAll();
        ArrayList<CustomerDTO> listOfCustomer = new ArrayList<>();
        for (Customer customer : customerList) {
            listOfCustomer.add(new CustomerDTO(customer.getCid(), customer.getName(), customer.getMobile(), customer.getAddress()));
        }
        return listOfCustomer;
    }

    @Override
    public String getCustId() throws ClassNotFoundException, SQLException {
        String custId = dao.getCustId();
        if (custId != null) {
            String[] temp = custId.split("C");
            int tempNumber = Integer.parseInt(temp[1]);
            tempNumber++;

            if (tempNumber < 10) {
                custId = "C00" + tempNumber;
            } else if (tempNumber < 100) {
                custId = "C0" + tempNumber;
            } else {
                custId = "C" + tempNumber;
            }
        } else {
            custId = "C001";
        }

        return custId;
    }
}
