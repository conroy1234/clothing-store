package com.clothing.store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clothing.store.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
