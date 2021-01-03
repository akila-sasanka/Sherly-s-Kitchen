
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {
    private static DbConnection dbConnection;
    private Connection con;
    
    private DbConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/FoodCompany","root","akila1230");
    }
    
    public static DbConnection getInstance() throws ClassNotFoundException, SQLException{
        return dbConnection==null ? dbConnection=new DbConnection() : dbConnection;
    }
    
    public Connection getConnection(){
        return con;
    }
}
