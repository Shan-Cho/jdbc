package com.chouguleindustries.jdbcproject.customer;

public class CustomerSaveTester {

	public static void main(String[] args) {

		CustomerService service = new CustomerServiceImpl();
		CustomerDTO dto1 = new CustomerDTO("John", "Manali", "Shimla", "Old airport road, Delhi", false, 123456781,
				Education.BE);
		CustomerDTO dto2 = new CustomerDTO("Mary", "Sangli", "Kolhapur", "Army colony , Pune", false, 123456782,
				Education.BE);
		CustomerDTO dto3 = new CustomerDTO("Barak", "Bangalore", "Hassan", "Backside Temple, Tumkur", false, 123456783,
				Education.BE);
		CustomerDTO dto4 = new CustomerDTO("Donald", "Pune", "Mumbai", "Miramar beach, Goa", true, 123456784,
				Education.ME);
		CustomerDTO dto5 = new CustomerDTO("Sherlock", "Jaipur", "Udaipur", "Near savarkar colony, Kupwad", false,
				123456785, Education.MBA);

		service.validateAndSave(dto1);
		service.validateAndSave(dto2);
		service.validateAndSave(dto3);
		service.validateAndSave(dto4);
		service.validateAndSave(dto5);
	}

}
