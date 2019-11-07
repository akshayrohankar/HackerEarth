package interview.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_JDBC_Connection {

	public static void main(String[] args) throws ClassNotFoundException {

		
		
		  // Create a variable for the connection string.
		//Class.forName("com.mysql.jdbc.Driver");  
		 

        try (Connection con=DriverManager.getConnection(  
        		"jdbc:mysql://localhost:3306/classicmodels","root","Akshay7593"); 
        	Statement stmt = con.createStatement();) {
            String SQL = "select DISTINCT firstname from employees;";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("FirstName"));
        }}
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
