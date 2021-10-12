package hu.webuni.blind.hr;

import hu.webuni.blind.hr.model.Employee;
import hu.webuni.blind.hr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class HrApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

	@Autowired
	SalaryService salaryService;
	Employee employee = new Employee(123456,"Vladimir Goncar","fazekas",10000,LocalDate.of(2002,5,3));
	Employee employee1 = new Employee(1234567,"Leslie Potter","fazekas",10000,LocalDate.of(2015,5,3));
	Employee employee2 = new Employee(12345678,"Ladislao Vasaio","fazekas",10000,LocalDate.of(2018,12,3));
	Employee employee3 = new Employee(123456789,"Ladislas Pottier","fazekas",10000,LocalDate.of(2021,5,3));


	@Override
	public void run(String... args) throws Exception {
		System.out.println(salaryService.getSalaryRaise(employee));
		System.out.println(salaryService.getSalaryRaise(employee1));
		System.out.println(salaryService.getSalaryRaise(employee2));
		System.out.println(salaryService.getSalaryRaise(employee3));
	}
	/*
	* Ha megadom beanként mind a 2 EmployeeService-t akkor kéri, hogy adjam meg melyik service fusson. A hibakóddal kilép
	* */
}
