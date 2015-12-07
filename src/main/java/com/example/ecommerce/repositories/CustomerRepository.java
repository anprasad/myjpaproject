package com.example.ecommerce.repositories;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.domain.Customer;

//@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

	//@Cacheable(value="customerFindCache")
	//List<Customer> findByLastName(@Param("lastName") String lastName);
}
