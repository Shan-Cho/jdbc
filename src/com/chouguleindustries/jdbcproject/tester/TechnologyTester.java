package com.chouguleindustries.jdbcproject.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TechnologyTester {

	public static void main(String[] args) {
		String username = "root";
		String password = "4BB14ME044";
		String url = "jdbc:mysql://127.0.0.1:3306/project";
		String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";
		Connection connection = null;

		try {
			Class.forName(fqnOfDriverImpl);
			connection = DriverManager.getConnection(url, username, password);

			String query = "insert into tech values(99,'Core Java',25000.00,6)";
			String query1 = "insert into tech values(88,'artificial intelligence',35000.00,2)";
			String query2 = "insert into tech values(77,'C++',20000.00,3)";
			String query3 = "insert into tech values(44,'Python',5000.00,4)";
			String query4 = "insert into tech values(33,'Machine learning',12000.00,7)";

			Statement statement = connection.createStatement();

			statement.execute(query);
			statement.execute(query1);
			statement.execute(query2);
			statement.execute(query3);
			statement.execute(query4);

			System.out.println(connection);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
