package Controller;

import com.example.testjpa.EmpRepo;
import com.example.testjpa.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/a")
public class EmpController {
    @Autowired
    public EmpRepo repo;

    @GetMapping("/b")
    public String retriveAllEmployee(){
        System.out.println("---- JPA Executed -----");
        return "Hello";
    }
}
