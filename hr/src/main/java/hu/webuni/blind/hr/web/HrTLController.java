package hu.webuni.blind.hr.web;

import hu.webuni.blind.hr.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HrTLController {

    private List<Employee> allEmployees = new ArrayList<>();
    {
        allEmployees.add(new Employee(1L,"Matyi","IT",10000, LocalDate.of(2021,4,1)));
        allEmployees.add(new Employee(2L,"Gizi","Munkahelyi pszichológus",10000, LocalDate.of(2021, 5,1)));
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/employees")
    public String listOfEmployees(Map<String, Object> model){
        model.put("employees",allEmployees);
        model.put("newEmployee", new Employee());
        System.out.println(allEmployees.get(allEmployees.size()-1).getEntryDate());
        return "employees";
    }

    @PostMapping("/employees")
    public String addEmployee(Employee employee){
        allEmployees.add(employee);
        return "redirect:employees";
    }

}
