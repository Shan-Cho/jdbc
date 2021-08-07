package com.chouguleindustries.jdbcproject.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ScamUpdateYearByIdTester {

	public static void main(String[] args) {

		String username = "root";
		String password = "4BB14ME044";
		String url = "jdbc:mysql://127.0.0.1:3306/project";

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			Statement statement = connection.createStatement();
			String query = "UPDATE scam SET s_year = 2012 WHERE s_id = 12";
			statement.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}