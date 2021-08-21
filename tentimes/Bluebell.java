package com.chouguleindustries.jdbcproject.tentimes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bluebell {

	public static void main(String[] args) {

		String username = "root";
		String password = "4BB14ME044";
		String url = "jdbc:mysql://127.0.0.1:3306/project";
		String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(fqnOfDriverImpl);
			Connection connection = DriverManager.getConnection(url, username, password);
			String query = "INSERT INTO flower1 VALUES(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setInt(1, 9);
			ps.setString(2, "Bluebell");
			ps.setString(3, "Small");
			ps.setString(4, "Blue");
			ps.setString(5, "Italy");
			ps.setString(6, "Rome");
			ps.setInt(7, 17);
			ps.setInt(8, 10);
			ps.setString(9, "Fall");
			ps.setInt(10, 94);

			int resultSet = ps.executeUpdate();
			System.out.println(resultSet);

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
