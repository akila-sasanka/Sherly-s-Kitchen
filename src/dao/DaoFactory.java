/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.custom.impl.CustomerDaoImpl;
import dao.custom.impl.ItemDaoImpl;
import dao.custom.impl.OrderDaoImpl;
import dao.custom.impl.OrderDetailDaoImpl;
import dao.custom.impl.QueryDaoImpl;

/**
 *
 * @author shanilerosh
 */
public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }
   
    /**
     *
     * @return
     */
    public static DaoFactory getInstance(){
        return daoFactory==null ? daoFactory=new DaoFactory() : daoFactory;
    }
    
    public enum DaoTypes{
        CUSTOMER,ITEM,ORDER,ORDERDETAIL,QUERY
    }
    
    public SuperDao getBO(DaoTypes types){
         switch(types){
             case CUSTOMER:
                 return new CustomerDaoImpl();
             case ITEM:
                 return new ItemDaoImpl();
             case ORDER:
                 return new OrderDaoImpl();
             case ORDERDETAIL:
                 return new OrderDetailDaoImpl();
             case QUERY:
                 return new QueryDaoImpl();
             default:
                 return null;
         }
    
    }
}
