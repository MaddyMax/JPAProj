package Controller;

import com.example.testjpa.EmpRepo;
import com.example.testjpa.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    public EmpRepo repo;

    @GetMapping("/employee")
    public void retriveAllEmployee(){

    }


}
