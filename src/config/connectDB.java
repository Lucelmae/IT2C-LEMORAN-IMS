    package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectDB {
    private Connection connect;
    
    public connectDB(){
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/deguma", "root", "");
        } 
        catch (SQLException ex) {
            System.out.println("Can't connect to database: " + ex.getMessage());
        }
    }
    
    public Connection getConnection() {
        return connect;
    }
    
    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = connect.createStatement();
        return stmt.executeQuery(sql);
    }
    
    public int InsertData(String sql){
        int result;
        try{
            try (PreparedStatement pst = connect.prepareStatement(sql)) {
                pst.executeUpdate();
                System.out.println("Inserted Successfully! ");
            }
            result = 1;
        }catch(SQLException ex){
            System.out.println("Connection Error: "+ex);
            result = 0;
        }
        return result;
    }

    public PreparedStatement prepareStatement(String checkSql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
