package com.chouguleindustries.jdbcproject.tentimes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Orchid {
	public static void main(String[] args) {

		String username = "root";
		String password = "4BB14ME044";
		String url = "jdbc:mysql://127.0.0.1:3306/project";
		String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(fqnOfDriverImpl);
			Connection connection = DriverManager.getConnection(url, username, password);
			String query = "INSERT INTO flower1 VALUES(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, 1);
			statement.setString(2, "Orchid");
			statement.setString(3, "Small");
			statement.setString(4, "White");
			statement.setString(5, "Belgium");
			statement.setString(6, "Brussels");
			statement.setInt(7, 10);
			statement.setInt(8, 12);
			statement.setString(9, "Spring");
			statement.setInt(10, 100);

			int resultSet = statement.executeUpdate();
			System.out.println(resultSet);

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
