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

	public List<Customer> createCustomer(List<Customer> customers) {
		
		System.out.println("Inside service, the customer to be saved firstName: "+customers.get(0).getFirstName());
		System.out.println("Inside service, the customer to be saved lastName: "+customers.get(0).getLastName());
		System.out.println("Inside service, the customer to be saved address: "+customers.get(0).getAddress());
				
		return (List<Customer>) customerDao.save(customers);
	}
	
	
	
	

}
