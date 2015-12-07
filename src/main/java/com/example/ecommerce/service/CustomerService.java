package com.example.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.domain.Customer;
import com.example.ecommerce.domain.CustomerDao;
import com.example.ecommerce.domain.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerDao;
	
	//@Autowired
	//CustomerDao customerDao;
	
	public List<Customer> getCustomerService(){

		List<Customer> foundCustomers = (List<Customer>) customerDao.findAll();
		
//		List<Customer> foundCustomers = new ArrayList<Customer>();
//		Customer customer = new Customer();
//		customer.setFirstName("Clark");
//		customer.setLastName("Kent");
//		foundCustomers.add(customer);
		
		return foundCustomers;
	}

}
