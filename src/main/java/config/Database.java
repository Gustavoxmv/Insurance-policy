
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    
    Connection con;
    
    public Database(){
try{
    Class.forName("com.mysql.jdbc.Driver");
   con= DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
    }
catch(Exception e){}
    }
    public Connection getConnection (){
    return con;
    }
    
}
    

