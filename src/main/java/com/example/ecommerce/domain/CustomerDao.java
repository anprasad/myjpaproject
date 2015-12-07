package com.example.ecommerce.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
	
	public List<Customer> findAll(){
		
		System.out.println("Inside the customer dao findAll()");
		
		Customer customer = new Customer();
		customer.setFirstName("Pete");
		customer.setLastName("SuperMan");
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customer);
		
		return customerList;
	}

}
