package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.domain.Customer;
import com.example.ecommerce.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerDao;
	
	public List<Customer> getCustomerService(){

		List<Customer> foundCustomers = (List<Customer>) customerDao.findAll();
		
		return foundCustomers;
	}

}
