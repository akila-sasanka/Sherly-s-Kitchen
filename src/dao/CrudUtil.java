package dao;


import db.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, chonose Tools | Templates
 * and open the template in the editot
package dao;

/**
 *
 * @author shanilerosh
 */
public class CrudUtil {
    private static PreparedStatement setPrepareStatement(String sql,Object... para) throws ClassNotFoundException, SQLException{
        Connection con = DbConnection.getInstance().getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        for (int i = 0; i < para.length; i++) {
            ps.setObject((i+1), para[i]);
        }
        
        return ps;
    }
    
    public static ResultSet executeQuery (String sql,Object... para) throws ClassNotFoundException, SQLException{
        return setPrepareStatement(sql, para).executeQuery();
    }
    
    public static boolean executeUpdate (String sql,Object... para) throws ClassNotFoundException, SQLException {
        return setPrepareStatement(sql, para).executeUpdate()>0;
    }
}
