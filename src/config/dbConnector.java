
package config;
import java.sql.*;
public class dbConnector {
    private Connection connect;
     // constructor to connect to our database
    
    public dbConnector(){
       try{ 
        connect=DriverManager.getConnection("jdbc:mysql://local3306isurance","root", "");
          }catch(SQLException ex){
              System.out.println("Can't connect to database:"+ex.getMessage());
          }
    }
    public ResultSet getData(String sql){
        try [
        statement stmt= connect.create Statement();
        ResultSet rst = statement.executeQuery(sql):    
         return rst:      
         ]catch(SQLException){
                System.out.println("Can't connect to database:"+ex.getMessage());
    }
}           
        