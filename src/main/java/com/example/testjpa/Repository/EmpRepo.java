package com.example.testjpa.Repository;

import com.example.testjpa.Entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepo extends CrudRepository<Employee,Long> {
}
