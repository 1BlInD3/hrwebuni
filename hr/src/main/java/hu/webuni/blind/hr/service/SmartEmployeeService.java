package hu.webuni.blind.hr.service;

import hu.webuni.blind.hr.config.EmployeeConfigProperties;
import hu.webuni.blind.hr.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.DAYS;

@Service

public class SmartEmployeeService implements EmployeeService {

    @Autowired
    EmployeeConfigProperties employeeConfigProperties;

    @Override
    public int getPayRaisePercent(Employee employee) {
        EmployeeConfigProperties.Years years = employeeConfigProperties.getEmployee().getYears();
        EmployeeConfigProperties.Raise raise = employeeConfigProperties.getEmployee().getRaise();
        //double spentYears = Duration.between(employee.getEntryDate(), LocalDate.now()).toDays()/365.0;
        double spentYears = DAYS.between(employee.getEntryDate(),LocalDate.now())/365.0;
        if (spentYears > years.getMax()) {
            return raise.getMax();
        } else if (spentYears >= years.getMid()) {
            return raise.getMid();
        } else if (spentYears >= years.getMin()) {
            return raise.getMin();
        } else {
            return raise.getDef();
        }
    }

    /*
    * public int getPayRaisePercent(Employee employee) {
        EmployeeConfigProperties.Raise raise = employeeConfigProperties.getEmployee().getRaise();
        EmployeeConfigProperties.Years years = employeeConfigProperties.getEmployee().getYears();
        if ((LocalDateTime.now().getYear() - employee.getEntryDate().getYear()) > years.getMax()) {
            return raise.getMax();
        } else if ((LocalDateTime.now().getYear() - employee.getEntryDate().getYear()) < years.getMax() && (LocalDateTime.now().getYear() - employee.getEntryDate().getYear()) >= years.getMid()) {
            return raise.getMid();
        } else if ((LocalDateTime.now().getYear() - employee.getEntryDate().getYear()) < years.getMid() && (LocalDateTime.now().getYear() - employee.getEntryDate().getYear()) >= years.getMin()) {
            return raise.getMin();
        } else {
            return raise.getDef();
        }
    }*/
}
