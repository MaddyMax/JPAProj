package com.example.testjpa;

import org.springframework.data.repository.CrudRepository;

public interface EmpRepo extends CrudRepository<Employee,Long> {
}
