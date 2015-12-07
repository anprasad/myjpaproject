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
	
	public List<Customer> getAllCustomers(){		
		return (List<Customer>) customerDao.findAll();
	}
	
	public Customer getCustomer(Long id){		
		return customerDao.findOne(id);
	}

	public List<Customer> createOrUpdateCustomers(List<Customer> customers) {				
		return (List<Customer>) customerDao.save(customers);
	}

	public String deleteCustomer(Long id) {		
		customerDao.delete(id);
		Customer checkDeletedCustomer = customerDao.findOne(id);
		return (checkDeletedCustomer == null) ? id.toString() : ""; 
	}
	
	
	
	

}
