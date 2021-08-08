package com.chouguleindustries.jdbcproject.tester;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.chouguleindustries.jdbcproject.dto.ScamDTO;

public class SelectAllTester {

	public static void main(String[] args) {

		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			String query = "SELECT * FROM scam WHERE s_amount >= 10000";

			Statement statement = connection.createStatement();
			statement.execute(query);

			ResultSet resultSet = statement.getResultSet();

			List<ScamDTO> set = new ArrayList<ScamDTO>();
			ScamDTO dto = null;

			while (resultSet.next()) {

				ScamDTO scamDTO = new ScamDTO();
				scamDTO.setAmount(resultSet.getDouble("s_amount"));

				int id = resultSet.getInt("s_id");
				String name = resultSet.getString("s_name");
				String type = resultSet.getString("s_type");
				Date year = resultSet.getDate("s_year");
				String by = resultSet.getString("s_by");
				double amount = resultSet.getDouble("s_amount");
				String location = resultSet.getString("s_location");
				String description = resultSet.getString("s_description");
				dto = new ScamDTO(id, name, type, year, by, amount, location, description);
				System.out.println(dto);
				set.add(scamDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
