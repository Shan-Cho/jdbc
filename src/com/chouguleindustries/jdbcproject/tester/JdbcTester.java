package com.chouguleindustries.jdbcproject.tester;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTester {

	public static void main(String[] args) {

		String username = "root";
		String password = "4BB14ME044";
		String url = "jdbc:mysql://127.0.0.1:3306/project";
		String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		// java.jdbc.Driver--> com.mysql.jdbc.Driver

		try {
			Class.forName(fqnOfDriverImpl); // optional
			// without knowing the impl, use the functionality
			Connection connection = DriverManager.getConnection(url, username, password);
			
			String query = "insert into insurance_table values(9999,'John','Car',3,'United India Assurance',123321)";
			String query1 = "insert into insurance_table values(98,'Sherlock','Life',9,'Max Bhupa',900990)";
			
			Statement statement = connection.createStatement();  // impl --- abstraction
			
			statement.execute(query);
			statement.execute(query1);
					
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
