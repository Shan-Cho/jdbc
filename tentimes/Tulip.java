package com.chouguleindustries.jdbcproject.tentimes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tulip {
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

			ps.setInt(1, 5);
			ps.setString(2, "Tulip");
			ps.setString(3, "Small");
			ps.setString(4, "Purple");
			ps.setString(5, "India");
			ps.setString(6, "Jammu");
			ps.setInt(7, 38);
			ps.setInt(8, 78);
			ps.setString(9, "Fall");
			ps.setInt(10, 999);

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
