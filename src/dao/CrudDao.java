/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author shanilerosh
 */
public interface CrudDao <T, ID> extends SuperDao{
    public boolean add(T entity) throws ClassNotFoundException, SQLException;
    public boolean update(T entity) throws ClassNotFoundException, SQLException;
    public boolean delete(String id) throws ClassNotFoundException, SQLException;
    public T Search(String id) throws ClassNotFoundException, SQLException;
    public ArrayList<T> getAll() throws ClassNotFoundException, SQLException;
}
