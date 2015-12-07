package com.example.ecommerce.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.domain.Customer;
import com.example.ecommerce.service.CustomerService;

@RestController
class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
	Customer getCustomer(@PathVariable Long id) {
		return customerService.getCustomer(id);		
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	List<Customer> getCustomer() {
		return customerService.getAllCustomers();		
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	List<Customer> createCustomer(@RequestBody List<Customer> customers) {		
		return customerService.createOrUpdateCustomers(customers);		
	}
	
	@RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
	String deleteCustomer(@PathVariable Long id) {
		return customerService.deleteCustomer(id);
	}

}

