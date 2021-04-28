package com.clothing.store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clothing.store.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
