/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbctest;
import java.util.*;
import java.sql.*;
import java.math.*;

/**
 *
 * @author Hayden Szymanski
 */
public class JdbcTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String url = "jdbc:mysql://137.45.216.2:3306/hszymanski@localhost";
		String user = "hszymanski";
		String pass = "dragonsrock2";
		Connection conn = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pass);
		}
		catch(ClassNotFoundException ex) {
			System.out.println(ex);
		}
		catch(SQLException se)
		{
			System.out.println("srry bae");
		}
    }
    
}

