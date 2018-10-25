package com.example.testjpa.Controller;

import com.example.testjpa.EmpRepo;
import com.example.testjpa.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/a")
public class EmpController {
    @Autowired
    public EmpRepo repo;

    @GetMapping("/save")
//    public String retriveAllEmployee(@PathVariable Long id , @PathVariable String name){
    public String retriveAllEmployee(
            @RequestBody String name,
            @RequestBody Long id
    ){
        System.out.println("---- JPA Executed -----");
        Employee employee = new Employee();
        employee.setName(name);
        employee.setId(id);

        repo.save(employee);
        return "Employee Saved";
    }

//    @GetMapping("/{id}")
//    public String deleteId(@PathVariable Long id){
//        repo.deleteById(id);
//        return "deleted";
//    }

    @GetMapping("/{id}")
    public String saveEmpoyee(@PathVariable Long id){

        Employee employee = new Employee();
//        employee.setId(id);
//        employee.setName("updatename");

        Optional<Employee> optionalEmployee =  repo.findById(id);
        employee = optionalEmployee.get();
        return employee.getName();
    }
}
