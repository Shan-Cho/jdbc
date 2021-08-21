package com.chouguleindustries.jdbcproject.tentimes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sunflower {

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

			ps.setInt(1, 6);
			ps.setString(2, "Sunflower");
			ps.setString(3, "Big");
			ps.setString(4, "Yellow");
			ps.setString(5, "China");
			ps.setString(6, "Wuhan");
			ps.setInt(7, 12);
			ps.setInt(8, 19);
			ps.setString(9, "Summer");
			ps.setInt(10, 80);

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
