package com.chouguleindustries.jdbcproject.restaurant;

import java.util.Collection;

public interface RestaurantDAO {
	int save(RestaurantDTO dto);

	RestaurantDTO findByName(String name);

	Collection<RestaurantDTO> findByType(RestaurantType type);

	default boolean updateTypeByName(RestaurantType newtype, String name) {

		return false;
	}

	default boolean deleteByTypeAndName(RestaurantType newtype, String name) {
		return false;
	}
}
