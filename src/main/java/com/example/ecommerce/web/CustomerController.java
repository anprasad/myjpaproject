package com.example.ecommerce.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.domain.Customer;
import com.example.ecommerce.service.CustomerService;

@RestController
class CustomerController {

	//private CustomerDaoImpl customerDao;
	
//	@Autowired
//	public void setCustomerDao(CustomerDaoImpl customerDao){
//		this.customerDao = customerDao;
//	}
	
	@Autowired
	CustomerService customerService;

	@RequestMapping("/customer/{lastName}")
	List<Customer> getCustomer(@PathVariable String lastName) {
		
		System.err.println("Inside the getCustomer controller");
		return customerService.getCustomerService();
		
	}

}

