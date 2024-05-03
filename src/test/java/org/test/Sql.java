package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;


public class Sql {
	@Test
	public void sql() {
		
		Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Register JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Open a connection
            // show parameter local ---------->to check the localhost numner
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe", "hr", "admin");

            // Create SQL statement
            String sql = "SELECT * FROM student";

            // Create prepared statement
            preparedStatement = connection.prepareStatement(sql);

            // Execute query
            resultSet = preparedStatement.executeQuery();

            // Process the result set
            while (resultSet.next()) {
                int sid = resultSet.getInt("sid");
                String name = resultSet.getString("sname");
                int cid = resultSet.getInt("cid");
                System.out.println("SID: " + sid + ", Name: " + name + ", CID: " + cid );
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Hello...........");
            System.out.println("janani branch");
        }
	}

}
