package com.chouguleindustries.jdbcproject.customer;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public interface CustomerService {

	int validateAndSave(CustomerDTO dto);

	void ValidateAndSaveAll(Collection<CustomerDTO> collection);

	Optional<CustomerDTO> findOne(Predicate<CustomerDTO> predicate);

	Collection<CustomerDTO> findAll();

	Collection<CustomerDTO> findAll(Predicate<CustomerDTO> predicate);

	Collection<CustomerDTO> findAllSortByNameAsc();
	
	Collection<CustomerDTO> findAllSortByNameDesc();

	int total();

}
