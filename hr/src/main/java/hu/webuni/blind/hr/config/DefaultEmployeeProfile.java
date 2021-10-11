package hu.webuni.blind.hr.config;

import hu.webuni.blind.hr.service.DefaultEmployeeService;
import hu.webuni.blind.hr.service.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!smart")
public class DefaultEmployeeProfile {
    @Bean
    public EmployeeService employeeService(){
        return new DefaultEmployeeService();
    }
}
