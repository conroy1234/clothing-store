package com.clothing.store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clothing.store.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
