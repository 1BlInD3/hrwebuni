package hu.webuni.blind.hr.service;

import hu.webuni.blind.hr.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    private EmployeeService employeeService;

    public SalaryService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public int getSalaryRaise(Employee employee){
        return (int)(employee.getWage() / 100.0 * (100 + employeeService.getPayRaisePercent(employee)));
    }

}
