/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbabridge;
import java.sql.*;
import java.math.*;

/**
 *
 * @author Hayden
 */
public class DbaBridge {
    
    int test;
    
    

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@PICARD2.radford.edu:1521:itec2";
        String username = "hszymanski";
        String password = "welcometothejam";
        Statement statement;
        Connection conn;
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch (ClassNotFoundException e )
        {
            System.err.println(e);
            System.out.println("pls no");
        }
        System.out.println("Driver registered");
        
        try {
            conn = DriverManager.getConnection(url, username, password);
            statement = conn.createStatement();
            String query;
            query = "SELECT * FROM PRODUCT";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                String name = rs.getString("PRODNO");
                System.out.println(name);
            }
            
            conn.close();
        }
        catch(SQLException se)
        {
            se.printStackTrace();
            System.out.println(se);
        }
        
        System.out.println("Handshake complete.");
        
        
    }
    
    */
    
    
}
