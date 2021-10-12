package hu.webuni.blind.hr.web;

import hu.webuni.blind.hr.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employees")
public class HrController {

    private Map<Long, EmployeeDto> employees = new HashMap<>();

    {
        employees.put(1L, new EmployeeDto(1L, "Attila", "IT", 125, LocalDate.of(2020, 6, 5)));
        employees.put(2L, new EmployeeDto(2L, "Árpád", "IT", 135, LocalDate.of(2010, 9, 19)));
    }

    @GetMapping
    public List<EmployeeDto> getAll() {
        return new ArrayList<>(employees.values());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable long id) {
        EmployeeDto employeeDto = employees.get(id);
        if (employeeDto != null) {
            return ResponseEntity.ok(employeeDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employeeDto) {
        employees.put(employeeDto.getId(), employeeDto);
        return employeeDto;
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeDto> modifyEmployee(@PathVariable long id, @RequestBody EmployeeDto employeeDto) {
        if (!employees.containsKey(id)) {
            return ResponseEntity.notFound().build();
        }
        employeeDto.setId(id);
        employees.put(id, employeeDto);
        return ResponseEntity.ok(employeeDto);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employees.remove(id);
    }

    @GetMapping("/wage/{wage}")
    public List<EmployeeDto> getWage(@PathVariable int wage) {
        EmployeeDto employeeDto;
        ArrayList<EmployeeDto> myList = new ArrayList<>();
        System.out.println(employees.size());
        for (int i = 1; i <= employees.size(); i++) {
            if(employees.get((long)i).getWage()>wage){
                employeeDto = employees.get((long)i);
                System.out.println("true");
                myList.add(employeeDto);
            }
        }
        return myList;
    }
}
