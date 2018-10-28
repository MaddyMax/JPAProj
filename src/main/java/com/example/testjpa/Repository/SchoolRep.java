package com.example.testjpa.Repository;

import com.example.testjpa.Entity.SchoolBasic;
import org.springframework.data.repository.CrudRepository;

public interface SchoolRep extends CrudRepository<SchoolBasic,Long> {
}
