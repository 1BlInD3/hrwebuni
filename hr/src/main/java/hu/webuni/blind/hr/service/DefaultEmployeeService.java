package hu.webuni.blind.hr.service;

import hu.webuni.blind.hr.config.EmployeeConfigProperties;
import hu.webuni.blind.hr.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultEmployeeService implements EmployeeService{

    @Autowired
    EmployeeConfigProperties employeeConfigProperties;

    @Override
    public int getPayRaisePercent(Employee employee) {
        return employeeConfigProperties.getEmployee().getRaise().getMid();
    }
}
