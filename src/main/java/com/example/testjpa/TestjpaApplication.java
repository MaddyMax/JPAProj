package com.example.testjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitManager;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
@EnableSwagger2
public class TestjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestjpaApplication.class, args);


//		Employee employee=  new Employee();
//		employee.setId(1L);
//		employee.setName("maddy");

	}
}
