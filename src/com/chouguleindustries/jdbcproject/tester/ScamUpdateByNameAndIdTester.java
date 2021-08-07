package com.chouguleindustries.jdbcproject.tester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ScamUpdateByNameAndIdTester {

	public static void main(String[] args) {

		String username = "root";
		String password = "4BB14ME044";
		String url = "jdbc:mysql://127.0.0.1:3306/project";

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			Statement statement = connection.createStatement();
			String query = "UPDATE scam SET s_year = 2018, s_amount = '1 billion', s_location = 'North India', s_type = 'Market manipulation Scam' WHERE s_name = 'Indian stock market Scam' AND s_id = 2";
			statement.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
