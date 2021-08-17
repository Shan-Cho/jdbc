package com.chouguleindustries.jdbcproject.customer;

import java.util.Collection;
import java.util.Optional;

public class CustomerFindTester {

	public static void main(String[] args) {

		CustomerService service = new CustomerServiceImpl();

		Collection<CustomerDTO> collection = service.findAll();
		collection.forEach(r -> System.out.println(r));

		collection = service.findAll((a) -> a.getTo().equals("Shimla"));
		collection.forEach(r -> System.out.println(r));

		collection = service.findAllSortByNameAsc();
		collection.forEach(r -> System.out.println(r));

		Optional<CustomerDTO> opt = service.findOne((a) -> a.getName().equals("Barak"));
		if (opt.isPresent()) {
			CustomerDTO dto = opt.get();
			System.out.println(dto);
		}

		System.out.println(service.total());

	}
}
