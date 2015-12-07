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

	//private CustomerDaoImpl customerDao;
	
//	@Autowired
//	public void setCustomerDao(CustomerDaoImpl customerDao){
//		this.customerDao = customerDao;
//	}
	
	@Autowired
	CustomerService customerService;

	@RequestMapping("/customers/{lastName}")
	List<Customer> getCustomer(@PathVariable String lastName) {
		
		System.out.println("Inside the getCustomer controller");
		return customerService.getCustomerService();		
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	List<Customer> createCustomer(@RequestBody List<Customer> customers) {
		
		System.out.println("Inside the createCustomer controller");
		System.out.println("Going to save customer in List:");
		System.out.println("Inside createCustomer, the customer to be saved firstName: "+customers.get(0).getFirstName());
		System.out.println("Inside createCustomer, the customer to be saved lastName: "+customers.get(0).getLastName());
		System.out.println("Inside createCustomer, the customer to be saved address: "+customers.get(0).getAddress());
		
		return customerService.createCustomer(customers);		
	}

}

