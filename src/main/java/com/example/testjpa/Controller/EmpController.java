package com.example.testjpa.Controller;

import com.example.testjpa.Entity.Teachers;
import com.example.testjpa.Repository.EmpRepo;
import com.example.testjpa.Entity.Employee;
import com.example.testjpa.Entity.Student;
import com.example.testjpa.Repository.SchoolRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/a")
public class EmpController {
    @Autowired
    public EmpRepo repo;

    @Autowired
    public SchoolRep schoolRep;

    @GetMapping("/school/student/{id}/{name}/{standard}")
    public String schoolEntity(@PathVariable Long id,
                               @PathVariable String name,
                               @PathVariable String standard){

        Student student = new Student(id,name,standard);
        schoolRep.save(student);
        return "student saved";

    }

    @GetMapping("/school/teacher/{id}/{name}/{subject}")
    public String teacherEntity(Long id, String name, String subject){

        Teachers teachers = new Teachers(id, name, subject);
        schoolRep.save(teachers);

        return "teachers saved";
    }

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
